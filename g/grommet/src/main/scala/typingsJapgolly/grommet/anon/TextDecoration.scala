package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6ComponentsAnchorMod.AnchorExtendedProps
import typingsJapgolly.grommet.es6ThemesBaseMod.ExtendProps
import typingsJapgolly.grommet.es6ThemesBaseMod.ExtendType
import typingsJapgolly.grommet.es6ThemesBaseMod.ExtendValue
import typingsJapgolly.grommet.es6UtilsMod.PropsOf
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDecoration extends StObject {
  
  var extend: js.UndefOr[ExtendType[PropsOf[FC[AnchorExtendedProps]]]] = js.undefined
  
  var textDecoration: js.UndefOr[String] = js.undefined
}
object TextDecoration {
  
  inline def apply(): TextDecoration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDecoration]
  }
  
  extension [Self <: TextDecoration](x: Self) {
    
    inline def setExtend(value: ExtendType[PropsOf[FC[AnchorExtendedProps]]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendFunction1(
      value: /* props */ ExtendProps[PropsOf[FC[AnchorExtendedProps]]] => ExtendValue[PropsOf[FC[AnchorExtendedProps]]]
    ): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
  }
}

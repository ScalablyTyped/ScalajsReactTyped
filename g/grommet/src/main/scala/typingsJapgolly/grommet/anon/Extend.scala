package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6ThemesBaseMod.ExtendProps
import typingsJapgolly.grommet.es6ThemesBaseMod.ExtendType
import typingsJapgolly.grommet.es6ThemesBaseMod.ExtendValue
import typingsJapgolly.grommet.es6UtilsMod.BackgroundType
import typingsJapgolly.grommet.es6UtilsMod.PadType
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extend extends StObject {
  
  var background: js.UndefOr[BackgroundType] = js.undefined
  
  var extend: js.UndefOr[ExtendType[Record[String, Any]]] = js.undefined
  
  var pad: js.UndefOr[PadType] = js.undefined
}
object Extend {
  
  inline def apply(): Extend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extend]
  }
  
  extension [Self <: Extend](x: Self) {
    
    inline def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setExtend(value: ExtendType[Record[String, Any]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendFunction1(value: /* props */ ExtendProps[Record[String, Any]] => ExtendValue[Record[String, Any]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
  }
}

package typingsJapgolly.materialUi.MaterialUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.LegacyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontIconProps
  extends StObject
     with HTMLAttributes[js.Object] {
  
  var hoverColor: js.UndefOr[String] = js.undefined
  
  var ref: js.UndefOr[LegacyRef[Component[FontIconProps & js.Object, js.Object]]] = js.undefined
}
object FontIconProps {
  
  inline def apply(): FontIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontIconProps]
  }
  
  extension [Self <: FontIconProps](x: Self) {
    
    inline def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
    
    inline def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
    
    inline def setRef(value: LegacyRef[Component[FontIconProps & js.Object, js.Object]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: (Component[FontIconProps & js.Object, js.Object]) | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: (Component[FontIconProps & js.Object, js.Object]) | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}

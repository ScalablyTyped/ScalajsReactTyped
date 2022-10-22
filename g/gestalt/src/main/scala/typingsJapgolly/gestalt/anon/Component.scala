package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  var component: Element
  
  var mask: js.UndefOr[Rounding] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object Component {
  
  inline def apply(component: VdomElement): Component = {
    val __obj = js.Dynamic.literal(component = component.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setComponent(value: VdomElement): Self = StObject.set(x, "component", value.rawElement.asInstanceOf[js.Any])
    
    inline def setMask(value: Rounding): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

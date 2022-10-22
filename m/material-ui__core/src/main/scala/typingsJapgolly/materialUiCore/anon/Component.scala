package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component[DefaultComponent /* <: ElementType */] extends StObject {
  
  /**
    * The component used for the root node.
    * Either a string to use a HTML element or a component.
    */
  var component: js.UndefOr[DefaultComponent] = js.undefined
}
object Component {
  
  inline def apply[DefaultComponent /* <: ElementType */](): Component[DefaultComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Component[DefaultComponent]]
  }
  
  extension [Self <: Component[?], DefaultComponent /* <: ElementType */](x: Self & Component[DefaultComponent]) {
    
    inline def setComponent(value: DefaultComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}

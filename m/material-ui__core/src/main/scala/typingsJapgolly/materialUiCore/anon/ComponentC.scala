package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentC[C /* <: ElementType */] extends StObject {
  
  /**
    * The component used for the root node.
    * Either a string to use a HTML element or a component.
    */
  var component: C
}
object ComponentC {
  
  inline def apply[C /* <: ElementType */](component: C): ComponentC[C] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentC[C]]
  }
  
  extension [Self <: ComponentC[?], C /* <: ElementType */](x: Self & ComponentC[C]) {
    
    inline def setComponent(value: C): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
  }
}

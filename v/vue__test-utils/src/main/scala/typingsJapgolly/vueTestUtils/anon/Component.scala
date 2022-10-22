package typingsJapgolly.vueTestUtils.anon

import typingsJapgolly.vueRuntimeCore.mod.ComputedOptions
import typingsJapgolly.vueRuntimeCore.mod.ConcreteComponent
import typingsJapgolly.vueRuntimeCore.mod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  var component: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]
  
  var name: String
}
object Component {
  
  inline def apply(component: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions], name: String): Component = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setComponent(value: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

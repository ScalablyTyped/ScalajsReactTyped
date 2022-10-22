package typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dependency extends StObject {
  
  /**
    * The event. The dependency is satisfied when the referenced object emits this event.
    */
  var event: String
  
  /**
    * The scope. This names the object referenced by the dependency.
    */
  var scope: String
}
object Dependency {
  
  inline def apply(event: String, scope: String): Dependency = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependency]
  }
  
  extension [Self <: Dependency](x: Self) {
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}

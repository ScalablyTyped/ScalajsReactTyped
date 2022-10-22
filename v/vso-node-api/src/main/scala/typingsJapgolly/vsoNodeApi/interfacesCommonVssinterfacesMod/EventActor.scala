package typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventActor extends StObject {
  
  /**
    * Required: This is the identity of the user for the specified role.
    */
  var id: String
  
  /**
    * Required: The event specific name of a role.
    */
  var role: String
}
object EventActor {
  
  inline def apply(id: String, role: String): EventActor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventActor]
  }
  
  extension [Self <: EventActor](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}

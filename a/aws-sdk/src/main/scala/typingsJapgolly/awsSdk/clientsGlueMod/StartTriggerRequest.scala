package typingsJapgolly.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTriggerRequest extends StObject {
  
  /**
    * The name of the trigger to start.
    */
  var Name: NameString
}
object StartTriggerRequest {
  
  inline def apply(Name: NameString): StartTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTriggerRequest]
  }
  
  extension [Self <: StartTriggerRequest](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

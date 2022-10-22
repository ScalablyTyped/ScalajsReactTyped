package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteContactMethodRequest extends StObject {
  
  /**
    * The protocol that will be deleted, such as Email or SMS (text messaging).  To delete an Email and an SMS contact method if you added both, you must run separate DeleteContactMethod actions to delete each protocol. 
    */
  var protocol: ContactProtocol
}
object DeleteContactMethodRequest {
  
  inline def apply(protocol: ContactProtocol): DeleteContactMethodRequest = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContactMethodRequest]
  }
  
  extension [Self <: DeleteContactMethodRequest](x: Self) {
    
    inline def setProtocol(value: ContactProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}

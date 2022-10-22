package typingsJapgolly.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  val agentLogin: String
  
  val endpointARN: String
  
  val endpointId: String
  
  val name: String
  
  val phoneNumber: String
  
  val queue: String
  
  val `type`: EndpointType
}
object Endpoint {
  
  inline def apply(
    agentLogin: String,
    endpointARN: String,
    endpointId: String,
    name: String,
    phoneNumber: String,
    queue: String,
    `type`: EndpointType
  ): Endpoint = {
    val __obj = js.Dynamic.literal(agentLogin = agentLogin.asInstanceOf[js.Any], endpointARN = endpointARN.asInstanceOf[js.Any], endpointId = endpointId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  
  extension [Self <: Endpoint](x: Self) {
    
    inline def setAgentLogin(value: String): Self = StObject.set(x, "agentLogin", value.asInstanceOf[js.Any])
    
    inline def setEndpointARN(value: String): Self = StObject.set(x, "endpointARN", value.asInstanceOf[js.Any])
    
    inline def setEndpointId(value: String): Self = StObject.set(x, "endpointId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setType(value: EndpointType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

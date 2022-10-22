package typingsJapgolly.pulumiKubernetes.typesOutputMod.extensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DEPRECATED 1.9 - This group version of NetworkPolicyPort is deprecated by networking/v1/NetworkPolicyPort.
  */
trait NetworkPolicyPort extends StObject {
  
  /**
    * If specified, the port on the given protocol.  This can either be a numerical or named port on a pod.  If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
    */
  var port: Double | String
  
  /**
    * Optional.  The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
    */
  var protocol: String
}
object NetworkPolicyPort {
  
  inline def apply(port: Double | String, protocol: String): NetworkPolicyPort = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicyPort]
  }
  
  extension [Self <: NetworkPolicyPort](x: Self) {
    
    inline def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}

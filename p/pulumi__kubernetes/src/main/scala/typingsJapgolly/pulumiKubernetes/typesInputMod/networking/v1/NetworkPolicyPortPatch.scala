package typingsJapgolly.pulumiKubernetes.typesInputMod.networking.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NetworkPolicyPort describes a port to allow traffic on
  */
trait NetworkPolicyPortPatch extends StObject {
  
  /**
    * If set, indicates that the range of ports from port to endPort, inclusive, should be allowed by the policy. This field cannot be defined if the port field is not defined or if the port field is defined as a named (string) port. The endPort must be equal or greater than port.
    */
  var endPort: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
    */
  var port: js.UndefOr[Input[Double | String]] = js.undefined
  
  /**
    * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
    */
  var protocol: js.UndefOr[Input[String]] = js.undefined
}
object NetworkPolicyPortPatch {
  
  inline def apply(): NetworkPolicyPortPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPolicyPortPatch]
  }
  
  extension [Self <: NetworkPolicyPortPatch](x: Self) {
    
    inline def setEndPort(value: Input[Double]): Self = StObject.set(x, "endPort", value.asInstanceOf[js.Any])
    
    inline def setEndPortUndefined: Self = StObject.set(x, "endPort", js.undefined)
    
    inline def setPort(value: Input[Double | String]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}

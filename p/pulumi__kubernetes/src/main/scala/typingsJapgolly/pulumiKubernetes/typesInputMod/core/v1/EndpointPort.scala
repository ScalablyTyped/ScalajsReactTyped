package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EndpointPort is a tuple that describes a single port.
  */
trait EndpointPort extends StObject {
  
  /**
    * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
    */
  var appProtocol: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The name of this port.  This must match the 'name' field in the corresponding ServicePort. Must be a DNS_LABEL. Optional only if one port is defined.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The port number of the endpoint.
    */
  var port: Input[Double]
  
  /**
    * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
    */
  var protocol: js.UndefOr[Input[String]] = js.undefined
}
object EndpointPort {
  
  inline def apply(port: Input[Double]): EndpointPort = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointPort]
  }
  
  extension [Self <: EndpointPort](x: Self) {
    
    inline def setAppProtocol(value: Input[String]): Self = StObject.set(x, "appProtocol", value.asInstanceOf[js.Any])
    
    inline def setAppProtocolUndefined: Self = StObject.set(x, "appProtocol", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}

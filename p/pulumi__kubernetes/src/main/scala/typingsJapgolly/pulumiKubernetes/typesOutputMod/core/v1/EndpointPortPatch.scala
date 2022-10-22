package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EndpointPort is a tuple that describes a single port.
  */
trait EndpointPortPatch extends StObject {
  
  /**
    * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
    */
  var appProtocol: String
  
  /**
    * The name of this port.  This must match the 'name' field in the corresponding ServicePort. Must be a DNS_LABEL. Optional only if one port is defined.
    */
  var name: String
  
  /**
    * The port number of the endpoint.
    */
  var port: Double
  
  /**
    * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
    */
  var protocol: String
}
object EndpointPortPatch {
  
  inline def apply(appProtocol: String, name: String, port: Double, protocol: String): EndpointPortPatch = {
    val __obj = js.Dynamic.literal(appProtocol = appProtocol.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointPortPatch]
  }
  
  extension [Self <: EndpointPortPatch](x: Self) {
    
    inline def setAppProtocol(value: String): Self = StObject.set(x, "appProtocol", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}

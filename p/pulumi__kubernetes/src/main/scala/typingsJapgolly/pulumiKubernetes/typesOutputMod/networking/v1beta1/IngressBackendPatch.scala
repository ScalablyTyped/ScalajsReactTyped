package typingsJapgolly.pulumiKubernetes.typesOutputMod.networking.v1beta1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.TypedLocalObjectReferencePatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressBackend describes all endpoints for a given service and port.
  */
trait IngressBackendPatch extends StObject {
  
  /**
    * Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, serviceName and servicePort must not be specified.
    */
  var resource: TypedLocalObjectReferencePatch
  
  /**
    * Specifies the name of the referenced service.
    */
  var serviceName: String
  
  /**
    * Specifies the port of the referenced service.
    */
  var servicePort: Double | String
}
object IngressBackendPatch {
  
  inline def apply(resource: TypedLocalObjectReferencePatch, serviceName: String, servicePort: Double | String): IngressBackendPatch = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], servicePort = servicePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressBackendPatch]
  }
  
  extension [Self <: IngressBackendPatch](x: Self) {
    
    inline def setResource(value: TypedLocalObjectReferencePatch): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServicePort(value: Double | String): Self = StObject.set(x, "servicePort", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.pulumiKubernetes.typesOutputMod.networking.v1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.TypedLocalObjectReferencePatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressBackend describes all endpoints for a given service and port.
  */
trait IngressBackendPatch extends StObject {
  
  /**
    * Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, a service.Name and service.Port must not be specified. This is a mutually exclusive setting with "Service".
    */
  var resource: TypedLocalObjectReferencePatch
  
  /**
    * Service references a Service as a Backend. This is a mutually exclusive setting with "Resource".
    */
  var service: IngressServiceBackendPatch
}
object IngressBackendPatch {
  
  inline def apply(resource: TypedLocalObjectReferencePatch, service: IngressServiceBackendPatch): IngressBackendPatch = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressBackendPatch]
  }
  
  extension [Self <: IngressBackendPatch](x: Self) {
    
    inline def setResource(value: TypedLocalObjectReferencePatch): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setService(value: IngressServiceBackendPatch): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}

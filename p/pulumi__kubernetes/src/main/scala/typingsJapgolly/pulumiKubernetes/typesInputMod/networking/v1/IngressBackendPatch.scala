package typingsJapgolly.pulumiKubernetes.typesInputMod.networking.v1

import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.TypedLocalObjectReferencePatch
import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var resource: js.UndefOr[Input[TypedLocalObjectReferencePatch]] = js.undefined
  
  /**
    * Service references a Service as a Backend. This is a mutually exclusive setting with "Resource".
    */
  var service: js.UndefOr[Input[IngressServiceBackendPatch]] = js.undefined
}
object IngressBackendPatch {
  
  inline def apply(): IngressBackendPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngressBackendPatch]
  }
  
  extension [Self <: IngressBackendPatch](x: Self) {
    
    inline def setResource(value: Input[TypedLocalObjectReferencePatch]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setService(value: Input[IngressServiceBackendPatch]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}

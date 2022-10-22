package typingsJapgolly.pulumiKubernetes.typesInputMod.extensions.v1beta1

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
    * Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, serviceName and servicePort must not be specified.
    */
  var resource: js.UndefOr[Input[TypedLocalObjectReferencePatch]] = js.undefined
  
  /**
    * Specifies the name of the referenced service.
    */
  var serviceName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Specifies the port of the referenced service.
    */
  var servicePort: js.UndefOr[Input[Double | String]] = js.undefined
}
object IngressBackendPatch {
  
  inline def apply(): IngressBackendPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngressBackendPatch]
  }
  
  extension [Self <: IngressBackendPatch](x: Self) {
    
    inline def setResource(value: Input[TypedLocalObjectReferencePatch]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setServiceName(value: Input[String]): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setServicePort(value: Input[Double | String]): Self = StObject.set(x, "servicePort", value.asInstanceOf[js.Any])
    
    inline def setServicePortUndefined: Self = StObject.set(x, "servicePort", js.undefined)
  }
}

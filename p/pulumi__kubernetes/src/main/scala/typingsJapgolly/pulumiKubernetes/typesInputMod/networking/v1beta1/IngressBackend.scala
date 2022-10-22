package typingsJapgolly.pulumiKubernetes.typesInputMod.networking.v1beta1

import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.TypedLocalObjectReference
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressBackend describes all endpoints for a given service and port.
  */
trait IngressBackend extends StObject {
  
  /**
    * Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, serviceName and servicePort must not be specified.
    */
  var resource: js.UndefOr[Input[TypedLocalObjectReference]] = js.undefined
  
  /**
    * Specifies the name of the referenced service.
    */
  var serviceName: Input[String]
  
  /**
    * Specifies the port of the referenced service.
    */
  var servicePort: Input[Double | String]
}
object IngressBackend {
  
  inline def apply(serviceName: Input[String], servicePort: Input[Double | String]): IngressBackend = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], servicePort = servicePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressBackend]
  }
  
  extension [Self <: IngressBackend](x: Self) {
    
    inline def setResource(value: Input[TypedLocalObjectReference]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setServiceName(value: Input[String]): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServicePort(value: Input[Double | String]): Self = StObject.set(x, "servicePort", value.asInstanceOf[js.Any])
  }
}

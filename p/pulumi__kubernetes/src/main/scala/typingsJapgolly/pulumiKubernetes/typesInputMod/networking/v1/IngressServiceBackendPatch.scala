package typingsJapgolly.pulumiKubernetes.typesInputMod.networking.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressServiceBackend references a Kubernetes Service as a Backend.
  */
trait IngressServiceBackendPatch extends StObject {
  
  /**
    * Name is the referenced service. The service must exist in the same namespace as the Ingress object.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Port of the referenced service. A port name or port number is required for a IngressServiceBackend.
    */
  var port: js.UndefOr[Input[ServiceBackendPortPatch]] = js.undefined
}
object IngressServiceBackendPatch {
  
  inline def apply(): IngressServiceBackendPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngressServiceBackendPatch]
  }
  
  extension [Self <: IngressServiceBackendPatch](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPort(value: Input[ServiceBackendPortPatch]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}

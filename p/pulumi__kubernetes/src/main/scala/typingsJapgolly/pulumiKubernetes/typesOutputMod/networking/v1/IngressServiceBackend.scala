package typingsJapgolly.pulumiKubernetes.typesOutputMod.networking.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressServiceBackend references a Kubernetes Service as a Backend.
  */
trait IngressServiceBackend extends StObject {
  
  /**
    * Name is the referenced service. The service must exist in the same namespace as the Ingress object.
    */
  var name: String
  
  /**
    * Port of the referenced service. A port name or port number is required for a IngressServiceBackend.
    */
  var port: ServiceBackendPort
}
object IngressServiceBackend {
  
  inline def apply(name: String, port: ServiceBackendPort): IngressServiceBackend = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressServiceBackend]
  }
  
  extension [Self <: IngressServiceBackend](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPort(value: ServiceBackendPort): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.pulumiKubernetes.typesOutputMod.networking.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IngressClassSpec provides information about the class of an Ingress.
  */
trait IngressClassSpecPatch extends StObject {
  
  /**
    * Controller refers to the name of the controller that should handle this class. This allows for different "flavors" that are controlled by the same controller. For example, you may have different Parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. "acme.io/ingress-controller". This field is immutable.
    */
  var controller: String
  
  /**
    * Parameters is a link to a custom resource containing additional configuration for the controller. This is optional if the controller does not require extra parameters.
    */
  var parameters: IngressClassParametersReferencePatch
}
object IngressClassSpecPatch {
  
  inline def apply(controller: String, parameters: IngressClassParametersReferencePatch): IngressClassSpecPatch = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressClassSpecPatch]
  }
  
  extension [Self <: IngressClassSpecPatch](x: Self) {
    
    inline def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: IngressClassParametersReferencePatch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}

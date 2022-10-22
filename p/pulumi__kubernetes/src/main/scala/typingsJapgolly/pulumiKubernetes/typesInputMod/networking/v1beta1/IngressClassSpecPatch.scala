package typingsJapgolly.pulumiKubernetes.typesInputMod.networking.v1beta1

import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.TypedLocalObjectReferencePatch
import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var controller: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Parameters is a link to a custom resource containing additional configuration for the controller. This is optional if the controller does not require extra parameters.
    */
  var parameters: js.UndefOr[Input[TypedLocalObjectReferencePatch]] = js.undefined
}
object IngressClassSpecPatch {
  
  inline def apply(): IngressClassSpecPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngressClassSpecPatch]
  }
  
  extension [Self <: IngressClassSpecPatch](x: Self) {
    
    inline def setController(value: Input[String]): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setParameters(value: Input[TypedLocalObjectReferencePatch]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}

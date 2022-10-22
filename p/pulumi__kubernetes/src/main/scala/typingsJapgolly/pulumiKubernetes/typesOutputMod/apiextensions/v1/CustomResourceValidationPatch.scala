package typingsJapgolly.pulumiKubernetes.typesOutputMod.apiextensions.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceValidation is a list of validation methods for CustomResources.
  */
trait CustomResourceValidationPatch extends StObject {
  
  /**
    * openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.
    */
  var openAPIV3Schema: JSONSchemaPropsPatch
}
object CustomResourceValidationPatch {
  
  inline def apply(openAPIV3Schema: JSONSchemaPropsPatch): CustomResourceValidationPatch = {
    val __obj = js.Dynamic.literal(openAPIV3Schema = openAPIV3Schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceValidationPatch]
  }
  
  extension [Self <: CustomResourceValidationPatch](x: Self) {
    
    inline def setOpenAPIV3Schema(value: JSONSchemaPropsPatch): Self = StObject.set(x, "openAPIV3Schema", value.asInstanceOf[js.Any])
  }
}

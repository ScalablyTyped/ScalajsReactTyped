package typingsJapgolly.pulumiKubernetes.typesInputMod.apiextensions.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var openAPIV3Schema: js.UndefOr[Input[JSONSchemaPropsPatch]] = js.undefined
}
object CustomResourceValidationPatch {
  
  inline def apply(): CustomResourceValidationPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomResourceValidationPatch]
  }
  
  extension [Self <: CustomResourceValidationPatch](x: Self) {
    
    inline def setOpenAPIV3Schema(value: Input[JSONSchemaPropsPatch]): Self = StObject.set(x, "openAPIV3Schema", value.asInstanceOf[js.Any])
    
    inline def setOpenAPIV3SchemaUndefined: Self = StObject.set(x, "openAPIV3Schema", js.undefined)
  }
}

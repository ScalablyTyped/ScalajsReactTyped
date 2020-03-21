package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.validationMetadataMod.ValidationMetadata
import typingsJapgolly.classValidator.validationSchemaMod.ValidationSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/validation-schema/ValidationSchemaToMetadataTransformer", JSImport.Namespace)
@js.native
object validationSchemaToMetadataTransformerMod extends js.Object {
  @js.native
  class ValidationSchemaToMetadataTransformer () extends js.Object {
    def transform(schema: ValidationSchema): js.Array[ValidationMetadata] = js.native
  }
  
}


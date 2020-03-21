package typingsJapgolly.schemaUtils.validationErrorMod

import typingsJapgolly.jsonSchema.mod.JSONSchema4
import typingsJapgolly.schemaUtils.ErrorObjectchildrenArrayE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schema-utils/declarations/ValidationError", JSImport.Default)
@js.native
class default protected () extends ValidationError {
  /**
    * @param {Array<SchemaUtilErrorObject>} errors
    * @param {Schema} schema
    * @param {ValidationErrorConfiguration} configuration
    */
  def this(errors: js.Array[ErrorObjectchildrenArrayE], schema: JSONSchema4) = this()
  def this(errors: js.Array[ErrorObjectchildrenArrayE], schema: typingsJapgolly.jsonSchema.mod.JSONSchema6) = this()
  def this(errors: js.Array[ErrorObjectchildrenArrayE], schema: typingsJapgolly.jsonSchema.mod.JSONSchema7) = this()
  def this(
    errors: js.Array[ErrorObjectchildrenArrayE],
    schema: JSONSchema4,
    configuration: typingsJapgolly.schemaUtils.validateMod.ValidationErrorConfiguration
  ) = this()
  def this(
    errors: js.Array[ErrorObjectchildrenArrayE],
    schema: typingsJapgolly.jsonSchema.mod.JSONSchema6,
    configuration: typingsJapgolly.schemaUtils.validateMod.ValidationErrorConfiguration
  ) = this()
  def this(
    errors: js.Array[ErrorObjectchildrenArrayE],
    schema: typingsJapgolly.jsonSchema.mod.JSONSchema7,
    configuration: typingsJapgolly.schemaUtils.validateMod.ValidationErrorConfiguration
  ) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}


package typingsJapgolly.webpack.mod

import typingsJapgolly.schemaUtils.declarationsValidationErrorMod.Schema
import typingsJapgolly.schemaUtils.declarationsValidationErrorMod.SchemaUtilErrorObject
import typingsJapgolly.schemaUtils.declarationsValidationErrorMod.ValidationErrorConfiguration
import typingsJapgolly.schemaUtils.declarationsValidationErrorMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "ValidationError")
@js.native
open class ValidationError protected () extends default {
  /**
    * @param {Array<SchemaUtilErrorObject>} errors
    * @param {Schema} schema
    * @param {ValidationErrorConfiguration} configuration
    */
  def this(errors: js.Array[SchemaUtilErrorObject], schema: Schema) = this()
  def this(
    errors: js.Array[SchemaUtilErrorObject],
    schema: Schema,
    configuration: ValidationErrorConfiguration
  ) = this()
}

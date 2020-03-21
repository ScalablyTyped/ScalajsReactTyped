package typingsJapgolly.simplSchema.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomValidationContext extends js.Object {
  /** The schema definition object. */
  var definition: SchemaDefinition
  /** The generic name of the schema key (e.g., "addresses.$.street") */
  var genericKey: String
  /** Does the object being validated have this key set? */
  var isSet: Boolean
  /** The name of the schema key (e.g., "addresses.0.street") */
  var key: String
  /** The Mongo operator for which we're doing validation. Might be null. */
  var operator: js.Any
  var validationContext: ValidationContext
  /** Value to validate */
  var value: js.Any
  /**
    * Call this to add validation errors for any key. In general, you should use
    * this to add errors for other keys. To add an error for the current key,
    * return the error type string. If you do use this to add an error for the
    * current key, return false from your custom validation function.
    */
  def addValidationErrors(errors: SimpleSchemaValidationError): js.Any
  /**
    * Use this method to get information about other fields. Pass a field name
    * (non-generic schema key) as the only argument. The return object will
    * have isSet, value, and operator properties for that field.
    */
  def field(): js.Any
  /**
    * Use this method to get information about other fields that have the same
    * parent object. Works the same way as field(). This is helpful when you use
    * sub-schemas or when you're dealing with arrays of objects.
    */
  def siblingField(): js.Any
}

object CustomValidationContext {
  @scala.inline
  def apply(
    addValidationErrors: SimpleSchemaValidationError => CallbackTo[js.Any],
    definition: SchemaDefinition,
    field: CallbackTo[js.Any],
    genericKey: String,
    isSet: Boolean,
    key: String,
    operator: js.Any,
    siblingField: CallbackTo[js.Any],
    validationContext: ValidationContext,
    value: js.Any
  ): CustomValidationContext = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], genericKey = genericKey.asInstanceOf[js.Any], isSet = isSet.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], validationContext = validationContext.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("addValidationErrors")(js.Any.fromFunction1((t0: typingsJapgolly.simplSchema.mod.SimpleSchemaValidationError) => addValidationErrors(t0).runNow()))
    __obj.updateDynamic("field")(field.toJsFn)
    __obj.updateDynamic("siblingField")(siblingField.toJsFn)
    __obj.asInstanceOf[CustomValidationContext]
  }
}


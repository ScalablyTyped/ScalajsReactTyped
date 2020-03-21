package typingsJapgolly.jsData

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsData.mod.SchemaValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllOf extends js.Object {
  def allOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def anyOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def dependencies(value: js.Any, schema: js.Any, opts: js.Any): Unit
  def enum(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def items(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def maxItems(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def maxLength(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def maxProperties(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def maximum(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def minItems(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def minLength(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def minProperties(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def minimum(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def multipleOf(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def not(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def oneOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def pattern(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def properties(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def required(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def `type`(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def uniqueItems(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
}

object AnonAllOf {
  @scala.inline
  def apply(
    allOf: (js.Any, js.Any, js.Any) => CallbackTo[js.Array[SchemaValidationError]],
    anyOf: (js.Any, js.Any, js.Any) => CallbackTo[js.Array[SchemaValidationError]],
    dependencies: (js.Any, js.Any, js.Any) => Callback,
    enum: (js.Any, js.Any, js.Any) => CallbackTo[SchemaValidationError],
    items: (js.Any, js.Any, js.Any) => CallbackTo[js.Array[SchemaValidationError]],
    maxItems: (js.Any, js.Any, js.Any) => CallbackTo[SchemaValidationError],
    maxLength: (js.Any, js.Any, js.Any) => CallbackTo[SchemaValidationError],
    maxProperties: (js.Any, js.Any, js.Any) => CallbackTo[SchemaValidationError],
    maximum: (js.Any, js.Any, js.Any) => CallbackTo[SchemaValidationError],
    minItems: (js.Any, js.Any, js.Any) => CallbackTo[SchemaValidationError],
    minLength: (js.Any, js.Any, js.Any) => CallbackTo[SchemaValidationError],
    minProperties: (js.Any, js.Any, js.Any) => CallbackTo[SchemaValidationError],
    minimum: (js.Any, js.Any, js.Any) => CallbackTo[SchemaValidationError],
    multipleOf: (js.Any, js.Any, js.Any) => CallbackTo[SchemaValidationError],
    not: (js.Any, js.Any, js.Any) => CallbackTo[SchemaValidationError],
    oneOf: (js.Any, js.Any, js.Any) => CallbackTo[js.Array[SchemaValidationError]],
    pattern: (js.Any, js.Any, js.Any) => CallbackTo[SchemaValidationError],
    properties: (js.Any, js.Any, js.Any) => CallbackTo[js.Array[SchemaValidationError]],
    required: (js.Any, js.Any, js.Any) => CallbackTo[js.Array[SchemaValidationError]],
    `type`: (js.Any, js.Any, js.Any) => CallbackTo[SchemaValidationError],
    uniqueItems: (js.Any, js.Any, js.Any) => CallbackTo[SchemaValidationError]
  ): AnonAllOf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allOf")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => allOf(t0, t1, t2).runNow()))
    __obj.updateDynamic("anyOf")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => anyOf(t0, t1, t2).runNow()))
    __obj.updateDynamic("dependencies")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => dependencies(t0, t1, t2).runNow()))
    __obj.updateDynamic("enum")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => enum(t0, t1, t2).runNow()))
    __obj.updateDynamic("items")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => items(t0, t1, t2).runNow()))
    __obj.updateDynamic("maxItems")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => maxItems(t0, t1, t2).runNow()))
    __obj.updateDynamic("maxLength")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => maxLength(t0, t1, t2).runNow()))
    __obj.updateDynamic("maxProperties")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => maxProperties(t0, t1, t2).runNow()))
    __obj.updateDynamic("maximum")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => maximum(t0, t1, t2).runNow()))
    __obj.updateDynamic("minItems")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => minItems(t0, t1, t2).runNow()))
    __obj.updateDynamic("minLength")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => minLength(t0, t1, t2).runNow()))
    __obj.updateDynamic("minProperties")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => minProperties(t0, t1, t2).runNow()))
    __obj.updateDynamic("minimum")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => minimum(t0, t1, t2).runNow()))
    __obj.updateDynamic("multipleOf")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => multipleOf(t0, t1, t2).runNow()))
    __obj.updateDynamic("not")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => not(t0, t1, t2).runNow()))
    __obj.updateDynamic("oneOf")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => oneOf(t0, t1, t2).runNow()))
    __obj.updateDynamic("pattern")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => pattern(t0, t1, t2).runNow()))
    __obj.updateDynamic("properties")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => properties(t0, t1, t2).runNow()))
    __obj.updateDynamic("required")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => required(t0, t1, t2).runNow()))
    __obj.updateDynamic("type")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => `type`(t0, t1, t2).runNow()))
    __obj.updateDynamic("uniqueItems")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => uniqueItems(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonAllOf]
  }
}


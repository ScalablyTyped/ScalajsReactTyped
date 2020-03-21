package typingsJapgolly.jsData

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsData.mod.SchemaValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInteger extends js.Object {
  def array(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def integer(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def number(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def numeric(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def `object`(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def string(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
}

object AnonInteger {
  @scala.inline
  def apply(
    array: (js.Any, js.Any, js.Any) => CallbackTo[js.Array[SchemaValidationError]],
    integer: (js.Any, js.Any, js.Any) => CallbackTo[js.Array[SchemaValidationError]],
    number: (js.Any, js.Any, js.Any) => CallbackTo[js.Array[SchemaValidationError]],
    numeric: (js.Any, js.Any, js.Any) => CallbackTo[js.Array[SchemaValidationError]],
    `object`: (js.Any, js.Any, js.Any) => CallbackTo[js.Array[SchemaValidationError]],
    string: (js.Any, js.Any, js.Any) => CallbackTo[js.Array[SchemaValidationError]]
  ): AnonInteger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("array")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => array(t0, t1, t2).runNow()))
    __obj.updateDynamic("integer")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => integer(t0, t1, t2).runNow()))
    __obj.updateDynamic("number")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => number(t0, t1, t2).runNow()))
    __obj.updateDynamic("numeric")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => numeric(t0, t1, t2).runNow()))
    __obj.updateDynamic("object")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => `object`(t0, t1, t2).runNow()))
    __obj.updateDynamic("string")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => string(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonInteger]
  }
}


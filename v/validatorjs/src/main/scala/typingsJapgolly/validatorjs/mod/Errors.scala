package typingsJapgolly.validatorjs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.validatorjs.validatorjsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var errors: ValidationErrors
  def add(attribute: String, message: String): Unit
  def all(): ValidationErrors
  def first(attribute: String): String | `false`
  def get(attribute: String): js.Array[String]
  def has(attribute: String): Boolean
}

object Errors {
  @scala.inline
  def apply(
    add: (String, String) => Callback,
    all: CallbackTo[ValidationErrors],
    errors: ValidationErrors,
    first: String => CallbackTo[String | `false`],
    get: String => CallbackTo[js.Array[String]],
    has: String => CallbackTo[Boolean]
  ): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => add(t0, t1).runNow()))
    __obj.updateDynamic("all")(all.toJsFn)
    __obj.updateDynamic("first")(js.Any.fromFunction1((t0: java.lang.String) => first(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.asInstanceOf[Errors]
  }
}


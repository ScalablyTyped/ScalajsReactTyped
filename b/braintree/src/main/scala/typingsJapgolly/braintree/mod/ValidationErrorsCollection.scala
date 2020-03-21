package typingsJapgolly.braintree.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationErrorsCollection extends js.Object {
  def deepErrors(): js.Array[ValidationError]
  def `for`(name: String): ValidationErrorsCollection
  def forIndex(index: Double): ValidationErrorsCollection
  def on(name: String): ValidationError
}

object ValidationErrorsCollection {
  @scala.inline
  def apply(
    deepErrors: CallbackTo[js.Array[ValidationError]],
    `for`: String => CallbackTo[ValidationErrorsCollection],
    forIndex: Double => CallbackTo[ValidationErrorsCollection],
    on: String => CallbackTo[ValidationError]
  ): ValidationErrorsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deepErrors")(deepErrors.toJsFn)
    __obj.updateDynamic("for")(js.Any.fromFunction1((t0: java.lang.String) => `for`(t0).runNow()))
    __obj.updateDynamic("forIndex")(js.Any.fromFunction1((t0: scala.Double) => forIndex(t0).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction1((t0: java.lang.String) => on(t0).runNow()))
    __obj.asInstanceOf[ValidationErrorsCollection]
  }
}


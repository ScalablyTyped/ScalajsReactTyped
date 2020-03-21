package typingsJapgolly.valerie.Valerie_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Construction options for a model validation state.
trait ModelValidationStateOptions extends js.Object {
  var excludeFromSummary: Boolean
  var failureMessage: String
  def applicable(): Boolean
  def name(): String
  def paused(): Boolean
}

object ModelValidationStateOptions {
  @scala.inline
  def apply(
    applicable: CallbackTo[Boolean],
    excludeFromSummary: Boolean,
    failureMessage: String,
    name: CallbackTo[String],
    paused: CallbackTo[Boolean]
  ): ModelValidationStateOptions = {
    val __obj = js.Dynamic.literal(excludeFromSummary = excludeFromSummary.asInstanceOf[js.Any], failureMessage = failureMessage.asInstanceOf[js.Any])
    __obj.updateDynamic("applicable")(applicable.toJsFn)
    __obj.updateDynamic("name")(name.toJsFn)
    __obj.updateDynamic("paused")(paused.toJsFn)
    __obj.asInstanceOf[ModelValidationStateOptions]
  }
}


package typingsJapgolly.knockoutValidation

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationRuleDefinition extends KnockoutValidationRuleBase {
  def validator(value: js.Any, params: js.Any): Boolean
}

object KnockoutValidationRuleDefinition {
  @scala.inline
  def apply(
    message: String | KnockoutValidationMessageFunction,
    validator: (js.Any, js.Any) => CallbackTo[Boolean]
  ): KnockoutValidationRuleDefinition = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("validator")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => validator(t0, t1).runNow()))
    __obj.asInstanceOf[KnockoutValidationRuleDefinition]
  }
}


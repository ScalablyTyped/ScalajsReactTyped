package typingsJapgolly.knockoutValidation

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationAsyncRuleDefinition extends KnockoutValidationRuleBase {
  var async: Boolean
  def validator(value: js.Any, params: js.Any, callback: KnockoutValidationAsyncCallback): Unit
}

object KnockoutValidationAsyncRuleDefinition {
  @scala.inline
  def apply(
    async: Boolean,
    message: String | KnockoutValidationMessageFunction,
    validator: (js.Any, js.Any, KnockoutValidationAsyncCallback) => Callback
  ): KnockoutValidationAsyncRuleDefinition = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("validator")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: typingsJapgolly.knockoutValidation.KnockoutValidationAsyncCallback) => validator(t0, t1, t2).runNow()))
    __obj.asInstanceOf[KnockoutValidationAsyncRuleDefinition]
  }
}


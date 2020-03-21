package typingsJapgolly.knockoutValidation

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationRule extends js.Object {
  var condition: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var message: js.UndefOr[String | KnockoutValidationMessageFunction] = js.undefined
  var params: js.Any
  var rule: String
}

object KnockoutValidationRule {
  @scala.inline
  def apply(
    params: js.Any,
    rule: String,
    condition: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    message: String | KnockoutValidationMessageFunction = null
  ): KnockoutValidationRule = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    condition.foreach(p => __obj.updateDynamic("condition")(p.toJsFn))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutValidationRule]
  }
}


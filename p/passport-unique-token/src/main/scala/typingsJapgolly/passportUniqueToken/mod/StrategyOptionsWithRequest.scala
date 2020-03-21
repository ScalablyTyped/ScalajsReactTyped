package typingsJapgolly.passportUniqueToken.mod

import typingsJapgolly.passportUniqueToken.passportUniqueTokenBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionsWithRequest extends js.Object {
  var failedOnMissing: js.UndefOr[Boolean] = js.undefined
  var passReqToCallback: `true`
  var tokenField: js.UndefOr[String] = js.undefined
  var tokenHeader: js.UndefOr[String] = js.undefined
  var tokenParams: js.UndefOr[String] = js.undefined
  var tokenQuery: js.UndefOr[String] = js.undefined
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(
    passReqToCallback: `true`,
    failedOnMissing: js.UndefOr[Boolean] = js.undefined,
    tokenField: String = null,
    tokenHeader: String = null,
    tokenParams: String = null,
    tokenQuery: String = null
  ): StrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
    if (!js.isUndefined(failedOnMissing)) __obj.updateDynamic("failedOnMissing")(failedOnMissing.asInstanceOf[js.Any])
    if (tokenField != null) __obj.updateDynamic("tokenField")(tokenField.asInstanceOf[js.Any])
    if (tokenHeader != null) __obj.updateDynamic("tokenHeader")(tokenHeader.asInstanceOf[js.Any])
    if (tokenParams != null) __obj.updateDynamic("tokenParams")(tokenParams.asInstanceOf[js.Any])
    if (tokenQuery != null) __obj.updateDynamic("tokenQuery")(tokenQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionsWithRequest]
  }
}


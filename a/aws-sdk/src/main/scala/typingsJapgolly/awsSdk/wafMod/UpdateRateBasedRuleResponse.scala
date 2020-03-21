package typingsJapgolly.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRateBasedRuleResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the UpdateRateBasedRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsJapgolly.awsSdk.wafMod.ChangeToken] = js.native
}

object UpdateRateBasedRuleResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null): UpdateRateBasedRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRateBasedRuleResponse]
  }
}


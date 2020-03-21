package typingsJapgolly.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRuleGroupResponse extends js.Object {
  /**
    * A token used for optimistic locking. AWS WAF returns this token to your update requests. You use NextLockToken in the same manner as you use LockToken. 
    */
  var NextLockToken: js.UndefOr[LockToken] = js.native
}

object UpdateRuleGroupResponse {
  @scala.inline
  def apply(NextLockToken: LockToken = null): UpdateRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (NextLockToken != null) __obj.updateDynamic("NextLockToken")(NextLockToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRuleGroupResponse]
  }
}


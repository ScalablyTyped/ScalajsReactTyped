package typingsJapgolly.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSqlInjectionMatchSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the UpdateSqlInjectionMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsJapgolly.awsSdk.wafMod.ChangeToken] = js.native
}

object UpdateSqlInjectionMatchSetResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null): UpdateSqlInjectionMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSqlInjectionMatchSetResponse]
  }
}


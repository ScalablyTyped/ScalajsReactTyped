package typingsJapgolly.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSizeConstraintSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the DeleteSizeConstraintSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsJapgolly.awsSdk.wafregionalMod.ChangeToken] = js.native
}

object DeleteSizeConstraintSetResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null): DeleteSizeConstraintSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSizeConstraintSetResponse]
  }
}


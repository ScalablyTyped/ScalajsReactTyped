package typingsJapgolly.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromoteResourceShareCreatedFromPolicyResponse extends js.Object {
  /**
    * Indicates whether the request succeeded.
    */
  var returnValue: js.UndefOr[Boolean] = js.native
}

object PromoteResourceShareCreatedFromPolicyResponse {
  @scala.inline
  def apply(returnValue: js.UndefOr[scala.Boolean] = js.undefined): PromoteResourceShareCreatedFromPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(returnValue)) __obj.updateDynamic("returnValue")(returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromoteResourceShareCreatedFromPolicyResponse]
  }
}


package typingsJapgolly.stripe

import typingsJapgolly.stripe.stripeStrings.declined
import typingsJapgolly.stripe.stripeStrings.failed
import typingsJapgolly.stripe.stripeStrings.not_required
import typingsJapgolly.stripe.stripeStrings.pending
import typingsJapgolly.stripe.stripeStrings.processing_error
import typingsJapgolly.stripe.stripeStrings.succeeded
import typingsJapgolly.stripe.stripeStrings.user_abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFailurereason extends js.Object {
  var failure_reason: js.UndefOr[user_abort | declined | processing_error] = js.undefined
  var return_url: String
  var status: pending | succeeded | not_required | failed
  var url: String
}

object AnonFailurereason {
  @scala.inline
  def apply(
    return_url: String,
    status: pending | succeeded | not_required | failed,
    url: String,
    failure_reason: user_abort | declined | processing_error = null
  ): AnonFailurereason = {
    val __obj = js.Dynamic.literal(return_url = return_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (failure_reason != null) __obj.updateDynamic("failure_reason")(failure_reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFailurereason]
  }
}


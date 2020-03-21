package typingsJapgolly.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information provided by the user when they complete the subscription
  * cancellation flow (cancellation reason survey).
  */
@js.native
trait SchemaSubscriptionCancelSurveyResult extends js.Object {
  /**
    * The cancellation reason the user chose in the survey. Possible values
    * are:   - Other  - I don&#39;t use this service enough  - Technical issues
    * - Cost-related reasons  - I found a better app
    */
  var cancelSurveyReason: js.UndefOr[Double] = js.native
  /**
    * The customized input cancel reason from the user. Only present when
    * cancelReason is 0.
    */
  var userInputCancelReason: js.UndefOr[String] = js.native
}

object SchemaSubscriptionCancelSurveyResult {
  @scala.inline
  def apply(cancelSurveyReason: Int | Double = null, userInputCancelReason: String = null): SchemaSubscriptionCancelSurveyResult = {
    val __obj = js.Dynamic.literal()
    if (cancelSurveyReason != null) __obj.updateDynamic("cancelSurveyReason")(cancelSurveyReason.asInstanceOf[js.Any])
    if (userInputCancelReason != null) __obj.updateDynamic("userInputCancelReason")(userInputCancelReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSubscriptionCancelSurveyResult]
  }
}


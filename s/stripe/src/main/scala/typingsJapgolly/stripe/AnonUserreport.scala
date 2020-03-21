package typingsJapgolly.stripe

import typingsJapgolly.stripe.stripeStrings.fraudulent
import typingsJapgolly.stripe.stripeStrings.safe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUserreport extends js.Object {
  /**
    * If you believe a charge is fraudulent, include a user_report key with a value of fraudulent. If you believe a
    * charge is safe, include a user_report key with a value of safe. Note that you must refund a charge before setting
    * the user_report to fraudulent. Stripe will use the information you send to improve our fraud detection algorithm
    */
  var user_report: js.UndefOr[fraudulent | safe] = js.undefined
}

object AnonUserreport {
  @scala.inline
  def apply(user_report: fraudulent | safe = null): AnonUserreport = {
    val __obj = js.Dynamic.literal()
    if (user_report != null) __obj.updateDynamic("user_report")(user_report.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUserreport]
  }
}


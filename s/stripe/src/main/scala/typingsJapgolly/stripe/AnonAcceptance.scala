package typingsJapgolly.stripe

import typingsJapgolly.stripe.stripeStrings.email
import typingsJapgolly.stripe.stripeStrings.manual
import typingsJapgolly.stripe.stripeStrings.none
import typingsJapgolly.stripe.stripeStrings.one_time
import typingsJapgolly.stripe.stripeStrings.scheduled
import typingsJapgolly.stripe.stripeStrings.variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAcceptance extends js.Object {
  var acceptance: js.UndefOr[AnonOffline] = js.undefined
  var amount: js.UndefOr[Double | Null] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var interval: js.UndefOr[one_time | scheduled | variable] = js.undefined
  var notification_method: js.UndefOr[email | manual | none] = js.undefined
}

object AnonAcceptance {
  @scala.inline
  def apply(
    acceptance: AnonOffline = null,
    amount: Int | Double = null,
    currency: String = null,
    interval: one_time | scheduled | variable = null,
    notification_method: email | manual | none = null
  ): AnonAcceptance = {
    val __obj = js.Dynamic.literal()
    if (acceptance != null) __obj.updateDynamic("acceptance")(acceptance.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (notification_method != null) __obj.updateDynamic("notification_method")(notification_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAcceptance]
  }
}


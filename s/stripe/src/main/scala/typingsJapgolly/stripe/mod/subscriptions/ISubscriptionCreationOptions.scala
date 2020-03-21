package typingsJapgolly.stripe.mod.subscriptions

import typingsJapgolly.stripe.mod.IOptionsMetadata
import typingsJapgolly.stripe.mod.cards.ICardSourceCreationOptions
import typingsJapgolly.stripe.stripeStrings.now
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionCreationOptions extends ISubscriptionCustCreationOptions {
  /**
    * A timestamp at which the subscription should cancel. If set to a date before the current period ends
    * this will cause a proration if prorate=true.
    */
  var cancel_at: js.UndefOr[Double | Null] = js.undefined
  /**
    * Boolean indicating whether this subscription should cancel at the end of the current period.
    */
  var cancel_at_period_end: js.UndefOr[Boolean] = js.undefined
  /***
    * The identifier of the customer to subscribe.
    */
  var customer: String
}

object ISubscriptionCreationOptions {
  @scala.inline
  def apply(
    customer: String,
    application_fee_percent: Int | Double = null,
    billing: SubscriptionBilling = null,
    billing_cycle_anchor: Int | Double = null,
    cancel_at: Int | Double = null,
    cancel_at_period_end: js.UndefOr[Boolean] = js.undefined,
    coupon: String = null,
    days_until_due: Int | Double = null,
    default_payment_method: String = null,
    default_source: String | ICardSourceCreationOptions = null,
    default_tax_rates: js.Array[String] = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    items: js.Array[ISubscriptionCreationItem] = null,
    metadata: IOptionsMetadata = null,
    off_session: js.UndefOr[Boolean] = js.undefined,
    pay_immediately: js.UndefOr[Boolean] = js.undefined,
    plan: String = null,
    prorate: js.UndefOr[Boolean] = js.undefined,
    quantity: Int | Double = null,
    tax_percent: Int | Double = null,
    trial_end: Double | now = null,
    trial_from_plan: js.UndefOr[Boolean] = js.undefined,
    trial_period_days: Int | Double = null
  ): ISubscriptionCreationOptions = {
    val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any])
    if (application_fee_percent != null) __obj.updateDynamic("application_fee_percent")(application_fee_percent.asInstanceOf[js.Any])
    if (billing != null) __obj.updateDynamic("billing")(billing.asInstanceOf[js.Any])
    if (billing_cycle_anchor != null) __obj.updateDynamic("billing_cycle_anchor")(billing_cycle_anchor.asInstanceOf[js.Any])
    if (cancel_at != null) __obj.updateDynamic("cancel_at")(cancel_at.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel_at_period_end)) __obj.updateDynamic("cancel_at_period_end")(cancel_at_period_end.asInstanceOf[js.Any])
    if (coupon != null) __obj.updateDynamic("coupon")(coupon.asInstanceOf[js.Any])
    if (days_until_due != null) __obj.updateDynamic("days_until_due")(days_until_due.asInstanceOf[js.Any])
    if (default_payment_method != null) __obj.updateDynamic("default_payment_method")(default_payment_method.asInstanceOf[js.Any])
    if (default_source != null) __obj.updateDynamic("default_source")(default_source.asInstanceOf[js.Any])
    if (default_tax_rates != null) __obj.updateDynamic("default_tax_rates")(default_tax_rates.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(off_session)) __obj.updateDynamic("off_session")(off_session.asInstanceOf[js.Any])
    if (!js.isUndefined(pay_immediately)) __obj.updateDynamic("pay_immediately")(pay_immediately.asInstanceOf[js.Any])
    if (plan != null) __obj.updateDynamic("plan")(plan.asInstanceOf[js.Any])
    if (!js.isUndefined(prorate)) __obj.updateDynamic("prorate")(prorate.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (tax_percent != null) __obj.updateDynamic("tax_percent")(tax_percent.asInstanceOf[js.Any])
    if (trial_end != null) __obj.updateDynamic("trial_end")(trial_end.asInstanceOf[js.Any])
    if (!js.isUndefined(trial_from_plan)) __obj.updateDynamic("trial_from_plan")(trial_from_plan.asInstanceOf[js.Any])
    if (trial_period_days != null) __obj.updateDynamic("trial_period_days")(trial_period_days.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionCreationOptions]
  }
}


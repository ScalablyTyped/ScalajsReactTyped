package typingsJapgolly.stripe.mod.plans

import typingsJapgolly.stripe.mod.IMetadata
import typingsJapgolly.stripe.mod.IResourceObject
import typingsJapgolly.stripe.mod.products.IProduct
import typingsJapgolly.stripe.stripeStrings.graduated
import typingsJapgolly.stripe.stripeStrings.last_during_period
import typingsJapgolly.stripe.stripeStrings.last_ever
import typingsJapgolly.stripe.stripeStrings.licensed
import typingsJapgolly.stripe.stripeStrings.max
import typingsJapgolly.stripe.stripeStrings.metered
import typingsJapgolly.stripe.stripeStrings.per_unit
import typingsJapgolly.stripe.stripeStrings.plan
import typingsJapgolly.stripe.stripeStrings.sum
import typingsJapgolly.stripe.stripeStrings.tiered
import typingsJapgolly.stripe.stripeStrings.volume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A subscription plan contains the pricing information for different products and feature levels on your site.
  * For example, you might have a $10/month plan for basic features and a different $20/month plan for premium features.
  */
trait IPlan extends IResourceObject {
  /**
    * Whether the plan is currently available for new subscriptions.
    */
  var active: Boolean
  /**
    * Specifies a usage aggregation strategy for plans of `usage_type=metered`. Allowed values are `sum` for summing up all usage during a period, `last_during_period` for picking the last usage record reported within a period, `last_ever` for picking the last usage record ever (across period bounds) or `max` which picks the usage record with the maximum reported usage during a period. Defaults to `sum`.
    */
  var aggregate_usage: sum | last_during_period | last_ever | max | Null
  /**
    * The amount in cents to be charged on the interval specified
    */
  var amount: Double | Null
  /**
    * Same as `amount`, but contains a decimal value with at most 12 decimal places.
    */
  var amount_decimal: String | Null
  /**
    * Describes how to compute the price per period. Either `per_unit` or `tiered`. `per_unit` indicates that the fixed amount (specified in `amount`) will be charged per unit in `quantity` (for plans with `usage_type=licensed`), or per unit of total usage (for plans with `usage_type=metered`). `tiered` indicates that the unit pricing will be computed using a tiering strategy as defined using the `tiers` and `tiers_mode` attributes.
    */
  var billing_scheme: per_unit | tiered
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String
  /**
    * One of `day`, `week`, `month` or `year`. The frequency with which a subscription should be billed.
    */
  var interval: IntervalUnit
  /**
    * The number of intervals (specified in the `interval` property) between subscription billings. For example, `interval=month` and `interval_count=3` bills every 3 months.
    */
  var interval_count: Double
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: IMetadata
  /**
    * A brief description of the plan, hidden from customers.
    */
  var nickname: String | Null
  /**
    * Value is "plan"
    */
  @JSName("object")
  var object_IPlan: plan
  /**
    * The product whose pricing this plan determines. [Expandable]
    */
  var product: js.UndefOr[String | IProduct] = js.undefined
  /**
    * Each element represents a pricing tier. This parameter requires `billing_scheme` to be set to `tiered`. See also the documentation for `billing_scheme`.
    */
  var tiers: js.Array[ITier] | Null
  /**
    * Defines if the tiering price should be `graduated` or `volume` based. In `volume`-based tiering, the maximum quantity within a period determines the per unit price, in `graduated` tiering pricing can successively change as the quantity grows.
    */
  var tiers_mode: graduated | volume | Null
  /**
    * Apply a transformation to the reported usage or set quantity before computing the billed price. Cannot be combined with `tiers`.
    */
  var transform_usage: ITransformUsage | Null
  /**
    * Default number of trial days when subscribing a customer to this plan using `trial_from_plan=true`.
    */
  var trial_period_days: Double | Null
  /**
    * Configures how the quantity per period should be determined, can be either `metered` or `licensed`. `licensed` will automatically bill the `quantity` set for a plan when adding it to a subscription, `metered` will aggregate the total usage based on usage records. Defaults to `licensed`.
    */
  var usage_type: metered | licensed
}

object IPlan {
  @scala.inline
  def apply(
    active: Boolean,
    billing_scheme: per_unit | tiered,
    created: Double,
    currency: String,
    id: String,
    interval: IntervalUnit,
    interval_count: Double,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: plan,
    usage_type: metered | licensed,
    aggregate_usage: sum | last_during_period | last_ever | max = null,
    amount: Int | Double = null,
    amount_decimal: String = null,
    nickname: String = null,
    product: String | IProduct = null,
    tiers: js.Array[ITier] = null,
    tiers_mode: graduated | volume = null,
    transform_usage: ITransformUsage = null,
    trial_period_days: Int | Double = null
  ): IPlan = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], billing_scheme = billing_scheme.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], interval_count = interval_count.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], usage_type = usage_type.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (aggregate_usage != null) __obj.updateDynamic("aggregate_usage")(aggregate_usage.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (amount_decimal != null) __obj.updateDynamic("amount_decimal")(amount_decimal.asInstanceOf[js.Any])
    if (nickname != null) __obj.updateDynamic("nickname")(nickname.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (tiers != null) __obj.updateDynamic("tiers")(tiers.asInstanceOf[js.Any])
    if (tiers_mode != null) __obj.updateDynamic("tiers_mode")(tiers_mode.asInstanceOf[js.Any])
    if (transform_usage != null) __obj.updateDynamic("transform_usage")(transform_usage.asInstanceOf[js.Any])
    if (trial_period_days != null) __obj.updateDynamic("trial_period_days")(trial_period_days.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlan]
  }
}


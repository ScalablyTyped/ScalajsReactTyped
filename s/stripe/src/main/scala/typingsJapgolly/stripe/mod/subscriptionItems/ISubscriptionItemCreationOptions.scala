package typingsJapgolly.stripe.mod.subscriptionItems

import typingsJapgolly.stripe.mod.IDataOptionsWithMetadata
import typingsJapgolly.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionItemCreationOptions extends IDataOptionsWithMetadata {
  /**
    * The identifier of the plan to add to the subscription.
    */
  var plan: String
  /**
    * Flag indicating whether to prorate switching plans during a billing cycle.
    */
  var prorate: js.UndefOr[Boolean] = js.undefined
  /**
    * If set, the proration will be calculated as though the subscription was updated at the given time. This can be used to apply the same
    * proration that was previewed with the upcoming invoice endpoint.
    */
  var proration_date: js.UndefOr[Double] = js.undefined
  /**
    * The quantity you’d like to apply to the subscription item you’re creating.
    */
  var quantity: js.UndefOr[Double] = js.undefined
  /**
    * The identifier of the subscription to modify.
    */
  var subscription: String
}

object ISubscriptionItemCreationOptions {
  @scala.inline
  def apply(
    plan: String,
    subscription: String,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null,
    prorate: js.UndefOr[Boolean] = js.undefined,
    proration_date: Int | Double = null,
    quantity: Int | Double = null
  ): ISubscriptionItemCreationOptions = {
    val __obj = js.Dynamic.literal(plan = plan.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(prorate)) __obj.updateDynamic("prorate")(prorate.asInstanceOf[js.Any])
    if (proration_date != null) __obj.updateDynamic("proration_date")(proration_date.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionItemCreationOptions]
  }
}


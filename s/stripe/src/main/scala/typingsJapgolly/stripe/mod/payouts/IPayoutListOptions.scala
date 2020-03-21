package typingsJapgolly.stripe.mod.payouts

import typingsJapgolly.stripe.mod.IDateFilter
import typingsJapgolly.stripe.mod.IListOptionsCreated
import typingsJapgolly.stripe.stripeStrings.canceled
import typingsJapgolly.stripe.stripeStrings.failed
import typingsJapgolly.stripe.stripeStrings.paid
import typingsJapgolly.stripe.stripeStrings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPayoutListOptions extends IListOptionsCreated {
  var arrival_date: js.UndefOr[String | IDateFilter] = js.undefined
  var destination: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[canceled | failed | paid | pending] = js.undefined
}

object IPayoutListOptions {
  @scala.inline
  def apply(
    arrival_date: String | IDateFilter = null,
    created: String | IDateFilter = null,
    destination: String = null,
    ending_before: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    limit: Int | Double = null,
    starting_after: String = null,
    status: canceled | failed | paid | pending = null
  ): IPayoutListOptions = {
    val __obj = js.Dynamic.literal()
    if (arrival_date != null) __obj.updateDynamic("arrival_date")(arrival_date.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPayoutListOptions]
  }
}


package typingsJapgolly.stripe.mod.applicationFees

import typingsJapgolly.stripe.mod.IDateFilter
import typingsJapgolly.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplicationFeeListOptions extends IListOptionsCreated {
  /**
    * Only return application fees for the charge specified by this charge ID.
    */
  var charge: String
}

object IApplicationFeeListOptions {
  @scala.inline
  def apply(
    charge: String,
    created: String | IDateFilter = null,
    ending_before: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    limit: Int | Double = null,
    starting_after: String = null
  ): IApplicationFeeListOptions = {
    val __obj = js.Dynamic.literal(charge = charge.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApplicationFeeListOptions]
  }
}


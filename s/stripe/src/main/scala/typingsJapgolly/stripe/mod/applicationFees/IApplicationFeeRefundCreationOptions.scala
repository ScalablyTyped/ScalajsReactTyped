package typingsJapgolly.stripe.mod.applicationFees

import typingsJapgolly.stripe.mod.IDataOptionsWithMetadata
import typingsJapgolly.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplicationFeeRefundCreationOptions extends IDataOptionsWithMetadata {
  /**
    * A positive integer in pence representing how much of this fee to refund.
    * Can only refund up to the unrefunded amount remaining of the fee.
    *
    * default is entire application fee
    */
  var amount: js.UndefOr[Double] = js.undefined
}

object IApplicationFeeRefundCreationOptions {
  @scala.inline
  def apply(
    amount: Int | Double = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null
  ): IApplicationFeeRefundCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApplicationFeeRefundCreationOptions]
  }
}


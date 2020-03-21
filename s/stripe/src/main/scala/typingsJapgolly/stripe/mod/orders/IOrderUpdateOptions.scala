package typingsJapgolly.stripe.mod.orders

import typingsJapgolly.stripe.mod.IDataOptionsWithMetadata
import typingsJapgolly.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOrderUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * A coupon code that represents a discount to be applied to this order. Must be one-time duration and in same currency as the order.
    */
  var coupon: js.UndefOr[String] = js.undefined
  /**
    * The shipping method to select for fulfilling this order. If specified, must be one of the ids of a shipping method in the
    * shipping_methods array. If specified, will overwrite the existing selected shipping method, updating items as necessary.
    */
  var selected_shipping_method: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[OrderStatus] = js.undefined
}

object IOrderUpdateOptions {
  @scala.inline
  def apply(
    coupon: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null,
    selected_shipping_method: String = null,
    status: OrderStatus = null
  ): IOrderUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (coupon != null) __obj.updateDynamic("coupon")(coupon.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (selected_shipping_method != null) __obj.updateDynamic("selected_shipping_method")(selected_shipping_method.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrderUpdateOptions]
  }
}


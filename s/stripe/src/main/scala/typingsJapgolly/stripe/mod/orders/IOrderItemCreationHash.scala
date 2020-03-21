package typingsJapgolly.stripe.mod.orders

import typingsJapgolly.stripe.stripeStrings.discount
import typingsJapgolly.stripe.stripeStrings.shipping
import typingsJapgolly.stripe.stripeStrings.sku
import typingsJapgolly.stripe.stripeStrings.tax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOrderItemCreationHash extends js.Object {
  /**
    * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a 0-decimal currency)
    * representing the total amount for the line item.
    */
  var amount: js.UndefOr[Double] = js.undefined
  /**
    * 3-letter ISO code representing the currency of the line item.
    */
  var currency: js.UndefOr[String] = js.undefined
  /**
    * Description of the line item, meant to be displayable to the user (e.g., "Express shipping").
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The ID of the SKU being ordered.
    */
  var parent: String
  /**
    * The quantity of this order item. When type is sku, this is the number of instances of the SKU to be ordered.
    */
  var quantity: js.UndefOr[Double] = js.undefined
  /**
    * The type of line item. One of "sku", "tax", "shipping", or "discount".
    */
  var `type`: js.UndefOr[sku | tax | shipping | discount] = js.undefined
}

object IOrderItemCreationHash {
  @scala.inline
  def apply(
    parent: String,
    amount: Int | Double = null,
    currency: String = null,
    description: String = null,
    quantity: Int | Double = null,
    `type`: sku | tax | shipping | discount = null
  ): IOrderItemCreationHash = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrderItemCreationHash]
  }
}


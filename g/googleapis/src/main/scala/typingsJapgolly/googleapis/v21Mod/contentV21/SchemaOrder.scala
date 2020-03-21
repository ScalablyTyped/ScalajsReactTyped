package typingsJapgolly.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Order. All methods require the order manager role.
  */
@js.native
trait SchemaOrder extends js.Object {
  /**
    * Whether the order was acknowledged.
    */
  var acknowledged: js.UndefOr[Boolean] = js.native
  /**
    * The billing address.
    */
  var billingAddress: js.UndefOr[SchemaOrderAddress] = js.native
  /**
    * The details of the customer who placed the order.
    */
  var customer: js.UndefOr[SchemaOrderCustomer] = js.native
  /**
    * The details for the delivery.
    */
  var deliveryDetails: js.UndefOr[SchemaOrderDeliveryDetails] = js.native
  /**
    * The REST ID of the order. Globally unique.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#order&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Line items that are ordered.
    */
  var lineItems: js.UndefOr[js.Array[SchemaOrderLineItem]] = js.native
  var merchantId: js.UndefOr[String] = js.native
  /**
    * Merchant-provided ID of the order.
    */
  var merchantOrderId: js.UndefOr[String] = js.native
  /**
    * The net amount for the order (price part). For example, if an order was
    * originally for $100 and a refund was issued for $20, the net amount will
    * be $80.
    */
  var netPriceAmount: js.UndefOr[SchemaPrice] = js.native
  /**
    * The net amount for the order (tax part). Note that in certain cases due
    * to taxable base adjustment netTaxAmount might not match to a sum of tax
    * field across all lineItems and refunds.
    */
  var netTaxAmount: js.UndefOr[SchemaPrice] = js.native
  /**
    * The status of the payment.
    */
  var paymentStatus: js.UndefOr[String] = js.native
  /**
    * The date when the order was placed, in ISO 8601 format.
    */
  var placedDate: js.UndefOr[String] = js.native
  /**
    * Promotions associated with the order.
    */
  var promotions: js.UndefOr[js.Array[SchemaOrderPromotion]] = js.native
  /**
    * Refunds for the order.
    */
  var refunds: js.UndefOr[js.Array[SchemaOrderRefund]] = js.native
  /**
    * Shipments of the order.
    */
  var shipments: js.UndefOr[js.Array[SchemaOrderShipment]] = js.native
  /**
    * The total cost of shipping for all items.
    */
  var shippingCost: js.UndefOr[SchemaPrice] = js.native
  /**
    * The tax for the total shipping cost.
    */
  var shippingCostTax: js.UndefOr[SchemaPrice] = js.native
  /**
    * The status of the order.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The party responsible for collecting and remitting taxes.
    */
  var taxCollector: js.UndefOr[String] = js.native
}

object SchemaOrder {
  @scala.inline
  def apply(
    acknowledged: js.UndefOr[Boolean] = js.undefined,
    billingAddress: SchemaOrderAddress = null,
    customer: SchemaOrderCustomer = null,
    deliveryDetails: SchemaOrderDeliveryDetails = null,
    id: String = null,
    kind: String = null,
    lineItems: js.Array[SchemaOrderLineItem] = null,
    merchantId: String = null,
    merchantOrderId: String = null,
    netPriceAmount: SchemaPrice = null,
    netTaxAmount: SchemaPrice = null,
    paymentStatus: String = null,
    placedDate: String = null,
    promotions: js.Array[SchemaOrderPromotion] = null,
    refunds: js.Array[SchemaOrderRefund] = null,
    shipments: js.Array[SchemaOrderShipment] = null,
    shippingCost: SchemaPrice = null,
    shippingCostTax: SchemaPrice = null,
    status: String = null,
    taxCollector: String = null
  ): SchemaOrder = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acknowledged)) __obj.updateDynamic("acknowledged")(acknowledged.asInstanceOf[js.Any])
    if (billingAddress != null) __obj.updateDynamic("billingAddress")(billingAddress.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (deliveryDetails != null) __obj.updateDynamic("deliveryDetails")(deliveryDetails.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (merchantOrderId != null) __obj.updateDynamic("merchantOrderId")(merchantOrderId.asInstanceOf[js.Any])
    if (netPriceAmount != null) __obj.updateDynamic("netPriceAmount")(netPriceAmount.asInstanceOf[js.Any])
    if (netTaxAmount != null) __obj.updateDynamic("netTaxAmount")(netTaxAmount.asInstanceOf[js.Any])
    if (paymentStatus != null) __obj.updateDynamic("paymentStatus")(paymentStatus.asInstanceOf[js.Any])
    if (placedDate != null) __obj.updateDynamic("placedDate")(placedDate.asInstanceOf[js.Any])
    if (promotions != null) __obj.updateDynamic("promotions")(promotions.asInstanceOf[js.Any])
    if (refunds != null) __obj.updateDynamic("refunds")(refunds.asInstanceOf[js.Any])
    if (shipments != null) __obj.updateDynamic("shipments")(shipments.asInstanceOf[js.Any])
    if (shippingCost != null) __obj.updateDynamic("shippingCost")(shippingCost.asInstanceOf[js.Any])
    if (shippingCostTax != null) __obj.updateDynamic("shippingCostTax")(shippingCostTax.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (taxCollector != null) __obj.updateDynamic("taxCollector")(taxCollector.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrder]
  }
}


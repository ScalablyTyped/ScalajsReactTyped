package typingsJapgolly.gapiClientContent.gapi.client.content

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientContent.AnonAcknowledged
import typingsJapgolly.gapiClientContent.AnonAlt
import typingsJapgolly.gapiClientContent.AnonMerchantOrderId
import typingsJapgolly.gapiClientContent.AnonOrderId
import typingsJapgolly.gapiClientContent.AnonQuotaUser
import typingsJapgolly.gapiClientContent.AnonTemplateName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersResource extends js.Object {
  /** Marks an order as acknowledged. This method can only be called for non-multi-client accounts. */
  def acknowledge(request: AnonOrderId): Request_[OrdersAcknowledgeResponse]
  /** Sandbox only. Moves a test order from state "inProgress" to state "pendingShipment". This method can only be called for non-multi-client accounts. */
  def advancetestorder(request: AnonOrderId): Request_[OrdersAdvanceTestOrderResponse]
  /** Cancels all line items in an order, making a full refund. This method can only be called for non-multi-client accounts. */
  def cancel(request: AnonOrderId): Request_[OrdersCancelResponse]
  /** Cancels a line item, making a full refund. This method can only be called for non-multi-client accounts. */
  def cancellineitem(request: AnonOrderId): Request_[OrdersCancelLineItemResponse]
  /** Sandbox only. Creates a test order. This method can only be called for non-multi-client accounts. */
  def createtestorder(request: AnonQuotaUser): Request_[OrdersCreateTestOrderResponse]
  /** Retrieves or modifies multiple orders in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: AnonAlt): Request_[OrdersCustomBatchResponse]
  /** Retrieves an order from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: AnonOrderId): Request_[Order]
  /** Retrieves an order using merchant order id. This method can only be called for non-multi-client accounts. */
  def getbymerchantorderid(request: AnonMerchantOrderId): Request_[OrdersGetByMerchantOrderIdResponse]
  /**
    * Sandbox only. Retrieves an order template that can be used to quickly create a new order in sandbox. This method can only be called for
    * non-multi-client accounts.
    */
  def gettestordertemplate(request: AnonTemplateName): Request_[OrdersGetTestOrderTemplateResponse]
  /** Lists the orders in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: AnonAcknowledged): Request_[OrdersListResponse]
  /** Refund a portion of the order, up to the full amount paid. This method can only be called for non-multi-client accounts. */
  def refund(request: AnonOrderId): Request_[OrdersRefundResponse]
  /** Returns a line item. This method can only be called for non-multi-client accounts. */
  def returnlineitem(request: AnonOrderId): Request_[OrdersReturnLineItemResponse]
  /** Marks line item(s) as shipped. This method can only be called for non-multi-client accounts. */
  def shiplineitems(request: AnonOrderId): Request_[OrdersShipLineItemsResponse]
  /** Updates the merchant order ID for a given order. This method can only be called for non-multi-client accounts. */
  def updatemerchantorderid(request: AnonOrderId): Request_[OrdersUpdateMerchantOrderIdResponse]
  /** Updates a shipment's status, carrier, and/or tracking ID. This method can only be called for non-multi-client accounts. */
  def updateshipment(request: AnonOrderId): Request_[OrdersUpdateShipmentResponse]
}

object OrdersResource {
  @scala.inline
  def apply(
    acknowledge: AnonOrderId => CallbackTo[Request_[OrdersAcknowledgeResponse]],
    advancetestorder: AnonOrderId => CallbackTo[Request_[OrdersAdvanceTestOrderResponse]],
    cancel: AnonOrderId => CallbackTo[Request_[OrdersCancelResponse]],
    cancellineitem: AnonOrderId => CallbackTo[Request_[OrdersCancelLineItemResponse]],
    createtestorder: AnonQuotaUser => CallbackTo[Request_[OrdersCreateTestOrderResponse]],
    custombatch: AnonAlt => CallbackTo[Request_[OrdersCustomBatchResponse]],
    get: AnonOrderId => CallbackTo[Request_[Order]],
    getbymerchantorderid: AnonMerchantOrderId => CallbackTo[Request_[OrdersGetByMerchantOrderIdResponse]],
    gettestordertemplate: AnonTemplateName => CallbackTo[Request_[OrdersGetTestOrderTemplateResponse]],
    list: AnonAcknowledged => CallbackTo[Request_[OrdersListResponse]],
    refund: AnonOrderId => CallbackTo[Request_[OrdersRefundResponse]],
    returnlineitem: AnonOrderId => CallbackTo[Request_[OrdersReturnLineItemResponse]],
    shiplineitems: AnonOrderId => CallbackTo[Request_[OrdersShipLineItemsResponse]],
    updatemerchantorderid: AnonOrderId => CallbackTo[Request_[OrdersUpdateMerchantOrderIdResponse]],
    updateshipment: AnonOrderId => CallbackTo[Request_[OrdersUpdateShipmentResponse]]
  ): OrdersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acknowledge")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonOrderId) => acknowledge(t0).runNow()))
    __obj.updateDynamic("advancetestorder")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonOrderId) => advancetestorder(t0).runNow()))
    __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonOrderId) => cancel(t0).runNow()))
    __obj.updateDynamic("cancellineitem")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonOrderId) => cancellineitem(t0).runNow()))
    __obj.updateDynamic("createtestorder")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonQuotaUser) => createtestorder(t0).runNow()))
    __obj.updateDynamic("custombatch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonAlt) => custombatch(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonOrderId) => get(t0).runNow()))
    __obj.updateDynamic("getbymerchantorderid")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonMerchantOrderId) => getbymerchantorderid(t0).runNow()))
    __obj.updateDynamic("gettestordertemplate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonTemplateName) => gettestordertemplate(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonAcknowledged) => list(t0).runNow()))
    __obj.updateDynamic("refund")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonOrderId) => refund(t0).runNow()))
    __obj.updateDynamic("returnlineitem")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonOrderId) => returnlineitem(t0).runNow()))
    __obj.updateDynamic("shiplineitems")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonOrderId) => shiplineitems(t0).runNow()))
    __obj.updateDynamic("updatemerchantorderid")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonOrderId) => updatemerchantorderid(t0).runNow()))
    __obj.updateDynamic("updateshipment")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonOrderId) => updateshipment(t0).runNow()))
    __obj.asInstanceOf[OrdersResource]
  }
}


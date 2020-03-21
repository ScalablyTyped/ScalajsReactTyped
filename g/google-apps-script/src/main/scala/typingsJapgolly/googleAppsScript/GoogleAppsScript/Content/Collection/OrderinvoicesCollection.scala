package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderinvoicesCreateChargeInvoiceRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderinvoicesCreateChargeInvoiceResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderinvoicesCreateRefundInvoiceRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderinvoicesCreateRefundInvoiceResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderinvoicesCollection extends js.Object {
  // Creates a charge invoice for a shipment group, and triggers a charge capture for non-facilitated payment orders.
  def createchargeinvoice(resource: OrderinvoicesCreateChargeInvoiceRequest, merchantId: String, orderId: String): OrderinvoicesCreateChargeInvoiceResponse
  // Creates a refund invoice for one or more shipment groups, and triggers a refund for non-facilitated payment orders. This can only be used for line items that have previously been charged using createChargeInvoice. All amounts (except for the summary) are incremental with respect to the previous invoice.
  def createrefundinvoice(resource: OrderinvoicesCreateRefundInvoiceRequest, merchantId: String, orderId: String): OrderinvoicesCreateRefundInvoiceResponse
}

object OrderinvoicesCollection {
  @scala.inline
  def apply(
    createchargeinvoice: (OrderinvoicesCreateChargeInvoiceRequest, String, String) => CallbackTo[OrderinvoicesCreateChargeInvoiceResponse],
    createrefundinvoice: (OrderinvoicesCreateRefundInvoiceRequest, String, String) => CallbackTo[OrderinvoicesCreateRefundInvoiceResponse]
  ): OrderinvoicesCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createchargeinvoice")(js.Any.fromFunction3((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderinvoicesCreateChargeInvoiceRequest, t1: java.lang.String, t2: java.lang.String) => createchargeinvoice(t0, t1, t2).runNow()))
    __obj.updateDynamic("createrefundinvoice")(js.Any.fromFunction3((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderinvoicesCreateRefundInvoiceRequest, t1: java.lang.String, t2: java.lang.String) => createrefundinvoice(t0, t1, t2).runNow()))
    __obj.asInstanceOf[OrderinvoicesCollection]
  }
}


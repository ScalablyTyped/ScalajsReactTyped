package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderinvoicesCreateChargeInvoiceRequest extends StObject {
  
  /** [required] The ID of the invoice. */
  var invoiceId: js.UndefOr[String] = js.undefined
  
  /** [required] Invoice summary. */
  var invoiceSummary: js.UndefOr[InvoiceSummary] = js.undefined
  
  /** [required] Invoice details per line item. */
  var lineItemInvoices: js.UndefOr[js.Array[ShipmentInvoiceLineItemInvoice]] = js.undefined
  
  /** [required] The ID of the operation, unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.undefined
  
  /**
    * [required] ID of the shipment group. It is assigned by the merchant in the `shipLineItems` method and is used to group multiple line items that have the same kind of shipping
    * charges.
    */
  var shipmentGroupId: js.UndefOr[String] = js.undefined
}
object OrderinvoicesCreateChargeInvoiceRequest {
  
  inline def apply(): OrderinvoicesCreateChargeInvoiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderinvoicesCreateChargeInvoiceRequest]
  }
  
  extension [Self <: OrderinvoicesCreateChargeInvoiceRequest](x: Self) {
    
    inline def setInvoiceId(value: String): Self = StObject.set(x, "invoiceId", value.asInstanceOf[js.Any])
    
    inline def setInvoiceIdUndefined: Self = StObject.set(x, "invoiceId", js.undefined)
    
    inline def setInvoiceSummary(value: InvoiceSummary): Self = StObject.set(x, "invoiceSummary", value.asInstanceOf[js.Any])
    
    inline def setInvoiceSummaryUndefined: Self = StObject.set(x, "invoiceSummary", js.undefined)
    
    inline def setLineItemInvoices(value: js.Array[ShipmentInvoiceLineItemInvoice]): Self = StObject.set(x, "lineItemInvoices", value.asInstanceOf[js.Any])
    
    inline def setLineItemInvoicesUndefined: Self = StObject.set(x, "lineItemInvoices", js.undefined)
    
    inline def setLineItemInvoicesVarargs(value: ShipmentInvoiceLineItemInvoice*): Self = StObject.set(x, "lineItemInvoices", js.Array(value*))
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setShipmentGroupId(value: String): Self = StObject.set(x, "shipmentGroupId", value.asInstanceOf[js.Any])
    
    inline def setShipmentGroupIdUndefined: Self = StObject.set(x, "shipmentGroupId", js.undefined)
  }
}

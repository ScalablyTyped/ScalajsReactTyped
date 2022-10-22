package typingsJapgolly.paypalRestSdk.mod

import typingsJapgolly.paypalRestSdk.anon.Allowedpaymentmethod
import typingsJapgolly.paypalRestSdk.anon.Items
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transaction extends StObject {
  
  var amount: Amount
  
  var custom: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var invoice_number: js.UndefOr[String] = js.undefined
  
  var item_list: js.UndefOr[Items] = js.undefined
  
  var note_to_payee: js.UndefOr[String] = js.undefined
  
  var notify_url: js.UndefOr[String] = js.undefined
  
  var order_url: js.UndefOr[String] = js.undefined
  
  var payee: js.UndefOr[Payee] = js.undefined
  
  var payment_options: js.UndefOr[Allowedpaymentmethod] = js.undefined
  
  var purchase_order: js.UndefOr[String] = js.undefined
  
  var reference_id: js.UndefOr[String] = js.undefined
  
  val related_resources: js.UndefOr[js.Array[RelatedResources]] = js.undefined
  
  var soft_descriptor: js.UndefOr[String] = js.undefined
}
object Transaction {
  
  inline def apply(amount: Amount): Transaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  
  extension [Self <: Transaction](x: Self) {
    
    inline def setAmount(value: Amount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCustom(value: String): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInvoice_number(value: String): Self = StObject.set(x, "invoice_number", value.asInstanceOf[js.Any])
    
    inline def setInvoice_numberUndefined: Self = StObject.set(x, "invoice_number", js.undefined)
    
    inline def setItem_list(value: Items): Self = StObject.set(x, "item_list", value.asInstanceOf[js.Any])
    
    inline def setItem_listUndefined: Self = StObject.set(x, "item_list", js.undefined)
    
    inline def setNote_to_payee(value: String): Self = StObject.set(x, "note_to_payee", value.asInstanceOf[js.Any])
    
    inline def setNote_to_payeeUndefined: Self = StObject.set(x, "note_to_payee", js.undefined)
    
    inline def setNotify_url(value: String): Self = StObject.set(x, "notify_url", value.asInstanceOf[js.Any])
    
    inline def setNotify_urlUndefined: Self = StObject.set(x, "notify_url", js.undefined)
    
    inline def setOrder_url(value: String): Self = StObject.set(x, "order_url", value.asInstanceOf[js.Any])
    
    inline def setOrder_urlUndefined: Self = StObject.set(x, "order_url", js.undefined)
    
    inline def setPayee(value: Payee): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
    
    inline def setPayeeUndefined: Self = StObject.set(x, "payee", js.undefined)
    
    inline def setPayment_options(value: Allowedpaymentmethod): Self = StObject.set(x, "payment_options", value.asInstanceOf[js.Any])
    
    inline def setPayment_optionsUndefined: Self = StObject.set(x, "payment_options", js.undefined)
    
    inline def setPurchase_order(value: String): Self = StObject.set(x, "purchase_order", value.asInstanceOf[js.Any])
    
    inline def setPurchase_orderUndefined: Self = StObject.set(x, "purchase_order", js.undefined)
    
    inline def setReference_id(value: String): Self = StObject.set(x, "reference_id", value.asInstanceOf[js.Any])
    
    inline def setReference_idUndefined: Self = StObject.set(x, "reference_id", js.undefined)
    
    inline def setRelated_resources(value: js.Array[RelatedResources]): Self = StObject.set(x, "related_resources", value.asInstanceOf[js.Any])
    
    inline def setRelated_resourcesUndefined: Self = StObject.set(x, "related_resources", js.undefined)
    
    inline def setRelated_resourcesVarargs(value: RelatedResources*): Self = StObject.set(x, "related_resources", js.Array(value*))
    
    inline def setSoft_descriptor(value: String): Self = StObject.set(x, "soft_descriptor", value.asInstanceOf[js.Any])
    
    inline def setSoft_descriptorUndefined: Self = StObject.set(x, "soft_descriptor", js.undefined)
  }
}

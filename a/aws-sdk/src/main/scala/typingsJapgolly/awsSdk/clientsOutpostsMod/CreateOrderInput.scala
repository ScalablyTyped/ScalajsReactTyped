package typingsJapgolly.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOrderInput extends StObject {
  
  /**
    * The line items that make up the order.
    */
  var LineItems: LineItemRequestListDefinition
  
  /**
    *  The ID or the Amazon Resource Name (ARN) of the Outpost. 
    */
  var OutpostIdentifier: typingsJapgolly.awsSdk.clientsOutpostsMod.OutpostIdentifier
  
  /**
    * The payment option.
    */
  var PaymentOption: typingsJapgolly.awsSdk.clientsOutpostsMod.PaymentOption
  
  /**
    * The payment terms.
    */
  var PaymentTerm: js.UndefOr[typingsJapgolly.awsSdk.clientsOutpostsMod.PaymentTerm] = js.undefined
}
object CreateOrderInput {
  
  inline def apply(
    LineItems: LineItemRequestListDefinition,
    OutpostIdentifier: OutpostIdentifier,
    PaymentOption: PaymentOption
  ): CreateOrderInput = {
    val __obj = js.Dynamic.literal(LineItems = LineItems.asInstanceOf[js.Any], OutpostIdentifier = OutpostIdentifier.asInstanceOf[js.Any], PaymentOption = PaymentOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOrderInput]
  }
  
  extension [Self <: CreateOrderInput](x: Self) {
    
    inline def setLineItems(value: LineItemRequestListDefinition): Self = StObject.set(x, "LineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsVarargs(value: LineItemRequest*): Self = StObject.set(x, "LineItems", js.Array(value*))
    
    inline def setOutpostIdentifier(value: OutpostIdentifier): Self = StObject.set(x, "OutpostIdentifier", value.asInstanceOf[js.Any])
    
    inline def setPaymentOption(value: PaymentOption): Self = StObject.set(x, "PaymentOption", value.asInstanceOf[js.Any])
    
    inline def setPaymentTerm(value: PaymentTerm): Self = StObject.set(x, "PaymentTerm", value.asInstanceOf[js.Any])
    
    inline def setPaymentTermUndefined: Self = StObject.set(x, "PaymentTerm", js.undefined)
  }
}

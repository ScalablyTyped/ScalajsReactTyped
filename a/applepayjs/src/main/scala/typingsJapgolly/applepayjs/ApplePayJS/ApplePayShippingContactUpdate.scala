package typingsJapgolly.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updated transaction details resulting from a change in shipping contact, including any errors.
  */
trait ApplePayShippingContactUpdate extends StObject {
  
  /**
    * List of custom errors to display on the payment sheet.
    */
  var errors: js.UndefOr[js.Array[ApplePayError]] = js.undefined
  
  /**
    * An optional list of updated line items.
    */
  var newLineItems: js.UndefOr[js.Array[ApplePayLineItem]] = js.undefined
  
  /**
    * A list of shipping methods that are available to the updated shipping contact.
    */
  var newShippingMethods: js.UndefOr[js.Array[ApplePayShippingMethod]] = js.undefined
  
  /**
    * The new total resulting from a change in the shipping contact.
    */
  var newTotal: ApplePayLineItem
}
object ApplePayShippingContactUpdate {
  
  inline def apply(newTotal: ApplePayLineItem): ApplePayShippingContactUpdate = {
    val __obj = js.Dynamic.literal(newTotal = newTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayShippingContactUpdate]
  }
  
  extension [Self <: ApplePayShippingContactUpdate](x: Self) {
    
    inline def setErrors(value: js.Array[ApplePayError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: ApplePayError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setNewLineItems(value: js.Array[ApplePayLineItem]): Self = StObject.set(x, "newLineItems", value.asInstanceOf[js.Any])
    
    inline def setNewLineItemsUndefined: Self = StObject.set(x, "newLineItems", js.undefined)
    
    inline def setNewLineItemsVarargs(value: ApplePayLineItem*): Self = StObject.set(x, "newLineItems", js.Array(value*))
    
    inline def setNewShippingMethods(value: js.Array[ApplePayShippingMethod]): Self = StObject.set(x, "newShippingMethods", value.asInstanceOf[js.Any])
    
    inline def setNewShippingMethodsUndefined: Self = StObject.set(x, "newShippingMethods", js.undefined)
    
    inline def setNewShippingMethodsVarargs(value: ApplePayShippingMethod*): Self = StObject.set(x, "newShippingMethods", js.Array(value*))
    
    inline def setNewTotal(value: ApplePayLineItem): Self = StObject.set(x, "newTotal", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3VerticalsPurchasePurchaseError extends StObject {
  
  /**
    * Available quantity now. Applicable in case of AVAILABILITY_CHANGED.
    */
  var availableQuantity: js.UndefOr[Double] = js.undefined
  
  /**
    * Additional error description.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Entity Id that corresponds to the error. Example this can correspond to
    * LineItemId / ItemOptionId.
    */
  var entityId: js.UndefOr[String] = js.undefined
  
  /**
    * Required: This represents the granular reason why an order gets rejected by
    * the merchant.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseErrorType] = js.undefined
  
  /**
    * Relevant in case of PRICE_CHANGED / INCORRECT_PRICE error type.
    */
  var updatedPrice: js.UndefOr[GoogleActionsOrdersV3PriceAttribute] = js.undefined
}
object GoogleActionsOrdersV3VerticalsPurchasePurchaseError {
  
  inline def apply(): GoogleActionsOrdersV3VerticalsPurchasePurchaseError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseError]
  }
  
  extension [Self <: GoogleActionsOrdersV3VerticalsPurchasePurchaseError](x: Self) {
    
    inline def setAvailableQuantity(value: Double): Self = StObject.set(x, "availableQuantity", value.asInstanceOf[js.Any])
    
    inline def setAvailableQuantityUndefined: Self = StObject.set(x, "availableQuantity", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setType(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseErrorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdatedPrice(value: GoogleActionsOrdersV3PriceAttribute): Self = StObject.set(x, "updatedPrice", value.asInstanceOf[js.Any])
    
    inline def setUpdatedPriceUndefined: Self = StObject.set(x, "updatedPrice", js.undefined)
  }
}

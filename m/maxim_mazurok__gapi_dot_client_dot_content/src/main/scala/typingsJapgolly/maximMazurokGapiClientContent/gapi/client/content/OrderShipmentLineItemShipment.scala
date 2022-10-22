package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderShipmentLineItemShipment extends StObject {
  
  /** The ID of the line item that is shipped. This value is assigned by Google when an order is created. Either lineItemId or productId is required. */
  var lineItemId: js.UndefOr[String] = js.undefined
  
  /** The ID of the product to ship. This is the REST ID used in the products service. Either lineItemId or productId is required. */
  var productId: js.UndefOr[String] = js.undefined
  
  /** The quantity that is shipped. */
  var quantity: js.UndefOr[Double] = js.undefined
}
object OrderShipmentLineItemShipment {
  
  inline def apply(): OrderShipmentLineItemShipment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderShipmentLineItemShipment]
  }
  
  extension [Self <: OrderShipmentLineItemShipment](x: Self) {
    
    inline def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}

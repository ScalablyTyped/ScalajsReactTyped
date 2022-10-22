package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderLineItemShippingDetails extends StObject {
  
  /** Required. The delivery by date, in ISO 8601 format. */
  var deliverByDate: js.UndefOr[String] = js.undefined
  
  /** Required. Details of the shipping method. */
  var method: js.UndefOr[OrderLineItemShippingDetailsMethod] = js.undefined
  
  /** The promised time in minutes in which the order will be ready for pickup. This only applies to buy-online-pickup-in-store same-day order. */
  var pickupPromiseInMinutes: js.UndefOr[Double] = js.undefined
  
  /** Required. The ship by date, in ISO 8601 format. */
  var shipByDate: js.UndefOr[String] = js.undefined
  
  /** Type of shipment. Indicates whether `deliveryDetails` or `pickupDetails` is applicable for this shipment. Acceptable values are: - "`delivery`" - "`pickup`" */
  var `type`: js.UndefOr[String] = js.undefined
}
object OrderLineItemShippingDetails {
  
  inline def apply(): OrderLineItemShippingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLineItemShippingDetails]
  }
  
  extension [Self <: OrderLineItemShippingDetails](x: Self) {
    
    inline def setDeliverByDate(value: String): Self = StObject.set(x, "deliverByDate", value.asInstanceOf[js.Any])
    
    inline def setDeliverByDateUndefined: Self = StObject.set(x, "deliverByDate", js.undefined)
    
    inline def setMethod(value: OrderLineItemShippingDetailsMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPickupPromiseInMinutes(value: Double): Self = StObject.set(x, "pickupPromiseInMinutes", value.asInstanceOf[js.Any])
    
    inline def setPickupPromiseInMinutesUndefined: Self = StObject.set(x, "pickupPromiseInMinutes", js.undefined)
    
    inline def setShipByDate(value: String): Self = StObject.set(x, "shipByDate", value.asInstanceOf[js.Any])
    
    inline def setShipByDateUndefined: Self = StObject.set(x, "shipByDate", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

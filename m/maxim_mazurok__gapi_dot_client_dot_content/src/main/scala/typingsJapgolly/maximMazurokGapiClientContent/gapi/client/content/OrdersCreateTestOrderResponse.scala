package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersCreateTestOrderResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#ordersCreateTestOrderResponse`". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The ID of the newly created test order. */
  var orderId: js.UndefOr[String] = js.undefined
}
object OrdersCreateTestOrderResponse {
  
  inline def apply(): OrdersCreateTestOrderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCreateTestOrderResponse]
  }
  
  extension [Self <: OrdersCreateTestOrderResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
  }
}

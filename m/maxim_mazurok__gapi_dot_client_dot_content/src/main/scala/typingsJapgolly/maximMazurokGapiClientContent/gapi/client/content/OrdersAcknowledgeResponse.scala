package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersAcknowledgeResponse extends StObject {
  
  /** The status of the execution. Acceptable values are: - "`duplicate`" - "`executed`" */
  var executionStatus: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#ordersAcknowledgeResponse`". */
  var kind: js.UndefOr[String] = js.undefined
}
object OrdersAcknowledgeResponse {
  
  inline def apply(): OrdersAcknowledgeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersAcknowledgeResponse]
  }
  
  extension [Self <: OrdersAcknowledgeResponse](x: Self) {
    
    inline def setExecutionStatus(value: String): Self = StObject.set(x, "executionStatus", value.asInstanceOf[js.Any])
    
    inline def setExecutionStatusUndefined: Self = StObject.set(x, "executionStatus", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

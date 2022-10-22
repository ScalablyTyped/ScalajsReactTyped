package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInsertionOrdersResponse extends StObject {
  
  /** The list of insertion orders. This list will be absent if empty. */
  var insertionOrders: js.UndefOr[js.Array[InsertionOrder]] = js.undefined
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListInsertionOrders` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListInsertionOrdersResponse {
  
  inline def apply(): ListInsertionOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInsertionOrdersResponse]
  }
  
  extension [Self <: ListInsertionOrdersResponse](x: Self) {
    
    inline def setInsertionOrders(value: js.Array[InsertionOrder]): Self = StObject.set(x, "insertionOrders", value.asInstanceOf[js.Any])
    
    inline def setInsertionOrdersUndefined: Self = StObject.set(x, "insertionOrders", js.undefined)
    
    inline def setInsertionOrdersVarargs(value: InsertionOrder*): Self = StObject.set(x, "insertionOrders", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}

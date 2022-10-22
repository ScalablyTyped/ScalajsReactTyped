package typingsJapgolly.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLiveSourcesResponse extends StObject {
  
  /**
    * Lists the live sources.
    */
  var Items: js.UndefOr[listOfLiveSource] = js.undefined
  
  /**
    * Pagination token from the list request. Use the token to fetch the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListLiveSourcesResponse {
  
  inline def apply(): ListLiveSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLiveSourcesResponse]
  }
  
  extension [Self <: ListLiveSourcesResponse](x: Self) {
    
    inline def setItems(value: listOfLiveSource): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: LiveSource*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

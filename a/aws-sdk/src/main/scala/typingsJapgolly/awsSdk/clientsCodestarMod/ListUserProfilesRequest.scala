package typingsJapgolly.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUserProfilesRequest extends StObject {
  
  /**
    * The maximum number of results to return in a response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The continuation token for the next set of results, if the results cannot be returned in one response.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListUserProfilesRequest {
  
  inline def apply(): ListUserProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserProfilesRequest]
  }
  
  extension [Self <: ListUserProfilesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

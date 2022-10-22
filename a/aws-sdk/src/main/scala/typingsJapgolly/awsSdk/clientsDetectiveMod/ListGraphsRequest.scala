package typingsJapgolly.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGraphsRequest extends StObject {
  
  /**
    * The maximum number of graphs to return at a time. The total must be less than the overall limit on the number of results to return, which is currently 200.
    */
  var MaxResults: js.UndefOr[MemberResultsLimit] = js.undefined
  
  /**
    * For requests to get the next page of results, the pagination token that was returned with the previous set of results. The initial request does not include a pagination token.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListGraphsRequest {
  
  inline def apply(): ListGraphsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGraphsRequest]
  }
  
  extension [Self <: ListGraphsRequest](x: Self) {
    
    inline def setMaxResults(value: MemberResultsLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

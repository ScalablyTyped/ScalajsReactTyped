package typingsJapgolly.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorldExportJobsResponse extends StObject {
  
  /**
    * If the previous paginated request did not return all of the remaining results, the response object's nextToken parameter value is set to a token. To retrieve the next set of results, call ListWorldExportJobsRequest again and assign that token to the request object's nextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Summary information for world export jobs.
    */
  var worldExportJobSummaries: WorldExportJobSummaries
}
object ListWorldExportJobsResponse {
  
  inline def apply(worldExportJobSummaries: WorldExportJobSummaries): ListWorldExportJobsResponse = {
    val __obj = js.Dynamic.literal(worldExportJobSummaries = worldExportJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorldExportJobsResponse]
  }
  
  extension [Self <: ListWorldExportJobsResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setWorldExportJobSummaries(value: WorldExportJobSummaries): Self = StObject.set(x, "worldExportJobSummaries", value.asInstanceOf[js.Any])
    
    inline def setWorldExportJobSummariesVarargs(value: WorldExportJobSummary*): Self = StObject.set(x, "worldExportJobSummaries", js.Array(value*))
  }
}

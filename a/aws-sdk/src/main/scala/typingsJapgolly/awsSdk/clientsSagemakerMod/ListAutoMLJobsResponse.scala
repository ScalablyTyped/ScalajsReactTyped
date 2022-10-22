package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAutoMLJobsResponse extends StObject {
  
  /**
    * Returns a summary list of jobs.
    */
  var AutoMLJobSummaries: typingsJapgolly.awsSdk.clientsSagemakerMod.AutoMLJobSummaries
  
  /**
    * If the previous response was truncated, you receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListAutoMLJobsResponse {
  
  inline def apply(AutoMLJobSummaries: AutoMLJobSummaries): ListAutoMLJobsResponse = {
    val __obj = js.Dynamic.literal(AutoMLJobSummaries = AutoMLJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAutoMLJobsResponse]
  }
  
  extension [Self <: ListAutoMLJobsResponse](x: Self) {
    
    inline def setAutoMLJobSummaries(value: AutoMLJobSummaries): Self = StObject.set(x, "AutoMLJobSummaries", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobSummariesVarargs(value: AutoMLJobSummary*): Self = StObject.set(x, "AutoMLJobSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

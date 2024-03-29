package typingsJapgolly.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobQueuesRequest extends StObject {
  
  /**
    * A list of up to 100 queue names or full queue Amazon Resource Name (ARN) entries.
    */
  var jobQueues: js.UndefOr[StringList] = js.undefined
  
  /**
    * The maximum number of results returned by DescribeJobQueues in paginated output. When this parameter is used, DescribeJobQueues only returns maxResults results in a single page and a nextToken response element. The remaining results of the initial request can be seen by sending another DescribeJobQueues request with the returned nextToken value. This value can be between 1 and 100. If this parameter isn't used, then DescribeJobQueues returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated DescribeJobQueues request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.  This token should be treated as an opaque identifier that's only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object DescribeJobQueuesRequest {
  
  inline def apply(): DescribeJobQueuesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobQueuesRequest]
  }
  
  extension [Self <: DescribeJobQueuesRequest](x: Self) {
    
    inline def setJobQueues(value: StringList): Self = StObject.set(x, "jobQueues", value.asInstanceOf[js.Any])
    
    inline def setJobQueuesUndefined: Self = StObject.set(x, "jobQueues", js.undefined)
    
    inline def setJobQueuesVarargs(value: String*): Self = StObject.set(x, "jobQueues", js.Array(value*))
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

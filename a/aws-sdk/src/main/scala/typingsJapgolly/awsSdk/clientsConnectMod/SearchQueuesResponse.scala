package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchQueuesResponse extends StObject {
  
  /**
    * The total number of queues which matched your search query.
    */
  var ApproximateTotalCount: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.ApproximateTotalCount] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[NextToken2500] = js.undefined
  
  /**
    * Information about the queues.
    */
  var Queues: js.UndefOr[QueueSearchSummaryList] = js.undefined
}
object SearchQueuesResponse {
  
  inline def apply(): SearchQueuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchQueuesResponse]
  }
  
  extension [Self <: SearchQueuesResponse](x: Self) {
    
    inline def setApproximateTotalCount(value: ApproximateTotalCount): Self = StObject.set(x, "ApproximateTotalCount", value.asInstanceOf[js.Any])
    
    inline def setApproximateTotalCountUndefined: Self = StObject.set(x, "ApproximateTotalCount", js.undefined)
    
    inline def setNextToken(value: NextToken2500): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQueues(value: QueueSearchSummaryList): Self = StObject.set(x, "Queues", value.asInstanceOf[js.Any])
    
    inline def setQueuesUndefined: Self = StObject.set(x, "Queues", js.undefined)
    
    inline def setQueuesVarargs(value: Queue*): Self = StObject.set(x, "Queues", js.Array(value*))
  }
}

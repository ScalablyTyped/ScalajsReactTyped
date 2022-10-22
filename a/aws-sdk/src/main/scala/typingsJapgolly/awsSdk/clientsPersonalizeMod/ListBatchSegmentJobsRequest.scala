package typingsJapgolly.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBatchSegmentJobsRequest extends StObject {
  
  /**
    * The maximum number of batch segment job results to return in each page. The default value is 100.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token to request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the solution version that the batch segment jobs used to generate batch segments.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.undefined
}
object ListBatchSegmentJobsRequest {
  
  inline def apply(): ListBatchSegmentJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBatchSegmentJobsRequest]
  }
  
  extension [Self <: ListBatchSegmentJobsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
    
    inline def setSolutionVersionArnUndefined: Self = StObject.set(x, "solutionVersionArn", js.undefined)
  }
}

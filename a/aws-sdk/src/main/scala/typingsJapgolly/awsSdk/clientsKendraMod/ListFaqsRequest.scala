package typingsJapgolly.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFaqsRequest extends StObject {
  
  /**
    * The index that contains the FAQ lists.
    */
  var IndexId: typingsJapgolly.awsSdk.clientsKendraMod.IndexId
  
  /**
    * The maximum number of FAQs to return in the response. If there are fewer results in the list, this response contains only the actual results.
    */
  var MaxResults: js.UndefOr[MaxResultsIntegerForListFaqsRequest] = js.undefined
  
  /**
    * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a pagination token in the response. You can use this pagination token to retrieve the next set of FAQs.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsKendraMod.NextToken] = js.undefined
}
object ListFaqsRequest {
  
  inline def apply(IndexId: IndexId): ListFaqsRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFaqsRequest]
  }
  
  extension [Self <: ListFaqsRequest](x: Self) {
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResultsIntegerForListFaqsRequest): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

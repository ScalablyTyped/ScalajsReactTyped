package typingsJapgolly.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExperiencesRequest extends StObject {
  
  /**
    * The identifier of the index for your Amazon Kendra experience.
    */
  var IndexId: typingsJapgolly.awsSdk.clientsKendraMod.IndexId
  
  /**
    * The maximum number of returned Amazon Kendra experiences.
    */
  var MaxResults: js.UndefOr[MaxResultsIntegerForListExperiencesRequest] = js.undefined
  
  /**
    * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a pagination token in the response. You can use this pagination token to retrieve the next set of Amazon Kendra experiences.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsKendraMod.NextToken] = js.undefined
}
object ListExperiencesRequest {
  
  inline def apply(IndexId: IndexId): ListExperiencesRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListExperiencesRequest]
  }
  
  extension [Self <: ListExperiencesRequest](x: Self) {
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResultsIntegerForListExperiencesRequest): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

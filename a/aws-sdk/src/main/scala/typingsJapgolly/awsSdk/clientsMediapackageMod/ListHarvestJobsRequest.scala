package typingsJapgolly.awsSdk.clientsMediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHarvestJobsRequest extends StObject {
  
  /**
    * When specified, the request will return only HarvestJobs associated with the given Channel ID.
    */
  var IncludeChannelId: js.UndefOr[string] = js.undefined
  
  /**
    * When specified, the request will return only HarvestJobs in the given status.
    */
  var IncludeStatus: js.UndefOr[string] = js.undefined
  
  /**
    * The upper bound on the number of records to return.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsMediapackageMod.MaxResults] = js.undefined
  
  /**
    * A token used to resume pagination from the end of a previous request.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListHarvestJobsRequest {
  
  inline def apply(): ListHarvestJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHarvestJobsRequest]
  }
  
  extension [Self <: ListHarvestJobsRequest](x: Self) {
    
    inline def setIncludeChannelId(value: string): Self = StObject.set(x, "IncludeChannelId", value.asInstanceOf[js.Any])
    
    inline def setIncludeChannelIdUndefined: Self = StObject.set(x, "IncludeChannelId", js.undefined)
    
    inline def setIncludeStatus(value: string): Self = StObject.set(x, "IncludeStatus", value.asInstanceOf[js.Any])
    
    inline def setIncludeStatusUndefined: Self = StObject.set(x, "IncludeStatus", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

package typingsJapgolly.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCelebrityRecognitionRequest extends StObject {
  
  /**
    * Job identifier for the required celebrity recognition analysis. You can get the job identifer from a call to StartCelebrityRecognition.
    */
  var JobId: typingsJapgolly.awsSdk.clientsRekognitionMod.JobId
  
  /**
    * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsRekognitionMod.MaxResults] = js.undefined
  
  /**
    * If the previous response was incomplete (because there is more recognized celebrities to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of celebrities. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Sort to use for celebrities returned in Celebrities field. Specify ID to sort by the celebrity identifier, specify TIMESTAMP to sort by the time the celebrity was recognized.
    */
  var SortBy: js.UndefOr[CelebrityRecognitionSortBy] = js.undefined
}
object GetCelebrityRecognitionRequest {
  
  inline def apply(JobId: JobId): GetCelebrityRecognitionRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCelebrityRecognitionRequest]
  }
  
  extension [Self <: GetCelebrityRecognitionRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: CelebrityRecognitionSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
  }
}

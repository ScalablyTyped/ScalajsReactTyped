package typingsJapgolly.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchJobsResponse extends StObject {
  
  /**
    * If query broadening is enabled, we may append additional results from the broadened query. This number indicates how many of the jobs returned in the jobs field are from the
    * broadened query. These results are always at the end of the jobs list. In particular, a value of 0, or if the field isn't set, all the jobs in the jobs list are from the original
    * (without broadening) query. If this field is non-zero, subsequent requests with offset after this result set should contain all broadened results.
    */
  var broadenedQueryJobsCount: js.UndefOr[Double] = js.undefined
  
  /** The histogram results that match with specified SearchJobsRequest.histogram_queries. */
  var histogramQueryResults: js.UndefOr[js.Array[HistogramQueryResult]] = js.undefined
  
  /**
    * The location filters that the service applied to the specified query. If any filters are lat-lng based, the Location.location_type is
    * Location.LocationType.LOCATION_TYPE_UNSPECIFIED.
    */
  var locationFilters: js.UndefOr[js.Array[Location]] = js.undefined
  
  /** The Job entities that match the specified SearchJobsRequest. */
  var matchingJobs: js.UndefOr[js.Array[MatchingJob]] = js.undefined
  
  /** Additional information for the API invocation, such as the request tracking id. */
  var metadata: js.UndefOr[ResponseMetadata] = js.undefined
  
  /** The token that specifies the starting position of the next page of results. This field is empty if there are no more results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The spell checking result, and correction. */
  var spellCorrection: js.UndefOr[SpellingCorrection] = js.undefined
  
  /** Number of jobs that match the specified query. Note: This size is precise only if the total is less than 100,000. */
  var totalSize: js.UndefOr[Double] = js.undefined
}
object SearchJobsResponse {
  
  inline def apply(): SearchJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchJobsResponse]
  }
  
  extension [Self <: SearchJobsResponse](x: Self) {
    
    inline def setBroadenedQueryJobsCount(value: Double): Self = StObject.set(x, "broadenedQueryJobsCount", value.asInstanceOf[js.Any])
    
    inline def setBroadenedQueryJobsCountUndefined: Self = StObject.set(x, "broadenedQueryJobsCount", js.undefined)
    
    inline def setHistogramQueryResults(value: js.Array[HistogramQueryResult]): Self = StObject.set(x, "histogramQueryResults", value.asInstanceOf[js.Any])
    
    inline def setHistogramQueryResultsUndefined: Self = StObject.set(x, "histogramQueryResults", js.undefined)
    
    inline def setHistogramQueryResultsVarargs(value: HistogramQueryResult*): Self = StObject.set(x, "histogramQueryResults", js.Array(value*))
    
    inline def setLocationFilters(value: js.Array[Location]): Self = StObject.set(x, "locationFilters", value.asInstanceOf[js.Any])
    
    inline def setLocationFiltersUndefined: Self = StObject.set(x, "locationFilters", js.undefined)
    
    inline def setLocationFiltersVarargs(value: Location*): Self = StObject.set(x, "locationFilters", js.Array(value*))
    
    inline def setMatchingJobs(value: js.Array[MatchingJob]): Self = StObject.set(x, "matchingJobs", value.asInstanceOf[js.Any])
    
    inline def setMatchingJobsUndefined: Self = StObject.set(x, "matchingJobs", js.undefined)
    
    inline def setMatchingJobsVarargs(value: MatchingJob*): Self = StObject.set(x, "matchingJobs", js.Array(value*))
    
    inline def setMetadata(value: ResponseMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSpellCorrection(value: SpellingCorrection): Self = StObject.set(x, "spellCorrection", value.asInstanceOf[js.Any])
    
    inline def setSpellCorrectionUndefined: Self = StObject.set(x, "spellCorrection", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}

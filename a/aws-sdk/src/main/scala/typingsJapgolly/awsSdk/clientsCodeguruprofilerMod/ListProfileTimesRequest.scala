package typingsJapgolly.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProfileTimesRequest extends StObject {
  
  /**
    * The end time of the time range from which to list the profiles.
    */
  var endTime: js.Date
  
  /**
    * The maximum number of profile time results returned by ListProfileTimes in paginated output. When this parameter is used, ListProfileTimes only returns maxResults results in a single page with a nextToken response element. The remaining results of the initial request can be seen by sending another ListProfileTimes request with the returned nextToken value. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated ListProfileTimes request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.   This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The order (ascending or descending by start time of the profile) to use when listing profiles. Defaults to TIMESTAMP_DESCENDING. 
    */
  var orderBy: js.UndefOr[OrderBy] = js.undefined
  
  /**
    *  The aggregation period. This specifies the period during which an aggregation profile collects posted agent profiles for a profiling group. There are 3 valid values.     P1D — 1 day     PT1H — 1 hour     PT5M — 5 minutes   
    */
  var period: AggregationPeriod
  
  /**
    * The name of the profiling group.
    */
  var profilingGroupName: ProfilingGroupName
  
  /**
    * The start time of the time range from which to list the profiles.
    */
  var startTime: js.Date
}
object ListProfileTimesRequest {
  
  inline def apply(
    endTime: js.Date,
    period: AggregationPeriod,
    profilingGroupName: ProfilingGroupName,
    startTime: js.Date
  ): ListProfileTimesRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProfileTimesRequest]
  }
  
  extension [Self <: ListProfileTimesRequest](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOrderBy(value: OrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPeriod(value: AggregationPeriod): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.maximMazurokGapiClientDfareporting.anon

import typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DimensionValue
import typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.SortedDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activities extends StObject {
  
  /** Activity group. */
  var activities: js.UndefOr[
    typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.Activities
  ] = js.undefined
  
  /** Custom Rich Media Events group. */
  var customRichMediaEvents: js.UndefOr[
    typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.CustomRichMediaEvents
  ] = js.undefined
  
  /** The date range for which this report should be run. */
  var dateRange: js.UndefOr[
    typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DateRange
  ] = js.undefined
  
  /** The list of filters on which dimensions are filtered. Filters for different dimensions are ANDed, filters for the same dimension are grouped together and ORed. */
  var dimensionFilters: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  
  /** The list of standard dimensions the report should include. */
  var dimensions: js.UndefOr[js.Array[SortedDimension]] = js.undefined
  
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
}
object Activities {
  
  inline def apply(): Activities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activities]
  }
  
  extension [Self <: Activities](x: Self) {
    
    inline def setActivities(value: typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.Activities): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    inline def setCustomRichMediaEvents(
      value: typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.CustomRichMediaEvents
    ): Self = StObject.set(x, "customRichMediaEvents", value.asInstanceOf[js.Any])
    
    inline def setCustomRichMediaEventsUndefined: Self = StObject.set(x, "customRichMediaEvents", js.undefined)
    
    inline def setDateRange(value: typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setDimensionFilters(value: js.Array[DimensionValue]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    inline def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    inline def setDimensionFiltersVarargs(value: DimensionValue*): Self = StObject.set(x, "dimensionFilters", js.Array(value*))
    
    inline def setDimensions(value: js.Array[SortedDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: SortedDimension*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    inline def setMetricNamesUndefined: Self = StObject.set(x, "metricNames", js.undefined)
    
    inline def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value*))
  }
}

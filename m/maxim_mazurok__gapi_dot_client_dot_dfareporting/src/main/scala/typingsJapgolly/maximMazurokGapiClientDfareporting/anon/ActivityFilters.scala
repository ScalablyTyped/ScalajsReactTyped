package typingsJapgolly.maximMazurokGapiClientDfareporting.anon

import typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.ChannelGrouping
import typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DimensionValue
import typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.PathFilter
import typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.SortedDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityFilters extends StObject {
  
  /** The list of 'dfa:activity' values to filter on. */
  var activityFilters: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  
  /** Channel Grouping. */
  var customChannelGrouping: js.UndefOr[ChannelGrouping] = js.undefined
  
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[
    typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DateRange
  ] = js.undefined
  
  /** The list of dimensions the report should include. */
  var dimensions: js.UndefOr[js.Array[SortedDimension]] = js.undefined
  
  /**
    * The floodlight ID for which to show data in this report. All advertisers associated with that ID will automatically be added. The dimension of the value needs to be
    * 'dfa:floodlightConfigId'.
    */
  var floodlightConfigId: js.UndefOr[DimensionValue] = js.undefined
  
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Path Filters. */
  var pathFilters: js.UndefOr[js.Array[PathFilter]] = js.undefined
}
object ActivityFilters {
  
  inline def apply(): ActivityFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityFilters]
  }
  
  extension [Self <: ActivityFilters](x: Self) {
    
    inline def setActivityFilters(value: js.Array[DimensionValue]): Self = StObject.set(x, "activityFilters", value.asInstanceOf[js.Any])
    
    inline def setActivityFiltersUndefined: Self = StObject.set(x, "activityFilters", js.undefined)
    
    inline def setActivityFiltersVarargs(value: DimensionValue*): Self = StObject.set(x, "activityFilters", js.Array(value*))
    
    inline def setCustomChannelGrouping(value: ChannelGrouping): Self = StObject.set(x, "customChannelGrouping", value.asInstanceOf[js.Any])
    
    inline def setCustomChannelGroupingUndefined: Self = StObject.set(x, "customChannelGrouping", js.undefined)
    
    inline def setDateRange(value: typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setDimensions(value: js.Array[SortedDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: SortedDimension*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setFloodlightConfigId(value: DimensionValue): Self = StObject.set(x, "floodlightConfigId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightConfigIdUndefined: Self = StObject.set(x, "floodlightConfigId", js.undefined)
    
    inline def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    inline def setMetricNamesUndefined: Self = StObject.set(x, "metricNames", js.undefined)
    
    inline def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value*))
    
    inline def setPathFilters(value: js.Array[PathFilter]): Self = StObject.set(x, "pathFilters", value.asInstanceOf[js.Any])
    
    inline def setPathFiltersUndefined: Self = StObject.set(x, "pathFilters", js.undefined)
    
    inline def setPathFiltersVarargs(value: PathFilter*): Self = StObject.set(x, "pathFilters", js.Array(value*))
  }
}

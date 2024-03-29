package typingsJapgolly.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An aggregation analyzing log information for queries and events. */
trait MetricAggregation extends StObject {
  
  /** The event type associated with this metric result. This field, when present, will always be `click`. */
  var event_type: js.UndefOr[String] = js.undefined
  
  /** The measurement interval for this metric. Metric intervals are always 1 day (`1d`). */
  var interval: js.UndefOr[String] = js.undefined
  
  /** Array of metric aggregation query results. */
  var results: js.UndefOr[js.Array[MetricAggregationResult]] = js.undefined
}
object MetricAggregation {
  
  inline def apply(): MetricAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricAggregation]
  }
  
  extension [Self <: MetricAggregation](x: Self) {
    
    inline def setEvent_type(value: String): Self = StObject.set(x, "event_type", value.asInstanceOf[js.Any])
    
    inline def setEvent_typeUndefined: Self = StObject.set(x, "event_type", js.undefined)
    
    inline def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setResults(value: js.Array[MetricAggregationResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: MetricAggregationResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}

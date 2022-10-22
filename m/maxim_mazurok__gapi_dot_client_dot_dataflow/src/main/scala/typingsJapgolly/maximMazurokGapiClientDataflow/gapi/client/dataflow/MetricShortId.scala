package typingsJapgolly.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricShortId extends StObject {
  
  /** The index of the corresponding metric in the ReportWorkItemStatusRequest. Required. */
  var metricIndex: js.UndefOr[Double] = js.undefined
  
  /** The service-generated short identifier for the metric. */
  var shortId: js.UndefOr[String] = js.undefined
}
object MetricShortId {
  
  inline def apply(): MetricShortId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricShortId]
  }
  
  extension [Self <: MetricShortId](x: Self) {
    
    inline def setMetricIndex(value: Double): Self = StObject.set(x, "metricIndex", value.asInstanceOf[js.Any])
    
    inline def setMetricIndexUndefined: Self = StObject.set(x, "metricIndex", js.undefined)
    
    inline def setShortId(value: String): Self = StObject.set(x, "shortId", value.asInstanceOf[js.Any])
    
    inline def setShortIdUndefined: Self = StObject.set(x, "shortId", js.undefined)
  }
}

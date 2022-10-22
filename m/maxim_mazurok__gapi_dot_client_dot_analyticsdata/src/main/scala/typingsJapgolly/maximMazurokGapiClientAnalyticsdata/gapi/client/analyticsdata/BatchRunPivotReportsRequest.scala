package typingsJapgolly.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchRunPivotReportsRequest extends StObject {
  
  /** Individual requests. Each request has a separate pivot report response. Each batch request is allowed up to 5 requests. */
  var requests: js.UndefOr[js.Array[RunPivotReportRequest]] = js.undefined
}
object BatchRunPivotReportsRequest {
  
  inline def apply(): BatchRunPivotReportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchRunPivotReportsRequest]
  }
  
  extension [Self <: BatchRunPivotReportsRequest](x: Self) {
    
    inline def setRequests(value: js.Array[RunPivotReportRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: RunPivotReportRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}

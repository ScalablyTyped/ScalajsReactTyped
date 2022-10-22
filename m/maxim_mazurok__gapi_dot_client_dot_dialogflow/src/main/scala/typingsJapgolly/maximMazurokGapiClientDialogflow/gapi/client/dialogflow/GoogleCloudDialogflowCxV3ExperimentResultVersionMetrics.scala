package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ExperimentResultVersionMetrics extends StObject {
  
  /** The metrics and corresponding confidence intervals in the inference result. */
  var metrics: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3ExperimentResultMetric]] = js.undefined
  
  /** Number of sessions that were allocated to this version. */
  var sessionCount: js.UndefOr[Double] = js.undefined
  
  /** The name of the flow Version. Format: `projects//locations//agents//flows//versions/`. */
  var version: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3ExperimentResultVersionMetrics {
  
  inline def apply(): GoogleCloudDialogflowCxV3ExperimentResultVersionMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ExperimentResultVersionMetrics]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ExperimentResultVersionMetrics](x: Self) {
    
    inline def setMetrics(value: js.Array[GoogleCloudDialogflowCxV3ExperimentResultMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: GoogleCloudDialogflowCxV3ExperimentResultMetric*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setSessionCount(value: Double): Self = StObject.set(x, "sessionCount", value.asInstanceOf[js.Any])
    
    inline def setSessionCountUndefined: Self = StObject.set(x, "sessionCount", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

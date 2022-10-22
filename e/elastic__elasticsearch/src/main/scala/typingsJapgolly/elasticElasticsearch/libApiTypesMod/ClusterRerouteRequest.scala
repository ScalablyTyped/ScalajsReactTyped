package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterRerouteRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var commands: js.UndefOr[js.Array[ClusterRerouteCommand]] = js.undefined
  
  var dry_run: js.UndefOr[Boolean] = js.undefined
  
  var explain: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var metric: js.UndefOr[Metrics] = js.undefined
  
  var retry_failed: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object ClusterRerouteRequest {
  
  inline def apply(): ClusterRerouteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterRerouteRequest]
  }
  
  extension [Self <: ClusterRerouteRequest](x: Self) {
    
    inline def setCommands(value: js.Array[ClusterRerouteCommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setCommandsVarargs(value: ClusterRerouteCommand*): Self = StObject.set(x, "commands", js.Array(value*))
    
    inline def setDry_run(value: Boolean): Self = StObject.set(x, "dry_run", value.asInstanceOf[js.Any])
    
    inline def setDry_runUndefined: Self = StObject.set(x, "dry_run", js.undefined)
    
    inline def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    inline def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setMetric(value: Metrics): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setMetricVarargs(value: String*): Self = StObject.set(x, "metric", js.Array(value*))
    
    inline def setRetry_failed(value: Boolean): Self = StObject.set(x, "retry_failed", value.asInstanceOf[js.Any])
    
    inline def setRetry_failedUndefined: Self = StObject.set(x, "retry_failed", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}

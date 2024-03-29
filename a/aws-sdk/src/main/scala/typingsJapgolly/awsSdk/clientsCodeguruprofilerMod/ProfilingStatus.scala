package typingsJapgolly.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilingStatus extends StObject {
  
  /**
    * The date and time when the profiling agent most recently pinged back. Specify using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
    */
  var latestAgentOrchestratedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time when the most recent profile was received. Specify using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
    */
  var latestAgentProfileReportedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  An  AggregatedProfileTime  object that contains the aggregation period and start time for an aggregated profile. 
    */
  var latestAggregatedProfile: js.UndefOr[AggregatedProfileTime] = js.undefined
}
object ProfilingStatus {
  
  inline def apply(): ProfilingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfilingStatus]
  }
  
  extension [Self <: ProfilingStatus](x: Self) {
    
    inline def setLatestAgentOrchestratedAt(value: js.Date): Self = StObject.set(x, "latestAgentOrchestratedAt", value.asInstanceOf[js.Any])
    
    inline def setLatestAgentOrchestratedAtUndefined: Self = StObject.set(x, "latestAgentOrchestratedAt", js.undefined)
    
    inline def setLatestAgentProfileReportedAt(value: js.Date): Self = StObject.set(x, "latestAgentProfileReportedAt", value.asInstanceOf[js.Any])
    
    inline def setLatestAgentProfileReportedAtUndefined: Self = StObject.set(x, "latestAgentProfileReportedAt", js.undefined)
    
    inline def setLatestAggregatedProfile(value: AggregatedProfileTime): Self = StObject.set(x, "latestAggregatedProfile", value.asInstanceOf[js.Any])
    
    inline def setLatestAggregatedProfileUndefined: Self = StObject.set(x, "latestAggregatedProfile", js.undefined)
  }
}

package typingsJapgolly.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightEvent extends StObject {
  
  /**
    * The impact statistics of the client side service. This includes the number of requests to the client service and whether the requests were faults or okay.
    */
  var ClientRequestImpactStatistics: js.UndefOr[RequestImpactStatistics] = js.undefined
  
  /**
    * The time, in Unix seconds, at which the event was recorded.
    */
  var EventTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The impact statistics of the root cause service. This includes the number of requests to the client service and whether the requests were faults or okay.
    */
  var RootCauseServiceRequestImpactStatistics: js.UndefOr[RequestImpactStatistics] = js.undefined
  
  /**
    * A brief description of the event.
    */
  var Summary: js.UndefOr[EventSummaryText] = js.undefined
  
  /**
    * The service during the event that is most impacted by the incident.
    */
  var TopAnomalousServices: js.UndefOr[AnomalousServiceList] = js.undefined
}
object InsightEvent {
  
  inline def apply(): InsightEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightEvent]
  }
  
  extension [Self <: InsightEvent](x: Self) {
    
    inline def setClientRequestImpactStatistics(value: RequestImpactStatistics): Self = StObject.set(x, "ClientRequestImpactStatistics", value.asInstanceOf[js.Any])
    
    inline def setClientRequestImpactStatisticsUndefined: Self = StObject.set(x, "ClientRequestImpactStatistics", js.undefined)
    
    inline def setEventTime(value: js.Date): Self = StObject.set(x, "EventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "EventTime", js.undefined)
    
    inline def setRootCauseServiceRequestImpactStatistics(value: RequestImpactStatistics): Self = StObject.set(x, "RootCauseServiceRequestImpactStatistics", value.asInstanceOf[js.Any])
    
    inline def setRootCauseServiceRequestImpactStatisticsUndefined: Self = StObject.set(x, "RootCauseServiceRequestImpactStatistics", js.undefined)
    
    inline def setSummary(value: EventSummaryText): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "Summary", js.undefined)
    
    inline def setTopAnomalousServices(value: AnomalousServiceList): Self = StObject.set(x, "TopAnomalousServices", value.asInstanceOf[js.Any])
    
    inline def setTopAnomalousServicesUndefined: Self = StObject.set(x, "TopAnomalousServices", js.undefined)
    
    inline def setTopAnomalousServicesVarargs(value: AnomalousService*): Self = StObject.set(x, "TopAnomalousServices", js.Array(value*))
  }
}

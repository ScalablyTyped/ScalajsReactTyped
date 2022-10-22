package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Analytics {
  
  @JSGlobal("SP.Analytics.AnalyticsUsageEntry")
  @js.native
  open class AnalyticsUsageEntry ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.ClientObject
  object AnalyticsUsageEntry {
    
    @JSGlobal("SP.Analytics.AnalyticsUsageEntry")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def logAnalyticsAppEvent(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      appEventTypeId: typingsJapgolly.sharepoint.SP.Guid,
      itemId: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logAnalyticsAppEvent")(context.asInstanceOf[js.Any], appEventTypeId.asInstanceOf[js.Any], itemId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def logAnalyticsAppEvent2(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      appEventTypeId: typingsJapgolly.sharepoint.SP.Guid,
      itemId: String,
      rollupScopeId: typingsJapgolly.sharepoint.SP.Guid,
      siteId: typingsJapgolly.sharepoint.SP.Guid,
      userId: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logAnalyticsAppEvent2")(context.asInstanceOf[js.Any], appEventTypeId.asInstanceOf[js.Any], itemId.asInstanceOf[js.Any], rollupScopeId.asInstanceOf[js.Any], siteId.asInstanceOf[js.Any], userId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def logAnalyticsEvent(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext, eventTypeId: Double, itemId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logAnalyticsEvent")(context.asInstanceOf[js.Any], eventTypeId.asInstanceOf[js.Any], itemId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def logAnalyticsEvent2(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      eventTypeId: Double,
      itemId: String,
      rollupScopeId: typingsJapgolly.sharepoint.SP.Guid,
      siteId: typingsJapgolly.sharepoint.SP.Guid,
      userId: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logAnalyticsEvent2")(context.asInstanceOf[js.Any], eventTypeId.asInstanceOf[js.Any], itemId.asInstanceOf[js.Any], rollupScopeId.asInstanceOf[js.Any], siteId.asInstanceOf[js.Any], userId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSGlobal("SP.Analytics.EventTypeId")
  @js.native
  object EventTypeId extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.Analytics.EventTypeId & Double] = js.native
    
    /* 1 */ val first: typingsJapgolly.sharepoint.SP.Analytics.EventTypeId.first & Double = js.native
    
    /* 5 */ val last: typingsJapgolly.sharepoint.SP.Analytics.EventTypeId.last & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.sharepoint.SP.Analytics.EventTypeId.none & Double = js.native
    
    /* 4 */ val recommendationClick: typingsJapgolly.sharepoint.SP.Analytics.EventTypeId.recommendationClick & Double = js.native
    
    /* 3 */ val recommendationView: typingsJapgolly.sharepoint.SP.Analytics.EventTypeId.recommendationView & Double = js.native
    
    /* 2 */ val view: typingsJapgolly.sharepoint.SP.Analytics.EventTypeId.view & Double = js.native
  }
}

package typingsJapgolly.next

import typingsJapgolly.next.anon.EventName
import typingsJapgolly.next.anon.EventNamePayload
import typingsJapgolly.next.anon.EventNameString
import typingsJapgolly.next.anon.OmitEventBuildCompletedto
import typingsJapgolly.next.anon.OmitEventBuildOptimizedto
import typingsJapgolly.next.anon.OmitEventCliSessionStarte
import typingsJapgolly.next.anon.Payload
import typingsJapgolly.next.anon.PayloadEventCliSessionStarted
import typingsJapgolly.next.anon.PayloadEventPackageUsedInGetServerSideProps
import typingsJapgolly.next.anon.PayloadEventTypeCheckCompleted
import typingsJapgolly.next.distBuildWebpackPluginsTelemetryPluginMod.TelemetryPlugin
import typingsJapgolly.next.distServerConfigSharedMod.NextConfigComplete
import typingsJapgolly.next.distTelemetryEventsBuildMod.EventLintCheckCompleted_
import typingsJapgolly.next.distTelemetryEventsBuildMod.EventTypeCheckCompleted_
import typingsJapgolly.next.distTelemetryEventsPluginsMod.NextPluginsEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryEventsMod {
  
  @JSImport("next/dist/telemetry/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/telemetry/events", "EVENT_BUILD_FEATURE_USAGE")
  @js.native
  val EVENT_BUILD_FEATURE_USAGE: /* "NEXT_BUILD_FEATURE_USAGE" */ String = js.native
  
  @JSImport("next/dist/telemetry/events", "EVENT_NAME_PACKAGE_USED_IN_GET_SERVER_SIDE_PROPS")
  @js.native
  val EVENT_NAME_PACKAGE_USED_IN_GET_SERVER_SIDE_PROPS: /* "NEXT_PACKAGE_USED_IN_GET_SERVER_SIDE_PROPS" */ String = js.native
  
  inline def eventBuildCompleted(pagePaths: js.Array[String], event: OmitEventBuildCompletedto): EventName = (^.asInstanceOf[js.Dynamic].applyDynamic("eventBuildCompleted")(pagePaths.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[EventName]
  
  inline def eventBuildFeatureUsage(telemetryPlugin: TelemetryPlugin): js.Array[Payload] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventBuildFeatureUsage")(telemetryPlugin.asInstanceOf[js.Any]).asInstanceOf[js.Array[Payload]]
  
  inline def eventBuildOptimize(pagePaths: js.Array[String], event: OmitEventBuildOptimizedto): EventNamePayload = (^.asInstanceOf[js.Dynamic].applyDynamic("eventBuildOptimize")(pagePaths.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[EventNamePayload]
  
  inline def eventCliSession(dir: String, nextConfig: NextConfigComplete, event: OmitEventCliSessionStarte): js.Array[PayloadEventCliSessionStarted] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventCliSession")(dir.asInstanceOf[js.Any], nextConfig.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Array[PayloadEventCliSessionStarted]]
  
  inline def eventLintCheckCompleted(event: EventLintCheckCompleted_): EventNameString = ^.asInstanceOf[js.Dynamic].applyDynamic("eventLintCheckCompleted")(event.asInstanceOf[js.Any]).asInstanceOf[EventNameString]
  
  inline def eventNextPlugins(dir: String): js.Promise[js.Array[NextPluginsEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventNextPlugins")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[NextPluginsEvent]]]
  
  inline def eventPackageUsedInGetServerSideProps(telemetryPlugin: TelemetryPlugin): js.Array[PayloadEventPackageUsedInGetServerSideProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventPackageUsedInGetServerSideProps")(telemetryPlugin.asInstanceOf[js.Any]).asInstanceOf[js.Array[PayloadEventPackageUsedInGetServerSideProps]]
  
  inline def eventTypeCheckCompleted(event: EventTypeCheckCompleted_): PayloadEventTypeCheckCompleted = ^.asInstanceOf[js.Dynamic].applyDynamic("eventTypeCheckCompleted")(event.asInstanceOf[js.Any]).asInstanceOf[PayloadEventTypeCheckCompleted]
}

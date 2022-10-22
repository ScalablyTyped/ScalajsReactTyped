package typingsJapgolly.firebaseAnalyticsCompat

import typingsJapgolly.firebaseAnalytics.mod.Analytics
import typingsJapgolly.firebaseAnalyticsTypes.mod.AnalyticsCallOptions
import typingsJapgolly.firebaseAnalyticsTypes.mod.CustomParams
import typingsJapgolly.firebaseAnalyticsTypes.mod.EventParams
import typingsJapgolly.firebaseAnalyticsTypes.mod.FirebaseAnalytics
import typingsJapgolly.firebaseAppCompat.mod.FirebaseApp
import typingsJapgolly.firebaseAppCompat.mod.FirebaseServiceInternals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcServiceMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.firebaseAppCompat.mod.FirebaseService because var conflicts: app. Inlined INTERNAL */ @JSImport("@firebase/analytics-compat/dist/src/service", "AnalyticsService")
  @js.native
  open class AnalyticsService protected ()
    extends StObject
       with FirebaseAnalytics {
    def this(app: FirebaseApp, _delegate: Analytics) = this()
    
    var INTERNAL: js.UndefOr[FirebaseServiceInternals] = js.native
    
    val _delegate: Analytics = js.native
    
    @JSName("app")
    var app_AnalyticsService: FirebaseApp = js.native
    
    def logEvent(eventName: String): Unit = js.native
    def logEvent(eventName: String, eventParams: Unit, options: AnalyticsCallOptions): Unit = js.native
    def logEvent(eventName: String, eventParams: CustomParams): Unit = js.native
    def logEvent(eventName: String, eventParams: CustomParams, options: AnalyticsCallOptions): Unit = js.native
    def logEvent(eventName: String, eventParams: EventParams): Unit = js.native
    def logEvent(eventName: String, eventParams: EventParams, options: AnalyticsCallOptions): Unit = js.native
  }
}

package typingsJapgolly.segmentAnalytics

import typingsJapgolly.segmentAnalytics.SegmentAnalytics.AnalyticsJS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analyticsDotjsCoreMod {
  
  @JSImport("@segment/analytics.js-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@segment/analytics.js-core", JSImport.Default)
  @js.native
  def default: AnalyticsJS = js.native
  inline def default_=(x: AnalyticsJS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}

package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.angularDevkitCore.mod.analytics.AnalyticsReporter
import typingsJapgolly.angularDevkitCore.mod.analytics.ForwardingAnalytics
import typingsJapgolly.angularDevkitCore.mod.analytics.LoggingAnalytics
import typingsJapgolly.angularDevkitCore.mod.analytics.MultiAnalytics
import typingsJapgolly.angularDevkitCore.mod.analytics.NoopAnalytics
import typingsJapgolly.angularDevkitCore.srcAnalyticsApiMod.Analytics
import typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsForwarderFn
import typingsJapgolly.angularDevkitCore.srcLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofanalytics extends StObject {
  
  var AnalyticsReporter: Instantiable1[
    /* _analytics */ Analytics, 
    typingsJapgolly.angularDevkitCore.mod.analytics.AnalyticsReporter
  ]
  
  var ForwardingAnalytics: Instantiable1[
    /* _fn */ AnalyticsForwarderFn, 
    typingsJapgolly.angularDevkitCore.mod.analytics.ForwardingAnalytics
  ]
  
  var LoggingAnalytics: Instantiable1[
    /* _logger */ Logger, 
    typingsJapgolly.angularDevkitCore.mod.analytics.LoggingAnalytics
  ]
  
  var MultiAnalytics: Instantiable0[typingsJapgolly.angularDevkitCore.mod.analytics.MultiAnalytics]
  
  val NgCliAnalyticsDimensionsFlagInfo: Any
  
  val NgCliAnalyticsMetricsFlagInfo: Any
  
  var NoopAnalytics: Instantiable0[typingsJapgolly.angularDevkitCore.mod.analytics.NoopAnalytics]
}
object Typeofanalytics {
  
  inline def apply(
    AnalyticsReporter: Instantiable1[/* _analytics */ Analytics, AnalyticsReporter],
    ForwardingAnalytics: Instantiable1[/* _fn */ AnalyticsForwarderFn, ForwardingAnalytics],
    LoggingAnalytics: Instantiable1[/* _logger */ Logger, LoggingAnalytics],
    MultiAnalytics: Instantiable0[MultiAnalytics],
    NgCliAnalyticsDimensionsFlagInfo: Any,
    NgCliAnalyticsMetricsFlagInfo: Any,
    NoopAnalytics: Instantiable0[NoopAnalytics]
  ): Typeofanalytics = {
    val __obj = js.Dynamic.literal(AnalyticsReporter = AnalyticsReporter.asInstanceOf[js.Any], ForwardingAnalytics = ForwardingAnalytics.asInstanceOf[js.Any], LoggingAnalytics = LoggingAnalytics.asInstanceOf[js.Any], MultiAnalytics = MultiAnalytics.asInstanceOf[js.Any], NgCliAnalyticsDimensionsFlagInfo = NgCliAnalyticsDimensionsFlagInfo.asInstanceOf[js.Any], NgCliAnalyticsMetricsFlagInfo = NgCliAnalyticsMetricsFlagInfo.asInstanceOf[js.Any], NoopAnalytics = NoopAnalytics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofanalytics]
  }
  
  extension [Self <: Typeofanalytics](x: Self) {
    
    inline def setAnalyticsReporter(value: Instantiable1[/* _analytics */ Analytics, AnalyticsReporter]): Self = StObject.set(x, "AnalyticsReporter", value.asInstanceOf[js.Any])
    
    inline def setForwardingAnalytics(value: Instantiable1[/* _fn */ AnalyticsForwarderFn, ForwardingAnalytics]): Self = StObject.set(x, "ForwardingAnalytics", value.asInstanceOf[js.Any])
    
    inline def setLoggingAnalytics(value: Instantiable1[/* _logger */ Logger, LoggingAnalytics]): Self = StObject.set(x, "LoggingAnalytics", value.asInstanceOf[js.Any])
    
    inline def setMultiAnalytics(value: Instantiable0[MultiAnalytics]): Self = StObject.set(x, "MultiAnalytics", value.asInstanceOf[js.Any])
    
    inline def setNgCliAnalyticsDimensionsFlagInfo(value: Any): Self = StObject.set(x, "NgCliAnalyticsDimensionsFlagInfo", value.asInstanceOf[js.Any])
    
    inline def setNgCliAnalyticsMetricsFlagInfo(value: Any): Self = StObject.set(x, "NgCliAnalyticsMetricsFlagInfo", value.asInstanceOf[js.Any])
    
    inline def setNoopAnalytics(value: Instantiable0[NoopAnalytics]): Self = StObject.set(x, "NoopAnalytics", value.asInstanceOf[js.Any])
  }
}

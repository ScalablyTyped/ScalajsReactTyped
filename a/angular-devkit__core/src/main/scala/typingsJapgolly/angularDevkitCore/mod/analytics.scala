package typingsJapgolly.angularDevkitCore.mod

import typingsJapgolly.angularDevkitCore.srcAnalyticsApiMod.Analytics
import typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsForwarderFn
import typingsJapgolly.angularDevkitCore.srcLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analytics {
  
  @JSImport("@angular-devkit/core", "analytics.AnalyticsReportKind")
  @js.native
  object AnalyticsReportKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind & String
      ] = js.native
    
    /* "event" */ val Event: typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Event & String = js.native
    
    /* "pageview" */ val Pageview: typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Pageview & String = js.native
    
    /* "screenview" */ val Screenview: typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Screenview & String = js.native
    
    /* "timing" */ val Timing: typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Timing & String = js.native
  }
  
  @JSImport("@angular-devkit/core", "analytics.AnalyticsReporter")
  @js.native
  open class AnalyticsReporter protected ()
    extends typingsJapgolly.angularDevkitCore.srcAnalyticsMod.AnalyticsReporter {
    def this(_analytics: Analytics) = this()
  }
  
  @JSImport("@angular-devkit/core", "analytics.ForwardingAnalytics")
  @js.native
  open class ForwardingAnalytics protected ()
    extends typingsJapgolly.angularDevkitCore.srcAnalyticsMod.ForwardingAnalytics {
    def this(_fn: AnalyticsForwarderFn) = this()
  }
  
  @JSImport("@angular-devkit/core", "analytics.LoggingAnalytics")
  @js.native
  open class LoggingAnalytics protected ()
    extends typingsJapgolly.angularDevkitCore.srcAnalyticsMod.LoggingAnalytics {
    def this(_logger: Logger) = this()
  }
  
  @JSImport("@angular-devkit/core", "analytics.MultiAnalytics")
  @js.native
  open class MultiAnalytics ()
    extends typingsJapgolly.angularDevkitCore.srcAnalyticsMod.MultiAnalytics {
    def this(_backends: js.Array[Analytics]) = this()
  }
  
  @JSImport("@angular-devkit/core", "analytics.NgCliAnalyticsDimensions")
  @js.native
  object NgCliAnalyticsDimensions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsDimensions & Double
      ] = js.native
    
    /* 8 */ val AngularCLIMajorVersion: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsDimensions.AngularCLIMajorVersion & Double = js.native
    
    /* 20 */ val BuildErrors: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsDimensions.BuildErrors & Double = js.native
    
    /* 1 */ val CpuCount: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsDimensions.CpuCount & Double = js.native
    
    /* 2 */ val CpuSpeed: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsDimensions.CpuSpeed & Double = js.native
    
    /* 6 */ val NgAddCollection: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsDimensions.NgAddCollection & Double = js.native
    
    /* 4 */ val NodeVersion: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsDimensions.NodeVersion & Double = js.native
    
    /* 3 */ val RamInGigabytes: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsDimensions.RamInGigabytes & Double = js.native
  }
  
  @JSImport("@angular-devkit/core", "analytics.NgCliAnalyticsMetrics")
  @js.native
  object NgCliAnalyticsMetrics extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics & Double] = js.native
    
    /* 12 */ val AssetCount: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.AssetCount & Double = js.native
    
    /* 13 */ val AssetSize: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.AssetSize & Double = js.native
    
    /* 5 */ val BuildTime: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.BuildTime & Double = js.native
    
    /* 15 */ val CssSize: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.CssSize & Double = js.native
    
    /* 7 */ val InitialChunkSize: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.InitialChunkSize & Double = js.native
    
    /* 10 */ val LazyChunkCount: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.LazyChunkCount & Double = js.native
    
    /* 11 */ val LazyChunkSize: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.LazyChunkSize & Double = js.native
    
    /* 1 */ val NgComponentCount: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.NgComponentCount & Double = js.native
    
    /* 6 */ val NgOnInitCount: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.NgOnInitCount & Double = js.native
    
    /* 14 */ val PolyfillSize: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.PolyfillSize & Double = js.native
    
    /* 8 */ val TotalChunkCount: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.TotalChunkCount & Double = js.native
    
    /* 9 */ val TotalChunkSize: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.TotalChunkSize & Double = js.native
    
    /* 2 */ val UNUSED_2: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.UNUSED_2 & Double = js.native
    
    /* 3 */ val UNUSED_3: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.UNUSED_3 & Double = js.native
    
    /* 4 */ val UNUSED_4: typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NgCliAnalyticsMetrics.UNUSED_4 & Double = js.native
  }
  
  @JSImport("@angular-devkit/core", "analytics.NoopAnalytics")
  @js.native
  open class NoopAnalytics ()
    extends typingsJapgolly.angularDevkitCore.srcAnalyticsMod.NoopAnalytics
}

package typingsJapgolly.angularDevkitCore

import typingsJapgolly.angularDevkitCore.srcAnalyticsApiMod.Analytics
import typingsJapgolly.angularDevkitCore.srcAnalyticsApiMod.EventOptions
import typingsJapgolly.angularDevkitCore.srcAnalyticsApiMod.PageviewOptions
import typingsJapgolly.angularDevkitCore.srcAnalyticsApiMod.ScreenviewOptions
import typingsJapgolly.angularDevkitCore.srcAnalyticsApiMod.TimingOptions
import typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Event
import typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Pageview
import typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Screenview
import typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Timing
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAnalyticsForwarderMod {
  
  @js.native
  sealed trait AnalyticsReportKind extends StObject
  @JSImport("@angular-devkit/core/src/analytics/forwarder", "AnalyticsReportKind")
  @js.native
  object AnalyticsReportKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AnalyticsReportKind & String] = js.native
    
    @js.native
    sealed trait Event
      extends StObject
         with AnalyticsReportKind
    /* "event" */ val Event: typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Event & String = js.native
    
    @js.native
    sealed trait Pageview
      extends StObject
         with AnalyticsReportKind
    /* "pageview" */ val Pageview: typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Pageview & String = js.native
    
    @js.native
    sealed trait Screenview
      extends StObject
         with AnalyticsReportKind
    /* "screenview" */ val Screenview: typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Screenview & String = js.native
    
    @js.native
    sealed trait Timing
      extends StObject
         with AnalyticsReportKind
    /* "timing" */ val Timing: typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportKind.Timing & String = js.native
  }
  
  @JSImport("@angular-devkit/core/src/analytics/forwarder", "AnalyticsReporter")
  @js.native
  open class AnalyticsReporter protected () extends StObject {
    def this(_analytics: Analytics) = this()
    
    /* protected */ var _analytics: Analytics = js.native
    
    def report(report: AnalyticsReport): Unit = js.native
  }
  
  @JSImport("@angular-devkit/core/src/analytics/forwarder", "ForwardingAnalytics")
  @js.native
  open class ForwardingAnalytics protected ()
    extends StObject
       with Analytics {
    def this(_fn: AnalyticsForwarderFn) = this()
    
    /* protected */ def _fn(report: JsonObject & AnalyticsReport): Unit = js.native
    /* protected */ @JSName("_fn")
    var _fn_Original: AnalyticsForwarderFn = js.native
  }
  
  @js.native
  trait AnalyticsForwarderFn extends StObject {
    
    def apply(report: JsonObject & AnalyticsReport): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportEvent
    - typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportScreenview
    - typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportPageview
    - typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportTiming
  */
  trait AnalyticsReport extends StObject
  object AnalyticsReport {
    
    inline def AnalyticsReportEvent(action: String, category: String, kind: Event, options: JsonObject & EventOptions): typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportEvent = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportEvent]
    }
    
    inline def AnalyticsReportPageview(kind: Pageview, options: JsonObject & PageviewOptions, path: String): typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportPageview = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportPageview]
    }
    
    inline def AnalyticsReportScreenview(appName: String, kind: Screenview, options: JsonObject & ScreenviewOptions, screenName: String): typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportScreenview = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportScreenview]
    }
    
    inline def AnalyticsReportTiming(
      category: String,
      kind: Timing,
      options: JsonObject & TimingOptions,
      time: String | Double,
      variable: String
    ): typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportTiming = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.angularDevkitCore.srcAnalyticsForwarderMod.AnalyticsReportTiming]
    }
  }
  
  trait AnalyticsReportBase
    extends StObject
       with JsonObject {
    
    var kind: AnalyticsReportKind
  }
  object AnalyticsReportBase {
    
    inline def apply(kind: AnalyticsReportKind): AnalyticsReportBase = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsReportBase]
    }
    
    extension [Self <: AnalyticsReportBase](x: Self) {
      
      inline def setKind(value: AnalyticsReportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnalyticsReportEvent
    extends StObject
       with AnalyticsReportBase
       with AnalyticsReport {
    
    var action: String
    
    var category: String
    
    @JSName("kind")
    var kind_AnalyticsReportEvent: Event
    
    var options: JsonObject & EventOptions
  }
  object AnalyticsReportEvent {
    
    inline def apply(action: String, category: String, kind: Event, options: JsonObject & EventOptions): AnalyticsReportEvent = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsReportEvent]
    }
    
    extension [Self <: AnalyticsReportEvent](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setKind(value: Event): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: JsonObject & EventOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnalyticsReportPageview
    extends StObject
       with AnalyticsReportBase
       with AnalyticsReport {
    
    @JSName("kind")
    var kind_AnalyticsReportPageview: Pageview
    
    var options: JsonObject & PageviewOptions
    
    var path: String
  }
  object AnalyticsReportPageview {
    
    inline def apply(kind: Pageview, options: JsonObject & PageviewOptions, path: String): AnalyticsReportPageview = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsReportPageview]
    }
    
    extension [Self <: AnalyticsReportPageview](x: Self) {
      
      inline def setKind(value: Pageview): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: JsonObject & PageviewOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnalyticsReportScreenview
    extends StObject
       with AnalyticsReportBase
       with AnalyticsReport {
    
    var appName: String
    
    @JSName("kind")
    var kind_AnalyticsReportScreenview: Screenview
    
    var options: JsonObject & ScreenviewOptions
    
    var screenName: String
  }
  object AnalyticsReportScreenview {
    
    inline def apply(appName: String, kind: Screenview, options: JsonObject & ScreenviewOptions, screenName: String): AnalyticsReportScreenview = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsReportScreenview]
    }
    
    extension [Self <: AnalyticsReportScreenview](x: Self) {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setKind(value: Screenview): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: JsonObject & ScreenviewOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnalyticsReportTiming
    extends StObject
       with AnalyticsReportBase
       with AnalyticsReport {
    
    var category: String
    
    @JSName("kind")
    var kind_AnalyticsReportTiming: Timing
    
    var options: JsonObject & TimingOptions
    
    var time: String | Double
    
    var variable: String
  }
  object AnalyticsReportTiming {
    
    inline def apply(
      category: String,
      kind: Timing,
      options: JsonObject & TimingOptions,
      time: String | Double,
      variable: String
    ): AnalyticsReportTiming = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsReportTiming]
    }
    
    extension [Self <: AnalyticsReportTiming](x: Self) {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setKind(value: Timing): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: JsonObject & TimingOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String | Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    }
  }
}

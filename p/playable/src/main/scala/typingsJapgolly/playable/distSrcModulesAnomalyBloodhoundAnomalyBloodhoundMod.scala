package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import typingsJapgolly.playable.anon.EndTS
import typingsJapgolly.playable.anon.Engine
import typingsJapgolly.playable.distSrcModulesAnomalyBloodhoundTypesMod.IReportReasons
import typingsJapgolly.playable.distSrcModulesAnomalyBloodhoundTypesMod.IReportType
import typingsJapgolly.playable.distSrcModulesAnomalyBloodhoundTypesMod.IReportTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesAnomalyBloodhoundAnomalyBloodhoundMod {
  
  @JSImport("playable/dist/src/modules/anomaly-bloodhound/anomaly-bloodhound", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AnomalyBloodhound {
    def this(hasEngineEventEmitter: Engine) = this()
    
    /* private */ /* CompleteClass */
    var _bindEvents: Any = js.native
    
    /* private */ /* CompleteClass */
    var _callback: Any = js.native
    
    /* private */ /* CompleteClass */
    var _engine: Any = js.native
    
    /* private */ /* CompleteClass */
    var _eventEmitter: Any = js.native
    
    /* private */ /* CompleteClass */
    var _processStateChange: Any = js.native
    
    /* private */ /* CompleteClass */
    var _timeoutMap: Any = js.native
    
    /* private */ /* CompleteClass */
    var _unbindEvents: Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def isDelayedReportExist(`type`: IReportType): Boolean = js.native
    
    /* CompleteClass */
    override def reportDebugInfo(hasReasonStartTSEndTS: EndTS): Unit = js.native
    
    /* CompleteClass */
    override def setAnomalyCallback(callback: js.Function1[/* anomalyData */ Any, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def startDelayedReport(`type`: IReportType, reason: String): Unit = js.native
    
    /* CompleteClass */
    override def stopAllDelayedReports(): Unit = js.native
    
    /* CompleteClass */
    override def stopDelayedReport(`type`: IReportType): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/anomaly-bloodhound/anomaly-bloodhound", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/anomaly-bloodhound/anomaly-bloodhound", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/anomaly-bloodhound/anomaly-bloodhound", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("playable/dist/src/modules/anomaly-bloodhound/anomaly-bloodhound", "DELAYED_REPORT_TYPES")
  @js.native
  val DELAYED_REPORT_TYPES: IReportTypes = js.native
  
  @JSImport("playable/dist/src/modules/anomaly-bloodhound/anomaly-bloodhound", "REPORT_REASONS")
  @js.native
  val REPORT_REASONS: IReportReasons = js.native
  
  trait AnomalyBloodhound extends StObject {
    
    /* private */ var _bindEvents: Any
    
    /* private */ var _callback: Any
    
    /* private */ var _engine: Any
    
    /* private */ var _eventEmitter: Any
    
    /* private */ var _processStateChange: Any
    
    /* private */ var _timeoutMap: Any
    
    /* private */ var _unbindEvents: Any
    
    def destroy(): Unit
    
    def isDelayedReportExist(`type`: IReportType): Boolean
    
    def reportDebugInfo(hasReasonStartTSEndTS: EndTS): Unit
    
    def setAnomalyCallback(callback: js.Function1[/* anomalyData */ Any, Unit]): Unit
    
    def startDelayedReport(`type`: IReportType, reason: String): Unit
    
    def stopAllDelayedReports(): Unit
    
    def stopDelayedReport(`type`: IReportType): Unit
  }
  object AnomalyBloodhound {
    
    inline def apply(
      _bindEvents: Any,
      _callback: Any,
      _engine: Any,
      _eventEmitter: Any,
      _processStateChange: Any,
      _timeoutMap: Any,
      _unbindEvents: Any,
      destroy: Callback,
      isDelayedReportExist: IReportType => Boolean,
      reportDebugInfo: EndTS => Callback,
      setAnomalyCallback: js.Function1[/* anomalyData */ Any, Unit] => Callback,
      startDelayedReport: (IReportType, String) => Callback,
      stopAllDelayedReports: Callback,
      stopDelayedReport: IReportType => Callback
    ): AnomalyBloodhound = {
      val __obj = js.Dynamic.literal(_bindEvents = _bindEvents.asInstanceOf[js.Any], _callback = _callback.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _processStateChange = _processStateChange.asInstanceOf[js.Any], _timeoutMap = _timeoutMap.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], destroy = destroy.toJsFn, isDelayedReportExist = js.Any.fromFunction1(isDelayedReportExist), reportDebugInfo = js.Any.fromFunction1((t0: EndTS) => reportDebugInfo(t0).runNow()), setAnomalyCallback = js.Any.fromFunction1((t0: js.Function1[/* anomalyData */ Any, Unit]) => setAnomalyCallback(t0).runNow()), startDelayedReport = js.Any.fromFunction2((t0: IReportType, t1: String) => (startDelayedReport(t0, t1)).runNow()), stopAllDelayedReports = stopAllDelayedReports.toJsFn, stopDelayedReport = js.Any.fromFunction1((t0: IReportType) => stopDelayedReport(t0).runNow()))
      __obj.asInstanceOf[AnomalyBloodhound]
    }
    
    extension [Self <: AnomalyBloodhound](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setIsDelayedReportExist(value: IReportType => Boolean): Self = StObject.set(x, "isDelayedReportExist", js.Any.fromFunction1(value))
      
      inline def setReportDebugInfo(value: EndTS => Callback): Self = StObject.set(x, "reportDebugInfo", js.Any.fromFunction1((t0: EndTS) => value(t0).runNow()))
      
      inline def setSetAnomalyCallback(value: js.Function1[/* anomalyData */ Any, Unit] => Callback): Self = StObject.set(x, "setAnomalyCallback", js.Any.fromFunction1((t0: js.Function1[/* anomalyData */ Any, Unit]) => value(t0).runNow()))
      
      inline def setStartDelayedReport(value: (IReportType, String) => Callback): Self = StObject.set(x, "startDelayedReport", js.Any.fromFunction2((t0: IReportType, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setStopAllDelayedReports(value: Callback): Self = StObject.set(x, "stopAllDelayedReports", value.toJsFn)
      
      inline def setStopDelayedReport(value: IReportType => Callback): Self = StObject.set(x, "stopDelayedReport", js.Any.fromFunction1((t0: IReportType) => value(t0).runNow()))
      
      inline def set_bindEvents(value: Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      inline def set_callback(value: Any): Self = StObject.set(x, "_callback", value.asInstanceOf[js.Any])
      
      inline def set_engine(value: Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      inline def set_eventEmitter(value: Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      inline def set_processStateChange(value: Any): Self = StObject.set(x, "_processStateChange", value.asInstanceOf[js.Any])
      
      inline def set_timeoutMap(value: Any): Self = StObject.set(x, "_timeoutMap", value.asInstanceOf[js.Any])
      
      inline def set_unbindEvents(value: Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
    }
  }
}

package typingsJapgolly.opentelemetryApi

import typingsJapgolly.opentelemetryApi.buildSrcBaggageTypesMod.BaggageEntryMetadata
import typingsJapgolly.opentelemetryApi.buildSrcContextTypesMod.Context
import typingsJapgolly.opentelemetryApi.buildSrcPropagationTextMapPropagatorMod.TextMapGetter
import typingsJapgolly.opentelemetryApi.buildSrcPropagationTextMapPropagatorMod.TextMapSetter
import typingsJapgolly.opentelemetryApi.buildSrcTraceProxyTracerMod.TracerDelegator
import typingsJapgolly.opentelemetryApi.buildSrcTraceSpanContextMod.SpanContext
import typingsJapgolly.opentelemetryApi.buildSrcTraceTraceStateMod.TraceState
import typingsJapgolly.opentelemetryApi.buildSrcTraceTracerOptionsMod.TracerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@opentelemetry/api", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/api", "default.context")
    @js.native
    def context: typingsJapgolly.opentelemetryApi.buildSrcApiContextMod.ContextAPI = js.native
    inline def context_=(x: typingsJapgolly.opentelemetryApi.buildSrcApiContextMod.ContextAPI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("context")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/api", "default.diag")
    @js.native
    def diag: typingsJapgolly.opentelemetryApi.buildSrcApiDiagMod.DiagAPI = js.native
    inline def diag_=(x: typingsJapgolly.opentelemetryApi.buildSrcApiDiagMod.DiagAPI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("diag")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/api", "default.propagation")
    @js.native
    def propagation: typingsJapgolly.opentelemetryApi.buildSrcApiPropagationMod.PropagationAPI = js.native
    inline def propagation_=(x: typingsJapgolly.opentelemetryApi.buildSrcApiPropagationMod.PropagationAPI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propagation")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/api", "default.trace")
    @js.native
    def trace: typingsJapgolly.opentelemetryApi.buildSrcApiTraceMod.TraceAPI = js.native
    inline def trace_=(x: typingsJapgolly.opentelemetryApi.buildSrcApiTraceMod.TraceAPI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trace")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@opentelemetry/api", "ContextAPI")
  @js.native
  /** Empty private constructor prevents end users from constructing a new instance of the API */
  /* private */ open class ContextAPI ()
    extends typingsJapgolly.opentelemetryApi.buildSrcApiContextMod.ContextAPI
  /* static members */
  object ContextAPI {
    
    @JSImport("@opentelemetry/api", "ContextAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/api", "ContextAPI._instance")
    @js.native
    def _instance: Any = js.native
    inline def _instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /** Get the singleton instance of the Context API */
    inline def getInstance(): typingsJapgolly.opentelemetryApi.buildSrcApiContextMod.ContextAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[typingsJapgolly.opentelemetryApi.buildSrcApiContextMod.ContextAPI]
  }
  
  @JSImport("@opentelemetry/api", "DiagAPI")
  @js.native
  /**
    * Private internal constructor
    * @private
    */
  /* private */ open class DiagAPI ()
    extends typingsJapgolly.opentelemetryApi.buildSrcApiDiagMod.DiagAPI
  /* static members */
  object DiagAPI {
    
    @JSImport("@opentelemetry/api", "DiagAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/api", "DiagAPI._instance")
    @js.native
    def _instance: Any = js.native
    inline def _instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /** Get the singleton instance of the DiagAPI API */
    inline def instance(): typingsJapgolly.opentelemetryApi.buildSrcApiDiagMod.DiagAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")().asInstanceOf[typingsJapgolly.opentelemetryApi.buildSrcApiDiagMod.DiagAPI]
  }
  
  @JSImport("@opentelemetry/api", "DiagConsoleLogger")
  @js.native
  open class DiagConsoleLogger ()
    extends typingsJapgolly.opentelemetryApi.buildSrcDiagMod.DiagConsoleLogger
  
  @JSImport("@opentelemetry/api", "DiagLogLevel")
  @js.native
  object DiagLogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel & Double] = js.native
    
    /* 9999 */ val ALL: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.ALL & Double = js.native
    
    /* 70 */ val DEBUG: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.DEBUG & Double = js.native
    
    /* 30 */ val ERROR: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.ERROR & Double = js.native
    
    /* 60 */ val INFO: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.INFO & Double = js.native
    
    /* 0 */ val NONE: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.NONE & Double = js.native
    
    /* 80 */ val VERBOSE: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.VERBOSE & Double = js.native
    
    /* 50 */ val WARN: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.WARN & Double = js.native
  }
  
  @JSImport("@opentelemetry/api", "INVALID_SPANID")
  @js.native
  val INVALID_SPANID: /* "0000000000000000" */ String = js.native
  
  @JSImport("@opentelemetry/api", "INVALID_SPAN_CONTEXT")
  @js.native
  val INVALID_SPAN_CONTEXT: SpanContext = js.native
  
  @JSImport("@opentelemetry/api", "INVALID_TRACEID")
  @js.native
  val INVALID_TRACEID: /* "00000000000000000000000000000000" */ String = js.native
  
  @JSImport("@opentelemetry/api", "PropagationAPI")
  @js.native
  /** Empty private constructor prevents end users from constructing a new instance of the API */
  /* private */ open class PropagationAPI ()
    extends typingsJapgolly.opentelemetryApi.buildSrcApiPropagationMod.PropagationAPI
  /* static members */
  object PropagationAPI {
    
    @JSImport("@opentelemetry/api", "PropagationAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/api", "PropagationAPI._instance")
    @js.native
    def _instance: Any = js.native
    inline def _instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /** Get the singleton instance of the Propagator API */
    inline def getInstance(): typingsJapgolly.opentelemetryApi.buildSrcApiPropagationMod.PropagationAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[typingsJapgolly.opentelemetryApi.buildSrcApiPropagationMod.PropagationAPI]
  }
  
  @JSImport("@opentelemetry/api", "ProxyTracer")
  @js.native
  open class ProxyTracer protected ()
    extends typingsJapgolly.opentelemetryApi.buildSrcTraceProxyTracerMod.ProxyTracer {
    def this(_provider: TracerDelegator, name: String) = this()
    def this(_provider: TracerDelegator, name: String, version: String) = this()
    def this(_provider: TracerDelegator, name: String, version: String, options: TracerOptions) = this()
    def this(_provider: TracerDelegator, name: String, version: Unit, options: TracerOptions) = this()
  }
  
  @JSImport("@opentelemetry/api", "ProxyTracerProvider")
  @js.native
  open class ProxyTracerProvider ()
    extends typingsJapgolly.opentelemetryApi.buildSrcTraceProxyTracerProviderMod.ProxyTracerProvider
  
  @JSImport("@opentelemetry/api", "ROOT_CONTEXT")
  @js.native
  val ROOT_CONTEXT: Context = js.native
  
  @JSImport("@opentelemetry/api", "SamplingDecision")
  @js.native
  object SamplingDecision extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.opentelemetryApi.buildSrcTraceSamplingResultMod.SamplingDecision & Double
      ] = js.native
    
    /* 0 */ val NOT_RECORD: typingsJapgolly.opentelemetryApi.buildSrcTraceSamplingResultMod.SamplingDecision.NOT_RECORD & Double = js.native
    
    /* 1 */ val RECORD: typingsJapgolly.opentelemetryApi.buildSrcTraceSamplingResultMod.SamplingDecision.RECORD & Double = js.native
    
    /* 2 */ val RECORD_AND_SAMPLED: typingsJapgolly.opentelemetryApi.buildSrcTraceSamplingResultMod.SamplingDecision.RECORD_AND_SAMPLED & Double = js.native
  }
  
  @JSImport("@opentelemetry/api", "SpanKind")
  @js.native
  object SpanKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.opentelemetryApi.buildSrcTraceSpanKindMod.SpanKind & Double] = js.native
    
    /* 2 */ val CLIENT: typingsJapgolly.opentelemetryApi.buildSrcTraceSpanKindMod.SpanKind.CLIENT & Double = js.native
    
    /* 4 */ val CONSUMER: typingsJapgolly.opentelemetryApi.buildSrcTraceSpanKindMod.SpanKind.CONSUMER & Double = js.native
    
    /* 0 */ val INTERNAL: typingsJapgolly.opentelemetryApi.buildSrcTraceSpanKindMod.SpanKind.INTERNAL & Double = js.native
    
    /* 3 */ val PRODUCER: typingsJapgolly.opentelemetryApi.buildSrcTraceSpanKindMod.SpanKind.PRODUCER & Double = js.native
    
    /* 1 */ val SERVER: typingsJapgolly.opentelemetryApi.buildSrcTraceSpanKindMod.SpanKind.SERVER & Double = js.native
  }
  
  @JSImport("@opentelemetry/api", "SpanStatusCode")
  @js.native
  object SpanStatusCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.opentelemetryApi.buildSrcTraceStatusMod.SpanStatusCode & Double] = js.native
    
    /* 2 */ val ERROR: typingsJapgolly.opentelemetryApi.buildSrcTraceStatusMod.SpanStatusCode.ERROR & Double = js.native
    
    /* 1 */ val OK: typingsJapgolly.opentelemetryApi.buildSrcTraceStatusMod.SpanStatusCode.OK & Double = js.native
    
    /* 0 */ val UNSET: typingsJapgolly.opentelemetryApi.buildSrcTraceStatusMod.SpanStatusCode.UNSET & Double = js.native
  }
  
  @JSImport("@opentelemetry/api", "TraceAPI")
  @js.native
  /** Empty private constructor prevents end users from constructing a new instance of the API */
  /* private */ open class TraceAPI ()
    extends typingsJapgolly.opentelemetryApi.buildSrcApiTraceMod.TraceAPI
  /* static members */
  object TraceAPI {
    
    @JSImport("@opentelemetry/api", "TraceAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/api", "TraceAPI._instance")
    @js.native
    def _instance: Any = js.native
    inline def _instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /** Get the singleton instance of the Trace API */
    inline def getInstance(): typingsJapgolly.opentelemetryApi.buildSrcApiTraceMod.TraceAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[typingsJapgolly.opentelemetryApi.buildSrcApiTraceMod.TraceAPI]
  }
  
  @JSImport("@opentelemetry/api", "TraceFlags")
  @js.native
  object TraceFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.opentelemetryApi.buildSrcTraceTraceFlagsMod.TraceFlags & Double] = js.native
    
    /* 0 */ val NONE: typingsJapgolly.opentelemetryApi.buildSrcTraceTraceFlagsMod.TraceFlags.NONE & Double = js.native
    
    /* 1 */ val SAMPLED: typingsJapgolly.opentelemetryApi.buildSrcTraceTraceFlagsMod.TraceFlags.SAMPLED & Double = js.native
  }
  
  inline def baggageEntryMetadataFromString(str: String): BaggageEntryMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("baggageEntryMetadataFromString")(str.asInstanceOf[js.Any]).asInstanceOf[BaggageEntryMetadata]
  
  @JSImport("@opentelemetry/api", "context")
  @js.native
  val context: typingsJapgolly.opentelemetryApi.buildSrcApiContextMod.ContextAPI = js.native
  
  inline def createContextKey(description: String): js.Symbol = ^.asInstanceOf[js.Dynamic].applyDynamic("createContextKey")(description.asInstanceOf[js.Any]).asInstanceOf[js.Symbol]
  
  inline def createTraceState(): TraceState = ^.asInstanceOf[js.Dynamic].applyDynamic("createTraceState")().asInstanceOf[TraceState]
  inline def createTraceState(rawTraceState: String): TraceState = ^.asInstanceOf[js.Dynamic].applyDynamic("createTraceState")(rawTraceState.asInstanceOf[js.Any]).asInstanceOf[TraceState]
  
  @JSImport("@opentelemetry/api", "defaultTextMapGetter")
  @js.native
  val defaultTextMapGetter: TextMapGetter[Any] = js.native
  
  @JSImport("@opentelemetry/api", "defaultTextMapSetter")
  @js.native
  val defaultTextMapSetter: TextMapSetter[Any] = js.native
  
  @JSImport("@opentelemetry/api", "diag")
  @js.native
  val diag: typingsJapgolly.opentelemetryApi.buildSrcApiDiagMod.DiagAPI = js.native
  
  inline def isSpanContextValid(spanContext: SpanContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpanContextValid")(spanContext.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidSpanId(spanId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidSpanId")(spanId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidTraceId(traceId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidTraceId")(traceId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@opentelemetry/api", "propagation")
  @js.native
  val propagation: typingsJapgolly.opentelemetryApi.buildSrcApiPropagationMod.PropagationAPI = js.native
  
  @JSImport("@opentelemetry/api", "trace")
  @js.native
  val trace: typingsJapgolly.opentelemetryApi.buildSrcApiTraceMod.TraceAPI = js.native
}

package typingsJapgolly.opentelemetrySdkTraceBase

import typingsJapgolly.opentelemetryApi.buildSrcCommonTimeMod.TimeInput
import typingsJapgolly.opentelemetryApi.buildSrcContextTypesMod.Context
import typingsJapgolly.opentelemetryApi.buildSrcTraceLinkMod.Link
import typingsJapgolly.opentelemetryApi.buildSrcTraceSpanContextMod.SpanContext
import typingsJapgolly.opentelemetryApi.buildSrcTraceSpanKindMod.SpanKind
import typingsJapgolly.opentelemetryCore.buildSrcCommonAnchoredClockMod.Clock
import typingsJapgolly.opentelemetryCore.buildSrcCommonTypesMod.InstrumentationLibrary
import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcBasicTracerProviderMod.EXPORTER_FACTORY
import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcBasicTracerProviderMod.PROPAGATOR_FACTORY
import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcExportSpanExporterMod.SpanExporter
import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcSamplerParentBasedSamplerMod.ParentBasedSamplerConfig
import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTypesMod.BufferConfig
import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTypesMod.TracerConfig
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/sdk-trace-base", "AlwaysOffSampler")
  @js.native
  open class AlwaysOffSampler ()
    extends typingsJapgolly.opentelemetrySdkTraceBase.buildSrcSamplerAlwaysOffSamplerMod.AlwaysOffSampler
  
  @JSImport("@opentelemetry/sdk-trace-base", "AlwaysOnSampler")
  @js.native
  open class AlwaysOnSampler ()
    extends typingsJapgolly.opentelemetrySdkTraceBase.buildSrcSamplerAlwaysOnSamplerMod.AlwaysOnSampler
  
  @JSImport("@opentelemetry/sdk-trace-base", "BasicTracerProvider")
  @js.native
  open class BasicTracerProvider ()
    extends typingsJapgolly.opentelemetrySdkTraceBase.buildSrcBasicTracerProviderMod.BasicTracerProvider {
    def this(config: TracerConfig) = this()
  }
  /* static members */
  object BasicTracerProvider {
    
    @JSImport("@opentelemetry/sdk-trace-base", "BasicTracerProvider._registeredExporters")
    @js.native
    val _registeredExporters: Map[String, EXPORTER_FACTORY] = js.native
    
    @JSImport("@opentelemetry/sdk-trace-base", "BasicTracerProvider._registeredPropagators")
    @js.native
    val _registeredPropagators: Map[String, PROPAGATOR_FACTORY] = js.native
  }
  
  @JSImport("@opentelemetry/sdk-trace-base", "BatchSpanProcessor")
  @js.native
  open class BatchSpanProcessor protected ()
    extends typingsJapgolly.opentelemetrySdkTraceBase.buildSrcPlatformMod.BatchSpanProcessor {
    def this(_exporter: SpanExporter) = this()
    def this(_exporter: SpanExporter, config: BufferConfig) = this()
  }
  
  @JSImport("@opentelemetry/sdk-trace-base", "ConsoleSpanExporter")
  @js.native
  open class ConsoleSpanExporter ()
    extends typingsJapgolly.opentelemetrySdkTraceBase.buildSrcExportConsoleSpanExporterMod.ConsoleSpanExporter
  
  @JSImport("@opentelemetry/sdk-trace-base", "ForceFlushState")
  @js.native
  object ForceFlushState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.opentelemetrySdkTraceBase.buildSrcBasicTracerProviderMod.ForceFlushState & Double
      ] = js.native
    
    /* 2 */ val error: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcBasicTracerProviderMod.ForceFlushState.error & Double = js.native
    
    /* 0 */ val resolved: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcBasicTracerProviderMod.ForceFlushState.resolved & Double = js.native
    
    /* 1 */ val timeout: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcBasicTracerProviderMod.ForceFlushState.timeout & Double = js.native
    
    /* 3 */ val unresolved: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcBasicTracerProviderMod.ForceFlushState.unresolved & Double = js.native
  }
  
  @JSImport("@opentelemetry/sdk-trace-base", "InMemorySpanExporter")
  @js.native
  open class InMemorySpanExporter ()
    extends typingsJapgolly.opentelemetrySdkTraceBase.buildSrcExportInMemorySpanExporterMod.InMemorySpanExporter
  
  @JSImport("@opentelemetry/sdk-trace-base", "NoopSpanProcessor")
  @js.native
  open class NoopSpanProcessor ()
    extends typingsJapgolly.opentelemetrySdkTraceBase.buildSrcExportNoopSpanProcessorMod.NoopSpanProcessor
  
  @JSImport("@opentelemetry/sdk-trace-base", "ParentBasedSampler")
  @js.native
  open class ParentBasedSampler protected ()
    extends typingsJapgolly.opentelemetrySdkTraceBase.buildSrcSamplerParentBasedSamplerMod.ParentBasedSampler {
    def this(config: ParentBasedSamplerConfig) = this()
  }
  
  @JSImport("@opentelemetry/sdk-trace-base", "RandomIdGenerator")
  @js.native
  open class RandomIdGenerator ()
    extends typingsJapgolly.opentelemetrySdkTraceBase.buildSrcPlatformMod.RandomIdGenerator
  
  @JSImport("@opentelemetry/sdk-trace-base", "SamplingDecision")
  @js.native
  object SamplingDecision extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.opentelemetrySdkTraceBase.buildSrcSamplerMod.SamplingDecision & Double
      ] = js.native
    
    /* 0 */ val NOT_RECORD: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcSamplerMod.SamplingDecision.NOT_RECORD & Double = js.native
    
    /* 1 */ val RECORD: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcSamplerMod.SamplingDecision.RECORD & Double = js.native
    
    /* 2 */ val RECORD_AND_SAMPLED: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcSamplerMod.SamplingDecision.RECORD_AND_SAMPLED & Double = js.native
  }
  
  @JSImport("@opentelemetry/sdk-trace-base", "SimpleSpanProcessor")
  @js.native
  open class SimpleSpanProcessor protected ()
    extends typingsJapgolly.opentelemetrySdkTraceBase.buildSrcExportSimpleSpanProcessorMod.SimpleSpanProcessor {
    def this(_exporter: SpanExporter) = this()
  }
  
  @JSImport("@opentelemetry/sdk-trace-base", "Span")
  @js.native
  open class Span protected ()
    extends typingsJapgolly.opentelemetrySdkTraceBase.buildSrcSpanMod.Span {
    /**
      * Constructs a new Span instance.
      *
      * @deprecated calling Span constructor directly is not supported. Please use tracer.startSpan.
      * */
    def this(
      parentTracer: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind
    ) = this()
    def this(
      parentTracer: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String
    ) = this()
    def this(
      parentTracer: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link]
    ) = this()
    def this(
      parentTracer: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: js.Array[Link]
    ) = this()
    def this(
      parentTracer: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: Unit,
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: js.Array[Link],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: Unit,
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link],
      startTime: Unit,
      clock: Clock
    ) = this()
    def this(
      parentTracer: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link],
      startTime: TimeInput,
      clock: Clock
    ) = this()
    def this(
      parentTracer: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: Unit,
      startTime: Unit,
      clock: Clock
    ) = this()
    def this(
      parentTracer: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: Unit,
      startTime: TimeInput,
      clock: Clock
    ) = this()
    def this(
      parentTracer: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: js.Array[Link],
      startTime: Unit,
      clock: Clock
    ) = this()
    def this(
      parentTracer: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: js.Array[Link],
      startTime: TimeInput,
      clock: Clock
    ) = this()
    def this(
      parentTracer: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: Unit,
      startTime: Unit,
      clock: Clock
    ) = this()
    def this(
      parentTracer: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: Unit,
      startTime: TimeInput,
      clock: Clock
    ) = this()
  }
  
  @JSImport("@opentelemetry/sdk-trace-base", "TraceIdRatioBasedSampler")
  @js.native
  open class TraceIdRatioBasedSampler ()
    extends typingsJapgolly.opentelemetrySdkTraceBase.buildSrcSamplerTraceIdRatioBasedSamplerMod.TraceIdRatioBasedSampler {
    def this(_ratio: Double) = this()
  }
  
  @JSImport("@opentelemetry/sdk-trace-base", "Tracer")
  @js.native
  open class Tracer protected ()
    extends typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer {
    /**
      * Constructs a new Tracer instance.
      */
    def this(
      instrumentationLibrary: InstrumentationLibrary,
      config: TracerConfig,
      _tracerProvider: typingsJapgolly.opentelemetrySdkTraceBase.buildSrcBasicTracerProviderMod.BasicTracerProvider
    ) = this()
  }
}

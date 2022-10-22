package typingsJapgolly.opentelemetrySdkTraceBase

import typingsJapgolly.opentelemetryApi.buildSrcContextTypesMod.Context
import typingsJapgolly.opentelemetryApi.buildSrcTraceAttributesMod.SpanAttributes
import typingsJapgolly.opentelemetryApi.buildSrcTraceLinkMod.Link
import typingsJapgolly.opentelemetryApi.buildSrcTraceSpanKindMod.SpanKind
import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcSamplerMod.Sampler
import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcSamplerMod.SamplingResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSamplerParentBasedSamplerMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/sampler/ParentBasedSampler", "ParentBasedSampler")
  @js.native
  open class ParentBasedSampler protected ()
    extends StObject
       with Sampler {
    def this(config: ParentBasedSamplerConfig) = this()
    
    /* private */ var _localParentNotSampled: Any = js.native
    
    /* private */ var _localParentSampled: Any = js.native
    
    /* private */ var _remoteParentNotSampled: Any = js.native
    
    /* private */ var _remoteParentSampled: Any = js.native
    
    /* private */ var _root: Any = js.native
    
    /**
      * Checks whether span needs to be created and tracked.
      *
      * @param context Parent Context which may contain a span.
      * @param traceId of the span to be created. It can be different from the
      *     traceId in the {@link SpanContext}. Typically in situations when the
      *     span to be created starts a new trace.
      * @param spanName of the span to be created.
      * @param spanKind of the span to be created.
      * @param attributes Initial set of SpanAttributes for the Span being constructed.
      * @param links Collection of links that will be associated with the Span to
      *     be created. Typically useful for batch operations.
      * @returns a {@link SamplingResult}.
      */
    /* CompleteClass */
    override def shouldSample(
      context: Context,
      traceId: String,
      spanName: String,
      spanKind: SpanKind,
      attributes: SpanAttributes,
      links: js.Array[Link]
    ): SamplingResult = js.native
  }
  
  trait ParentBasedSamplerConfig extends StObject {
    
    /** Sampler called for spans with a local parent which was not sampled. Default AlwaysOff */
    var localParentNotSampled: js.UndefOr[Sampler] = js.undefined
    
    /** Sampler called for spans with a local parent which was sampled. Default AlwaysOn */
    var localParentSampled: js.UndefOr[Sampler] = js.undefined
    
    /** Sampler called for spans with a remote parent which was not sampled. Default AlwaysOff */
    var remoteParentNotSampled: js.UndefOr[Sampler] = js.undefined
    
    /** Sampler called for spans with a remote parent which was sampled. Default AlwaysOn */
    var remoteParentSampled: js.UndefOr[Sampler] = js.undefined
    
    /** Sampler called for spans with no parent */
    var root: Sampler
  }
  object ParentBasedSamplerConfig {
    
    inline def apply(root: Sampler): ParentBasedSamplerConfig = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParentBasedSamplerConfig]
    }
    
    extension [Self <: ParentBasedSamplerConfig](x: Self) {
      
      inline def setLocalParentNotSampled(value: Sampler): Self = StObject.set(x, "localParentNotSampled", value.asInstanceOf[js.Any])
      
      inline def setLocalParentNotSampledUndefined: Self = StObject.set(x, "localParentNotSampled", js.undefined)
      
      inline def setLocalParentSampled(value: Sampler): Self = StObject.set(x, "localParentSampled", value.asInstanceOf[js.Any])
      
      inline def setLocalParentSampledUndefined: Self = StObject.set(x, "localParentSampled", js.undefined)
      
      inline def setRemoteParentNotSampled(value: Sampler): Self = StObject.set(x, "remoteParentNotSampled", value.asInstanceOf[js.Any])
      
      inline def setRemoteParentNotSampledUndefined: Self = StObject.set(x, "remoteParentNotSampled", js.undefined)
      
      inline def setRemoteParentSampled(value: Sampler): Self = StObject.set(x, "remoteParentSampled", value.asInstanceOf[js.Any])
      
      inline def setRemoteParentSampledUndefined: Self = StObject.set(x, "remoteParentSampled", js.undefined)
      
      inline def setRoot(value: Sampler): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}

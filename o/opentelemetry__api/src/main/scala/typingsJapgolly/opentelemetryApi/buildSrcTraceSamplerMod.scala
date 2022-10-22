package typingsJapgolly.opentelemetryApi

import typingsJapgolly.opentelemetryApi.buildSrcContextTypesMod.Context
import typingsJapgolly.opentelemetryApi.buildSrcTraceAttributesMod.SpanAttributes
import typingsJapgolly.opentelemetryApi.buildSrcTraceLinkMod.Link
import typingsJapgolly.opentelemetryApi.buildSrcTraceSamplingResultMod.SamplingResult
import typingsJapgolly.opentelemetryApi.buildSrcTraceSpanKindMod.SpanKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTraceSamplerMod {
  
  trait Sampler extends StObject {
    
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
    def shouldSample(
      context: Context,
      traceId: String,
      spanName: String,
      spanKind: SpanKind,
      attributes: SpanAttributes,
      links: js.Array[Link]
    ): SamplingResult
  }
  object Sampler {
    
    inline def apply(
      shouldSample: (Context, String, String, SpanKind, SpanAttributes, js.Array[Link]) => SamplingResult
    ): Sampler = {
      val __obj = js.Dynamic.literal(shouldSample = js.Any.fromFunction6(shouldSample))
      __obj.asInstanceOf[Sampler]
    }
    
    extension [Self <: Sampler](x: Self) {
      
      inline def setShouldSample(value: (Context, String, String, SpanKind, SpanAttributes, js.Array[Link]) => SamplingResult): Self = StObject.set(x, "shouldSample", js.Any.fromFunction6(value))
    }
  }
}

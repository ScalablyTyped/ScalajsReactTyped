package typingsJapgolly.opentelemetrySdkTraceBase

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.opentelemetryApi.buildSrcContextTypesMod.Context
import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcExportReadableSpanMod.ReadableSpan
import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcSpanMod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSpanProcessorMod {
  
  trait SpanProcessor extends StObject {
    
    /**
      * Forces to export all finished spans
      */
    def forceFlush(): js.Promise[Unit]
    
    /**
      * Called when a {@link ReadableSpan} is ended, if the `span.isRecording()`
      * returns true.
      * @param span the Span that just ended.
      */
    def onEnd(span: ReadableSpan): Unit
    
    /**
      * Called when a {@link Span} is started, if the `span.isRecording()`
      * returns true.
      * @param span the Span that just started.
      */
    def onStart(span: Span, parentContext: Context): Unit
    
    /**
      * Shuts down the processor. Called when SDK is shut down. This is an
      * opportunity for processor to do any cleanup required.
      */
    def shutdown(): js.Promise[Unit]
  }
  object SpanProcessor {
    
    inline def apply(
      forceFlush: CallbackTo[js.Promise[Unit]],
      onEnd: ReadableSpan => Callback,
      onStart: (Span, Context) => Callback,
      shutdown: CallbackTo[js.Promise[Unit]]
    ): SpanProcessor = {
      val __obj = js.Dynamic.literal(forceFlush = forceFlush.toJsFn, onEnd = js.Any.fromFunction1((t0: ReadableSpan) => onEnd(t0).runNow()), onStart = js.Any.fromFunction2((t0: Span, t1: Context) => (onStart(t0, t1)).runNow()), shutdown = shutdown.toJsFn)
      __obj.asInstanceOf[SpanProcessor]
    }
    
    extension [Self <: SpanProcessor](x: Self) {
      
      inline def setForceFlush(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "forceFlush", value.toJsFn)
      
      inline def setOnEnd(value: ReadableSpan => Callback): Self = StObject.set(x, "onEnd", js.Any.fromFunction1((t0: ReadableSpan) => value(t0).runNow()))
      
      inline def setOnStart(value: (Span, Context) => Callback): Self = StObject.set(x, "onStart", js.Any.fromFunction2((t0: Span, t1: Context) => (value(t0, t1)).runNow()))
      
      inline def setShutdown(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "shutdown", value.toJsFn)
    }
  }
}

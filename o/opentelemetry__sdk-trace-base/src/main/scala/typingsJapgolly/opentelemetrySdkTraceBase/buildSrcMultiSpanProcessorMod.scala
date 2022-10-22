package typingsJapgolly.opentelemetrySdkTraceBase

import typingsJapgolly.opentelemetryApi.buildSrcContextTypesMod.Context
import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcExportReadableSpanMod.ReadableSpan
import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcSpanMod.Span
import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcSpanProcessorMod.SpanProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcMultiSpanProcessorMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/MultiSpanProcessor", "MultiSpanProcessor")
  @js.native
  open class MultiSpanProcessor protected ()
    extends StObject
       with SpanProcessor {
    def this(_spanProcessors: js.Array[SpanProcessor]) = this()
    
    /* private */ val _spanProcessors: Any = js.native
    
    /**
      * Forces to export all finished spans
      */
    /* CompleteClass */
    override def forceFlush(): js.Promise[Unit] = js.native
    
    /**
      * Called when a {@link ReadableSpan} is ended, if the `span.isRecording()`
      * returns true.
      * @param span the Span that just ended.
      */
    /* CompleteClass */
    override def onEnd(span: ReadableSpan): Unit = js.native
    
    /**
      * Called when a {@link Span} is started, if the `span.isRecording()`
      * returns true.
      * @param span the Span that just started.
      */
    /* CompleteClass */
    override def onStart(span: Span, parentContext: Context): Unit = js.native
    
    /**
      * Shuts down the processor. Called when SDK is shut down. This is an
      * opportunity for processor to do any cleanup required.
      */
    /* CompleteClass */
    override def shutdown(): js.Promise[Unit] = js.native
  }
}

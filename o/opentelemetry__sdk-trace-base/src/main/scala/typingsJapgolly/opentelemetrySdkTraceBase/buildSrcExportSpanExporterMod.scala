package typingsJapgolly.opentelemetrySdkTraceBase

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.opentelemetryCore.buildSrcExportResultMod.ExportResult
import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcExportReadableSpanMod.ReadableSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcExportSpanExporterMod {
  
  trait SpanExporter extends StObject {
    
    /**
      * Called to export sampled {@link ReadableSpan}s.
      * @param spans the list of sampled Spans to be exported.
      */
    def `export`(spans: js.Array[ReadableSpan], resultCallback: js.Function1[/* result */ ExportResult, Unit]): Unit
    
    /** Stops the exporter. */
    def shutdown(): js.Promise[Unit]
  }
  object SpanExporter {
    
    inline def apply(
      `export`: (js.Array[ReadableSpan], js.Function1[/* result */ ExportResult, Unit]) => Callback,
      shutdown: CallbackTo[js.Promise[Unit]]
    ): SpanExporter = {
      val __obj = js.Dynamic.literal(shutdown = shutdown.toJsFn)
      __obj.updateDynamic("export")(js.Any.fromFunction2((t0: js.Array[ReadableSpan], t1: js.Function1[/* result */ ExportResult, Unit]) => (`export`(t0, t1)).runNow()))
      __obj.asInstanceOf[SpanExporter]
    }
    
    extension [Self <: SpanExporter](x: Self) {
      
      inline def setExport(value: (js.Array[ReadableSpan], js.Function1[/* result */ ExportResult, Unit]) => Callback): Self = StObject.set(x, "export", js.Any.fromFunction2((t0: js.Array[ReadableSpan], t1: js.Function1[/* result */ ExportResult, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setShutdown(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "shutdown", value.toJsFn)
    }
  }
}

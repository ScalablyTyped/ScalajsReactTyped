package typingsJapgolly.opentelemetrySdkTraceBase

import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcExportSpanExporterMod.SpanExporter
import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTypesMod.BatchSpanProcessorBrowserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformBrowserMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/platform/browser", "BatchSpanProcessor")
  @js.native
  open class BatchSpanProcessor protected ()
    extends typingsJapgolly.opentelemetrySdkTraceBase.buildSrcPlatformBrowserExportBatchSpanProcessorMod.BatchSpanProcessor {
    def this(_exporter: SpanExporter) = this()
    def this(_exporter: SpanExporter, config: BatchSpanProcessorBrowserConfig) = this()
  }
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/platform/browser", "RandomIdGenerator")
  @js.native
  open class RandomIdGenerator ()
    extends typingsJapgolly.opentelemetrySdkTraceBase.buildSrcPlatformBrowserRandomIdGeneratorMod.RandomIdGenerator
}

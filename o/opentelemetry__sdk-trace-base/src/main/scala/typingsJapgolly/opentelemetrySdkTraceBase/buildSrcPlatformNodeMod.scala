package typingsJapgolly.opentelemetrySdkTraceBase

import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcExportSpanExporterMod.SpanExporter
import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTypesMod.BufferConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformNodeMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/platform/node", "BatchSpanProcessor")
  @js.native
  open class BatchSpanProcessor protected ()
    extends typingsJapgolly.opentelemetrySdkTraceBase.buildSrcPlatformNodeExportBatchSpanProcessorMod.BatchSpanProcessor {
    def this(_exporter: SpanExporter) = this()
    def this(_exporter: SpanExporter, config: BufferConfig) = this()
  }
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/platform/node", "RandomIdGenerator")
  @js.native
  open class RandomIdGenerator ()
    extends typingsJapgolly.opentelemetrySdkTraceBase.buildSrcPlatformNodeRandomIdGeneratorMod.RandomIdGenerator
}

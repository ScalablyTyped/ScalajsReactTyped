package typingsJapgolly.opentelemetrySdkTraceBase

import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcExportSpanExporterMod.SpanExporter
import typingsJapgolly.opentelemetrySdkTraceBase.buildSrcTypesMod.BufferConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/platform", "BatchSpanProcessor")
  @js.native
  open class BatchSpanProcessor protected ()
    extends typingsJapgolly.opentelemetrySdkTraceBase.buildSrcPlatformNodeMod.BatchSpanProcessor {
    def this(_exporter: SpanExporter) = this()
    def this(_exporter: SpanExporter, config: BufferConfig) = this()
  }
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/platform", "RandomIdGenerator")
  @js.native
  open class RandomIdGenerator ()
    extends typingsJapgolly.opentelemetrySdkTraceBase.buildSrcPlatformNodeMod.RandomIdGenerator
}

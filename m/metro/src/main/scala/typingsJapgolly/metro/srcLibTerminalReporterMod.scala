package typingsJapgolly.metro

import typingsJapgolly.metro.libReportingMod.GlobalCacheDisabledReason
import typingsJapgolly.metro.metroStrings.debug
import typingsJapgolly.metro.metroStrings.group
import typingsJapgolly.metro.metroStrings.groupCollapsed
import typingsJapgolly.metro.metroStrings.groupEnd
import typingsJapgolly.metro.metroStrings.info
import typingsJapgolly.metro.metroStrings.log
import typingsJapgolly.metro.metroStrings.trace
import typingsJapgolly.metro.metroStrings.warn
import typingsJapgolly.metroCore.mod.Terminal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibTerminalReporterMod {
  
  @JSImport("metro/src/lib/TerminalReporter", "TerminalReporter")
  @js.native
  open class TerminalReporter protected () extends StObject {
    def this(terminal: Terminal) = this()
    
    def update(event: TerminalReportableEvent): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.metro.libReportingMod.ReportableEvent
    - typingsJapgolly.metro.anon.TransformedFileCount
  */
  trait TerminalReportableEvent extends StObject
  object TerminalReportableEvent {
    
    inline def `0`(): typingsJapgolly.metro.anon.`0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("dep_graph_loaded")
      __obj.asInstanceOf[typingsJapgolly.metro.anon.`0`]
    }
    
    inline def `1`(): typingsJapgolly.metro.anon.`1` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("transform_cache_reset")
      __obj.asInstanceOf[typingsJapgolly.metro.anon.`1`]
    }
    
    inline def BuildID(buildID: String): typingsJapgolly.metro.anon.BuildID = {
      val __obj = js.Dynamic.literal(buildID = buildID.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bundle_build_done")
      __obj.asInstanceOf[typingsJapgolly.metro.anon.BuildID]
    }
    
    inline def BundleDetails(buildID: String, bundleDetails: typingsJapgolly.metro.libReportingMod.BundleDetails): typingsJapgolly.metro.anon.BundleDetails = {
      val __obj = js.Dynamic.literal(buildID = buildID.asInstanceOf[js.Any], bundleDetails = bundleDetails.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bundle_build_started")
      __obj.asInstanceOf[typingsJapgolly.metro.anon.BundleDetails]
    }
    
    inline def Chunk(chunk: String): typingsJapgolly.metro.anon.Chunk = {
      val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("worker_stdout_chunk")
      __obj.asInstanceOf[typingsJapgolly.metro.anon.Chunk]
    }
    
    inline def ChunkType(chunk: String): typingsJapgolly.metro.anon.ChunkType = {
      val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("worker_stderr_chunk")
      __obj.asInstanceOf[typingsJapgolly.metro.anon.ChunkType]
    }
    
    inline def Data(data: js.Array[Any], level: trace | info | warn | log | group | groupCollapsed | groupEnd | debug): typingsJapgolly.metro.anon.Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("client_log")
      __obj.asInstanceOf[typingsJapgolly.metro.anon.Data]
    }
    
    inline def Error(error: js.Error, port: Double): typingsJapgolly.metro.anon.Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("initialize_failed")
      __obj.asInstanceOf[typingsJapgolly.metro.anon.Error]
    }
    
    inline def ErrorError(error: js.Error): typingsJapgolly.metro.anon.ErrorError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("global_cache_error")
      __obj.asInstanceOf[typingsJapgolly.metro.anon.ErrorError]
    }
    
    inline def ErrorErrorType(error: js.Error): typingsJapgolly.metro.anon.ErrorErrorType = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("hmr_client_error")
      __obj.asInstanceOf[typingsJapgolly.metro.anon.ErrorErrorType]
    }
    
    inline def ErrorType(error: js.Error): typingsJapgolly.metro.anon.ErrorType = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bundling_error")
      __obj.asInstanceOf[typingsJapgolly.metro.anon.ErrorType]
    }
    
    inline def HasReducedPerformance(hasReducedPerformance: Boolean, port: Double): typingsJapgolly.metro.anon.HasReducedPerformance = {
      val __obj = js.Dynamic.literal(hasReducedPerformance = hasReducedPerformance.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("initialize_started")
      __obj.asInstanceOf[typingsJapgolly.metro.anon.HasReducedPerformance]
    }
    
    inline def HasReducedPerformanceType(hasReducedPerformance: Boolean): typingsJapgolly.metro.anon.HasReducedPerformanceType = {
      val __obj = js.Dynamic.literal(hasReducedPerformance = hasReducedPerformance.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("dep_graph_loading")
      __obj.asInstanceOf[typingsJapgolly.metro.anon.HasReducedPerformanceType]
    }
    
    inline def Reason(reason: GlobalCacheDisabledReason): typingsJapgolly.metro.anon.Reason = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("global_cache_disabled")
      __obj.asInstanceOf[typingsJapgolly.metro.anon.Reason]
    }
    
    inline def TotalFileCount(buildID: String, totalFileCount: Double, transformedFileCount: Double): typingsJapgolly.metro.anon.TotalFileCount = {
      val __obj = js.Dynamic.literal(buildID = buildID.asInstanceOf[js.Any], totalFileCount = totalFileCount.asInstanceOf[js.Any], transformedFileCount = transformedFileCount.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bundle_transform_progressed")
      __obj.asInstanceOf[typingsJapgolly.metro.anon.TotalFileCount]
    }
    
    inline def TransformedFileCount(buildID: String, totalFileCount: Double, transformedFileCount: Double): typingsJapgolly.metro.anon.TransformedFileCount = {
      val __obj = js.Dynamic.literal(buildID = buildID.asInstanceOf[js.Any], totalFileCount = totalFileCount.asInstanceOf[js.Any], transformedFileCount = transformedFileCount.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bundle_transform_progressed_throttled")
      __obj.asInstanceOf[typingsJapgolly.metro.anon.TransformedFileCount]
    }
    
    inline def Type(buildID: String): typingsJapgolly.metro.anon.Type = {
      val __obj = js.Dynamic.literal(buildID = buildID.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bundle_build_failed")
      __obj.asInstanceOf[typingsJapgolly.metro.anon.Type]
    }
  }
}

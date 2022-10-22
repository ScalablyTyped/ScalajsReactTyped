package typingsJapgolly.parcelTypes.mod

import typingsJapgolly.parcelDiagnostic.mod.Diagnostic
import typingsJapgolly.parcelTypes.parcelTypesStrings.error
import typingsJapgolly.parcelTypes.parcelTypesStrings.info
import typingsJapgolly.parcelTypes.parcelTypesStrings.verbose
import typingsJapgolly.parcelTypes.parcelTypesStrings.warn
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.parcelTypes.mod.LogEvent
  - typingsJapgolly.parcelTypes.mod.BuildStartEvent
  - typingsJapgolly.parcelTypes.mod.BuildProgressEvent
  - typingsJapgolly.parcelTypes.mod.BuildSuccessEvent
  - typingsJapgolly.parcelTypes.mod.BuildFailureEvent
  - typingsJapgolly.parcelTypes.mod.WatchStartEvent
  - typingsJapgolly.parcelTypes.mod.WatchEndEvent
  - typingsJapgolly.parcelTypes.mod.ValidationEvent
*/
trait ReporterEvent extends StObject
object ReporterEvent {
  
  inline def BuildFailureEvent(diagnostics: js.Array[Diagnostic]): typingsJapgolly.parcelTypes.mod.BuildFailureEvent = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("buildFailure")
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.BuildFailureEvent]
  }
  
  inline def BuildStartEvent(): typingsJapgolly.parcelTypes.mod.BuildStartEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("buildStart")
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.BuildStartEvent]
  }
  
  inline def BuildSuccessEvent(
    buildTime: Double,
    bundleGraph: BundleGraph[PackagedBundle],
    changedAssets: Map[String, Asset],
    requestBundle: NamedBundle => js.Promise[typingsJapgolly.parcelTypes.mod.BuildSuccessEvent]
  ): typingsJapgolly.parcelTypes.mod.BuildSuccessEvent = {
    val __obj = js.Dynamic.literal(buildTime = buildTime.asInstanceOf[js.Any], bundleGraph = bundleGraph.asInstanceOf[js.Any], changedAssets = changedAssets.asInstanceOf[js.Any], requestBundle = js.Any.fromFunction1(requestBundle))
    __obj.updateDynamic("type")("buildSuccess")
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.BuildSuccessEvent]
  }
  
  inline def BundlingProgressEvent(): typingsJapgolly.parcelTypes.mod.BundlingProgressEvent = {
    val __obj = js.Dynamic.literal(phase = "bundling")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.BundlingProgressEvent]
  }
  
  inline def DiagnosticLogEvent(diagnostics: js.Array[Diagnostic], level: error | warn | info | verbose): typingsJapgolly.parcelTypes.mod.DiagnosticLogEvent = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.DiagnosticLogEvent]
  }
  
  inline def OptimizingProgressEvent(bundle: NamedBundle): typingsJapgolly.parcelTypes.mod.OptimizingProgressEvent = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any], phase = "optimizing")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.OptimizingProgressEvent]
  }
  
  inline def PackagingProgressEvent(bundle: NamedBundle): typingsJapgolly.parcelTypes.mod.PackagingProgressEvent = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any], phase = "packaging")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.PackagingProgressEvent]
  }
  
  inline def ProgressLogEvent(message: String): typingsJapgolly.parcelTypes.mod.ProgressLogEvent = {
    val __obj = js.Dynamic.literal(level = "progress", message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.ProgressLogEvent]
  }
  
  inline def ResolvingProgressEvent(dependency: Dependency): typingsJapgolly.parcelTypes.mod.ResolvingProgressEvent = {
    val __obj = js.Dynamic.literal(dependency = dependency.asInstanceOf[js.Any], phase = "resolving")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.ResolvingProgressEvent]
  }
  
  inline def TextLogEvent(message: String): typingsJapgolly.parcelTypes.mod.TextLogEvent = {
    val __obj = js.Dynamic.literal(level = "success", message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.TextLogEvent]
  }
  
  inline def TransformingProgressEvent(filePath: FilePath): typingsJapgolly.parcelTypes.mod.TransformingProgressEvent = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], phase = "transforming")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.TransformingProgressEvent]
  }
  
  inline def ValidationEvent(filePath: FilePath): typingsJapgolly.parcelTypes.mod.ValidationEvent = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("validation")
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.ValidationEvent]
  }
  
  inline def WatchEndEvent(): typingsJapgolly.parcelTypes.mod.WatchEndEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("watchEnd")
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.WatchEndEvent]
  }
  
  inline def WatchStartEvent(): typingsJapgolly.parcelTypes.mod.WatchStartEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("watchStart")
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.WatchStartEvent]
  }
}

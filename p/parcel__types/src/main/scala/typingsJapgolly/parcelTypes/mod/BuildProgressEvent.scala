package typingsJapgolly.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.parcelTypes.mod.ResolvingProgressEvent
  - typingsJapgolly.parcelTypes.mod.TransformingProgressEvent
  - typingsJapgolly.parcelTypes.mod.BundlingProgressEvent
  - typingsJapgolly.parcelTypes.mod.PackagingProgressEvent
  - typingsJapgolly.parcelTypes.mod.OptimizingProgressEvent
*/
trait BuildProgressEvent
  extends StObject
     with ReporterEvent
object BuildProgressEvent {
  
  inline def BundlingProgressEvent(): typingsJapgolly.parcelTypes.mod.BundlingProgressEvent = {
    val __obj = js.Dynamic.literal(phase = "bundling")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.BundlingProgressEvent]
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
  
  inline def ResolvingProgressEvent(dependency: Dependency): typingsJapgolly.parcelTypes.mod.ResolvingProgressEvent = {
    val __obj = js.Dynamic.literal(dependency = dependency.asInstanceOf[js.Any], phase = "resolving")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.ResolvingProgressEvent]
  }
  
  inline def TransformingProgressEvent(filePath: FilePath): typingsJapgolly.parcelTypes.mod.TransformingProgressEvent = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], phase = "transforming")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.TransformingProgressEvent]
  }
}

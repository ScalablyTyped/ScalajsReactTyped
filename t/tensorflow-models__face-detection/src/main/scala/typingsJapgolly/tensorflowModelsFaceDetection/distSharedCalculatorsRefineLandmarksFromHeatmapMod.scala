package typingsJapgolly.tensorflowModelsFaceDetection

import typingsJapgolly.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.Keypoint
import typingsJapgolly.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesConfigInterfacesMod.RefineLandmarksFromHeatmapConfig
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor4D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsRefineLandmarksFromHeatmapMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/refine_landmarks_from_heatmap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def refineLandmarksFromHeatmap(landmarks: js.Array[Keypoint], heatmapTensor: Tensor4D, config: RefineLandmarksFromHeatmapConfig): js.Promise[js.Array[Keypoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("refineLandmarksFromHeatmap")(landmarks.asInstanceOf[js.Any], heatmapTensor.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Keypoint]]]
}

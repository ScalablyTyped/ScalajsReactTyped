package typingsJapgolly.tensorflowModelsFaceLandmarksDetection

import typingsJapgolly.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.Keypoint
import typingsJapgolly.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesConfigInterfacesMod.TensorsToLandmarksConfig
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsTensorsToLandmarksMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/shared/calculators/tensors_to_landmarks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tensorsToLandmarks(landmarkTensor: Tensor[Rank], config: TensorsToLandmarksConfig): js.Promise[js.Array[Keypoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorsToLandmarks")(landmarkTensor.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Keypoint]]]
  inline def tensorsToLandmarks(landmarkTensor: Tensor[Rank], config: TensorsToLandmarksConfig, flipHorizontally: Boolean): js.Promise[js.Array[Keypoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorsToLandmarks")(landmarkTensor.asInstanceOf[js.Any], config.asInstanceOf[js.Any], flipHorizontally.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Keypoint]]]
  inline def tensorsToLandmarks(
    landmarkTensor: Tensor[Rank],
    config: TensorsToLandmarksConfig,
    flipHorizontally: Boolean,
    flipVertically: Boolean
  ): js.Promise[js.Array[Keypoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorsToLandmarks")(landmarkTensor.asInstanceOf[js.Any], config.asInstanceOf[js.Any], flipHorizontally.asInstanceOf[js.Any], flipVertically.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Keypoint]]]
  inline def tensorsToLandmarks(
    landmarkTensor: Tensor[Rank],
    config: TensorsToLandmarksConfig,
    flipHorizontally: Unit,
    flipVertically: Boolean
  ): js.Promise[js.Array[Keypoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorsToLandmarks")(landmarkTensor.asInstanceOf[js.Any], config.asInstanceOf[js.Any], flipHorizontally.asInstanceOf[js.Any], flipVertically.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Keypoint]]]
}

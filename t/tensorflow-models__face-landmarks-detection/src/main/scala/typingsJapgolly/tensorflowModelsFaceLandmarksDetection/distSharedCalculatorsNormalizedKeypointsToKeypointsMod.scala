package typingsJapgolly.tensorflowModelsFaceLandmarksDetection

import typingsJapgolly.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.ImageSize
import typingsJapgolly.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.Keypoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsNormalizedKeypointsToKeypointsMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/shared/calculators/normalized_keypoints_to_keypoints", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizedKeypointsToKeypoints(normalizedKeypoints: js.Array[Keypoint], imageSize: ImageSize): js.Array[Keypoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizedKeypointsToKeypoints")(normalizedKeypoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any])).asInstanceOf[js.Array[Keypoint]]
}

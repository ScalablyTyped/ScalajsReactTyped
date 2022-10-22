package typingsJapgolly.tensorflowModelsFaceLandmarksDetection

import typingsJapgolly.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.Keypoint
import typingsJapgolly.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsCalculateWorldLandmarkProjectionMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/shared/calculators/calculate_world_landmark_projection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateWorldLandmarkProjection(worldLandmarks: js.Array[Keypoint], inputRect: Rect): js.Array[Keypoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateWorldLandmarkProjection")(worldLandmarks.asInstanceOf[js.Any], inputRect.asInstanceOf[js.Any])).asInstanceOf[js.Array[Keypoint]]
}

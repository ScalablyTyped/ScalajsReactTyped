package typingsJapgolly.tensorflowModelsFaceDetection

import typingsJapgolly.tensorflowModelsFaceDetection.anon.IgnoreRotation
import typingsJapgolly.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.Keypoint
import typingsJapgolly.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsCalculateLandmarkProjectionMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/calculate_landmark_projection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateLandmarkProjection(landmarks: js.Array[Keypoint], inputRect: Rect): js.Array[Keypoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateLandmarkProjection")(landmarks.asInstanceOf[js.Any], inputRect.asInstanceOf[js.Any])).asInstanceOf[js.Array[Keypoint]]
  inline def calculateLandmarkProjection(landmarks: js.Array[Keypoint], inputRect: Rect, config: IgnoreRotation): js.Array[Keypoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateLandmarkProjection")(landmarks.asInstanceOf[js.Any], inputRect.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[Keypoint]]
}

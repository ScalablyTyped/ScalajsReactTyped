package typingsJapgolly.tensorflowModelsFaceDetection

import typingsJapgolly.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.Keypoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsCalculateScoreCopyMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/calculate_score_copy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateScoreCopy(landmarksFrom: js.Array[Keypoint], landmarksTo: js.Array[Keypoint]): js.Array[Keypoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateScoreCopy")(landmarksFrom.asInstanceOf[js.Any], landmarksTo.asInstanceOf[js.Any])).asInstanceOf[js.Array[Keypoint]]
  inline def calculateScoreCopy(landmarksFrom: js.Array[Keypoint], landmarksTo: js.Array[Keypoint], copyScore: Boolean): js.Array[Keypoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateScoreCopy")(landmarksFrom.asInstanceOf[js.Any], landmarksTo.asInstanceOf[js.Any], copyScore.asInstanceOf[js.Any])).asInstanceOf[js.Array[Keypoint]]
}

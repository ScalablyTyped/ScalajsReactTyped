package typingsJapgolly.tensorflowModelsFaceDetection

import typingsJapgolly.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.Detection
import typingsJapgolly.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.`intersection-over-union`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsNonMaxSuppressionMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/non_max_suppression", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nonMaxSuppression_intersectionoverunion(
    detections: js.Array[Detection],
    maxDetections: Double,
    iouThreshold: Double,
    overlapType: `intersection-over-union`
  ): js.Promise[js.Array[Detection]] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(detections.asInstanceOf[js.Any], maxDetections.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], overlapType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Detection]]]
}

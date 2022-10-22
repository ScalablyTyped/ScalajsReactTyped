package typingsJapgolly.tensorflowModelsFaceDetection

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsSplitDetectionResultMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/split_detection_result", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def splitDetectionResult(detectionResult: Tensor3D): js.Tuple2[Tensor3D, Tensor3D] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitDetectionResult")(detectionResult.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Tensor3D, Tensor3D]]
}

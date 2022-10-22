package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.anon.IouThreshold
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsNonmaxUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/nonmax_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nonMaxSuppSanityCheck(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): IouThreshold = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppSanityCheck")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[IouThreshold]
  inline def nonMaxSuppSanityCheck(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): IouThreshold = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppSanityCheck")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[IouThreshold]
}

package typingsJapgolly.tensorflowTfjs.distIndexWithPolyfillsMod

import typingsJapgolly.tensorflowTfjsCore.distBackendsNonMaxSuppressionImplMod.NonMaxSuppressionResult
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelImpls {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "kernel_impls")
  @js.native
  val ^ : js.Any = js.native
  
  inline def nonMaxSuppressionV3Impl(
    boxes: TypedArray,
    scores: TypedArray,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): NonMaxSuppressionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionV3Impl")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NonMaxSuppressionResult]
  
  inline def nonMaxSuppressionV4Impl(
    boxes: TypedArray,
    scores: TypedArray,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): NonMaxSuppressionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionV4Impl")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NonMaxSuppressionResult]
  
  inline def nonMaxSuppressionV5Impl(
    boxes: TypedArray,
    scores: TypedArray,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NonMaxSuppressionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionV5Impl")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NonMaxSuppressionResult]
  
  inline def whereImpl(condShape: js.Array[Double], condVals: TypedArray): Tensor2D = (^.asInstanceOf[js.Dynamic].applyDynamic("whereImpl")(condShape.asInstanceOf[js.Any], condVals.asInstanceOf[js.Any])).asInstanceOf[Tensor2D]
}

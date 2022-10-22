package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsLossesSigmoidCrossEntropyMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/losses/sigmoid_cross_entropy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sigmoidCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T | TensorLike, logits: T | TensorLike): O = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def sigmoidCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T | TensorLike, logits: T | TensorLike, weights: Unit, labelSmoothing: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def sigmoidCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    multiClassLabels: T | TensorLike,
    logits: T | TensorLike,
    weights: Unit,
    labelSmoothing: Double,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def sigmoidCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    multiClassLabels: T | TensorLike,
    logits: T | TensorLike,
    weights: Unit,
    labelSmoothing: Unit,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def sigmoidCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T | TensorLike, logits: T | TensorLike, weights: Tensor[Rank]): O = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def sigmoidCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    multiClassLabels: T | TensorLike,
    logits: T | TensorLike,
    weights: Tensor[Rank],
    labelSmoothing: Double
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def sigmoidCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    multiClassLabels: T | TensorLike,
    logits: T | TensorLike,
    weights: Tensor[Rank],
    labelSmoothing: Double,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def sigmoidCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    multiClassLabels: T | TensorLike,
    logits: T | TensorLike,
    weights: Tensor[Rank],
    labelSmoothing: Unit,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def sigmoidCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T | TensorLike, logits: T | TensorLike, weights: TensorLike): O = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def sigmoidCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    multiClassLabels: T | TensorLike,
    logits: T | TensorLike,
    weights: TensorLike,
    labelSmoothing: Double
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def sigmoidCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    multiClassLabels: T | TensorLike,
    logits: T | TensorLike,
    weights: TensorLike,
    labelSmoothing: Double,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def sigmoidCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    multiClassLabels: T | TensorLike,
    logits: T | TensorLike,
    weights: TensorLike,
    labelSmoothing: Unit,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
}

package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsLossesHuberLossMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/losses/huber_loss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def huberLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike): O = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def huberLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: Unit, delta: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def huberLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    weights: Unit,
    delta: Double,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def huberLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    weights: Unit,
    delta: Unit,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def huberLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: Tensor[Rank]): O = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def huberLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: Tensor[Rank], delta: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def huberLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    weights: Tensor[Rank],
    delta: Double,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def huberLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    weights: Tensor[Rank],
    delta: Unit,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def huberLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: TensorLike): O = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def huberLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: TensorLike, delta: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def huberLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    weights: TensorLike,
    delta: Double,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def huberLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    weights: TensorLike,
    delta: Unit,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
}

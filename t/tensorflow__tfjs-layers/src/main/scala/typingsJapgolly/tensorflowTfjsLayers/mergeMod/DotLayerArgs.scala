package typingsJapgolly.tensorflowTfjsLayers.mergeMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsJapgolly.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotLayerArgs extends LayerArgs {
  /**
    * Axis or axes along which the dot product will be taken.
    *
    * Integer or an Array of integers.
    */
  var axes: Double | (js.Tuple2[Double, Double])
  /**
    * Whether to L2-normalize samples along the dot product axis
    * before taking the dot product.
    *
    * If set to `true`, the output of the dot product isthe cosine
    * proximity between the two samples.
    */
  var normalize: js.UndefOr[Boolean] = js.undefined
}

object DotLayerArgs {
  @scala.inline
  def apply(
    axes: Double | (js.Tuple2[Double, Double]),
    batchInputShape: Shape = null,
    batchSize: Int | Double = null,
    dtype: DataType = null,
    inputDType: DataType = null,
    inputShape: Shape = null,
    name: String = null,
    normalize: js.UndefOr[Boolean] = js.undefined,
    trainable: js.UndefOr[Boolean] = js.undefined,
    weights: js.Array[Tensor_[Rank]] = null
  ): DotLayerArgs = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any])
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType.asInstanceOf[js.Any])
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    if (weights != null) __obj.updateDynamic("weights")(weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotLayerArgs]
  }
}


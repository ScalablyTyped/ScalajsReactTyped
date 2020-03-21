package typingsJapgolly.tensorflowTfjsLayers.poolingMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsJapgolly.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pooling3DLayerArgs extends LayerArgs {
  /** The data format to use for the pooling layer. */
  var dataFormat: js.UndefOr[DataFormat] = js.undefined
  /** The padding type to use for the pooling layer. */
  var padding: js.UndefOr[PaddingMode] = js.undefined
  /**
    * Factors by which to downscale in each dimension [depth, height, width].
    * Expects an integer or an array of 3 integers.
    *
    * For example, `[2, 2, 2]` will halve the input in three dimensions.
    * If only one integer is specified, the same window length
    * will be used for all dimensions.
    */
  var poolSize: js.UndefOr[Double | (js.Tuple3[Double, Double, Double])] = js.undefined
  /**
    * The size of the stride in each dimension of the pooling window. Expects
    * an integer or an array of 3 integers. Integer, tuple of 3 integers, or
    * None.
    *
    * If `null`, defaults to `poolSize`.
    */
  var strides: js.UndefOr[Double | (js.Tuple3[Double, Double, Double])] = js.undefined
}

object Pooling3DLayerArgs {
  @scala.inline
  def apply(
    batchInputShape: Shape = null,
    batchSize: Int | Double = null,
    dataFormat: DataFormat = null,
    dtype: DataType = null,
    inputDType: DataType = null,
    inputShape: Shape = null,
    name: String = null,
    padding: PaddingMode = null,
    poolSize: Double | (js.Tuple3[Double, Double, Double]) = null,
    strides: Double | (js.Tuple3[Double, Double, Double]) = null,
    trainable: js.UndefOr[Boolean] = js.undefined,
    weights: js.Array[Tensor_[Rank]] = null
  ): Pooling3DLayerArgs = {
    val __obj = js.Dynamic.literal()
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType.asInstanceOf[js.Any])
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (poolSize != null) __obj.updateDynamic("poolSize")(poolSize.asInstanceOf[js.Any])
    if (strides != null) __obj.updateDynamic("strides")(strides.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    if (weights != null) __obj.updateDynamic("weights")(weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pooling3DLayerArgs]
  }
}


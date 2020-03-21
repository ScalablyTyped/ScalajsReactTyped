package typingsJapgolly.tensorflowTfjsLayers.poolingSerializationMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pooling1DLayerConfig extends LayerConfig {
  var padding: js.UndefOr[PaddingMode] = js.undefined
  var pool_size: js.UndefOr[js.Array[Double]] = js.undefined
  var strides: js.UndefOr[js.Array[Double]] = js.undefined
}

object Pooling1DLayerConfig {
  @scala.inline
  def apply(
    batch_input_shape: Shape = null,
    batch_size: Int | Double = null,
    dtype: DataType = null,
    input_dtype: DataType = null,
    input_shape: Shape = null,
    name: String = null,
    padding: PaddingMode = null,
    pool_size: js.Array[Double] = null,
    strides: js.Array[Double] = null,
    trainable: js.UndefOr[Boolean] = js.undefined
  ): Pooling1DLayerConfig = {
    val __obj = js.Dynamic.literal()
    if (batch_input_shape != null) __obj.updateDynamic("batch_input_shape")(batch_input_shape.asInstanceOf[js.Any])
    if (batch_size != null) __obj.updateDynamic("batch_size")(batch_size.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (input_dtype != null) __obj.updateDynamic("input_dtype")(input_dtype.asInstanceOf[js.Any])
    if (input_shape != null) __obj.updateDynamic("input_shape")(input_shape.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pool_size != null) __obj.updateDynamic("pool_size")(pool_size.asInstanceOf[js.Any])
    if (strides != null) __obj.updateDynamic("strides")(strides.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pooling1DLayerConfig]
  }
}


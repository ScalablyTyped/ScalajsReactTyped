package typingsJapgolly.tensorflowTfjsLayers.coreSerializationMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReshapeLayerConfig extends LayerConfig {
  var target_shape: Shape
}

object ReshapeLayerConfig {
  @scala.inline
  def apply(
    target_shape: Shape,
    batch_input_shape: Shape = null,
    batch_size: Int | Double = null,
    dtype: DataType = null,
    input_dtype: DataType = null,
    input_shape: Shape = null,
    name: String = null,
    trainable: js.UndefOr[Boolean] = js.undefined
  ): ReshapeLayerConfig = {
    val __obj = js.Dynamic.literal(target_shape = target_shape.asInstanceOf[js.Any])
    if (batch_input_shape != null) __obj.updateDynamic("batch_input_shape")(batch_input_shape.asInstanceOf[js.Any])
    if (batch_size != null) __obj.updateDynamic("batch_size")(batch_size.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (input_dtype != null) __obj.updateDynamic("input_dtype")(input_dtype.asInstanceOf[js.Any])
    if (input_shape != null) __obj.updateDynamic("input_shape")(input_shape.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReshapeLayerConfig]
  }
}


package typingsJapgolly.tensorflowTfjsLayers.convolutionalSerializationMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormatSerialization
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsJapgolly.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseConvLayerConfig extends LayerConfig {
  var activation: js.UndefOr[String] = js.undefined
  var activity_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
  var bias_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
  var bias_initializer: js.UndefOr[InitializerSerialization] = js.undefined
  var bias_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
  var data_format: js.UndefOr[DataFormatSerialization] = js.undefined
  var dilation_rate: js.UndefOr[Double | js.Array[Double] | (js.Tuple2[Double, Double])] = js.undefined
  var kernel_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
  var kernel_initializer: js.UndefOr[InitializerSerialization] = js.undefined
  var kernel_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
  var kernel_size: Double | js.Array[Double]
  var padding: js.UndefOr[PaddingMode] = js.undefined
  var strides: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var use_bias: js.UndefOr[Boolean] = js.undefined
}

object BaseConvLayerConfig {
  @scala.inline
  def apply(
    kernel_size: Double | js.Array[Double],
    activation: String = null,
    activity_regularizer: RegularizerSerialization = null,
    batch_input_shape: Shape = null,
    batch_size: Int | Double = null,
    bias_constraint: ConstraintSerialization = null,
    bias_initializer: InitializerSerialization = null,
    bias_regularizer: RegularizerSerialization = null,
    data_format: DataFormatSerialization = null,
    dilation_rate: Double | js.Array[Double] | (js.Tuple2[Double, Double]) = null,
    dtype: DataType = null,
    input_dtype: DataType = null,
    input_shape: Shape = null,
    kernel_constraint: ConstraintSerialization = null,
    kernel_initializer: InitializerSerialization = null,
    kernel_regularizer: RegularizerSerialization = null,
    name: String = null,
    padding: PaddingMode = null,
    strides: Double | js.Array[Double] = null,
    trainable: js.UndefOr[Boolean] = js.undefined,
    use_bias: js.UndefOr[Boolean] = js.undefined
  ): BaseConvLayerConfig = {
    val __obj = js.Dynamic.literal(kernel_size = kernel_size.asInstanceOf[js.Any])
    if (activation != null) __obj.updateDynamic("activation")(activation.asInstanceOf[js.Any])
    if (activity_regularizer != null) __obj.updateDynamic("activity_regularizer")(activity_regularizer.asInstanceOf[js.Any])
    if (batch_input_shape != null) __obj.updateDynamic("batch_input_shape")(batch_input_shape.asInstanceOf[js.Any])
    if (batch_size != null) __obj.updateDynamic("batch_size")(batch_size.asInstanceOf[js.Any])
    if (bias_constraint != null) __obj.updateDynamic("bias_constraint")(bias_constraint.asInstanceOf[js.Any])
    if (bias_initializer != null) __obj.updateDynamic("bias_initializer")(bias_initializer.asInstanceOf[js.Any])
    if (bias_regularizer != null) __obj.updateDynamic("bias_regularizer")(bias_regularizer.asInstanceOf[js.Any])
    if (data_format != null) __obj.updateDynamic("data_format")(data_format.asInstanceOf[js.Any])
    if (dilation_rate != null) __obj.updateDynamic("dilation_rate")(dilation_rate.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (input_dtype != null) __obj.updateDynamic("input_dtype")(input_dtype.asInstanceOf[js.Any])
    if (input_shape != null) __obj.updateDynamic("input_shape")(input_shape.asInstanceOf[js.Any])
    if (kernel_constraint != null) __obj.updateDynamic("kernel_constraint")(kernel_constraint.asInstanceOf[js.Any])
    if (kernel_initializer != null) __obj.updateDynamic("kernel_initializer")(kernel_initializer.asInstanceOf[js.Any])
    if (kernel_regularizer != null) __obj.updateDynamic("kernel_regularizer")(kernel_regularizer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (strides != null) __obj.updateDynamic("strides")(strides.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    if (!js.isUndefined(use_bias)) __obj.updateDynamic("use_bias")(use_bias.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseConvLayerConfig]
  }
}


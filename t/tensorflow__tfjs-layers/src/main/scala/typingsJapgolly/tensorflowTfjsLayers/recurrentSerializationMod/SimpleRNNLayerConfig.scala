package typingsJapgolly.tensorflowTfjsLayers.recurrentSerializationMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsLayers.activationConfigMod.ActivationSerialization
import typingsJapgolly.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsJapgolly.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleRNNLayerConfig extends BaseRNNLayerConfig {
  var activation: js.UndefOr[ActivationSerialization] = js.undefined
  var bias_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
  var bias_initializer: js.UndefOr[InitializerSerialization] = js.undefined
  var bias_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
  var dropout: js.UndefOr[Double] = js.undefined
  var kernel_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
  var kernel_initializer: js.UndefOr[InitializerSerialization] = js.undefined
  var kernel_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
  var recurrent_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
  var recurrent_dropout: js.UndefOr[Double] = js.undefined
  var recurrent_initializer: js.UndefOr[InitializerSerialization] = js.undefined
  var recurrent_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
  var units: Double
  var use_bias: js.UndefOr[Boolean] = js.undefined
}

object SimpleRNNLayerConfig {
  @scala.inline
  def apply(
    units: Double,
    activation: ActivationSerialization = null,
    batch_input_shape: Shape = null,
    batch_size: Int | Double = null,
    bias_constraint: ConstraintSerialization = null,
    bias_initializer: InitializerSerialization = null,
    bias_regularizer: RegularizerSerialization = null,
    cell: RNNCellSerialization | js.Array[RNNCellSerialization] = null,
    dropout: Int | Double = null,
    dtype: DataType = null,
    go_backwards: js.UndefOr[Boolean] = js.undefined,
    input_dim: Int | Double = null,
    input_dtype: DataType = null,
    input_length: Int | Double = null,
    input_shape: Shape = null,
    kernel_constraint: ConstraintSerialization = null,
    kernel_initializer: InitializerSerialization = null,
    kernel_regularizer: RegularizerSerialization = null,
    name: String = null,
    recurrent_constraint: ConstraintSerialization = null,
    recurrent_dropout: Int | Double = null,
    recurrent_initializer: InitializerSerialization = null,
    recurrent_regularizer: RegularizerSerialization = null,
    return_sequences: js.UndefOr[Boolean] = js.undefined,
    return_state: js.UndefOr[Boolean] = js.undefined,
    stateful: js.UndefOr[Boolean] = js.undefined,
    trainable: js.UndefOr[Boolean] = js.undefined,
    unroll: js.UndefOr[Boolean] = js.undefined,
    use_bias: js.UndefOr[Boolean] = js.undefined
  ): SimpleRNNLayerConfig = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    if (activation != null) __obj.updateDynamic("activation")(activation.asInstanceOf[js.Any])
    if (batch_input_shape != null) __obj.updateDynamic("batch_input_shape")(batch_input_shape.asInstanceOf[js.Any])
    if (batch_size != null) __obj.updateDynamic("batch_size")(batch_size.asInstanceOf[js.Any])
    if (bias_constraint != null) __obj.updateDynamic("bias_constraint")(bias_constraint.asInstanceOf[js.Any])
    if (bias_initializer != null) __obj.updateDynamic("bias_initializer")(bias_initializer.asInstanceOf[js.Any])
    if (bias_regularizer != null) __obj.updateDynamic("bias_regularizer")(bias_regularizer.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (dropout != null) __obj.updateDynamic("dropout")(dropout.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (!js.isUndefined(go_backwards)) __obj.updateDynamic("go_backwards")(go_backwards.asInstanceOf[js.Any])
    if (input_dim != null) __obj.updateDynamic("input_dim")(input_dim.asInstanceOf[js.Any])
    if (input_dtype != null) __obj.updateDynamic("input_dtype")(input_dtype.asInstanceOf[js.Any])
    if (input_length != null) __obj.updateDynamic("input_length")(input_length.asInstanceOf[js.Any])
    if (input_shape != null) __obj.updateDynamic("input_shape")(input_shape.asInstanceOf[js.Any])
    if (kernel_constraint != null) __obj.updateDynamic("kernel_constraint")(kernel_constraint.asInstanceOf[js.Any])
    if (kernel_initializer != null) __obj.updateDynamic("kernel_initializer")(kernel_initializer.asInstanceOf[js.Any])
    if (kernel_regularizer != null) __obj.updateDynamic("kernel_regularizer")(kernel_regularizer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (recurrent_constraint != null) __obj.updateDynamic("recurrent_constraint")(recurrent_constraint.asInstanceOf[js.Any])
    if (recurrent_dropout != null) __obj.updateDynamic("recurrent_dropout")(recurrent_dropout.asInstanceOf[js.Any])
    if (recurrent_initializer != null) __obj.updateDynamic("recurrent_initializer")(recurrent_initializer.asInstanceOf[js.Any])
    if (recurrent_regularizer != null) __obj.updateDynamic("recurrent_regularizer")(recurrent_regularizer.asInstanceOf[js.Any])
    if (!js.isUndefined(return_sequences)) __obj.updateDynamic("return_sequences")(return_sequences.asInstanceOf[js.Any])
    if (!js.isUndefined(return_state)) __obj.updateDynamic("return_state")(return_state.asInstanceOf[js.Any])
    if (!js.isUndefined(stateful)) __obj.updateDynamic("stateful")(stateful.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    if (!js.isUndefined(unroll)) __obj.updateDynamic("unroll")(unroll.asInstanceOf[js.Any])
    if (!js.isUndefined(use_bias)) __obj.updateDynamic("use_bias")(use_bias.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleRNNLayerConfig]
  }
}


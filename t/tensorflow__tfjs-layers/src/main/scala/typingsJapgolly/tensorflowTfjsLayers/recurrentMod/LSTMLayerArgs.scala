package typingsJapgolly.tensorflowTfjsLayers.recurrentMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import typingsJapgolly.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import typingsJapgolly.tensorflowTfjsLayers.constraintsMod.Constraint
import typingsJapgolly.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typingsJapgolly.tensorflowTfjsLayers.initializersMod.Initializer
import typingsJapgolly.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsJapgolly.tensorflowTfjsLayers.regularizersMod.Regularizer
import typingsJapgolly.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LSTMLayerArgs extends SimpleRNNLayerArgs {
  /**
    * Implementation mode, either 1 or 2.
    *   Mode 1 will structure its operations as a larger number of
    *   smaller dot products and additions, whereas mode 2 will
    *   batch them into fewer, larger operations. These modes will
    *   have different performance profiles on different hardware and
    *   for different applications.
    *
    * Note: For superior performance, TensorFlow.js always uses implementation
    * 2, regardless of the actual value of this config field.
    */
  var implementation: js.UndefOr[Double] = js.undefined
  /**
    * Activation function to use for the recurrent step.
    *
    * Defaults to hard sigmoid (`hardSigmoid`).
    *
    * If `null`, no activation is applied.
    */
  var recurrentActivation: js.UndefOr[ActivationIdentifier] = js.undefined
  /**
    * If `true`, add 1 to the bias of the forget gate at initialization.
    * Setting it to `true` will also force `biasInitializer = 'zeros'`.
    * This is recommended in
    * [Jozefowicz et
    * al.](http://www.jmlr.org/proceedings/papers/v37/jozefowicz15.pdf).
    */
  var unitForgetBias: js.UndefOr[Boolean] = js.undefined
}

object LSTMLayerArgs {
  @scala.inline
  def apply(
    units: Double,
    activation: ActivationIdentifier = null,
    batchInputShape: Shape = null,
    batchSize: Int | Double = null,
    biasConstraint: ConstraintIdentifier | Constraint = null,
    biasInitializer: InitializerIdentifier | Initializer = null,
    biasRegularizer: RegularizerIdentifier | Regularizer = null,
    cell: RNNCell | js.Array[RNNCell] = null,
    dropout: Int | Double = null,
    dtype: DataType = null,
    goBackwards: js.UndefOr[Boolean] = js.undefined,
    implementation: Int | Double = null,
    inputDType: DataType = null,
    inputDim: Int | Double = null,
    inputLength: Int | Double = null,
    inputShape: Shape = null,
    kernelConstraint: ConstraintIdentifier | Constraint = null,
    kernelInitializer: InitializerIdentifier | Initializer = null,
    kernelRegularizer: RegularizerIdentifier | Regularizer = null,
    name: String = null,
    recurrentActivation: ActivationIdentifier = null,
    recurrentConstraint: ConstraintIdentifier | Constraint = null,
    recurrentDropout: Int | Double = null,
    recurrentInitializer: InitializerIdentifier | Initializer = null,
    recurrentRegularizer: RegularizerIdentifier | Regularizer = null,
    returnSequences: js.UndefOr[Boolean] = js.undefined,
    returnState: js.UndefOr[Boolean] = js.undefined,
    stateful: js.UndefOr[Boolean] = js.undefined,
    trainable: js.UndefOr[Boolean] = js.undefined,
    unitForgetBias: js.UndefOr[Boolean] = js.undefined,
    unroll: js.UndefOr[Boolean] = js.undefined,
    useBias: js.UndefOr[Boolean] = js.undefined,
    weights: js.Array[Tensor_[Rank]] = null
  ): LSTMLayerArgs = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    if (activation != null) __obj.updateDynamic("activation")(activation.asInstanceOf[js.Any])
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (biasConstraint != null) __obj.updateDynamic("biasConstraint")(biasConstraint.asInstanceOf[js.Any])
    if (biasInitializer != null) __obj.updateDynamic("biasInitializer")(biasInitializer.asInstanceOf[js.Any])
    if (biasRegularizer != null) __obj.updateDynamic("biasRegularizer")(biasRegularizer.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (dropout != null) __obj.updateDynamic("dropout")(dropout.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (!js.isUndefined(goBackwards)) __obj.updateDynamic("goBackwards")(goBackwards.asInstanceOf[js.Any])
    if (implementation != null) __obj.updateDynamic("implementation")(implementation.asInstanceOf[js.Any])
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType.asInstanceOf[js.Any])
    if (inputDim != null) __obj.updateDynamic("inputDim")(inputDim.asInstanceOf[js.Any])
    if (inputLength != null) __obj.updateDynamic("inputLength")(inputLength.asInstanceOf[js.Any])
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape.asInstanceOf[js.Any])
    if (kernelConstraint != null) __obj.updateDynamic("kernelConstraint")(kernelConstraint.asInstanceOf[js.Any])
    if (kernelInitializer != null) __obj.updateDynamic("kernelInitializer")(kernelInitializer.asInstanceOf[js.Any])
    if (kernelRegularizer != null) __obj.updateDynamic("kernelRegularizer")(kernelRegularizer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (recurrentActivation != null) __obj.updateDynamic("recurrentActivation")(recurrentActivation.asInstanceOf[js.Any])
    if (recurrentConstraint != null) __obj.updateDynamic("recurrentConstraint")(recurrentConstraint.asInstanceOf[js.Any])
    if (recurrentDropout != null) __obj.updateDynamic("recurrentDropout")(recurrentDropout.asInstanceOf[js.Any])
    if (recurrentInitializer != null) __obj.updateDynamic("recurrentInitializer")(recurrentInitializer.asInstanceOf[js.Any])
    if (recurrentRegularizer != null) __obj.updateDynamic("recurrentRegularizer")(recurrentRegularizer.asInstanceOf[js.Any])
    if (!js.isUndefined(returnSequences)) __obj.updateDynamic("returnSequences")(returnSequences.asInstanceOf[js.Any])
    if (!js.isUndefined(returnState)) __obj.updateDynamic("returnState")(returnState.asInstanceOf[js.Any])
    if (!js.isUndefined(stateful)) __obj.updateDynamic("stateful")(stateful.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    if (!js.isUndefined(unitForgetBias)) __obj.updateDynamic("unitForgetBias")(unitForgetBias.asInstanceOf[js.Any])
    if (!js.isUndefined(unroll)) __obj.updateDynamic("unroll")(unroll.asInstanceOf[js.Any])
    if (!js.isUndefined(useBias)) __obj.updateDynamic("useBias")(useBias.asInstanceOf[js.Any])
    if (weights != null) __obj.updateDynamic("weights")(weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[LSTMLayerArgs]
  }
}


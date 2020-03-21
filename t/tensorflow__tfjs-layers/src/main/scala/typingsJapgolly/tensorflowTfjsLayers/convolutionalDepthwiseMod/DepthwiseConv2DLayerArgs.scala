package typingsJapgolly.tensorflowTfjsLayers.convolutionalDepthwiseMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import typingsJapgolly.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import typingsJapgolly.tensorflowTfjsLayers.constraintsMod.Constraint
import typingsJapgolly.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typingsJapgolly.tensorflowTfjsLayers.convolutionalMod.BaseConvLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.initializersMod.Initializer
import typingsJapgolly.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsJapgolly.tensorflowTfjsLayers.regularizersMod.Regularizer
import typingsJapgolly.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepthwiseConv2DLayerArgs extends BaseConvLayerArgs {
  /**
    * The number of depthwise convolution output channels for each input
    * channel.
    * The total number of depthwise convolution output channels will be equal to
    * `filtersIn * depthMultiplier`.
    * Default: 1.
    */
  var depthMultiplier: js.UndefOr[Double] = js.undefined
  /**
    * Constraint for the depthwise kernel matrix.
    */
  var depthwiseConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
  /**
    * Initializer for the depthwise kernel matrix.
    * Default: GlorotNormal.
    */
  var depthwiseInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
  /**
    * Regulzarizer function for the depthwise kernel matrix.
    */
  var depthwiseRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
  /**
    * An integer or Array of 2 integers, specifying the width and height of the
    * 2D convolution window. Can be a single integer to specify the same value
    * for all spatial dimensions.
    */
  @JSName("kernelSize")
  var kernelSize_DepthwiseConv2DLayerArgs: Double | (js.Tuple2[Double, Double])
}

object DepthwiseConv2DLayerArgs {
  @scala.inline
  def apply(
    kernelSize: Double | (js.Tuple2[Double, Double]),
    activation: ActivationIdentifier = null,
    activityRegularizer: RegularizerIdentifier | Regularizer = null,
    batchInputShape: Shape = null,
    batchSize: Int | Double = null,
    biasConstraint: ConstraintIdentifier | Constraint = null,
    biasInitializer: InitializerIdentifier | Initializer = null,
    biasRegularizer: RegularizerIdentifier | Regularizer = null,
    dataFormat: DataFormat = null,
    depthMultiplier: Int | Double = null,
    depthwiseConstraint: ConstraintIdentifier | Constraint = null,
    depthwiseInitializer: InitializerIdentifier | Initializer = null,
    depthwiseRegularizer: RegularizerIdentifier | Regularizer = null,
    dilationRate: Double | js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) = null,
    dtype: DataType = null,
    inputDType: DataType = null,
    inputShape: Shape = null,
    kernelConstraint: ConstraintIdentifier | Constraint = null,
    kernelInitializer: InitializerIdentifier | Initializer = null,
    kernelRegularizer: RegularizerIdentifier | Regularizer = null,
    name: String = null,
    padding: PaddingMode = null,
    strides: Double | js.Array[Double] = null,
    trainable: js.UndefOr[Boolean] = js.undefined,
    useBias: js.UndefOr[Boolean] = js.undefined,
    weights: js.Array[Tensor_[Rank]] = null
  ): DepthwiseConv2DLayerArgs = {
    val __obj = js.Dynamic.literal(kernelSize = kernelSize.asInstanceOf[js.Any])
    if (activation != null) __obj.updateDynamic("activation")(activation.asInstanceOf[js.Any])
    if (activityRegularizer != null) __obj.updateDynamic("activityRegularizer")(activityRegularizer.asInstanceOf[js.Any])
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (biasConstraint != null) __obj.updateDynamic("biasConstraint")(biasConstraint.asInstanceOf[js.Any])
    if (biasInitializer != null) __obj.updateDynamic("biasInitializer")(biasInitializer.asInstanceOf[js.Any])
    if (biasRegularizer != null) __obj.updateDynamic("biasRegularizer")(biasRegularizer.asInstanceOf[js.Any])
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat.asInstanceOf[js.Any])
    if (depthMultiplier != null) __obj.updateDynamic("depthMultiplier")(depthMultiplier.asInstanceOf[js.Any])
    if (depthwiseConstraint != null) __obj.updateDynamic("depthwiseConstraint")(depthwiseConstraint.asInstanceOf[js.Any])
    if (depthwiseInitializer != null) __obj.updateDynamic("depthwiseInitializer")(depthwiseInitializer.asInstanceOf[js.Any])
    if (depthwiseRegularizer != null) __obj.updateDynamic("depthwiseRegularizer")(depthwiseRegularizer.asInstanceOf[js.Any])
    if (dilationRate != null) __obj.updateDynamic("dilationRate")(dilationRate.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType.asInstanceOf[js.Any])
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape.asInstanceOf[js.Any])
    if (kernelConstraint != null) __obj.updateDynamic("kernelConstraint")(kernelConstraint.asInstanceOf[js.Any])
    if (kernelInitializer != null) __obj.updateDynamic("kernelInitializer")(kernelInitializer.asInstanceOf[js.Any])
    if (kernelRegularizer != null) __obj.updateDynamic("kernelRegularizer")(kernelRegularizer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (strides != null) __obj.updateDynamic("strides")(strides.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    if (!js.isUndefined(useBias)) __obj.updateDynamic("useBias")(useBias.asInstanceOf[js.Any])
    if (weights != null) __obj.updateDynamic("weights")(weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthwiseConv2DLayerArgs]
  }
}


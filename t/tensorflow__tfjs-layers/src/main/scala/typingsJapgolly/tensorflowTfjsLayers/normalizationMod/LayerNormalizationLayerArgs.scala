package typingsJapgolly.tensorflowTfjsLayers.normalizationMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import typingsJapgolly.tensorflowTfjsLayers.initializersMod.Initializer
import typingsJapgolly.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsJapgolly.tensorflowTfjsLayers.regularizersMod.Regularizer
import typingsJapgolly.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import typingsJapgolly.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerNormalizationLayerArgs extends LayerArgs {
  /**
    * The axis or axes that should be normalized (typically, the feature axis.)
    * Defaults to -1 (the last axis.)
    */
  var axis: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
    * Initializer for the beta weight.
    * Default: `'zeros'`.
    */
  var betaInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
  /** Regularizer for the beta weight. */
  var betaRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
  /**
    * If `true`, add offset of `beta` to normalized tensor.
    * If `false`, `beta` is ignored.
    * Default: `true`.
    */
  var center: js.UndefOr[Boolean] = js.undefined
  /**
    * A small positive float added to variance to avoid divison by zero.
    * Defaults to 1e-3.
    */
  var epsilon: js.UndefOr[Double] = js.undefined
  /**
    * Initializer for the gamma weight.
    * Default: `'ones'`.
    */
  var gammaInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
  /** Regularizer for the gamma weight. */
  var gammaRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
  /**
    * If `true`, multiply output by `gamma`.
    * If `false`, `gamma` is not used.
    * When the next layer is linear, this can be disabled since scaling will
    * be done by the next layer.
    * Default: `true`.
    */
  var scale: js.UndefOr[Boolean] = js.undefined
}

object LayerNormalizationLayerArgs {
  @scala.inline
  def apply(
    axis: Double | js.Array[Double] = null,
    batchInputShape: Shape = null,
    batchSize: Int | Double = null,
    betaInitializer: InitializerIdentifier | Initializer = null,
    betaRegularizer: RegularizerIdentifier | Regularizer = null,
    center: js.UndefOr[Boolean] = js.undefined,
    dtype: DataType = null,
    epsilon: Int | Double = null,
    gammaInitializer: InitializerIdentifier | Initializer = null,
    gammaRegularizer: RegularizerIdentifier | Regularizer = null,
    inputDType: DataType = null,
    inputShape: Shape = null,
    name: String = null,
    scale: js.UndefOr[Boolean] = js.undefined,
    trainable: js.UndefOr[Boolean] = js.undefined,
    weights: js.Array[Tensor_[Rank]] = null
  ): LayerNormalizationLayerArgs = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (betaInitializer != null) __obj.updateDynamic("betaInitializer")(betaInitializer.asInstanceOf[js.Any])
    if (betaRegularizer != null) __obj.updateDynamic("betaRegularizer")(betaRegularizer.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (epsilon != null) __obj.updateDynamic("epsilon")(epsilon.asInstanceOf[js.Any])
    if (gammaInitializer != null) __obj.updateDynamic("gammaInitializer")(gammaInitializer.asInstanceOf[js.Any])
    if (gammaRegularizer != null) __obj.updateDynamic("gammaRegularizer")(gammaRegularizer.asInstanceOf[js.Any])
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType.asInstanceOf[js.Any])
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    if (weights != null) __obj.updateDynamic("weights")(weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerNormalizationLayerArgs]
  }
}


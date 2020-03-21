package typingsJapgolly.tensorflowTfjsCore.typesMod

import typingsJapgolly.tensorflowTfjsCore.AnonDtype
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeightsManifestEntry extends js.Object {
  /**
    * Data type of the weight.
    */
  var dtype: float32 | int32 | bool | string
  /**
    * Type of the weight.
    *
    * Optional.
    *
    * The value 'optimizer' indicates the weight belongs to an optimizer
    * (i.e., used only during model training and not during inference).
    */
  var group: js.UndefOr[WeightGroup] = js.undefined
  /**
    * Name of the weight, e.g., 'Dense_1/bias'
    */
  var name: String
  /**
    * Information for dequantization of the weight.
    */
  var quantization: js.UndefOr[AnonDtype] = js.undefined
  /**
    * Shape of the weight.
    */
  var shape: js.Array[Double]
}

object WeightsManifestEntry {
  @scala.inline
  def apply(
    dtype: float32 | int32 | bool | string,
    name: String,
    shape: js.Array[Double],
    group: WeightGroup = null,
    quantization: AnonDtype = null
  ): WeightsManifestEntry = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (quantization != null) __obj.updateDynamic("quantization")(quantization.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightsManifestEntry]
  }
}


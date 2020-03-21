package typingsJapgolly.tensorflowTfjsConverter.typesMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TensorInfo extends js.Object {
  var dtype: DataType
  var name: String
  var shape: js.UndefOr[js.Array[Double]] = js.undefined
}

object TensorInfo {
  @scala.inline
  def apply(dtype: DataType, name: String, shape: js.Array[Double] = null): TensorInfo = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorInfo]
  }
}


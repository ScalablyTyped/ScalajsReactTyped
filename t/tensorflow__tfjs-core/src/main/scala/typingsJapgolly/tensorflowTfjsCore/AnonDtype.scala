package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.uint16
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.uint8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDtype extends js.Object {
  var dtype: uint16 | uint8
  var min: Double
  var scale: Double
}

object AnonDtype {
  @scala.inline
  def apply(dtype: uint16 | uint8, min: Double, scale: Double): AnonDtype = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDtype]
  }
}


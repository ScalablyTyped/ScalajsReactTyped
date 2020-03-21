package typingsJapgolly.tensorflowTfjsCore.fusedUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.linear
  - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu
  - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.prelu
  - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.elu
  - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu6
*/
trait Activation extends js.Object

object Activation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def elu: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.elu = this.cast("elu")
  @scala.inline
  def linear: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.linear = this.cast("linear")
  @scala.inline
  def prelu: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.prelu = this.cast("prelu")
  @scala.inline
  def relu: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu = this.cast("relu")
  @scala.inline
  def relu6: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu6 = this.cast("relu6")
}


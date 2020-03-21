package typingsJapgolly.tensorflowTfjsLayers.activationConfigMod

import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.elu_
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu_
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softmax_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.elu_
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hardSigmoid
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu_
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softmax_
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh
*/
trait ActivationIdentifier extends js.Object

object ActivationIdentifier {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def elu: elu_ = this.cast("elu")
  @scala.inline
  def hardSigmoid: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hardSigmoid = this.cast("hardSigmoid")
  @scala.inline
  def linear: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear = this.cast("linear")
  @scala.inline
  def relu: relu_ = this.cast("relu")
  @scala.inline
  def relu6: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6 = this.cast("relu6")
  @scala.inline
  def selu: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu = this.cast("selu")
  @scala.inline
  def sigmoid: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid = this.cast("sigmoid")
  @scala.inline
  def softmax: softmax_ = this.cast("softmax")
  @scala.inline
  def softplus: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus = this.cast("softplus")
  @scala.inline
  def softsign: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign = this.cast("softsign")
  @scala.inline
  def tanh: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh = this.cast("tanh")
}


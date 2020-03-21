package typingsJapgolly.tensorflowTfjsLayers.activationsMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import typingsJapgolly.tensorflowTfjsCore.mod.serialization.Serializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/activations", "Activation")
@js.native
abstract class Activation () extends Serializable {
  @JSName("apply")
  def apply(tensor: Tensor_[Rank]): Tensor_[Rank] = js.native
  @JSName("apply")
  def apply(tensor: Tensor_[Rank], axis: Double): Tensor_[Rank] = js.native
}


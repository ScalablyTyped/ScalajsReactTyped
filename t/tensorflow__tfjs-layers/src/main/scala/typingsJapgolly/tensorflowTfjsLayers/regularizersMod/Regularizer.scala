package typingsJapgolly.tensorflowTfjsLayers.regularizersMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import typingsJapgolly.tensorflowTfjsCore.mod.serialization.Serializable
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Scalar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/regularizers", "Regularizer")
@js.native
abstract class Regularizer () extends Serializable {
  @JSName("apply")
  def apply(x: Tensor_[Rank]): Scalar = js.native
}


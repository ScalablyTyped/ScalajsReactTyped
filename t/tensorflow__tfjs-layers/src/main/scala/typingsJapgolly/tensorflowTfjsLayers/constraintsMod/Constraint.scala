package typingsJapgolly.tensorflowTfjsLayers.constraintsMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import typingsJapgolly.tensorflowTfjsCore.mod.serialization.Serializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/constraints", "Constraint")
@js.native
abstract class Constraint () extends Serializable {
  @JSName("apply")
  def apply(w: Tensor_[Rank]): Tensor_[Rank] = js.native
}


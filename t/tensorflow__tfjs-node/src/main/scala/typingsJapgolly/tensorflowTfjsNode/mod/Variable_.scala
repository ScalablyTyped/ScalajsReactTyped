package typingsJapgolly.tensorflowTfjsNode.mod

import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "Variable")
@js.native
class Variable_[R /* <: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank */] protected ()
  extends typingsJapgolly.tensorflowTfjs.mod.Variable_[R] {
  def this(initialValue: Tensor[R], trainable: Boolean, name: String, tensorId: Double) = this()
}


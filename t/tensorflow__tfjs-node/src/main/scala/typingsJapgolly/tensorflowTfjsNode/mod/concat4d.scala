package typingsJapgolly.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "concat4d")
@js.native
object concat4d
  extends TopLevel[
      js.Function2[/* tensors */ js.Array[Tensor4D | TensorLike], /* axis */ Double, Tensor4D]
    ]


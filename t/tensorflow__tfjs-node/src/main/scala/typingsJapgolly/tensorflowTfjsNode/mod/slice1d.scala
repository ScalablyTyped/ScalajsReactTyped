package typingsJapgolly.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "slice1d")
@js.native
object slice1d
  extends TopLevel[
      js.Function3[/* x */ Tensor1D | TensorLike, /* begin */ Double, /* size */ Double, Tensor1D]
    ]


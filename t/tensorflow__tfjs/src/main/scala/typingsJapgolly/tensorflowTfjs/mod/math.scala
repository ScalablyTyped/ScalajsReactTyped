package typingsJapgolly.tensorflowTfjs.mod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor1D
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "math")
@js.native
object math extends js.Object {
  val confusionMatrix: js.Function3[
    /* labels */ Tensor1D | TensorLike, 
    /* predictions */ Tensor1D | TensorLike, 
    /* numClasses */ Double, 
    Tensor2D
  ] = js.native
}


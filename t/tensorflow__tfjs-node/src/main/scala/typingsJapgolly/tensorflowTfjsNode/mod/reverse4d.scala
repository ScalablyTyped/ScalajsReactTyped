package typingsJapgolly.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "reverse4d")
@js.native
object reverse4d
  extends TopLevel[
      js.Function2[
        /* x */ Tensor4D | TensorLike, 
        /* axis */ js.UndefOr[Double | js.Array[Double]], 
        Tensor4D
      ]
    ]


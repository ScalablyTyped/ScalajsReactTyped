package typingsJapgolly.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "pad2d")
@js.native
object pad2d
  extends TopLevel[
      js.Function3[
        /* x */ Tensor2D | TensorLike, 
        /* paddings */ js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
        /* constantValue */ js.UndefOr[Double], 
        Tensor2D
      ]
    ]


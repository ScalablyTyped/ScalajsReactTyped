package typingsJapgolly.tensorflowTfjs.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor1D
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "batchNorm2d")
@js.native
object batchNorm2d
  extends TopLevel[
      js.Function6[
        /* x */ Tensor2D | TensorLike, 
        /* mean */ Tensor2D | Tensor1D | TensorLike, 
        /* variance */ Tensor2D | Tensor1D | TensorLike, 
        /* offset */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
        /* scale */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
        /* varianceEpsilon */ js.UndefOr[Double], 
        Tensor2D
      ]
    ]


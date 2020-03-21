package typingsJapgolly.tensorflowTfjsCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor1D
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "batchNormalization3d")
@js.native
object batchNormalization3d
  extends TopLevel[
      js.Function6[
        /* x */ Tensor3D | TensorLike, 
        /* mean */ Tensor3D | Tensor1D | TensorLike, 
        /* variance */ Tensor3D | Tensor1D | TensorLike, 
        /* varianceEpsilon */ js.UndefOr[Double], 
        /* scale */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
        /* offset */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
        Tensor3D
      ]
    ]


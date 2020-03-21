package typingsJapgolly.tensorflowTfjs.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.euclidean
import typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.fro
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "norm")
@js.native
object norm
  extends TopLevel[
      js.Function4[
        /* x */ Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* ord */ js.UndefOr[Double | euclidean | fro], 
        /* axis */ js.UndefOr[Double | js.Array[Double]], 
        /* keepDims */ js.UndefOr[Boolean], 
        Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]


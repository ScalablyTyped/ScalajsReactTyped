package typingsJapgolly.tensorflowTfjsCore.opsMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "booleanMaskAsync")
@js.native
object booleanMaskAsync
  extends TopLevel[
      js.Function3[
        /* tensor */ Tensor[Rank] | TensorLike, 
        /* mask */ Tensor[Rank] | TensorLike, 
        /* axis */ js.UndefOr[Double], 
        js.Promise[Tensor[Rank]]
      ]
    ]


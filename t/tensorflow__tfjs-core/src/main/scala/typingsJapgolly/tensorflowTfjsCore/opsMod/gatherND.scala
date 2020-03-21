package typingsJapgolly.tensorflowTfjsCore.opsMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "gatherND")
@js.native
object gatherND
  extends TopLevel[
      js.Function2[
        /* x */ Tensor[Rank] | TensorLike, 
        /* indices */ Tensor[Rank] | TensorLike, 
        Tensor[Rank]
      ]
    ]


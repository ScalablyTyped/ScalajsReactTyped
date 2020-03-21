package typingsJapgolly.tensorflowTfjsCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "gatherND")
@js.native
object gatherND
  extends TopLevel[
      js.Function2[
        /* x */ Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* indices */ Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]


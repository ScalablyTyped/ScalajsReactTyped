package typingsJapgolly.tensorflowTfjs.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "setdiff1dAsync")
@js.native
object setdiff1dAsync
  extends TopLevel[
      js.Function2[
        /* x */ Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* y */ Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        js.Promise[
          js.Tuple2[
            Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank], 
            Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
          ]
        ]
      ]
    ]


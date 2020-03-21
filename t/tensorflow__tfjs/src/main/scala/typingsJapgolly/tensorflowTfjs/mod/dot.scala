package typingsJapgolly.tensorflowTfjs.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "dot")
@js.native
object dot
  extends TopLevel[
      js.Function2[
        /* t1 */ Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* t2 */ Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]


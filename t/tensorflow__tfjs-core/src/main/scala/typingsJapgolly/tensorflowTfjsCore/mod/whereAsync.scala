package typingsJapgolly.tensorflowTfjsCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "whereAsync")
@js.native
object whereAsync
  extends TopLevel[
      js.Function1[
        /* condition */ Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        js.Promise[Tensor2D]
      ]
    ]


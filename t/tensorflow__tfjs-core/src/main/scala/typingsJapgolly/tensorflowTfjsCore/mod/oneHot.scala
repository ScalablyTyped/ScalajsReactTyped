package typingsJapgolly.tensorflowTfjsCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "oneHot")
@js.native
object oneHot
  extends TopLevel[
      js.Function4[
        /* indices */ Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* depth */ Double, 
        /* onValue */ js.UndefOr[Double], 
        /* offValue */ js.UndefOr[Double], 
        Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]


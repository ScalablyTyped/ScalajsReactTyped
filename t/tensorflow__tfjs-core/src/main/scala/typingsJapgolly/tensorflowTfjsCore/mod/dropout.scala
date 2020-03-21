package typingsJapgolly.tensorflowTfjsCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "dropout")
@js.native
object dropout
  extends TopLevel[
      js.Function4[
        /* x */ Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* rate */ Double, 
        /* noiseShape */ js.UndefOr[js.Array[Double]], 
        /* seed */ js.UndefOr[Double | String], 
        Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]


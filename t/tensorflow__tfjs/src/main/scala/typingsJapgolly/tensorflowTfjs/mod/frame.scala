package typingsJapgolly.tensorflowTfjs.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "frame")
@js.native
object frame
  extends TopLevel[
      js.Function5[
        /* signal */ Tensor1D, 
        /* frameLength */ Double, 
        /* frameStep */ Double, 
        /* padEnd */ js.UndefOr[Boolean], 
        /* padValue */ js.UndefOr[Double], 
        Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]


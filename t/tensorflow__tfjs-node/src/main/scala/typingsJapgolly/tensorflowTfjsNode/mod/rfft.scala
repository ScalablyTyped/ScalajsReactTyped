package typingsJapgolly.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "rfft")
@js.native
object rfft
  extends TopLevel[
      js.Function2[
        /* input */ Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank], 
        /* fftLength */ js.UndefOr[Double], 
        Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]


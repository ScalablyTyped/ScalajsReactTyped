package typingsJapgolly.tensorflowTfjs.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.NCHW
import typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.NHWC
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike4D
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "depthToSpace")
@js.native
object depthToSpace
  extends TopLevel[
      js.Function3[
        /* x */ Tensor4D | TensorLike4D, 
        /* blockSize */ Double, 
        /* dataFormat */ js.UndefOr[NHWC | NCHW], 
        Tensor4D
      ]
    ]


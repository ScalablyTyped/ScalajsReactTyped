package typingsJapgolly.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.lstmMod.LSTMCellFunc
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "multiRNNCell")
@js.native
object multiRNNCell
  extends TopLevel[
      js.Function4[
        /* lstmCells */ js.Array[LSTMCellFunc], 
        /* data */ Tensor2D | TensorLike, 
        /* c */ js.Array[Tensor2D | TensorLike], 
        /* h */ js.Array[Tensor2D | TensorLike], 
        js.Tuple2[js.Array[Tensor2D], js.Array[Tensor2D]]
      ]
    ]


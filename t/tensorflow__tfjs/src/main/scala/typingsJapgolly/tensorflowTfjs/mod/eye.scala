package typingsJapgolly.tensorflowTfjs.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "eye")
@js.native
object eye
  extends TopLevel[
      js.Function4[
        /* numRows */ Double, 
        /* numColumns */ js.UndefOr[Double], 
        /* batchShape */ js.UndefOr[
          js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
        ], 
        /* dtype */ js.UndefOr[DataType], 
        Tensor2D
      ]
    ]


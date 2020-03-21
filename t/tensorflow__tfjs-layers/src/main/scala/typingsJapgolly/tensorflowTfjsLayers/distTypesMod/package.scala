package typingsJapgolly.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type Kwargs = org.scalablytyped.runtime.StringDictionary[js.Any]
  type LossOrMetricFn = js.Function2[
    /* yTrue */ typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank], 
    /* yPred */ typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ]
  type RegularizerFn = js.Function0[typingsJapgolly.tensorflowTfjsCore.tensorMod.Scalar]
  type RnnStepFunction = js.Function2[
    /* inputs */ typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank], 
    /* states */ js.Array[
      typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
    ], 
    js.Tuple2[
      typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank], 
      js.Array[
        typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]
  ]
  type TensorOrArrayOrMap = typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
    typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ]) | typingsJapgolly.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
}

package typingsJapgolly.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object operationsTypesMod {
  type InternalOpExecutor = js.Function3[
    /* node */ typingsJapgolly.tensorflowTfjsConverter.operationsTypesMod.Node, 
    /* tensorMap */ typingsJapgolly.tensorflowTfjsConverter.typesMod.NamedTensorsMap, 
    /* context */ typingsJapgolly.tensorflowTfjsConverter.executionContextMod.ExecutionContext, 
    typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
    ]) | (js.Promise[
      typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
        typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
      ])
    ])
  ]
  type OpExecutor = js.Function1[
    /* node */ typingsJapgolly.tensorflowTfjsConverter.operationsTypesMod.GraphNode, 
    typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
    ]) | (js.Promise[
      typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
        typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
      ])
    ])
  ]
  type ValueType = java.lang.String | (js.Array[
    js.Array[scala.Double] | scala.Boolean | scala.Double | java.lang.String | typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ]) | scala.Double | scala.Boolean | typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
}

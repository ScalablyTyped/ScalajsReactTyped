package typingsJapgolly.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object topologyMod {
  type CallHook = js.Function2[
    /* inputs */ typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
    ]), 
    /* kwargs */ typingsJapgolly.tensorflowTfjsLayers.distTypesMod.Kwargs, 
    scala.Unit
  ]
  type Op = js.Function1[
    /* x */ typingsJapgolly.tensorflowTfjsLayers.variablesMod.LayerVariable, 
    typingsJapgolly.tensorflowTfjsLayers.variablesMod.LayerVariable
  ]
}

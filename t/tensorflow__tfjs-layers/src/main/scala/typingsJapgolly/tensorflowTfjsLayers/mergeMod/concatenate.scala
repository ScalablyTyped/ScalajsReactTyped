package typingsJapgolly.tensorflowTfjsLayers.mergeMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import typingsJapgolly.tensorflowTfjsLayers.topologyMod.Layer
import typingsJapgolly.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "concatenate")
@js.native
object concatenate extends js.Object {
  def apply(): Layer | SymbolicTensor | Tensor_[Rank] = js.native
  def apply(config: js.Array[SymbolicTensor | Tensor_[Rank]]): Layer | SymbolicTensor | Tensor_[Rank] = js.native
  def apply(config: ConcatenateLayerArgs): Layer | SymbolicTensor | Tensor_[Rank] = js.native
}


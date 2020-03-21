package typingsJapgolly.tensorflowTfjsLayers.recurrentMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import typingsJapgolly.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "RNNCell")
@js.native
abstract class RNNCell () extends Layer {
  var dropoutMask: Tensor_[Rank] | js.Array[Tensor_[Rank]] = js.native
  var recurrentDropoutMask: Tensor_[Rank] | js.Array[Tensor_[Rank]] = js.native
  /**
    * Size(s) of the states.
    * For RNN cells with only a single state, this is a single integer.
    */
  var stateSize: Double | js.Array[Double] = js.native
}


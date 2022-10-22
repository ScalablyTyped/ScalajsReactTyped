package typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.Layer
import typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "RNNCell")
@js.native
open class RNNCell () extends Layer {
  def this(args: LayerArgs) = this()
  
  var dropoutMask: Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  
  var recurrentDropoutMask: Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  
  /**
    * Size(s) of the states.
    * For RNN cells with only a single state, this is a single integer.
    */
  var stateSize: Double | js.Array[Double] = js.native
}

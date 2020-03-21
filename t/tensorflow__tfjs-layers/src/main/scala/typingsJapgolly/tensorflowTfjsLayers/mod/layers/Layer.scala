package typingsJapgolly.tensorflowTfjsLayers.mod.layers

import typingsJapgolly.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers", "layers.Layer")
@js.native
abstract class Layer protected ()
  extends typingsJapgolly.tensorflowTfjsLayers.exportsLayersMod.Layer {
  def this(args: LayerArgs) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-layers", "layers.Layer")
@js.native
object Layer extends js.Object {
  /**
    * Converts a layer and its index to a unique (immutable type) name.
    * This function is used internally with `this.containerNodes`.
    * @param layer The layer.
    * @param nodeIndex The layer's position (e.g. via enumerate) in a list of
    *   nodes.
    *
    * @returns The unique name.
    */
  /* protected */ def nodeKey(layer: typingsJapgolly.tensorflowTfjsLayers.topologyMod.Layer, nodeIndex: Double): String = js.native
}


package typingsJapgolly.tensorflowTfjsLayers.modelsMod

import typingsJapgolly.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequentialArgs extends js.Object {
  /** Stack of layers for the model. */
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  /** The name of this model. */
  var name: js.UndefOr[String] = js.undefined
}

object SequentialArgs {
  @scala.inline
  def apply(layers: js.Array[Layer] = null, name: String = null): SequentialArgs = {
    val __obj = js.Dynamic.literal()
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequentialArgs]
  }
}


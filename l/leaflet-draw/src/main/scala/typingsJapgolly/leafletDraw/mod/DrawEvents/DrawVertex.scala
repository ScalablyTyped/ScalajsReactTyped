package typingsJapgolly.leafletDraw.mod.DrawEvents

import typingsJapgolly.leaflet.mod.LayerGroup_
import typingsJapgolly.leaflet.mod.LeafletEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawVertex extends LeafletEvent {
  /**
    * List of all layers just being added from the map.
    */
  var layers: LayerGroup_[_]
}

object DrawVertex {
  @scala.inline
  def apply(
    layer: js.Any,
    layers: LayerGroup_[_],
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): DrawVertex = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawVertex]
  }
}


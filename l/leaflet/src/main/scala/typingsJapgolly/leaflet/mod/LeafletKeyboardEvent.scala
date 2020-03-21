package typingsJapgolly.leaflet.mod

import org.scalajs.dom.raw.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.leaflet.mod.DomEvent._PropagableEvent because Already inherited */ trait LeafletKeyboardEvent extends LeafletEvent {
  var originalEvent: KeyboardEvent
}

object LeafletKeyboardEvent {
  @scala.inline
  def apply(
    layer: js.Any,
    originalEvent: KeyboardEvent,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): LeafletKeyboardEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafletKeyboardEvent]
  }
}


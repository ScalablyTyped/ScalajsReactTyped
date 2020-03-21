package typingsJapgolly.openlayers.mod.olx.interaction

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openlayers.mod.EventsConditionType
import typingsJapgolly.openlayers.mod.Kinetic
import typingsJapgolly.openlayers.mod.MapBrowserEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragPanOptions extends js.Object {
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  var kinetic: js.UndefOr[Kinetic] = js.undefined
}

object DragPanOptions {
  @scala.inline
  def apply(condition: /* event */ MapBrowserEvent => CallbackTo[Boolean] = null, kinetic: Kinetic = null): DragPanOptions = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapBrowserEvent) => condition(t0).runNow()))
    if (kinetic != null) __obj.updateDynamic("kinetic")(kinetic.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragPanOptions]
  }
}


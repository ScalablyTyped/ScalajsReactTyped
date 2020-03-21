package typingsJapgolly.openlayers.mod.olx.interaction

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openlayers.mod.EventsConditionType
import typingsJapgolly.openlayers.mod.MapBrowserEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragRotateOptions extends js.Object {
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
}

object DragRotateOptions {
  @scala.inline
  def apply(
    condition: /* event */ MapBrowserEvent => CallbackTo[Boolean] = null,
    duration: Int | Double = null
  ): DragRotateOptions = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapBrowserEvent) => condition(t0).runNow()))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragRotateOptions]
  }
}


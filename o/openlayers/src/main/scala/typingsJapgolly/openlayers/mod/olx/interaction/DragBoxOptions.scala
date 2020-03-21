package typingsJapgolly.openlayers.mod.olx.interaction

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openlayers.mod.DragBoxEndConditionType
import typingsJapgolly.openlayers.mod.EventsConditionType
import typingsJapgolly.openlayers.mod.MapBrowserEvent
import typingsJapgolly.openlayers.mod.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragBoxOptions extends js.Object {
  var boxEndCondition: js.UndefOr[DragBoxEndConditionType] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  var minArea: js.UndefOr[Double] = js.undefined
}

object DragBoxOptions {
  @scala.inline
  def apply(
    boxEndCondition: (/* event */ MapBrowserEvent, /* pixel1 */ Pixel, /* pixel2 */ Pixel) => CallbackTo[Boolean] = null,
    className: String = null,
    condition: /* event */ MapBrowserEvent => CallbackTo[Boolean] = null,
    minArea: Int | Double = null
  ): DragBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (boxEndCondition != null) __obj.updateDynamic("boxEndCondition")(js.Any.fromFunction3((t0: /* event */ typingsJapgolly.openlayers.mod.MapBrowserEvent, t1: /* pixel1 */ typingsJapgolly.openlayers.mod.Pixel, t2: /* pixel2 */ typingsJapgolly.openlayers.mod.Pixel) => boxEndCondition(t0, t1, t2).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapBrowserEvent) => condition(t0).runNow()))
    if (minArea != null) __obj.updateDynamic("minArea")(minArea.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragBoxOptions]
  }
}


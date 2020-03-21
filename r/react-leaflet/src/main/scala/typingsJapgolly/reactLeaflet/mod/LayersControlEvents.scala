package typingsJapgolly.reactLeaflet.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.leaflet.mod.LayersControlEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersControlEvents extends js.Object {
  var onbaselayerchange: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.undefined
  var onoverlayadd: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.undefined
  var onoverlayremove: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.undefined
}

object LayersControlEvents {
  @scala.inline
  def apply(
    onbaselayerchange: /* event */ LayersControlEvent => Callback = null,
    onoverlayadd: /* event */ LayersControlEvent => Callback = null,
    onoverlayremove: /* event */ LayersControlEvent => Callback = null
  ): LayersControlEvents = {
    val __obj = js.Dynamic.literal()
    if (onbaselayerchange != null) __obj.updateDynamic("onbaselayerchange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayersControlEvent) => onbaselayerchange(t0).runNow()))
    if (onoverlayadd != null) __obj.updateDynamic("onoverlayadd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayersControlEvent) => onoverlayadd(t0).runNow()))
    if (onoverlayremove != null) __obj.updateDynamic("onoverlayremove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayersControlEvent) => onoverlayremove(t0).runNow()))
    __obj.asInstanceOf[LayersControlEvents]
  }
}


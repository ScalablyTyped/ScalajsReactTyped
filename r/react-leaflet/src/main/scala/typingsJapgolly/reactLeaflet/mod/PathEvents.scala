package typingsJapgolly.reactLeaflet.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.leaflet.mod.LeafletEvent
import typingsJapgolly.leaflet.mod.LeafletMouseEvent
import typingsJapgolly.leaflet.mod.PopupEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathEvents extends js.Object {
  var onadd: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var oncontextmenu: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var ondblclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var onmousedown: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var onmouseout: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var onmouseover: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var onpopupclose: js.UndefOr[js.Function1[/* event */ PopupEvent, Unit]] = js.undefined
  var onpopupopen: js.UndefOr[js.Function1[/* event */ PopupEvent, Unit]] = js.undefined
  var onremove: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
}

object PathEvents {
  @scala.inline
  def apply(
    onadd: /* event */ LeafletEvent => Callback = null,
    onclick: /* event */ LeafletMouseEvent => Callback = null,
    oncontextmenu: /* event */ LeafletMouseEvent => Callback = null,
    ondblclick: /* event */ LeafletMouseEvent => Callback = null,
    onmousedown: /* event */ LeafletMouseEvent => Callback = null,
    onmouseout: /* event */ LeafletMouseEvent => Callback = null,
    onmouseover: /* event */ LeafletMouseEvent => Callback = null,
    onpopupclose: /* event */ PopupEvent => Callback = null,
    onpopupopen: /* event */ PopupEvent => Callback = null,
    onremove: /* event */ LeafletEvent => Callback = null
  ): PathEvents = {
    val __obj = js.Dynamic.literal()
    if (onadd != null) __obj.updateDynamic("onadd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onadd(t0).runNow()))
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onclick(t0).runNow()))
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => oncontextmenu(t0).runNow()))
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => ondblclick(t0).runNow()))
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onmousedown(t0).runNow()))
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onmouseout(t0).runNow()))
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onmouseover(t0).runNow()))
    if (onpopupclose != null) __obj.updateDynamic("onpopupclose")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.PopupEvent) => onpopupclose(t0).runNow()))
    if (onpopupopen != null) __obj.updateDynamic("onpopupopen")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.PopupEvent) => onpopupopen(t0).runNow()))
    if (onremove != null) __obj.updateDynamic("onremove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onremove(t0).runNow()))
    __obj.asInstanceOf[PathEvents]
  }
}


package typingsJapgolly.reactLeaflet.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.leaflet.mod.DragEndEvent
import typingsJapgolly.leaflet.mod.ErrorEvent
import typingsJapgolly.leaflet.mod.LayerEvent
import typingsJapgolly.leaflet.mod.LayersControlEvent
import typingsJapgolly.leaflet.mod.LeafletEvent
import typingsJapgolly.leaflet.mod.LeafletMouseEvent
import typingsJapgolly.leaflet.mod.LocationEvent
import typingsJapgolly.leaflet.mod.PopupEvent
import typingsJapgolly.leaflet.mod.ResizeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapEvents extends js.Object {
  var onautopanstart: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onbaselayerchange: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.undefined
  var onblur: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var oncontextmenu: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var ondblclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var ondrag: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var ondragend: js.UndefOr[js.Function1[/* event */ DragEndEvent, Unit]] = js.undefined
  var ondragstart: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onfocus: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onlayeradd: js.UndefOr[js.Function1[/* event */ LayerEvent, Unit]] = js.undefined
  var onlayerremove: js.UndefOr[js.Function1[/* event */ LayerEvent, Unit]] = js.undefined
  var onload: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onlocationerror: js.UndefOr[js.Function1[/* event */ ErrorEvent, Unit]] = js.undefined
  var onlocationfound: js.UndefOr[js.Function1[/* event */ LocationEvent, Unit]] = js.undefined
  var onmousedown: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var onmousemove: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var onmouseout: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var onmouseover: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var onmouseup: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var onmove: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onmoveend: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onmovestart: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onoverlayadd: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.undefined
  var onoverlayremove: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.undefined
  var onpopupclose: js.UndefOr[js.Function1[/* event */ PopupEvent, Unit]] = js.undefined
  var onpopupopen: js.UndefOr[js.Function1[/* event */ PopupEvent, Unit]] = js.undefined
  var onpreclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var onresize: js.UndefOr[js.Function1[/* event */ ResizeEvent, Unit]] = js.undefined
  var onunload: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onviewreset: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onzoomend: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onzoomlevelschange: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onzoomstart: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
}

object MapEvents {
  @scala.inline
  def apply(
    onautopanstart: /* event */ LeafletEvent => Callback = null,
    onbaselayerchange: /* event */ LayersControlEvent => Callback = null,
    onblur: /* event */ LeafletEvent => Callback = null,
    onclick: /* event */ LeafletMouseEvent => Callback = null,
    oncontextmenu: /* event */ LeafletMouseEvent => Callback = null,
    ondblclick: /* event */ LeafletMouseEvent => Callback = null,
    ondrag: /* event */ LeafletEvent => Callback = null,
    ondragend: /* event */ DragEndEvent => Callback = null,
    ondragstart: /* event */ LeafletEvent => Callback = null,
    onfocus: /* event */ LeafletEvent => Callback = null,
    onlayeradd: /* event */ LayerEvent => Callback = null,
    onlayerremove: /* event */ LayerEvent => Callback = null,
    onload: /* event */ LeafletEvent => Callback = null,
    onlocationerror: /* event */ ErrorEvent => Callback = null,
    onlocationfound: /* event */ LocationEvent => Callback = null,
    onmousedown: /* event */ LeafletMouseEvent => Callback = null,
    onmousemove: /* event */ LeafletMouseEvent => Callback = null,
    onmouseout: /* event */ LeafletMouseEvent => Callback = null,
    onmouseover: /* event */ LeafletMouseEvent => Callback = null,
    onmouseup: /* event */ LeafletMouseEvent => Callback = null,
    onmove: /* event */ LeafletEvent => Callback = null,
    onmoveend: /* event */ LeafletEvent => Callback = null,
    onmovestart: /* event */ LeafletEvent => Callback = null,
    onoverlayadd: /* event */ LayersControlEvent => Callback = null,
    onoverlayremove: /* event */ LayersControlEvent => Callback = null,
    onpopupclose: /* event */ PopupEvent => Callback = null,
    onpopupopen: /* event */ PopupEvent => Callback = null,
    onpreclick: /* event */ LeafletMouseEvent => Callback = null,
    onresize: /* event */ ResizeEvent => Callback = null,
    onunload: /* event */ LeafletEvent => Callback = null,
    onviewreset: /* event */ LeafletEvent => Callback = null,
    onzoomend: /* event */ LeafletEvent => Callback = null,
    onzoomlevelschange: /* event */ LeafletEvent => Callback = null,
    onzoomstart: /* event */ LeafletEvent => Callback = null
  ): MapEvents = {
    val __obj = js.Dynamic.literal()
    if (onautopanstart != null) __obj.updateDynamic("onautopanstart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onautopanstart(t0).runNow()))
    if (onbaselayerchange != null) __obj.updateDynamic("onbaselayerchange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayersControlEvent) => onbaselayerchange(t0).runNow()))
    if (onblur != null) __obj.updateDynamic("onblur")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onblur(t0).runNow()))
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onclick(t0).runNow()))
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => oncontextmenu(t0).runNow()))
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => ondblclick(t0).runNow()))
    if (ondrag != null) __obj.updateDynamic("ondrag")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => ondrag(t0).runNow()))
    if (ondragend != null) __obj.updateDynamic("ondragend")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.DragEndEvent) => ondragend(t0).runNow()))
    if (ondragstart != null) __obj.updateDynamic("ondragstart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => ondragstart(t0).runNow()))
    if (onfocus != null) __obj.updateDynamic("onfocus")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onfocus(t0).runNow()))
    if (onlayeradd != null) __obj.updateDynamic("onlayeradd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayerEvent) => onlayeradd(t0).runNow()))
    if (onlayerremove != null) __obj.updateDynamic("onlayerremove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayerEvent) => onlayerremove(t0).runNow()))
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onload(t0).runNow()))
    if (onlocationerror != null) __obj.updateDynamic("onlocationerror")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.ErrorEvent) => onlocationerror(t0).runNow()))
    if (onlocationfound != null) __obj.updateDynamic("onlocationfound")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LocationEvent) => onlocationfound(t0).runNow()))
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onmousedown(t0).runNow()))
    if (onmousemove != null) __obj.updateDynamic("onmousemove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onmousemove(t0).runNow()))
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onmouseout(t0).runNow()))
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onmouseover(t0).runNow()))
    if (onmouseup != null) __obj.updateDynamic("onmouseup")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onmouseup(t0).runNow()))
    if (onmove != null) __obj.updateDynamic("onmove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onmove(t0).runNow()))
    if (onmoveend != null) __obj.updateDynamic("onmoveend")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onmoveend(t0).runNow()))
    if (onmovestart != null) __obj.updateDynamic("onmovestart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onmovestart(t0).runNow()))
    if (onoverlayadd != null) __obj.updateDynamic("onoverlayadd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayersControlEvent) => onoverlayadd(t0).runNow()))
    if (onoverlayremove != null) __obj.updateDynamic("onoverlayremove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayersControlEvent) => onoverlayremove(t0).runNow()))
    if (onpopupclose != null) __obj.updateDynamic("onpopupclose")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.PopupEvent) => onpopupclose(t0).runNow()))
    if (onpopupopen != null) __obj.updateDynamic("onpopupopen")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.PopupEvent) => onpopupopen(t0).runNow()))
    if (onpreclick != null) __obj.updateDynamic("onpreclick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onpreclick(t0).runNow()))
    if (onresize != null) __obj.updateDynamic("onresize")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.ResizeEvent) => onresize(t0).runNow()))
    if (onunload != null) __obj.updateDynamic("onunload")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onunload(t0).runNow()))
    if (onviewreset != null) __obj.updateDynamic("onviewreset")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onviewreset(t0).runNow()))
    if (onzoomend != null) __obj.updateDynamic("onzoomend")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onzoomend(t0).runNow()))
    if (onzoomlevelschange != null) __obj.updateDynamic("onzoomlevelschange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onzoomlevelschange(t0).runNow()))
    if (onzoomstart != null) __obj.updateDynamic("onzoomstart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onzoomstart(t0).runNow()))
    __obj.asInstanceOf[MapEvents]
  }
}


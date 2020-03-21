package typingsJapgolly.reactLeaflet.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.leaflet.mod.DivIcon_
import typingsJapgolly.leaflet.mod.DragEndEvent
import typingsJapgolly.leaflet.mod.IconOptions
import typingsJapgolly.leaflet.mod.Icon_
import typingsJapgolly.leaflet.mod.LatLngExpression
import typingsJapgolly.leaflet.mod.LeafletEvent
import typingsJapgolly.leaflet.mod.LeafletMouseEvent
import typingsJapgolly.leaflet.mod.MarkerOptions
import typingsJapgolly.leaflet.mod.PointExpression
import typingsJapgolly.leaflet.mod.PopupEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet
- typingsJapgolly.reactLeaflet.mod.MapLayerProps because var conflicts: attribution, pane. Inlined children */ trait MarkerProps
  extends MarkerOptions
     with MarkerEvents {
  var children: js.UndefOr[Children] = js.undefined
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  var position: LatLngExpression
}

object MarkerProps {
  @scala.inline
  def apply(
    position: LatLngExpression,
    alt: String = null,
    attribution: String = null,
    autoPan: js.UndefOr[Boolean] = js.undefined,
    autoPanPadding: PointExpression = null,
    autoPanSpeed: Int | Double = null,
    bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined,
    children: Children = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    icon: Icon_[IconOptions] | DivIcon_ = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    onadd: /* event */ LeafletEvent => Callback = null,
    onclick: /* event */ LeafletMouseEvent => Callback = null,
    oncontextmenu: /* event */ LeafletMouseEvent => Callback = null,
    ondblclick: /* event */ LeafletMouseEvent => Callback = null,
    ondrag: /* event */ LeafletEvent => Callback = null,
    ondragend: /* event */ DragEndEvent => Callback = null,
    ondragstart: /* event */ LeafletEvent => Callback = null,
    onmousedown: /* event */ LeafletMouseEvent => Callback = null,
    onmouseout: /* event */ LeafletMouseEvent => Callback = null,
    onmouseover: /* event */ LeafletMouseEvent => Callback = null,
    onmove: /* event */ LeafletEvent => Callback = null,
    onpopupclose: /* event */ PopupEvent => Callback = null,
    onpopupopen: /* event */ PopupEvent => Callback = null,
    onremove: /* event */ LeafletEvent => Callback = null,
    opacity: Int | Double = null,
    pane: String = null,
    riseOffset: Int | Double = null,
    riseOnHover: js.UndefOr[Boolean] = js.undefined,
    shadowPane: String = null,
    title: String = null,
    zIndexOffset: Int | Double = null
  ): MarkerProps = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPan)) __obj.updateDynamic("autoPan")(autoPan.asInstanceOf[js.Any])
    if (autoPanPadding != null) __obj.updateDynamic("autoPanPadding")(autoPanPadding.asInstanceOf[js.Any])
    if (autoPanSpeed != null) __obj.updateDynamic("autoPanSpeed")(autoPanSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(bubblingMouseEvents)) __obj.updateDynamic("bubblingMouseEvents")(bubblingMouseEvents.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    if (onadd != null) __obj.updateDynamic("onadd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onadd(t0).runNow()))
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onclick(t0).runNow()))
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => oncontextmenu(t0).runNow()))
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => ondblclick(t0).runNow()))
    if (ondrag != null) __obj.updateDynamic("ondrag")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => ondrag(t0).runNow()))
    if (ondragend != null) __obj.updateDynamic("ondragend")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.DragEndEvent) => ondragend(t0).runNow()))
    if (ondragstart != null) __obj.updateDynamic("ondragstart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => ondragstart(t0).runNow()))
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onmousedown(t0).runNow()))
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onmouseout(t0).runNow()))
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onmouseover(t0).runNow()))
    if (onmove != null) __obj.updateDynamic("onmove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onmove(t0).runNow()))
    if (onpopupclose != null) __obj.updateDynamic("onpopupclose")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.PopupEvent) => onpopupclose(t0).runNow()))
    if (onpopupopen != null) __obj.updateDynamic("onpopupopen")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.PopupEvent) => onpopupopen(t0).runNow()))
    if (onremove != null) __obj.updateDynamic("onremove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onremove(t0).runNow()))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (riseOffset != null) __obj.updateDynamic("riseOffset")(riseOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(riseOnHover)) __obj.updateDynamic("riseOnHover")(riseOnHover.asInstanceOf[js.Any])
    if (shadowPane != null) __obj.updateDynamic("shadowPane")(shadowPane.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (zIndexOffset != null) __obj.updateDynamic("zIndexOffset")(zIndexOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerProps]
  }
}


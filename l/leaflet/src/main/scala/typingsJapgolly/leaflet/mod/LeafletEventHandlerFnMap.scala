package typingsJapgolly.leaflet.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafletEventHandlerFnMap extends js.Object {
  var add: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var autopanstart: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var baselayerchange: js.UndefOr[LayersControlEventHandlerFn] = js.undefined
  var click: js.UndefOr[LeafletMouseEventHandlerFn] = js.undefined
  var contextmenu: js.UndefOr[LeafletMouseEventHandlerFn] = js.undefined
  var dblclick: js.UndefOr[LeafletMouseEventHandlerFn] = js.undefined
  var down: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var drag: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var dragend: js.UndefOr[DragEndEventHandlerFn] = js.undefined
  var dragstart: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var error: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var keydown: js.UndefOr[LeafletKeyboardEventHandlerFn] = js.undefined
  var keypress: js.UndefOr[LeafletKeyboardEventHandlerFn] = js.undefined
  var keyup: js.UndefOr[LeafletKeyboardEventHandlerFn] = js.undefined
  var layeradd: js.UndefOr[LayerEventHandlerFn] = js.undefined
  var layerremove: js.UndefOr[LayerEventHandlerFn] = js.undefined
  var load: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var loading: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var locationerror: js.UndefOr[ErrorEventHandlerFn] = js.undefined
  var locationfound: js.UndefOr[LocationEventHandlerFn] = js.undefined
  var mousedown: js.UndefOr[LeafletMouseEventHandlerFn] = js.undefined
  var mousemove: js.UndefOr[LeafletMouseEventHandlerFn] = js.undefined
  var mouseout: js.UndefOr[LeafletMouseEventHandlerFn] = js.undefined
  var mouseover: js.UndefOr[LeafletMouseEventHandlerFn] = js.undefined
  var mouseup: js.UndefOr[LeafletMouseEventHandlerFn] = js.undefined
  var move: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var moveend: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var movestart: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var overlayadd: js.UndefOr[LayersControlEventHandlerFn] = js.undefined
  var overlayremove: js.UndefOr[LayersControlEventHandlerFn] = js.undefined
  var popupclose: js.UndefOr[PopupEventHandlerFn] = js.undefined
  var popupopen: js.UndefOr[PopupEventHandlerFn] = js.undefined
  var preclick: js.UndefOr[LeafletMouseEventHandlerFn] = js.undefined
  var predrag: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var remove: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var resize: js.UndefOr[ResizeEventHandlerFn] = js.undefined
  var tileerror: js.UndefOr[TileErrorEventHandlerFn] = js.undefined
  var tileload: js.UndefOr[TileEventHandlerFn] = js.undefined
  var tileloadstart: js.UndefOr[TileEventHandlerFn] = js.undefined
  var tileunload: js.UndefOr[TileEventHandlerFn] = js.undefined
  var tooltipclose: js.UndefOr[TooltipEventHandlerFn] = js.undefined
  var tooltipopen: js.UndefOr[TooltipEventHandlerFn] = js.undefined
  var unload: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var update: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var viewreset: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var zoom: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var zoomanim: js.UndefOr[ZoomAnimEventHandlerFn] = js.undefined
  var zoomend: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var zoomlevelschange: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  var zoomstart: js.UndefOr[LeafletEventHandlerFn] = js.undefined
}

object LeafletEventHandlerFnMap {
  @scala.inline
  def apply(
    add: /* event */ LeafletEvent => Callback = null,
    autopanstart: /* event */ LeafletEvent => Callback = null,
    baselayerchange: /* event */ LayersControlEvent => Callback = null,
    click: /* event */ LeafletMouseEvent => Callback = null,
    contextmenu: /* event */ LeafletMouseEvent => Callback = null,
    dblclick: /* event */ LeafletMouseEvent => Callback = null,
    down: /* event */ LeafletEvent => Callback = null,
    drag: /* event */ LeafletEvent => Callback = null,
    dragend: /* event */ DragEndEvent => Callback = null,
    dragstart: /* event */ LeafletEvent => Callback = null,
    error: /* event */ LeafletEvent => Callback = null,
    keydown: /* event */ LeafletKeyboardEvent => Callback = null,
    keypress: /* event */ LeafletKeyboardEvent => Callback = null,
    keyup: /* event */ LeafletKeyboardEvent => Callback = null,
    layeradd: /* event */ LayerEvent => Callback = null,
    layerremove: /* event */ LayerEvent => Callback = null,
    load: /* event */ LeafletEvent => Callback = null,
    loading: /* event */ LeafletEvent => Callback = null,
    locationerror: /* event */ ErrorEvent => Callback = null,
    locationfound: /* event */ LocationEvent => Callback = null,
    mousedown: /* event */ LeafletMouseEvent => Callback = null,
    mousemove: /* event */ LeafletMouseEvent => Callback = null,
    mouseout: /* event */ LeafletMouseEvent => Callback = null,
    mouseover: /* event */ LeafletMouseEvent => Callback = null,
    mouseup: /* event */ LeafletMouseEvent => Callback = null,
    move: /* event */ LeafletEvent => Callback = null,
    moveend: /* event */ LeafletEvent => Callback = null,
    movestart: /* event */ LeafletEvent => Callback = null,
    overlayadd: /* event */ LayersControlEvent => Callback = null,
    overlayremove: /* event */ LayersControlEvent => Callback = null,
    popupclose: /* event */ PopupEvent => Callback = null,
    popupopen: /* event */ PopupEvent => Callback = null,
    preclick: /* event */ LeafletMouseEvent => Callback = null,
    predrag: /* event */ LeafletEvent => Callback = null,
    remove: /* event */ LeafletEvent => Callback = null,
    resize: /* event */ ResizeEvent => Callback = null,
    tileerror: /* event */ TileErrorEvent => Callback = null,
    tileload: /* event */ TileEvent => Callback = null,
    tileloadstart: /* event */ TileEvent => Callback = null,
    tileunload: /* event */ TileEvent => Callback = null,
    tooltipclose: /* event */ TooltipEvent => Callback = null,
    tooltipopen: /* event */ TooltipEvent => Callback = null,
    unload: /* event */ LeafletEvent => Callback = null,
    update: /* event */ LeafletEvent => Callback = null,
    viewreset: /* event */ LeafletEvent => Callback = null,
    zoom: /* event */ LeafletEvent => Callback = null,
    zoomanim: /* event */ ZoomAnimEvent => Callback = null,
    zoomend: /* event */ LeafletEvent => Callback = null,
    zoomlevelschange: /* event */ LeafletEvent => Callback = null,
    zoomstart: /* event */ LeafletEvent => Callback = null
  ): LeafletEventHandlerFnMap = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => add(t0).runNow()))
    if (autopanstart != null) __obj.updateDynamic("autopanstart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => autopanstart(t0).runNow()))
    if (baselayerchange != null) __obj.updateDynamic("baselayerchange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayersControlEvent) => baselayerchange(t0).runNow()))
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => click(t0).runNow()))
    if (contextmenu != null) __obj.updateDynamic("contextmenu")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => contextmenu(t0).runNow()))
    if (dblclick != null) __obj.updateDynamic("dblclick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => dblclick(t0).runNow()))
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => down(t0).runNow()))
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => drag(t0).runNow()))
    if (dragend != null) __obj.updateDynamic("dragend")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.DragEndEvent) => dragend(t0).runNow()))
    if (dragstart != null) __obj.updateDynamic("dragstart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => dragstart(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => error(t0).runNow()))
    if (keydown != null) __obj.updateDynamic("keydown")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletKeyboardEvent) => keydown(t0).runNow()))
    if (keypress != null) __obj.updateDynamic("keypress")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletKeyboardEvent) => keypress(t0).runNow()))
    if (keyup != null) __obj.updateDynamic("keyup")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletKeyboardEvent) => keyup(t0).runNow()))
    if (layeradd != null) __obj.updateDynamic("layeradd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayerEvent) => layeradd(t0).runNow()))
    if (layerremove != null) __obj.updateDynamic("layerremove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayerEvent) => layerremove(t0).runNow()))
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => load(t0).runNow()))
    if (loading != null) __obj.updateDynamic("loading")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => loading(t0).runNow()))
    if (locationerror != null) __obj.updateDynamic("locationerror")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.ErrorEvent) => locationerror(t0).runNow()))
    if (locationfound != null) __obj.updateDynamic("locationfound")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LocationEvent) => locationfound(t0).runNow()))
    if (mousedown != null) __obj.updateDynamic("mousedown")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => mousedown(t0).runNow()))
    if (mousemove != null) __obj.updateDynamic("mousemove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => mousemove(t0).runNow()))
    if (mouseout != null) __obj.updateDynamic("mouseout")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => mouseout(t0).runNow()))
    if (mouseover != null) __obj.updateDynamic("mouseover")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => mouseover(t0).runNow()))
    if (mouseup != null) __obj.updateDynamic("mouseup")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => mouseup(t0).runNow()))
    if (move != null) __obj.updateDynamic("move")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => move(t0).runNow()))
    if (moveend != null) __obj.updateDynamic("moveend")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => moveend(t0).runNow()))
    if (movestart != null) __obj.updateDynamic("movestart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => movestart(t0).runNow()))
    if (overlayadd != null) __obj.updateDynamic("overlayadd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayersControlEvent) => overlayadd(t0).runNow()))
    if (overlayremove != null) __obj.updateDynamic("overlayremove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayersControlEvent) => overlayremove(t0).runNow()))
    if (popupclose != null) __obj.updateDynamic("popupclose")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.PopupEvent) => popupclose(t0).runNow()))
    if (popupopen != null) __obj.updateDynamic("popupopen")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.PopupEvent) => popupopen(t0).runNow()))
    if (preclick != null) __obj.updateDynamic("preclick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => preclick(t0).runNow()))
    if (predrag != null) __obj.updateDynamic("predrag")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => predrag(t0).runNow()))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => remove(t0).runNow()))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.ResizeEvent) => resize(t0).runNow()))
    if (tileerror != null) __obj.updateDynamic("tileerror")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.TileErrorEvent) => tileerror(t0).runNow()))
    if (tileload != null) __obj.updateDynamic("tileload")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.TileEvent) => tileload(t0).runNow()))
    if (tileloadstart != null) __obj.updateDynamic("tileloadstart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.TileEvent) => tileloadstart(t0).runNow()))
    if (tileunload != null) __obj.updateDynamic("tileunload")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.TileEvent) => tileunload(t0).runNow()))
    if (tooltipclose != null) __obj.updateDynamic("tooltipclose")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.TooltipEvent) => tooltipclose(t0).runNow()))
    if (tooltipopen != null) __obj.updateDynamic("tooltipopen")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.TooltipEvent) => tooltipopen(t0).runNow()))
    if (unload != null) __obj.updateDynamic("unload")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => unload(t0).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => update(t0).runNow()))
    if (viewreset != null) __obj.updateDynamic("viewreset")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => viewreset(t0).runNow()))
    if (zoom != null) __obj.updateDynamic("zoom")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => zoom(t0).runNow()))
    if (zoomanim != null) __obj.updateDynamic("zoomanim")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.ZoomAnimEvent) => zoomanim(t0).runNow()))
    if (zoomend != null) __obj.updateDynamic("zoomend")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => zoomend(t0).runNow()))
    if (zoomlevelschange != null) __obj.updateDynamic("zoomlevelschange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => zoomlevelschange(t0).runNow()))
    if (zoomstart != null) __obj.updateDynamic("zoomstart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => zoomstart(t0).runNow()))
    __obj.asInstanceOf[LeafletEventHandlerFnMap]
  }
}


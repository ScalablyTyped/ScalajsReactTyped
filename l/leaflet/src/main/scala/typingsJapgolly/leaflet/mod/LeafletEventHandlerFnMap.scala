package typingsJapgolly.leaflet.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeafletEventHandlerFnMap extends StObject {
  
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
  
  var tileabort: js.UndefOr[TileEventHandlerFn] = js.undefined
  
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
  
  inline def apply(): LeafletEventHandlerFnMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeafletEventHandlerFnMap]
  }
  
  extension [Self <: LeafletEventHandlerFnMap](x: Self) {
    
    inline def setAdd(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAutopanstart(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "autopanstart", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setAutopanstartUndefined: Self = StObject.set(x, "autopanstart", js.undefined)
    
    inline def setBaselayerchange(value: /* event */ LayersControlEvent => Callback): Self = StObject.set(x, "baselayerchange", js.Any.fromFunction1((t0: /* event */ LayersControlEvent) => value(t0).runNow()))
    
    inline def setBaselayerchangeUndefined: Self = StObject.set(x, "baselayerchange", js.undefined)
    
    inline def setClick(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "click", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setContextmenu(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "contextmenu", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setContextmenuUndefined: Self = StObject.set(x, "contextmenu", js.undefined)
    
    inline def setDblclick(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "dblclick", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setDblclickUndefined: Self = StObject.set(x, "dblclick", js.undefined)
    
    inline def setDown(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "down", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    inline def setDrag(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "drag", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setDragend(value: /* event */ DragEndEvent => Callback): Self = StObject.set(x, "dragend", js.Any.fromFunction1((t0: /* event */ DragEndEvent) => value(t0).runNow()))
    
    inline def setDragendUndefined: Self = StObject.set(x, "dragend", js.undefined)
    
    inline def setDragstart(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "dragstart", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setDragstartUndefined: Self = StObject.set(x, "dragstart", js.undefined)
    
    inline def setError(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setKeydown(value: /* event */ LeafletKeyboardEvent => Callback): Self = StObject.set(x, "keydown", js.Any.fromFunction1((t0: /* event */ LeafletKeyboardEvent) => value(t0).runNow()))
    
    inline def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
    
    inline def setKeypress(value: /* event */ LeafletKeyboardEvent => Callback): Self = StObject.set(x, "keypress", js.Any.fromFunction1((t0: /* event */ LeafletKeyboardEvent) => value(t0).runNow()))
    
    inline def setKeypressUndefined: Self = StObject.set(x, "keypress", js.undefined)
    
    inline def setKeyup(value: /* event */ LeafletKeyboardEvent => Callback): Self = StObject.set(x, "keyup", js.Any.fromFunction1((t0: /* event */ LeafletKeyboardEvent) => value(t0).runNow()))
    
    inline def setKeyupUndefined: Self = StObject.set(x, "keyup", js.undefined)
    
    inline def setLayeradd(value: /* event */ LayerEvent => Callback): Self = StObject.set(x, "layeradd", js.Any.fromFunction1((t0: /* event */ LayerEvent) => value(t0).runNow()))
    
    inline def setLayeraddUndefined: Self = StObject.set(x, "layeradd", js.undefined)
    
    inline def setLayerremove(value: /* event */ LayerEvent => Callback): Self = StObject.set(x, "layerremove", js.Any.fromFunction1((t0: /* event */ LayerEvent) => value(t0).runNow()))
    
    inline def setLayerremoveUndefined: Self = StObject.set(x, "layerremove", js.undefined)
    
    inline def setLoad(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "load", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setLoading(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "loading", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setLocationerror(value: /* event */ ErrorEvent => Callback): Self = StObject.set(x, "locationerror", js.Any.fromFunction1((t0: /* event */ ErrorEvent) => value(t0).runNow()))
    
    inline def setLocationerrorUndefined: Self = StObject.set(x, "locationerror", js.undefined)
    
    inline def setLocationfound(value: /* event */ LocationEvent => Callback): Self = StObject.set(x, "locationfound", js.Any.fromFunction1((t0: /* event */ LocationEvent) => value(t0).runNow()))
    
    inline def setLocationfoundUndefined: Self = StObject.set(x, "locationfound", js.undefined)
    
    inline def setMousedown(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "mousedown", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setMousedownUndefined: Self = StObject.set(x, "mousedown", js.undefined)
    
    inline def setMousemove(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "mousemove", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setMousemoveUndefined: Self = StObject.set(x, "mousemove", js.undefined)
    
    inline def setMouseout(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "mouseout", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setMouseoutUndefined: Self = StObject.set(x, "mouseout", js.undefined)
    
    inline def setMouseover(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "mouseover", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
    
    inline def setMouseup(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "mouseup", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setMouseupUndefined: Self = StObject.set(x, "mouseup", js.undefined)
    
    inline def setMove(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "move", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    inline def setMoveend(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "moveend", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setMoveendUndefined: Self = StObject.set(x, "moveend", js.undefined)
    
    inline def setMovestart(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "movestart", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setMovestartUndefined: Self = StObject.set(x, "movestart", js.undefined)
    
    inline def setOverlayadd(value: /* event */ LayersControlEvent => Callback): Self = StObject.set(x, "overlayadd", js.Any.fromFunction1((t0: /* event */ LayersControlEvent) => value(t0).runNow()))
    
    inline def setOverlayaddUndefined: Self = StObject.set(x, "overlayadd", js.undefined)
    
    inline def setOverlayremove(value: /* event */ LayersControlEvent => Callback): Self = StObject.set(x, "overlayremove", js.Any.fromFunction1((t0: /* event */ LayersControlEvent) => value(t0).runNow()))
    
    inline def setOverlayremoveUndefined: Self = StObject.set(x, "overlayremove", js.undefined)
    
    inline def setPopupclose(value: /* event */ PopupEvent => Callback): Self = StObject.set(x, "popupclose", js.Any.fromFunction1((t0: /* event */ PopupEvent) => value(t0).runNow()))
    
    inline def setPopupcloseUndefined: Self = StObject.set(x, "popupclose", js.undefined)
    
    inline def setPopupopen(value: /* event */ PopupEvent => Callback): Self = StObject.set(x, "popupopen", js.Any.fromFunction1((t0: /* event */ PopupEvent) => value(t0).runNow()))
    
    inline def setPopupopenUndefined: Self = StObject.set(x, "popupopen", js.undefined)
    
    inline def setPreclick(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "preclick", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setPreclickUndefined: Self = StObject.set(x, "preclick", js.undefined)
    
    inline def setPredrag(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "predrag", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setPredragUndefined: Self = StObject.set(x, "predrag", js.undefined)
    
    inline def setRemove(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setResize(value: /* event */ ResizeEvent => Callback): Self = StObject.set(x, "resize", js.Any.fromFunction1((t0: /* event */ ResizeEvent) => value(t0).runNow()))
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setTileabort(value: /* event */ TileEvent => Callback): Self = StObject.set(x, "tileabort", js.Any.fromFunction1((t0: /* event */ TileEvent) => value(t0).runNow()))
    
    inline def setTileabortUndefined: Self = StObject.set(x, "tileabort", js.undefined)
    
    inline def setTileerror(value: /* event */ TileErrorEvent => Callback): Self = StObject.set(x, "tileerror", js.Any.fromFunction1((t0: /* event */ TileErrorEvent) => value(t0).runNow()))
    
    inline def setTileerrorUndefined: Self = StObject.set(x, "tileerror", js.undefined)
    
    inline def setTileload(value: /* event */ TileEvent => Callback): Self = StObject.set(x, "tileload", js.Any.fromFunction1((t0: /* event */ TileEvent) => value(t0).runNow()))
    
    inline def setTileloadUndefined: Self = StObject.set(x, "tileload", js.undefined)
    
    inline def setTileloadstart(value: /* event */ TileEvent => Callback): Self = StObject.set(x, "tileloadstart", js.Any.fromFunction1((t0: /* event */ TileEvent) => value(t0).runNow()))
    
    inline def setTileloadstartUndefined: Self = StObject.set(x, "tileloadstart", js.undefined)
    
    inline def setTileunload(value: /* event */ TileEvent => Callback): Self = StObject.set(x, "tileunload", js.Any.fromFunction1((t0: /* event */ TileEvent) => value(t0).runNow()))
    
    inline def setTileunloadUndefined: Self = StObject.set(x, "tileunload", js.undefined)
    
    inline def setTooltipclose(value: /* event */ TooltipEvent => Callback): Self = StObject.set(x, "tooltipclose", js.Any.fromFunction1((t0: /* event */ TooltipEvent) => value(t0).runNow()))
    
    inline def setTooltipcloseUndefined: Self = StObject.set(x, "tooltipclose", js.undefined)
    
    inline def setTooltipopen(value: /* event */ TooltipEvent => Callback): Self = StObject.set(x, "tooltipopen", js.Any.fromFunction1((t0: /* event */ TooltipEvent) => value(t0).runNow()))
    
    inline def setTooltipopenUndefined: Self = StObject.set(x, "tooltipopen", js.undefined)
    
    inline def setUnload(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "unload", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setUnloadUndefined: Self = StObject.set(x, "unload", js.undefined)
    
    inline def setUpdate(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setViewreset(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "viewreset", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setViewresetUndefined: Self = StObject.set(x, "viewreset", js.undefined)
    
    inline def setZoom(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "zoom", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    
    inline def setZoomanim(value: /* event */ ZoomAnimEvent => Callback): Self = StObject.set(x, "zoomanim", js.Any.fromFunction1((t0: /* event */ ZoomAnimEvent) => value(t0).runNow()))
    
    inline def setZoomanimUndefined: Self = StObject.set(x, "zoomanim", js.undefined)
    
    inline def setZoomend(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "zoomend", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setZoomendUndefined: Self = StObject.set(x, "zoomend", js.undefined)
    
    inline def setZoomlevelschange(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "zoomlevelschange", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setZoomlevelschangeUndefined: Self = StObject.set(x, "zoomlevelschange", js.undefined)
    
    inline def setZoomstart(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "zoomstart", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setZoomstartUndefined: Self = StObject.set(x, "zoomstart", js.undefined)
  }
}

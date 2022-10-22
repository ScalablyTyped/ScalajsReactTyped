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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapEvents extends StObject {
  
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
  
  var onzoom: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  
  var onzoomend: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  
  var onzoomlevelschange: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  
  var onzoomstart: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
}
object MapEvents {
  
  inline def apply(): MapEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapEvents]
  }
  
  extension [Self <: MapEvents](x: Self) {
    
    inline def setOnautopanstart(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "onautopanstart", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setOnautopanstartUndefined: Self = StObject.set(x, "onautopanstart", js.undefined)
    
    inline def setOnbaselayerchange(value: /* event */ LayersControlEvent => Callback): Self = StObject.set(x, "onbaselayerchange", js.Any.fromFunction1((t0: /* event */ LayersControlEvent) => value(t0).runNow()))
    
    inline def setOnbaselayerchangeUndefined: Self = StObject.set(x, "onbaselayerchange", js.undefined)
    
    inline def setOnblur(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "onblur", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setOnblurUndefined: Self = StObject.set(x, "onblur", js.undefined)
    
    inline def setOnclick(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "onclick", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    inline def setOncontextmenu(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "oncontextmenu", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setOncontextmenuUndefined: Self = StObject.set(x, "oncontextmenu", js.undefined)
    
    inline def setOndblclick(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "ondblclick", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setOndblclickUndefined: Self = StObject.set(x, "ondblclick", js.undefined)
    
    inline def setOndrag(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "ondrag", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setOndragUndefined: Self = StObject.set(x, "ondrag", js.undefined)
    
    inline def setOndragend(value: /* event */ DragEndEvent => Callback): Self = StObject.set(x, "ondragend", js.Any.fromFunction1((t0: /* event */ DragEndEvent) => value(t0).runNow()))
    
    inline def setOndragendUndefined: Self = StObject.set(x, "ondragend", js.undefined)
    
    inline def setOndragstart(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "ondragstart", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setOndragstartUndefined: Self = StObject.set(x, "ondragstart", js.undefined)
    
    inline def setOnfocus(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "onfocus", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setOnfocusUndefined: Self = StObject.set(x, "onfocus", js.undefined)
    
    inline def setOnlayeradd(value: /* event */ LayerEvent => Callback): Self = StObject.set(x, "onlayeradd", js.Any.fromFunction1((t0: /* event */ LayerEvent) => value(t0).runNow()))
    
    inline def setOnlayeraddUndefined: Self = StObject.set(x, "onlayeradd", js.undefined)
    
    inline def setOnlayerremove(value: /* event */ LayerEvent => Callback): Self = StObject.set(x, "onlayerremove", js.Any.fromFunction1((t0: /* event */ LayerEvent) => value(t0).runNow()))
    
    inline def setOnlayerremoveUndefined: Self = StObject.set(x, "onlayerremove", js.undefined)
    
    inline def setOnload(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "onload", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
    
    inline def setOnlocationerror(value: /* event */ ErrorEvent => Callback): Self = StObject.set(x, "onlocationerror", js.Any.fromFunction1((t0: /* event */ ErrorEvent) => value(t0).runNow()))
    
    inline def setOnlocationerrorUndefined: Self = StObject.set(x, "onlocationerror", js.undefined)
    
    inline def setOnlocationfound(value: /* event */ LocationEvent => Callback): Self = StObject.set(x, "onlocationfound", js.Any.fromFunction1((t0: /* event */ LocationEvent) => value(t0).runNow()))
    
    inline def setOnlocationfoundUndefined: Self = StObject.set(x, "onlocationfound", js.undefined)
    
    inline def setOnmousedown(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "onmousedown", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setOnmousedownUndefined: Self = StObject.set(x, "onmousedown", js.undefined)
    
    inline def setOnmousemove(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "onmousemove", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setOnmousemoveUndefined: Self = StObject.set(x, "onmousemove", js.undefined)
    
    inline def setOnmouseout(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
    
    inline def setOnmouseover(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "onmouseover", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
    
    inline def setOnmouseup(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "onmouseup", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setOnmouseupUndefined: Self = StObject.set(x, "onmouseup", js.undefined)
    
    inline def setOnmove(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "onmove", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setOnmoveUndefined: Self = StObject.set(x, "onmove", js.undefined)
    
    inline def setOnmoveend(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "onmoveend", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setOnmoveendUndefined: Self = StObject.set(x, "onmoveend", js.undefined)
    
    inline def setOnmovestart(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "onmovestart", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setOnmovestartUndefined: Self = StObject.set(x, "onmovestart", js.undefined)
    
    inline def setOnoverlayadd(value: /* event */ LayersControlEvent => Callback): Self = StObject.set(x, "onoverlayadd", js.Any.fromFunction1((t0: /* event */ LayersControlEvent) => value(t0).runNow()))
    
    inline def setOnoverlayaddUndefined: Self = StObject.set(x, "onoverlayadd", js.undefined)
    
    inline def setOnoverlayremove(value: /* event */ LayersControlEvent => Callback): Self = StObject.set(x, "onoverlayremove", js.Any.fromFunction1((t0: /* event */ LayersControlEvent) => value(t0).runNow()))
    
    inline def setOnoverlayremoveUndefined: Self = StObject.set(x, "onoverlayremove", js.undefined)
    
    inline def setOnpopupclose(value: /* event */ PopupEvent => Callback): Self = StObject.set(x, "onpopupclose", js.Any.fromFunction1((t0: /* event */ PopupEvent) => value(t0).runNow()))
    
    inline def setOnpopupcloseUndefined: Self = StObject.set(x, "onpopupclose", js.undefined)
    
    inline def setOnpopupopen(value: /* event */ PopupEvent => Callback): Self = StObject.set(x, "onpopupopen", js.Any.fromFunction1((t0: /* event */ PopupEvent) => value(t0).runNow()))
    
    inline def setOnpopupopenUndefined: Self = StObject.set(x, "onpopupopen", js.undefined)
    
    inline def setOnpreclick(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "onpreclick", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setOnpreclickUndefined: Self = StObject.set(x, "onpreclick", js.undefined)
    
    inline def setOnresize(value: /* event */ ResizeEvent => Callback): Self = StObject.set(x, "onresize", js.Any.fromFunction1((t0: /* event */ ResizeEvent) => value(t0).runNow()))
    
    inline def setOnresizeUndefined: Self = StObject.set(x, "onresize", js.undefined)
    
    inline def setOnunload(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "onunload", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setOnunloadUndefined: Self = StObject.set(x, "onunload", js.undefined)
    
    inline def setOnviewreset(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "onviewreset", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setOnviewresetUndefined: Self = StObject.set(x, "onviewreset", js.undefined)
    
    inline def setOnzoom(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "onzoom", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setOnzoomUndefined: Self = StObject.set(x, "onzoom", js.undefined)
    
    inline def setOnzoomend(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "onzoomend", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setOnzoomendUndefined: Self = StObject.set(x, "onzoomend", js.undefined)
    
    inline def setOnzoomlevelschange(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "onzoomlevelschange", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setOnzoomlevelschangeUndefined: Self = StObject.set(x, "onzoomlevelschange", js.undefined)
    
    inline def setOnzoomstart(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "onzoomstart", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setOnzoomstartUndefined: Self = StObject.set(x, "onzoomstart", js.undefined)
  }
}

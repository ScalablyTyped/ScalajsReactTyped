package typingsJapgolly.reactLeaflet.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.leaflet.mod.LeafletEvent
import typingsJapgolly.leaflet.mod.LeafletMouseEvent
import typingsJapgolly.leaflet.mod.PopupEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEvents extends StObject {
  
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
  
  inline def apply(): PathEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathEvents]
  }
  
  extension [Self <: PathEvents](x: Self) {
    
    inline def setOnadd(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "onadd", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setOnaddUndefined: Self = StObject.set(x, "onadd", js.undefined)
    
    inline def setOnclick(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "onclick", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    inline def setOncontextmenu(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "oncontextmenu", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setOncontextmenuUndefined: Self = StObject.set(x, "oncontextmenu", js.undefined)
    
    inline def setOndblclick(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "ondblclick", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setOndblclickUndefined: Self = StObject.set(x, "ondblclick", js.undefined)
    
    inline def setOnmousedown(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "onmousedown", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setOnmousedownUndefined: Self = StObject.set(x, "onmousedown", js.undefined)
    
    inline def setOnmouseout(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
    
    inline def setOnmouseover(value: /* event */ LeafletMouseEvent => Callback): Self = StObject.set(x, "onmouseover", js.Any.fromFunction1((t0: /* event */ LeafletMouseEvent) => value(t0).runNow()))
    
    inline def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
    
    inline def setOnpopupclose(value: /* event */ PopupEvent => Callback): Self = StObject.set(x, "onpopupclose", js.Any.fromFunction1((t0: /* event */ PopupEvent) => value(t0).runNow()))
    
    inline def setOnpopupcloseUndefined: Self = StObject.set(x, "onpopupclose", js.undefined)
    
    inline def setOnpopupopen(value: /* event */ PopupEvent => Callback): Self = StObject.set(x, "onpopupopen", js.Any.fromFunction1((t0: /* event */ PopupEvent) => value(t0).runNow()))
    
    inline def setOnpopupopenUndefined: Self = StObject.set(x, "onpopupopen", js.undefined)
    
    inline def setOnremove(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "onremove", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setOnremoveUndefined: Self = StObject.set(x, "onremove", js.undefined)
  }
}

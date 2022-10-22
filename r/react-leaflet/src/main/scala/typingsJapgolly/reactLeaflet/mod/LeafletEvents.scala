package typingsJapgolly.reactLeaflet.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.leaflet.mod.LeafletEvent
import typingsJapgolly.leaflet.mod.TileEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.reactLeaflet.mod.LayersControlEvents because var conflicts: onbaselayerchange, onoverlayadd, onoverlayremove. Inlined 
- typingsJapgolly.reactLeaflet.mod.FeatureGroupEvents because var conflicts: onclick, oncontextmenu, ondblclick, onlayeradd, onlayerremove, onmouseout, onmouseover. Inlined 
- typingsJapgolly.reactLeaflet.mod.PathEvents because var conflicts: onadd, onclick, oncontextmenu, ondblclick, onmousedown, onmouseout, onmouseover, onpopupclose, onpopupopen, onremove. Inlined 
- typingsJapgolly.reactLeaflet.mod.TileLayerEvents because var conflicts: onload. Inlined onloading, ontileloadstart, ontileload, ontileunload, ontileerror
- typingsJapgolly.reactLeaflet.mod.MarkerEvents because var conflicts: onclick, oncontextmenu, ondblclick, ondrag, ondragend, ondragstart, onmousedown, onmouseout, onmouseover, onmove, onpopupclose, onpopupopen. Inlined onadd, onremove */ trait LeafletEvents
  extends StObject
     with MapEvents {
  
  var onadd: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  
  var onloading: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  
  var onremove: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  
  var ontileerror: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.undefined
  
  var ontileload: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.undefined
  
  var ontileloadstart: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.undefined
  
  var ontileunload: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.undefined
}
object LeafletEvents {
  
  inline def apply(): LeafletEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeafletEvents]
  }
  
  extension [Self <: LeafletEvents](x: Self) {
    
    inline def setOnadd(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "onadd", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setOnaddUndefined: Self = StObject.set(x, "onadd", js.undefined)
    
    inline def setOnloading(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "onloading", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setOnloadingUndefined: Self = StObject.set(x, "onloading", js.undefined)
    
    inline def setOnremove(value: /* event */ LeafletEvent => Callback): Self = StObject.set(x, "onremove", js.Any.fromFunction1((t0: /* event */ LeafletEvent) => value(t0).runNow()))
    
    inline def setOnremoveUndefined: Self = StObject.set(x, "onremove", js.undefined)
    
    inline def setOntileerror(value: /* event */ TileEvent => Callback): Self = StObject.set(x, "ontileerror", js.Any.fromFunction1((t0: /* event */ TileEvent) => value(t0).runNow()))
    
    inline def setOntileerrorUndefined: Self = StObject.set(x, "ontileerror", js.undefined)
    
    inline def setOntileload(value: /* event */ TileEvent => Callback): Self = StObject.set(x, "ontileload", js.Any.fromFunction1((t0: /* event */ TileEvent) => value(t0).runNow()))
    
    inline def setOntileloadUndefined: Self = StObject.set(x, "ontileload", js.undefined)
    
    inline def setOntileloadstart(value: /* event */ TileEvent => Callback): Self = StObject.set(x, "ontileloadstart", js.Any.fromFunction1((t0: /* event */ TileEvent) => value(t0).runNow()))
    
    inline def setOntileloadstartUndefined: Self = StObject.set(x, "ontileloadstart", js.undefined)
    
    inline def setOntileunload(value: /* event */ TileEvent => Callback): Self = StObject.set(x, "ontileunload", js.Any.fromFunction1((t0: /* event */ TileEvent) => value(t0).runNow()))
    
    inline def setOntileunloadUndefined: Self = StObject.set(x, "ontileunload", js.undefined)
  }
}

package typingsJapgolly.reactLeaflet.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.leaflet.mod.LayersControlEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayersControlEvents extends StObject {
  
  var onbaselayerchange: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.undefined
  
  var onoverlayadd: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.undefined
  
  var onoverlayremove: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.undefined
}
object LayersControlEvents {
  
  inline def apply(): LayersControlEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersControlEvents]
  }
  
  extension [Self <: LayersControlEvents](x: Self) {
    
    inline def setOnbaselayerchange(value: /* event */ LayersControlEvent => Callback): Self = StObject.set(x, "onbaselayerchange", js.Any.fromFunction1((t0: /* event */ LayersControlEvent) => value(t0).runNow()))
    
    inline def setOnbaselayerchangeUndefined: Self = StObject.set(x, "onbaselayerchange", js.undefined)
    
    inline def setOnoverlayadd(value: /* event */ LayersControlEvent => Callback): Self = StObject.set(x, "onoverlayadd", js.Any.fromFunction1((t0: /* event */ LayersControlEvent) => value(t0).runNow()))
    
    inline def setOnoverlayaddUndefined: Self = StObject.set(x, "onoverlayadd", js.undefined)
    
    inline def setOnoverlayremove(value: /* event */ LayersControlEvent => Callback): Self = StObject.set(x, "onoverlayremove", js.Any.fromFunction1((t0: /* event */ LayersControlEvent) => value(t0).runNow()))
    
    inline def setOnoverlayremoveUndefined: Self = StObject.set(x, "onoverlayremove", js.undefined)
  }
}

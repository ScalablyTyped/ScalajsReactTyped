package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TileLayer {
  
  type MapTypeLayer = Layer
  
  type RoadNet = MapTypeLayer
  
  type Satellite = MapTypeLayer
  
  trait Traffic
    extends StObject
       with Layer {
    
    var autoRefresh: Boolean
    
    var interval: Double
  }
  object Traffic {
    
    inline def apply(
      autoRefresh: Boolean,
      getTiles: CallbackTo[js.Array[String]],
      getZooms: CallbackTo[js.Array[Double]],
      hide: Callback,
      interval: Double,
      off: (String, EventCallback) => Callback,
      on: (String, EventCallback) => Callback,
      reload: Callback,
      setMap: Map => Callback,
      setOpacity: Double => Callback,
      setTileUrl: Callback,
      setzIndex: Double => Callback,
      show: Callback
    ): Traffic = {
      val __obj = js.Dynamic.literal(autoRefresh = autoRefresh.asInstanceOf[js.Any], getTiles = getTiles.toJsFn, getZooms = getZooms.toJsFn, hide = hide.toJsFn, interval = interval.asInstanceOf[js.Any], off = js.Any.fromFunction2((t0: String, t1: EventCallback) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: EventCallback) => (on(t0, t1)).runNow()), reload = reload.toJsFn, setMap = js.Any.fromFunction1((t0: Map) => setMap(t0).runNow()), setOpacity = js.Any.fromFunction1((t0: Double) => setOpacity(t0).runNow()), setTileUrl = setTileUrl.toJsFn, setzIndex = js.Any.fromFunction1((t0: Double) => setzIndex(t0).runNow()), show = show.toJsFn)
      __obj.asInstanceOf[Traffic]
    }
    
    extension [Self <: Traffic](x: Self) {
      
      inline def setAutoRefresh(value: Boolean): Self = StObject.set(x, "autoRefresh", value.asInstanceOf[js.Any])
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    }
  }
}

package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layer
  extends StObject
     with EventBindable {
  
  def getTiles(): js.Array[String]
  
  def getZooms(): js.Array[Double]
  
  def hide(): Unit
  
  def reload(): Unit
  
  def setMap(map: Map): Unit
  
  def setOpacity(alpha: Double): Unit
  
  def setTileUrl(): Unit
  
  def setzIndex(index: Double): Unit
  
  def show(): Unit
}
object Layer {
  
  inline def apply(
    getTiles: CallbackTo[js.Array[String]],
    getZooms: CallbackTo[js.Array[Double]],
    hide: Callback,
    off: (String, EventCallback) => Callback,
    on: (String, EventCallback) => Callback,
    reload: Callback,
    setMap: Map => Callback,
    setOpacity: Double => Callback,
    setTileUrl: Callback,
    setzIndex: Double => Callback,
    show: Callback
  ): Layer = {
    val __obj = js.Dynamic.literal(getTiles = getTiles.toJsFn, getZooms = getZooms.toJsFn, hide = hide.toJsFn, off = js.Any.fromFunction2((t0: String, t1: EventCallback) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: EventCallback) => (on(t0, t1)).runNow()), reload = reload.toJsFn, setMap = js.Any.fromFunction1((t0: Map) => setMap(t0).runNow()), setOpacity = js.Any.fromFunction1((t0: Double) => setOpacity(t0).runNow()), setTileUrl = setTileUrl.toJsFn, setzIndex = js.Any.fromFunction1((t0: Double) => setzIndex(t0).runNow()), show = show.toJsFn)
    __obj.asInstanceOf[Layer]
  }
  
  extension [Self <: Layer](x: Self) {
    
    inline def setGetTiles(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getTiles", value.toJsFn)
    
    inline def setGetZooms(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getZooms", value.toJsFn)
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setReload(value: Callback): Self = StObject.set(x, "reload", value.toJsFn)
    
    inline def setSetMap(value: Map => Callback): Self = StObject.set(x, "setMap", js.Any.fromFunction1((t0: Map) => value(t0).runNow()))
    
    inline def setSetOpacity(value: Double => Callback): Self = StObject.set(x, "setOpacity", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetTileUrl(value: Callback): Self = StObject.set(x, "setTileUrl", value.toJsFn)
    
    inline def setSetzIndex(value: Double => Callback): Self = StObject.set(x, "setzIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}

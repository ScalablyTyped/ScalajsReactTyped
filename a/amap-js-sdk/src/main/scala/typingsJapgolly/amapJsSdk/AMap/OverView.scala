package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverView
  extends StObject
     with EventBindable
     with MapControl {
  
  def close(): Unit
  
  def getTileLayer(): TileLayer
  
  def open(): Unit
  
  def setTileLayer(layer: TileLayer): Unit
}
object OverView {
  
  inline def apply(
    close: Callback,
    getTileLayer: CallbackTo[TileLayer],
    hide: Callback,
    off: (String, EventCallback) => Callback,
    on: (String, EventCallback) => Callback,
    open: Callback,
    setTileLayer: TileLayer => Callback,
    show: Callback
  ): OverView = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, getTileLayer = getTileLayer.toJsFn, hide = hide.toJsFn, off = js.Any.fromFunction2((t0: String, t1: EventCallback) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: EventCallback) => (on(t0, t1)).runNow()), open = open.toJsFn, setTileLayer = js.Any.fromFunction1((t0: TileLayer) => setTileLayer(t0).runNow()), show = show.toJsFn)
    __obj.asInstanceOf[OverView]
  }
  
  extension [Self <: OverView](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setGetTileLayer(value: CallbackTo[TileLayer]): Self = StObject.set(x, "getTileLayer", value.toJsFn)
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
    
    inline def setSetTileLayer(value: TileLayer => Callback): Self = StObject.set(x, "setTileLayer", js.Any.fromFunction1((t0: TileLayer) => value(t0).runNow()))
  }
}

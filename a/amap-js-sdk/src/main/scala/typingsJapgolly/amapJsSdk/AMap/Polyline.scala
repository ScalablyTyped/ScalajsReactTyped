package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Polyline
  extends StObject
     with EventBindable {
  
  def getBounds(): Bounds
  
  def getExtData(): Any
  
  def getLength(): Double
  
  def getOptions(): PolylineOptions
  
  def getPath(): js.Array[LngLat]
  
  def hide(): Unit
  
  def setExtData(ext: Any): Unit
  
  def setMap(map: Map): Unit
  
  def setOptions(opt: PolylineOptions): Unit
  
  def setPath(path: js.Array[LngLat]): Unit
  
  def show(): Unit
}
object Polyline {
  
  inline def apply(
    getBounds: CallbackTo[Bounds],
    getExtData: CallbackTo[Any],
    getLength: CallbackTo[Double],
    getOptions: CallbackTo[PolylineOptions],
    getPath: CallbackTo[js.Array[LngLat]],
    hide: Callback,
    off: (String, EventCallback) => Callback,
    on: (String, EventCallback) => Callback,
    setExtData: Any => Callback,
    setMap: Map => Callback,
    setOptions: PolylineOptions => Callback,
    setPath: js.Array[LngLat] => Callback,
    show: Callback
  ): Polyline = {
    val __obj = js.Dynamic.literal(getBounds = getBounds.toJsFn, getExtData = getExtData.toJsFn, getLength = getLength.toJsFn, getOptions = getOptions.toJsFn, getPath = getPath.toJsFn, hide = hide.toJsFn, off = js.Any.fromFunction2((t0: String, t1: EventCallback) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: EventCallback) => (on(t0, t1)).runNow()), setExtData = js.Any.fromFunction1((t0: Any) => setExtData(t0).runNow()), setMap = js.Any.fromFunction1((t0: Map) => setMap(t0).runNow()), setOptions = js.Any.fromFunction1((t0: PolylineOptions) => setOptions(t0).runNow()), setPath = js.Any.fromFunction1((t0: js.Array[LngLat]) => setPath(t0).runNow()), show = show.toJsFn)
    __obj.asInstanceOf[Polyline]
  }
  
  extension [Self <: Polyline](x: Self) {
    
    inline def setGetBounds(value: CallbackTo[Bounds]): Self = StObject.set(x, "getBounds", value.toJsFn)
    
    inline def setGetExtData(value: CallbackTo[Any]): Self = StObject.set(x, "getExtData", value.toJsFn)
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
    
    inline def setGetOptions(value: CallbackTo[PolylineOptions]): Self = StObject.set(x, "getOptions", value.toJsFn)
    
    inline def setGetPath(value: CallbackTo[js.Array[LngLat]]): Self = StObject.set(x, "getPath", value.toJsFn)
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setSetExtData(value: Any => Callback): Self = StObject.set(x, "setExtData", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetMap(value: Map => Callback): Self = StObject.set(x, "setMap", js.Any.fromFunction1((t0: Map) => value(t0).runNow()))
    
    inline def setSetOptions(value: PolylineOptions => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: PolylineOptions) => value(t0).runNow()))
    
    inline def setSetPath(value: js.Array[LngLat] => Callback): Self = StObject.set(x, "setPath", js.Any.fromFunction1((t0: js.Array[LngLat]) => value(t0).runNow()))
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}

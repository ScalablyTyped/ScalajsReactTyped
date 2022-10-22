package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Circle extends StObject {
  
  def contains(point: LngLat): Boolean
  
  def getBounds(): Bounds
  
  def getCenter(): LngLat
  
  def getExtData(): Any
  
  def getOptions(): CircleOptions
  
  def getRadius(): Double
  
  def hide(): Unit
  
  def setCenter(lnglat: LngLat): Unit
  
  def setExtData(ext: Any): Unit
  
  def setMap(map: Map): Unit
  
  def setOptions(circleopt: CircleOptions): Unit
  
  def setRadius(radius: Double): Unit
  
  def show(): Unit
}
object Circle {
  
  inline def apply(
    contains: LngLat => Boolean,
    getBounds: CallbackTo[Bounds],
    getCenter: CallbackTo[LngLat],
    getExtData: CallbackTo[Any],
    getOptions: CallbackTo[CircleOptions],
    getRadius: CallbackTo[Double],
    hide: Callback,
    setCenter: LngLat => Callback,
    setExtData: Any => Callback,
    setMap: Map => Callback,
    setOptions: CircleOptions => Callback,
    setRadius: Double => Callback,
    show: Callback
  ): Circle = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getBounds = getBounds.toJsFn, getCenter = getCenter.toJsFn, getExtData = getExtData.toJsFn, getOptions = getOptions.toJsFn, getRadius = getRadius.toJsFn, hide = hide.toJsFn, setCenter = js.Any.fromFunction1((t0: LngLat) => setCenter(t0).runNow()), setExtData = js.Any.fromFunction1((t0: Any) => setExtData(t0).runNow()), setMap = js.Any.fromFunction1((t0: Map) => setMap(t0).runNow()), setOptions = js.Any.fromFunction1((t0: CircleOptions) => setOptions(t0).runNow()), setRadius = js.Any.fromFunction1((t0: Double) => setRadius(t0).runNow()), show = show.toJsFn)
    __obj.asInstanceOf[Circle]
  }
  
  extension [Self <: Circle](x: Self) {
    
    inline def setContains(value: LngLat => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setGetBounds(value: CallbackTo[Bounds]): Self = StObject.set(x, "getBounds", value.toJsFn)
    
    inline def setGetCenter(value: CallbackTo[LngLat]): Self = StObject.set(x, "getCenter", value.toJsFn)
    
    inline def setGetExtData(value: CallbackTo[Any]): Self = StObject.set(x, "getExtData", value.toJsFn)
    
    inline def setGetOptions(value: CallbackTo[CircleOptions]): Self = StObject.set(x, "getOptions", value.toJsFn)
    
    inline def setGetRadius(value: CallbackTo[Double]): Self = StObject.set(x, "getRadius", value.toJsFn)
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setSetCenter(value: LngLat => Callback): Self = StObject.set(x, "setCenter", js.Any.fromFunction1((t0: LngLat) => value(t0).runNow()))
    
    inline def setSetExtData(value: Any => Callback): Self = StObject.set(x, "setExtData", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetMap(value: Map => Callback): Self = StObject.set(x, "setMap", js.Any.fromFunction1((t0: Map) => value(t0).runNow()))
    
    inline def setSetOptions(value: CircleOptions => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: CircleOptions) => value(t0).runNow()))
    
    inline def setSetRadius(value: Double => Callback): Self = StObject.set(x, "setRadius", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}

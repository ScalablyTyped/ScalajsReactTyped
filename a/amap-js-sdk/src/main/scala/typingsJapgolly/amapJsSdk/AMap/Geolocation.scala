package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geolocation
  extends StObject
     with EventBindable {
  
  def clearWatch(watchId: Double): Double
  
  def getCurrentPosition(): Unit
  
  def isSupported(): Boolean
  
  def watchPosition(): Double
}
object Geolocation {
  
  inline def apply(
    clearWatch: Double => Double,
    getCurrentPosition: Callback,
    isSupported: CallbackTo[Boolean],
    off: (String, EventCallback) => Callback,
    on: (String, EventCallback) => Callback,
    watchPosition: CallbackTo[Double]
  ): Geolocation = {
    val __obj = js.Dynamic.literal(clearWatch = js.Any.fromFunction1(clearWatch), getCurrentPosition = getCurrentPosition.toJsFn, isSupported = isSupported.toJsFn, off = js.Any.fromFunction2((t0: String, t1: EventCallback) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: EventCallback) => (on(t0, t1)).runNow()), watchPosition = watchPosition.toJsFn)
    __obj.asInstanceOf[Geolocation]
  }
  
  extension [Self <: Geolocation](x: Self) {
    
    inline def setClearWatch(value: Double => Double): Self = StObject.set(x, "clearWatch", js.Any.fromFunction1(value))
    
    inline def setGetCurrentPosition(value: Callback): Self = StObject.set(x, "getCurrentPosition", value.toJsFn)
    
    inline def setIsSupported(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSupported", value.toJsFn)
    
    inline def setWatchPosition(value: CallbackTo[Double]): Self = StObject.set(x, "watchPosition", value.toJsFn)
  }
}

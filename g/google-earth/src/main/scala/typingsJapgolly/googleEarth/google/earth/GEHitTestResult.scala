package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GEHitTestResult extends StObject {
  
  /**
    * Altitude of sampled point.
    */
  def getAltitude(): Double
  
  /**
    * Latitude of sampled point.
    */
  def getLatitude(): Double
  
  /**
    * Longitude of sampled point.
    */
  def getLongitude(): Double
  
  /**
    * Altitude of sampled point.
    */
  def setAltitude(altitude: Double): Unit
  
  /**
    * Latitude of sampled point.
    */
  def setLatitude(latitude: Double): Unit
  
  /**
    * Longitude of sampled point.
    */
  def setLongitude(longitude: Double): Unit
}
object GEHitTestResult {
  
  inline def apply(
    getAltitude: CallbackTo[Double],
    getLatitude: CallbackTo[Double],
    getLongitude: CallbackTo[Double],
    setAltitude: Double => Callback,
    setLatitude: Double => Callback,
    setLongitude: Double => Callback
  ): GEHitTestResult = {
    val __obj = js.Dynamic.literal(getAltitude = getAltitude.toJsFn, getLatitude = getLatitude.toJsFn, getLongitude = getLongitude.toJsFn, setAltitude = js.Any.fromFunction1((t0: Double) => setAltitude(t0).runNow()), setLatitude = js.Any.fromFunction1((t0: Double) => setLatitude(t0).runNow()), setLongitude = js.Any.fromFunction1((t0: Double) => setLongitude(t0).runNow()))
    __obj.asInstanceOf[GEHitTestResult]
  }
  
  extension [Self <: GEHitTestResult](x: Self) {
    
    inline def setGetAltitude(value: CallbackTo[Double]): Self = StObject.set(x, "getAltitude", value.toJsFn)
    
    inline def setGetLatitude(value: CallbackTo[Double]): Self = StObject.set(x, "getLatitude", value.toJsFn)
    
    inline def setGetLongitude(value: CallbackTo[Double]): Self = StObject.set(x, "getLongitude", value.toJsFn)
    
    inline def setSetAltitude(value: Double => Callback): Self = StObject.set(x, "setAltitude", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetLatitude(value: Double => Callback): Self = StObject.set(x, "setLatitude", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetLongitude(value: Double => Callback): Self = StObject.set(x, "setLongitude", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}

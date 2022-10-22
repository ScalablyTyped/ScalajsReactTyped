package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlCoord extends StObject {
  
  /**
    * Distance from the earth's surface.
    */
  def getAltitude(): Double
  
  /**
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  def getLatitude(): Double
  
  /**
    * Angular distance in degrees, relative to the Prime Meridian. Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  def getLongitude(): Double
  
  /**
    * Distance from the earth's surface.
    */
  def setAltitude(altitude: Double): Unit
  
  /**
    * Sets the latitude, longitude, altitude.
    */
  def setLatLngAlt(latitude: Double, longitude: Double, altitude: Double): Unit
  
  /**
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  def setLatitude(latitude: Double): Unit
  
  /**
    * Angular distance in degrees, relative to the Prime Meridian. Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  def setLongitude(longitude: Double): Unit
}
object KmlCoord {
  
  inline def apply(
    getAltitude: CallbackTo[Double],
    getLatitude: CallbackTo[Double],
    getLongitude: CallbackTo[Double],
    setAltitude: Double => Callback,
    setLatLngAlt: (Double, Double, Double) => Callback,
    setLatitude: Double => Callback,
    setLongitude: Double => Callback
  ): KmlCoord = {
    val __obj = js.Dynamic.literal(getAltitude = getAltitude.toJsFn, getLatitude = getLatitude.toJsFn, getLongitude = getLongitude.toJsFn, setAltitude = js.Any.fromFunction1((t0: Double) => setAltitude(t0).runNow()), setLatLngAlt = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (setLatLngAlt(t0, t1, t2)).runNow()), setLatitude = js.Any.fromFunction1((t0: Double) => setLatitude(t0).runNow()), setLongitude = js.Any.fromFunction1((t0: Double) => setLongitude(t0).runNow()))
    __obj.asInstanceOf[KmlCoord]
  }
  
  extension [Self <: KmlCoord](x: Self) {
    
    inline def setGetAltitude(value: CallbackTo[Double]): Self = StObject.set(x, "getAltitude", value.toJsFn)
    
    inline def setGetLatitude(value: CallbackTo[Double]): Self = StObject.set(x, "getLatitude", value.toJsFn)
    
    inline def setGetLongitude(value: CallbackTo[Double]): Self = StObject.set(x, "getLongitude", value.toJsFn)
    
    inline def setSetAltitude(value: Double => Callback): Self = StObject.set(x, "setAltitude", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetLatLngAlt(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "setLatLngAlt", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetLatitude(value: Double => Callback): Self = StObject.set(x, "setLatitude", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetLongitude(value: Double => Callback): Self = StObject.set(x, "setLongitude", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}

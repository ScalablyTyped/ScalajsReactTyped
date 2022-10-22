package typingsJapgolly.googleAppsScript.GoogleAppsScript.Maps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows for direction finding, geocoding, elevation sampling and the creation of static map
  * images.
  */
trait Maps extends StObject {
  
  var DirectionFinder: DirectionFinderEnums
  
  var StaticMap: StaticMapEnums
  
  def decodePolyline(polyline: String): js.Array[Double]
  
  def encodePolyline(points: js.Array[Double]): String
  
  def newDirectionFinder(): DirectionFinder
  
  def newElevationSampler(): ElevationSampler
  
  def newGeocoder(): Geocoder
  
  def newStaticMap(): StaticMap
  
  def setAuthentication(clientId: String, signingKey: String): Unit
}
object Maps {
  
  inline def apply(
    DirectionFinder: DirectionFinderEnums,
    StaticMap: StaticMapEnums,
    decodePolyline: String => js.Array[Double],
    encodePolyline: js.Array[Double] => String,
    newDirectionFinder: CallbackTo[DirectionFinder],
    newElevationSampler: CallbackTo[ElevationSampler],
    newGeocoder: CallbackTo[Geocoder],
    newStaticMap: CallbackTo[StaticMap],
    setAuthentication: (String, String) => Callback
  ): typingsJapgolly.googleAppsScript.GoogleAppsScript.Maps.Maps = {
    val __obj = js.Dynamic.literal(DirectionFinder = DirectionFinder.asInstanceOf[js.Any], StaticMap = StaticMap.asInstanceOf[js.Any], decodePolyline = js.Any.fromFunction1(decodePolyline), encodePolyline = js.Any.fromFunction1(encodePolyline), newDirectionFinder = newDirectionFinder.toJsFn, newElevationSampler = newElevationSampler.toJsFn, newGeocoder = newGeocoder.toJsFn, newStaticMap = newStaticMap.toJsFn, setAuthentication = js.Any.fromFunction2((t0: String, t1: String) => (setAuthentication(t0, t1)).runNow()))
    __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Maps.Maps]
  }
  
  extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Maps.Maps](x: Self) {
    
    inline def setDecodePolyline(value: String => js.Array[Double]): Self = StObject.set(x, "decodePolyline", js.Any.fromFunction1(value))
    
    inline def setDirectionFinder(value: DirectionFinderEnums): Self = StObject.set(x, "DirectionFinder", value.asInstanceOf[js.Any])
    
    inline def setEncodePolyline(value: js.Array[Double] => String): Self = StObject.set(x, "encodePolyline", js.Any.fromFunction1(value))
    
    inline def setNewDirectionFinder(value: CallbackTo[DirectionFinder]): Self = StObject.set(x, "newDirectionFinder", value.toJsFn)
    
    inline def setNewElevationSampler(value: CallbackTo[ElevationSampler]): Self = StObject.set(x, "newElevationSampler", value.toJsFn)
    
    inline def setNewGeocoder(value: CallbackTo[Geocoder]): Self = StObject.set(x, "newGeocoder", value.toJsFn)
    
    inline def setNewStaticMap(value: CallbackTo[StaticMap]): Self = StObject.set(x, "newStaticMap", value.toJsFn)
    
    inline def setSetAuthentication(value: (String, String) => Callback): Self = StObject.set(x, "setAuthentication", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setStaticMap(value: StaticMapEnums): Self = StObject.set(x, "StaticMap", value.asInstanceOf[js.Any])
  }
}

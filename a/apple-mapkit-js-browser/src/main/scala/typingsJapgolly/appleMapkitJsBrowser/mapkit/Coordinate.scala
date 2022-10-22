package typingsJapgolly.appleMapkitJsBrowser.mapkit

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing the latitude and longitude for a point on the
  * Earth's surface.
  */
trait Coordinate extends StObject {
  
  /**
    * Returns a copy of the coordinate.
    */
  def copy(): Coordinate
  
  /**
    * Returns a Boolean value indicating whether two coordinates are equal.
    */
  def equals(anotherCoordinate: Coordinate): Boolean
  
  /**
    * The latitude in degrees.
    */
  var latitude: Double
  
  /**
    * The longitude in degrees.
    */
  var longitude: Double
  
  /**
    * Returns the map point that corresponds to the coordinate.
    */
  def toMapPoint(): MapPoint
  
  /**
    * Returns the unwrapped map point that corresponds to the coordinate.
    */
  def toUnwrappedMapPoint(): MapPoint
}
object Coordinate {
  
  inline def apply(
    copy: CallbackTo[Coordinate],
    equals_ : Coordinate => Boolean,
    latitude: Double,
    longitude: Double,
    toMapPoint: CallbackTo[MapPoint],
    toUnwrappedMapPoint: CallbackTo[MapPoint]
  ): Coordinate = {
    val __obj = js.Dynamic.literal(copy = copy.toJsFn, latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], toMapPoint = toMapPoint.toJsFn, toUnwrappedMapPoint = toUnwrappedMapPoint.toJsFn)
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Coordinate]
  }
  
  extension [Self <: Coordinate](x: Self) {
    
    inline def setCopy(value: CallbackTo[Coordinate]): Self = StObject.set(x, "copy", value.toJsFn)
    
    inline def setEquals_(value: Coordinate => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setToMapPoint(value: CallbackTo[MapPoint]): Self = StObject.set(x, "toMapPoint", value.toJsFn)
    
    inline def setToUnwrappedMapPoint(value: CallbackTo[MapPoint]): Self = StObject.set(x, "toUnwrappedMapPoint", value.toJsFn)
  }
}

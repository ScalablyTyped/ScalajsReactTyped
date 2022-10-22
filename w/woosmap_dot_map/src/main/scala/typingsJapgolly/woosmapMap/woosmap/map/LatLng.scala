package typingsJapgolly.woosmapMap.woosmap.map

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatLng extends StObject {
  
  /**
    * Comparison function.
    */
  def equals(other: LatLng): Boolean
  
  /**
    * Returns the latitude in degrees.
    */
  def lat(): Double
  
  /**
    * Returns the longitude in degrees.
    */
  def lng(): Double
  
  /**
    * Converts to JSON representation. This function is intended to be used via `JSON.stringify`.
    */
  def toJSON(): LatLngLiteral
}
object LatLng {
  
  inline def apply(
    equals_ : LatLng => Boolean,
    lat: CallbackTo[Double],
    lng: CallbackTo[Double],
    toJSON: CallbackTo[LatLngLiteral]
  ): LatLng = {
    val __obj = js.Dynamic.literal(lat = lat.toJsFn, lng = lng.toJsFn, toJSON = toJSON.toJsFn)
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[LatLng]
  }
  
  extension [Self <: LatLng](x: Self) {
    
    inline def setEquals_(value: LatLng => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setLat(value: CallbackTo[Double]): Self = StObject.set(x, "lat", value.toJsFn)
    
    inline def setLng(value: CallbackTo[Double]): Self = StObject.set(x, "lng", value.toJsFn)
    
    inline def setToJSON(value: CallbackTo[LatLngLiteral]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}

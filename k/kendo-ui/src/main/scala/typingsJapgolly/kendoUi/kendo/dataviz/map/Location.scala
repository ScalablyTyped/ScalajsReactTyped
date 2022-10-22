package typingsJapgolly.kendoUi.kendo.dataviz.map

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendo.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location
  extends StObject
     with Class {
  
  def destination(destination: Location, bearing: Double): Double
  
  def distanceTo(distance: Double, bearing: Double): Location
  
  def equals(location: Location): Boolean
  
  var lat: Double
  
  var lng: Double
  
  var options: LocationOptions
  
  def round(digits: Double): Location
  
  def toArray(): Any
  
  def wrap(): Location
}
object Location {
  
  inline def apply(
    destination: (Location, Double) => Double,
    distanceTo: (Double, Double) => Location,
    equals_ : Location => Boolean,
    lat: Double,
    lng: Double,
    options: LocationOptions,
    round: Double => Location,
    toArray: CallbackTo[Any],
    wrap: CallbackTo[Location]
  ): Location = {
    val __obj = js.Dynamic.literal(destination = js.Any.fromFunction2(destination), distanceTo = js.Any.fromFunction2(distanceTo), lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], round = js.Any.fromFunction1(round), toArray = toArray.toJsFn, wrap = wrap.toJsFn)
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Location]
  }
  
  extension [Self <: Location](x: Self) {
    
    inline def setDestination(value: (Location, Double) => Double): Self = StObject.set(x, "destination", js.Any.fromFunction2(value))
    
    inline def setDistanceTo(value: (Double, Double) => Location): Self = StObject.set(x, "distanceTo", js.Any.fromFunction2(value))
    
    inline def setEquals_(value: Location => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: LocationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRound(value: Double => Location): Self = StObject.set(x, "round", js.Any.fromFunction1(value))
    
    inline def setToArray(value: CallbackTo[Any]): Self = StObject.set(x, "toArray", value.toJsFn)
    
    inline def setWrap(value: CallbackTo[Location]): Self = StObject.set(x, "wrap", value.toJsFn)
  }
}

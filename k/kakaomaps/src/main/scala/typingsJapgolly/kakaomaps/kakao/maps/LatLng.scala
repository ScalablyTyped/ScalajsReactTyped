package typingsJapgolly.kakaomaps.kakao.maps

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatLng extends StObject {
  
  def equals(latlng: LatLng): Boolean
  
  def getLat(): Double
  
  def getLng(): Double
  
  def toCoords(): Coords
}
object LatLng {
  
  inline def apply(
    equals_ : LatLng => Boolean,
    getLat: CallbackTo[Double],
    getLng: CallbackTo[Double],
    toCoords: CallbackTo[Coords]
  ): LatLng = {
    val __obj = js.Dynamic.literal(getLat = getLat.toJsFn, getLng = getLng.toJsFn, toCoords = toCoords.toJsFn)
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[LatLng]
  }
  
  extension [Self <: LatLng](x: Self) {
    
    inline def setEquals_(value: LatLng => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setGetLat(value: CallbackTo[Double]): Self = StObject.set(x, "getLat", value.toJsFn)
    
    inline def setGetLng(value: CallbackTo[Double]): Self = StObject.set(x, "getLng", value.toJsFn)
    
    inline def setToCoords(value: CallbackTo[Coords]): Self = StObject.set(x, "toCoords", value.toJsFn)
  }
}

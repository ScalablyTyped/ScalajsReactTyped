package typingsJapgolly.kakaomaps.kakao.maps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatLngBounds extends StObject {
  
  def contain(latlng: LatLng): Boolean
  
  def equals(latlngBounds: LatLngBounds): Boolean
  
  def extend(latlng: LatLng): Unit
  
  def getNorthEast(): LatLng
  
  def getSouthWest(): LatLng
  
  def isEmpty(): Boolean
}
object LatLngBounds {
  
  inline def apply(
    contain: LatLng => Boolean,
    equals_ : LatLngBounds => Boolean,
    extend: LatLng => Callback,
    getNorthEast: CallbackTo[LatLng],
    getSouthWest: CallbackTo[LatLng],
    isEmpty: CallbackTo[Boolean]
  ): LatLngBounds = {
    val __obj = js.Dynamic.literal(contain = js.Any.fromFunction1(contain), extend = js.Any.fromFunction1((t0: LatLng) => extend(t0).runNow()), getNorthEast = getNorthEast.toJsFn, getSouthWest = getSouthWest.toJsFn, isEmpty = isEmpty.toJsFn)
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[LatLngBounds]
  }
  
  extension [Self <: LatLngBounds](x: Self) {
    
    inline def setContain(value: LatLng => Boolean): Self = StObject.set(x, "contain", js.Any.fromFunction1(value))
    
    inline def setEquals_(value: LatLngBounds => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setExtend(value: LatLng => Callback): Self = StObject.set(x, "extend", js.Any.fromFunction1((t0: LatLng) => value(t0).runNow()))
    
    inline def setGetNorthEast(value: CallbackTo[LatLng]): Self = StObject.set(x, "getNorthEast", value.toJsFn)
    
    inline def setGetSouthWest(value: CallbackTo[LatLng]): Self = StObject.set(x, "getSouthWest", value.toJsFn)
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
  }
}

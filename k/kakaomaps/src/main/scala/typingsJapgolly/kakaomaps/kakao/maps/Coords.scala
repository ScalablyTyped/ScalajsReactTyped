package typingsJapgolly.kakaomaps.kakao.maps

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coords extends StObject {
  
  def equals(latlng: Coords): Boolean
  
  def getX(): Double
  
  def getY(): Double
  
  def toLatLng(): LatLng
}
object Coords {
  
  inline def apply(
    equals_ : Coords => Boolean,
    getX: CallbackTo[Double],
    getY: CallbackTo[Double],
    toLatLng: CallbackTo[LatLng]
  ): Coords = {
    val __obj = js.Dynamic.literal(getX = getX.toJsFn, getY = getY.toJsFn, toLatLng = toLatLng.toJsFn)
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Coords]
  }
  
  extension [Self <: Coords](x: Self) {
    
    inline def setEquals_(value: Coords => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setGetX(value: CallbackTo[Double]): Self = StObject.set(x, "getX", value.toJsFn)
    
    inline def setGetY(value: CallbackTo[Double]): Self = StObject.set(x, "getY", value.toJsFn)
    
    inline def setToLatLng(value: CallbackTo[LatLng]): Self = StObject.set(x, "toLatLng", value.toJsFn)
  }
}

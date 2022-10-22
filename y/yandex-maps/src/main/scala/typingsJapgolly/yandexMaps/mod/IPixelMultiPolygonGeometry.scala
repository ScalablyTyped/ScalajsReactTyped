package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.yandexMaps.yandexMapsStrings.evenOdd
import typingsJapgolly.yandexMaps.yandexMapsStrings.nonZero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPixelMultiPolygonGeometry
  extends StObject
     with IPixelGeometry {
  
  def contains(position: js.Array[Double]): Boolean
  
  def getClosest(anchorPosition: js.Array[Double]): js.Object
  
  def getCoordinates(): js.Array[js.Array[js.Array[js.Array[Double]]]]
  
  def getFillRule(): evenOdd | nonZero
  
  def getLength(): Double
}
object IPixelMultiPolygonGeometry {
  
  inline def apply(
    contains: js.Array[Double] => Boolean,
    equals_ : IPixelGeometry => Boolean,
    events: IEventManager[js.Object],
    getBounds: CallbackTo[js.Array[js.Array[Double]] | Null],
    getClosest: js.Array[Double] => js.Object,
    getCoordinates: CallbackTo[js.Array[js.Array[js.Array[js.Array[Double]]]]],
    getFillRule: CallbackTo[evenOdd | nonZero],
    getLength: CallbackTo[Double],
    getMetaData: CallbackTo[js.Object],
    getType: CallbackTo[String],
    scale: Double => IPixelGeometry,
    shift: js.Array[Double] => IPixelGeometry
  ): IPixelMultiPolygonGeometry = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), events = events.asInstanceOf[js.Any], getBounds = getBounds.toJsFn, getClosest = js.Any.fromFunction1(getClosest), getCoordinates = getCoordinates.toJsFn, getFillRule = getFillRule.toJsFn, getLength = getLength.toJsFn, getMetaData = getMetaData.toJsFn, getType = getType.toJsFn, scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[IPixelMultiPolygonGeometry]
  }
  
  extension [Self <: IPixelMultiPolygonGeometry](x: Self) {
    
    inline def setContains(value: js.Array[Double] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setGetClosest(value: js.Array[Double] => js.Object): Self = StObject.set(x, "getClosest", js.Any.fromFunction1(value))
    
    inline def setGetCoordinates(value: CallbackTo[js.Array[js.Array[js.Array[js.Array[Double]]]]]): Self = StObject.set(x, "getCoordinates", value.toJsFn)
    
    inline def setGetFillRule(value: CallbackTo[evenOdd | nonZero]): Self = StObject.set(x, "getFillRule", value.toJsFn)
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
  }
}

package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShape extends StObject {
  
  def contains(position: js.Array[Double]): Boolean
  
  def equals(shape: IShape): Boolean
  
  def getBounds(): js.Array[js.Array[Double]] | Null
  
  def getGeometry(): IPixelGeometry
  
  def getType(): String
  
  def scale(factor: Double): IShape
  
  def shift(offset: js.Array[Double]): IShape
}
object IShape {
  
  inline def apply(
    contains: js.Array[Double] => Boolean,
    equals_ : IShape => Boolean,
    getBounds: CallbackTo[js.Array[js.Array[Double]] | Null],
    getGeometry: CallbackTo[IPixelGeometry],
    getType: CallbackTo[String],
    scale: Double => IShape,
    shift: js.Array[Double] => IShape
  ): IShape = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getBounds = getBounds.toJsFn, getGeometry = getGeometry.toJsFn, getType = getType.toJsFn, scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[IShape]
  }
  
  extension [Self <: IShape](x: Self) {
    
    inline def setContains(value: js.Array[Double] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setEquals_(value: IShape => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setGetBounds(value: CallbackTo[js.Array[js.Array[Double]] | Null]): Self = StObject.set(x, "getBounds", value.toJsFn)
    
    inline def setGetGeometry(value: CallbackTo[IPixelGeometry]): Self = StObject.set(x, "getGeometry", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[String]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setScale(value: Double => IShape): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    inline def setShift(value: js.Array[Double] => IShape): Self = StObject.set(x, "shift", js.Any.fromFunction1(value))
  }
}

package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPixelGeometry
  extends StObject
     with IBaseGeometry {
  
  def equals(geometry: IPixelGeometry): Boolean
  
  def getMetaData(): js.Object
  
  def scale(factor: Double): IPixelGeometry
  
  def shift(offset: js.Array[Double]): IPixelGeometry
}
object IPixelGeometry {
  
  inline def apply(
    equals_ : IPixelGeometry => Boolean,
    events: IEventManager[js.Object],
    getBounds: CallbackTo[js.Array[js.Array[Double]] | Null],
    getMetaData: CallbackTo[js.Object],
    getType: CallbackTo[String],
    scale: Double => IPixelGeometry,
    shift: js.Array[Double] => IPixelGeometry
  ): IPixelGeometry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], getBounds = getBounds.toJsFn, getMetaData = getMetaData.toJsFn, getType = getType.toJsFn, scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[IPixelGeometry]
  }
  
  extension [Self <: IPixelGeometry](x: Self) {
    
    inline def setEquals_(value: IPixelGeometry => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setGetMetaData(value: CallbackTo[js.Object]): Self = StObject.set(x, "getMetaData", value.toJsFn)
    
    inline def setScale(value: Double => IPixelGeometry): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    inline def setShift(value: js.Array[Double] => IPixelGeometry): Self = StObject.set(x, "shift", js.Any.fromFunction1(value))
  }
}

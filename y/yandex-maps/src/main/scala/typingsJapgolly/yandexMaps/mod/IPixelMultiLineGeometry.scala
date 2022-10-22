package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPixelMultiLineGeometry
  extends StObject
     with IPixelGeometry {
  
  def getClosest(anchorPosition: js.Array[Double]): js.Object
  
  def getCoordinates(): js.Array[js.Array[js.Array[Double]]]
  
  def getLength(): Double
}
object IPixelMultiLineGeometry {
  
  inline def apply(
    equals_ : IPixelGeometry => Boolean,
    events: IEventManager[js.Object],
    getBounds: CallbackTo[js.Array[js.Array[Double]] | Null],
    getClosest: js.Array[Double] => js.Object,
    getCoordinates: CallbackTo[js.Array[js.Array[js.Array[Double]]]],
    getLength: CallbackTo[Double],
    getMetaData: CallbackTo[js.Object],
    getType: CallbackTo[String],
    scale: Double => IPixelGeometry,
    shift: js.Array[Double] => IPixelGeometry
  ): IPixelMultiLineGeometry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], getBounds = getBounds.toJsFn, getClosest = js.Any.fromFunction1(getClosest), getCoordinates = getCoordinates.toJsFn, getLength = getLength.toJsFn, getMetaData = getMetaData.toJsFn, getType = getType.toJsFn, scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[IPixelMultiLineGeometry]
  }
  
  extension [Self <: IPixelMultiLineGeometry](x: Self) {
    
    inline def setGetClosest(value: js.Array[Double] => js.Object): Self = StObject.set(x, "getClosest", js.Any.fromFunction1(value))
    
    inline def setGetCoordinates(value: CallbackTo[js.Array[js.Array[js.Array[Double]]]]): Self = StObject.set(x, "getCoordinates", value.toJsFn)
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
  }
}

package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPixelCircleGeometry
  extends StObject
     with IPixelGeometry {
  
  def getCoordinates(): js.Array[Double]
  
  def getRadius(): Double
}
object IPixelCircleGeometry {
  
  inline def apply(
    equals_ : IPixelGeometry => Boolean,
    events: IEventManager[js.Object],
    getBounds: CallbackTo[js.Array[js.Array[Double]] | Null],
    getCoordinates: CallbackTo[js.Array[Double]],
    getMetaData: CallbackTo[js.Object],
    getRadius: CallbackTo[Double],
    getType: CallbackTo[String],
    scale: Double => IPixelGeometry,
    shift: js.Array[Double] => IPixelGeometry
  ): IPixelCircleGeometry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], getBounds = getBounds.toJsFn, getCoordinates = getCoordinates.toJsFn, getMetaData = getMetaData.toJsFn, getRadius = getRadius.toJsFn, getType = getType.toJsFn, scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[IPixelCircleGeometry]
  }
  
  extension [Self <: IPixelCircleGeometry](x: Self) {
    
    inline def setGetCoordinates(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getCoordinates", value.toJsFn)
    
    inline def setGetRadius(value: CallbackTo[Double]): Self = StObject.set(x, "getRadius", value.toJsFn)
  }
}

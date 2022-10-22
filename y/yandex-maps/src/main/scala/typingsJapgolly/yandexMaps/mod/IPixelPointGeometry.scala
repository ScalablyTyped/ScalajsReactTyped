package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPixelPointGeometry
  extends StObject
     with IPixelGeometry {
  
  def getCoordinates(): js.Array[Double]
}
object IPixelPointGeometry {
  
  inline def apply(
    equals_ : IPixelGeometry => Boolean,
    events: IEventManager[js.Object],
    getBounds: CallbackTo[js.Array[js.Array[Double]] | Null],
    getCoordinates: CallbackTo[js.Array[Double]],
    getMetaData: CallbackTo[js.Object],
    getType: CallbackTo[String],
    scale: Double => IPixelGeometry,
    shift: js.Array[Double] => IPixelGeometry
  ): IPixelPointGeometry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], getBounds = getBounds.toJsFn, getCoordinates = getCoordinates.toJsFn, getMetaData = getMetaData.toJsFn, getType = getType.toJsFn, scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[IPixelPointGeometry]
  }
  
  extension [Self <: IPixelPointGeometry](x: Self) {
    
    inline def setGetCoordinates(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getCoordinates", value.toJsFn)
  }
}

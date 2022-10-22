package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBaseGeometry
  extends StObject
     with IEventEmitter {
  
  def getBounds(): js.Array[js.Array[Double]] | Null
  
  def getType(): String
}
object IBaseGeometry {
  
  inline def apply(
    events: IEventManager[js.Object],
    getBounds: CallbackTo[js.Array[js.Array[Double]] | Null],
    getType: CallbackTo[String]
  ): IBaseGeometry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], getBounds = getBounds.toJsFn, getType = getType.toJsFn)
    __obj.asInstanceOf[IBaseGeometry]
  }
  
  extension [Self <: IBaseGeometry](x: Self) {
    
    inline def setGetBounds(value: CallbackTo[js.Array[js.Array[Double]] | Null]): Self = StObject.set(x, "getBounds", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[String]): Self = StObject.set(x, "getType", value.toJsFn)
  }
}

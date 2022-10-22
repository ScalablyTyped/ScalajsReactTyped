package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeometryEditorModel
  extends StObject
     with IEventEmitter {
  
  def destroy(): Unit
  
  def getPixels(): js.Array[Double]
}
object IGeometryEditorModel {
  
  inline def apply(destroy: Callback, events: IEventManager[js.Object], getPixels: CallbackTo[js.Array[Double]]): IGeometryEditorModel = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, events = events.asInstanceOf[js.Any], getPixels = getPixels.toJsFn)
    __obj.asInstanceOf[IGeometryEditorModel]
  }
  
  extension [Self <: IGeometryEditorModel](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setGetPixels(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getPixels", value.toJsFn)
  }
}

package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeometryEditorChildModel
  extends StObject
     with IGeometryEditorModel {
  
  var editor: IGeometryEditor
  
  var geometry: IBaseGeometry
  
  def getParent(): IGeometryEditorModel
  
  def setPixels(pixels: js.Array[Double]): Unit
}
object IGeometryEditorChildModel {
  
  inline def apply(
    destroy: Callback,
    editor: IGeometryEditor,
    events: IEventManager[js.Object],
    geometry: IBaseGeometry,
    getParent: CallbackTo[IGeometryEditorModel],
    getPixels: CallbackTo[js.Array[Double]],
    setPixels: js.Array[Double] => Callback
  ): IGeometryEditorChildModel = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, editor = editor.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], getParent = getParent.toJsFn, getPixels = getPixels.toJsFn, setPixels = js.Any.fromFunction1((t0: js.Array[Double]) => setPixels(t0).runNow()))
    __obj.asInstanceOf[IGeometryEditorChildModel]
  }
  
  extension [Self <: IGeometryEditorChildModel](x: Self) {
    
    inline def setEditor(value: IGeometryEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setGeometry(value: IBaseGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGetParent(value: CallbackTo[IGeometryEditorModel]): Self = StObject.set(x, "getParent", value.toJsFn)
    
    inline def setSetPixels(value: js.Array[Double] => Callback): Self = StObject.set(x, "setPixels", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
  }
}

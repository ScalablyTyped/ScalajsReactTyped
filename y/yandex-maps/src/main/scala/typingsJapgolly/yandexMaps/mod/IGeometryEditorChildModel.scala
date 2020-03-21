package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeometryEditorChildModel extends IGeometryEditorModel {
  var editor: IGeometryEditor
  var geometry: IBaseGeometry
  def getParent(): IGeometryEditorModel
  def setPixels(pixels: js.Array[Double]): Unit
}

object IGeometryEditorChildModel {
  @scala.inline
  def apply(
    destroy: Callback,
    editor: IGeometryEditor,
    events: IEventManager,
    geometry: IBaseGeometry,
    getParent: CallbackTo[IGeometryEditorModel],
    getPixels: CallbackTo[js.Array[Double]],
    setPixels: js.Array[Double] => Callback
  ): IGeometryEditorChildModel = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getParent")(getParent.toJsFn)
    __obj.updateDynamic("getPixels")(getPixels.toJsFn)
    __obj.updateDynamic("setPixels")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => setPixels(t0).runNow()))
    __obj.asInstanceOf[IGeometryEditorChildModel]
  }
}


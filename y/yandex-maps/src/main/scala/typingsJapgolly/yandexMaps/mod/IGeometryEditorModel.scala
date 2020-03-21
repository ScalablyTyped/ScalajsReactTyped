package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeometryEditorModel extends IEventEmitter {
  def destroy(): Unit
  def getPixels(): js.Array[Double]
}

object IGeometryEditorModel {
  @scala.inline
  def apply(destroy: Callback, events: IEventManager, getPixels: CallbackTo[js.Array[Double]]): IGeometryEditorModel = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getPixels")(getPixels.toJsFn)
    __obj.asInstanceOf[IGeometryEditorModel]
  }
}


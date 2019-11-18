package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeometryEditor extends ICustomizable {
  var geometry: IGeometry
  var state: IDataManager
  def startEditing(): Unit
  def stopEditing(): Unit
}

object IGeometryEditor {
  @scala.inline
  def apply(
    events: IEventManager,
    geometry: IGeometry,
    options: IOptionManager,
    startEditing: Callback,
    state: IDataManager,
    stopEditing: Callback
  ): IGeometryEditor = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("startEditing")(startEditing.toJsFn)
    __obj.updateDynamic("stopEditing")(stopEditing.toJsFn)
    __obj.asInstanceOf[IGeometryEditor]
  }
}


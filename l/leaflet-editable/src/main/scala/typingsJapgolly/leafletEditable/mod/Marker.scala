package typingsJapgolly.leafletEditable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Marker
  extends EditableMixin
     with BaseEditor

object Marker {
  @scala.inline
  def apply(
    disable: CallbackTo[MarkerEditor | PolylineEditor | PolygonEditor],
    disableEdit: Callback,
    editEnabled: CallbackTo[Boolean],
    enable: CallbackTo[MarkerEditor | PolylineEditor | PolygonEditor],
    enableEdit: CallbackTo[js.Any],
    toggleEdit: Callback
  ): Marker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("disableEdit")(disableEdit.toJsFn)
    __obj.updateDynamic("editEnabled")(editEnabled.toJsFn)
    __obj.updateDynamic("enable")(enable.toJsFn)
    __obj.updateDynamic("enableEdit")(enableEdit.toJsFn)
    __obj.updateDynamic("toggleEdit")(toggleEdit.toJsFn)
    __obj.asInstanceOf[Marker]
  }
}


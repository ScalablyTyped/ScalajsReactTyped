package typingsJapgolly.leafletEditable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:no-empty-interface
trait Polyline
  extends PolylineEditor
     with EditableMixin

object Polyline {
  @scala.inline
  def apply(
    continueBackward: Callback,
    continueForward: Callback,
    disable: CallbackTo[MarkerEditor | PolylineEditor | PolygonEditor],
    disableEdit: Callback,
    editEnabled: CallbackTo[Boolean],
    enable: CallbackTo[MarkerEditor | PolylineEditor | PolygonEditor],
    enableEdit: CallbackTo[js.Any],
    reset: Callback,
    toggleEdit: Callback
  ): Polyline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("continueBackward")(continueBackward.toJsFn)
    __obj.updateDynamic("continueForward")(continueForward.toJsFn)
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("disableEdit")(disableEdit.toJsFn)
    __obj.updateDynamic("editEnabled")(editEnabled.toJsFn)
    __obj.updateDynamic("enable")(enable.toJsFn)
    __obj.updateDynamic("enableEdit")(enableEdit.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("toggleEdit")(toggleEdit.toJsFn)
    __obj.asInstanceOf[Polyline]
  }
}


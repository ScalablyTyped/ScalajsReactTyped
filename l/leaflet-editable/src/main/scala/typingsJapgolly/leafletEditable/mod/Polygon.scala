package typingsJapgolly.leafletEditable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.leaflet.mod.LatLng_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polygon
  extends PolygonEditor
     with EditableMixin

object Polygon {
  @scala.inline
  def apply(
    disable: CallbackTo[MarkerEditor | PolylineEditor | PolygonEditor],
    disableEdit: Callback,
    editEnabled: CallbackTo[Boolean],
    enable: CallbackTo[MarkerEditor | PolylineEditor | PolygonEditor],
    enableEdit: CallbackTo[js.Any],
    newHole: LatLng_ => Callback,
    reset: Callback,
    toggleEdit: Callback
  ): Polygon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("disableEdit")(disableEdit.toJsFn)
    __obj.updateDynamic("editEnabled")(editEnabled.toJsFn)
    __obj.updateDynamic("enable")(enable.toJsFn)
    __obj.updateDynamic("enableEdit")(enableEdit.toJsFn)
    __obj.updateDynamic("newHole")(js.Any.fromFunction1((t0: typingsJapgolly.leaflet.mod.LatLng_) => newHole(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("toggleEdit")(toggleEdit.toJsFn)
    __obj.asInstanceOf[Polygon]
  }
}


package typingsJapgolly.leafletEditable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.leaflet.mod.LatLng_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inherit from L.Editable.PathEditor.
  */
trait PolygonEditor extends PathEditor {
  /**
    * Set up drawing tools for creating a new hole on the polygon. If the latlng param is given, a first
    * point is created.
    */
  def newHole(latlng: LatLng_): Unit
}

object PolygonEditor {
  @scala.inline
  def apply(
    disable: CallbackTo[MarkerEditor | PolylineEditor | PolygonEditor],
    enable: CallbackTo[MarkerEditor | PolylineEditor | PolygonEditor],
    newHole: LatLng_ => Callback,
    reset: Callback
  ): PolygonEditor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("enable")(enable.toJsFn)
    __obj.updateDynamic("newHole")(js.Any.fromFunction1((t0: typingsJapgolly.leaflet.mod.LatLng_) => newHole(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[PolygonEditor]
  }
}


package typingsJapgolly.leafletAreaselect.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.leaflet.mod.LatLngBounds_
import typingsJapgolly.leaflet.mod.Map_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaSelect_ extends js.Object {
  def addTo(map: Map_): Map_
  def getBounds(): LatLngBounds_
  def remove(): Unit
  def setDimensions(dim: Dimension): Unit
}

object AreaSelect_ {
  @scala.inline
  def apply(
    addTo: Map_ => CallbackTo[Map_],
    getBounds: CallbackTo[LatLngBounds_],
    remove: Callback,
    setDimensions: Dimension => Callback
  ): AreaSelect_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addTo")(js.Any.fromFunction1((t0: typingsJapgolly.leaflet.mod.Map_) => addTo(t0).runNow()))
    __obj.updateDynamic("getBounds")(getBounds.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("setDimensions")(js.Any.fromFunction1((t0: typingsJapgolly.leafletAreaselect.mod.Dimension) => setDimensions(t0).runNow()))
    __obj.asInstanceOf[AreaSelect_]
  }
}


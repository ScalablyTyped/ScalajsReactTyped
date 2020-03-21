package typingsJapgolly.reactLeaflet.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.leaflet.mod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerContainer extends js.Object {
  var addLayer: AddLayerHandler
  var removeLayer: RemoveLayerHandler
}

object LayerContainer {
  @scala.inline
  def apply(
    addLayer: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Callback,
    removeLayer: /* layer */ Layer => Callback
  ): LayerContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addLayer")(js.Any.fromFunction3((t0: /* layer */ typingsJapgolly.leaflet.mod.Layer, t1: /* name */ java.lang.String, t2: /* checked */ js.UndefOr[scala.Boolean]) => addLayer(t0, t1, t2).runNow()))
    __obj.updateDynamic("removeLayer")(js.Any.fromFunction1((t0: /* layer */ typingsJapgolly.leaflet.mod.Layer) => removeLayer(t0).runNow()))
    __obj.asInstanceOf[LayerContainer]
  }
}


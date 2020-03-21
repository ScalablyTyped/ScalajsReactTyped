package typingsJapgolly.reactLeaflet

import japgolly.scalajs.react.Callback
import typingsJapgolly.leaflet.mod.Layer
import typingsJapgolly.reactLeaflet.mod.AddLayerHandler
import typingsJapgolly.reactLeaflet.mod.RemoveLayerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddBaseLayer extends js.Object {
  var addBaseLayer: AddLayerHandler
  var addOverlay: AddLayerHandler
  var removeLayer: RemoveLayerHandler
  var removeLayerControl: RemoveLayerHandler
}

object AnonAddBaseLayer {
  @scala.inline
  def apply(
    addBaseLayer: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Callback,
    addOverlay: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Callback,
    removeLayer: /* layer */ Layer => Callback,
    removeLayerControl: /* layer */ Layer => Callback
  ): AnonAddBaseLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addBaseLayer")(js.Any.fromFunction3((t0: /* layer */ typingsJapgolly.leaflet.mod.Layer, t1: /* name */ java.lang.String, t2: /* checked */ js.UndefOr[scala.Boolean]) => addBaseLayer(t0, t1, t2).runNow()))
    __obj.updateDynamic("addOverlay")(js.Any.fromFunction3((t0: /* layer */ typingsJapgolly.leaflet.mod.Layer, t1: /* name */ java.lang.String, t2: /* checked */ js.UndefOr[scala.Boolean]) => addOverlay(t0, t1, t2).runNow()))
    __obj.updateDynamic("removeLayer")(js.Any.fromFunction1((t0: /* layer */ typingsJapgolly.leaflet.mod.Layer) => removeLayer(t0).runNow()))
    __obj.updateDynamic("removeLayerControl")(js.Any.fromFunction1((t0: /* layer */ typingsJapgolly.leaflet.mod.Layer) => removeLayerControl(t0).runNow()))
    __obj.asInstanceOf[AnonAddBaseLayer]
  }
}


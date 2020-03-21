package typingsJapgolly.reactLeaflet.mod.LayersControl

import japgolly.scalajs.react.Callback
import typingsJapgolly.leaflet.mod.Layer
import typingsJapgolly.reactLeaflet.mod.AddLayerHandler
import typingsJapgolly.reactLeaflet.mod.Children
import typingsJapgolly.reactLeaflet.mod.LeafletContext
import typingsJapgolly.reactLeaflet.mod.RemoveLayerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlledLayerProps extends js.Object {
  var addBaseLayer: js.UndefOr[AddLayerHandler] = js.undefined
  var addOverlay: js.UndefOr[AddLayerHandler] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var children: Children
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  var name: String
  var removeLayer: js.UndefOr[RemoveLayerHandler] = js.undefined
  var removeLayerControl: js.UndefOr[RemoveLayerHandler] = js.undefined
}

object ControlledLayerProps {
  @scala.inline
  def apply(
    name: String,
    addBaseLayer: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Callback = null,
    addOverlay: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Callback = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: Children = null,
    leaflet: LeafletContext = null,
    removeLayer: /* layer */ Layer => Callback = null,
    removeLayerControl: /* layer */ Layer => Callback = null
  ): ControlledLayerProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (addBaseLayer != null) __obj.updateDynamic("addBaseLayer")(js.Any.fromFunction3((t0: /* layer */ typingsJapgolly.leaflet.mod.Layer, t1: /* name */ java.lang.String, t2: /* checked */ js.UndefOr[scala.Boolean]) => addBaseLayer(t0, t1, t2).runNow()))
    if (addOverlay != null) __obj.updateDynamic("addOverlay")(js.Any.fromFunction3((t0: /* layer */ typingsJapgolly.leaflet.mod.Layer, t1: /* name */ java.lang.String, t2: /* checked */ js.UndefOr[scala.Boolean]) => addOverlay(t0, t1, t2).runNow()))
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    if (removeLayer != null) __obj.updateDynamic("removeLayer")(js.Any.fromFunction1((t0: /* layer */ typingsJapgolly.leaflet.mod.Layer) => removeLayer(t0).runNow()))
    if (removeLayerControl != null) __obj.updateDynamic("removeLayerControl")(js.Any.fromFunction1((t0: /* layer */ typingsJapgolly.leaflet.mod.Layer) => removeLayerControl(t0).runNow()))
    __obj.asInstanceOf[ControlledLayerProps]
  }
}


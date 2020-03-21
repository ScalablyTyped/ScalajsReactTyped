package typingsJapgolly.openlayers.mod.olx

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openlayers.mod.layer.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with options for the {@link ol.Map#forEachFeatureAtPixel} and
  * {@link ol.Map#hasFeatureAtPixel} methods.
  */
trait AtPixelOptions extends js.Object {
  var hitTolerance: js.UndefOr[Double] = js.undefined
  var layerFilter: js.UndefOr[js.Function1[/* layer */ Layer, Boolean]] = js.undefined
}

object AtPixelOptions {
  @scala.inline
  def apply(hitTolerance: Int | Double = null, layerFilter: /* layer */ Layer => CallbackTo[Boolean] = null): AtPixelOptions = {
    val __obj = js.Dynamic.literal()
    if (hitTolerance != null) __obj.updateDynamic("hitTolerance")(hitTolerance.asInstanceOf[js.Any])
    if (layerFilter != null) __obj.updateDynamic("layerFilter")(js.Any.fromFunction1((t0: /* layer */ typingsJapgolly.openlayers.mod.layer.Layer) => layerFilter(t0).runNow()))
    __obj.asInstanceOf[AtPixelOptions]
  }
}


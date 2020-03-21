package typingsJapgolly.ol.layerLayerMod

import typingsJapgolly.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var extent: js.UndefOr[Extent] = js.undefined
  var layer: typingsJapgolly.ol.baseMod.default
  var managed: Boolean
  var maxResolution: Double
  var maxZoom: Double
  var minResolution: Double
  var minZoom: Double
  var opacity: Double
  var sourceState: typingsJapgolly.ol.stateMod.State
  var visible: Boolean
  var zIndex: Double
}

object State {
  @scala.inline
  def apply(
    layer: typingsJapgolly.ol.baseMod.default,
    managed: Boolean,
    maxResolution: Double,
    maxZoom: Double,
    minResolution: Double,
    minZoom: Double,
    opacity: Double,
    sourceState: typingsJapgolly.ol.stateMod.State,
    visible: Boolean,
    zIndex: Double,
    extent: Extent = null
  ): State = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], managed = managed.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minResolution = minResolution.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], sourceState = sourceState.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}


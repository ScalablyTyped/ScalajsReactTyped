package typingsJapgolly.openlayers.mod.olx

import typingsJapgolly.openlayers.mod.Coordinate_
import typingsJapgolly.openlayers.mod.Extent_
import typingsJapgolly.openlayers.mod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with config options for the view.
  */
trait ViewOptions extends js.Object {
  var center: js.UndefOr[Coordinate_] = js.undefined
  var constrainRotation: js.UndefOr[Boolean | Double] = js.undefined
  var enableRotation: js.UndefOr[Boolean] = js.undefined
  var extent: js.UndefOr[Extent_] = js.undefined
  var maxResolution: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minResolution: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
  var zoomFactor: js.UndefOr[Double] = js.undefined
}

object ViewOptions {
  @scala.inline
  def apply(
    center: Coordinate_ = null,
    constrainRotation: Boolean | Double = null,
    enableRotation: js.UndefOr[Boolean] = js.undefined,
    extent: Extent_ = null,
    maxResolution: Int | Double = null,
    maxZoom: Int | Double = null,
    minResolution: Int | Double = null,
    minZoom: Int | Double = null,
    projection: ProjectionLike = null,
    resolution: Int | Double = null,
    resolutions: js.Array[Double] = null,
    rotation: Int | Double = null,
    zoom: Int | Double = null,
    zoomFactor: Int | Double = null
  ): ViewOptions = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (constrainRotation != null) __obj.updateDynamic("constrainRotation")(constrainRotation.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRotation)) __obj.updateDynamic("enableRotation")(enableRotation.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (maxResolution != null) __obj.updateDynamic("maxResolution")(maxResolution.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (zoomFactor != null) __obj.updateDynamic("zoomFactor")(zoomFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewOptions]
  }
}


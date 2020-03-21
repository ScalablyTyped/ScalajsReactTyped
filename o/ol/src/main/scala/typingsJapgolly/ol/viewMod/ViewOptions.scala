package typingsJapgolly.ol.viewMod

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewOptions extends js.Object {
  var center: js.UndefOr[Coordinate] = js.undefined
  var constrainOnlyCenter: js.UndefOr[Boolean] = js.undefined
  var constrainResolution: js.UndefOr[Boolean] = js.undefined
  var constrainRotation: js.UndefOr[Boolean | Double] = js.undefined
  var enableRotation: js.UndefOr[Boolean] = js.undefined
  var extent: js.UndefOr[Extent] = js.undefined
  var maxResolution: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minResolution: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var multiWorld: js.UndefOr[Boolean] = js.undefined
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var smoothExtentConstraint: js.UndefOr[Boolean] = js.undefined
  var smoothResolutionConstraint: js.UndefOr[Boolean] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
  var zoomFactor: js.UndefOr[Double] = js.undefined
}

object ViewOptions {
  @scala.inline
  def apply(
    center: Coordinate = null,
    constrainOnlyCenter: js.UndefOr[Boolean] = js.undefined,
    constrainResolution: js.UndefOr[Boolean] = js.undefined,
    constrainRotation: Boolean | Double = null,
    enableRotation: js.UndefOr[Boolean] = js.undefined,
    extent: Extent = null,
    maxResolution: Int | Double = null,
    maxZoom: Int | Double = null,
    minResolution: Int | Double = null,
    minZoom: Int | Double = null,
    multiWorld: js.UndefOr[Boolean] = js.undefined,
    projection: ProjectionLike = null,
    resolution: Int | Double = null,
    resolutions: js.Array[Double] = null,
    rotation: Int | Double = null,
    smoothExtentConstraint: js.UndefOr[Boolean] = js.undefined,
    smoothResolutionConstraint: js.UndefOr[Boolean] = js.undefined,
    zoom: Int | Double = null,
    zoomFactor: Int | Double = null
  ): ViewOptions = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainOnlyCenter)) __obj.updateDynamic("constrainOnlyCenter")(constrainOnlyCenter.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainResolution)) __obj.updateDynamic("constrainResolution")(constrainResolution.asInstanceOf[js.Any])
    if (constrainRotation != null) __obj.updateDynamic("constrainRotation")(constrainRotation.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRotation)) __obj.updateDynamic("enableRotation")(enableRotation.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (maxResolution != null) __obj.updateDynamic("maxResolution")(maxResolution.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(multiWorld)) __obj.updateDynamic("multiWorld")(multiWorld.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothExtentConstraint)) __obj.updateDynamic("smoothExtentConstraint")(smoothExtentConstraint.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothResolutionConstraint)) __obj.updateDynamic("smoothResolutionConstraint")(smoothResolutionConstraint.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (zoomFactor != null) __obj.updateDynamic("zoomFactor")(zoomFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewOptions]
  }
}


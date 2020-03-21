package typingsJapgolly.mapboxMapboxSdk.tilequeryMod

import typingsJapgolly.mapboxGl.mod.LngLatLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileQueryRequest extends js.Object {
  /**
    * The longitude and latitude to be queried.
    */
  var coordinates: LngLatLike
  /**
    * Whether or not to deduplicate results. (optional, default true)
    */
  var dedupe: Boolean
  /**
    * Queries for a specific geometry type.
    */
  var geometry: GeometryType
  var layers: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The number of features to return, between 1 and 50. (optional, default 5)
    */
  var limit: Double
  /**
    * The maps being queried. If you need to composite multiple layers, provide multiple map IDs.
    */
  var mapIds: js.Array[String]
  /**
    * The approximate distance in meters to query for features. (optional, default 0)
    */
  var radius: Double
}

object TileQueryRequest {
  @scala.inline
  def apply(
    coordinates: LngLatLike,
    dedupe: Boolean,
    geometry: GeometryType,
    limit: Double,
    mapIds: js.Array[String],
    radius: Double,
    layers: js.Array[String] = null
  ): TileQueryRequest = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], dedupe = dedupe.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], mapIds = mapIds.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileQueryRequest]
  }
}


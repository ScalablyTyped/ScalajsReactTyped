package typingsJapgolly.leafletGeosearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OpenStreetMap
  */
trait OpenStreetMapProviderResultRaw extends js.Object {
  var boundingbox: js.Tuple4[String, String, String, String]
  var `class`: String
  var display_name: String
  var icon: String
  var importance: Double
  var lat: String
  var licence: String
  var lon: String
  var osm_id: Double
  var osm_type: String
  var place_id: Double
  var `type`: String
}

object OpenStreetMapProviderResultRaw {
  @scala.inline
  def apply(
    boundingbox: js.Tuple4[String, String, String, String],
    `class`: String,
    display_name: String,
    icon: String,
    importance: Double,
    lat: String,
    licence: String,
    lon: String,
    osm_id: Double,
    osm_type: String,
    place_id: Double,
    `type`: String
  ): OpenStreetMapProviderResultRaw = {
    val __obj = js.Dynamic.literal(boundingbox = boundingbox.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], importance = importance.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], licence = licence.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any], osm_id = osm_id.asInstanceOf[js.Any], osm_type = osm_type.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenStreetMapProviderResultRaw]
  }
}


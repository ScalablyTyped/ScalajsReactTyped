package typingsJapgolly.amapJsApi

import typingsJapgolly.amapJsApi.AMap.GeoJSON.GeoJSONObject
import typingsJapgolly.amapJsApi.AMap.GeoJSON.Geometry
import typingsJapgolly.amapJsApi.amapJsApiStrings.Feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGeometry extends GeoJSONObject {
  var geometry: Geometry
  var properties: js.Any
  var `type`: Feature
}

object AnonGeometry {
  @scala.inline
  def apply(geometry: Geometry, properties: js.Any, `type`: Feature): AnonGeometry = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGeometry]
  }
}


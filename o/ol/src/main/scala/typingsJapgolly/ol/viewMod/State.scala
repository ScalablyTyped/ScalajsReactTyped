package typingsJapgolly.ol.viewMod

import typingsJapgolly.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var center: Coordinate
  var projection: typingsJapgolly.ol.projectionMod.default
  var resolution: Double
  var rotation: Double
  var zoom: Double
}

object State {
  @scala.inline
  def apply(
    center: Coordinate,
    projection: typingsJapgolly.ol.projectionMod.default,
    resolution: Double,
    rotation: Double,
    zoom: Double
  ): State = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}


package typingsJapgolly.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineString extends js.Object {
  var coordinates: js.Array[Coordinate]
  var `type`: typingsJapgolly.osrm.osrmStrings.LineString
}

object LineString {
  @scala.inline
  def apply(coordinates: js.Array[Coordinate], `type`: typingsJapgolly.osrm.osrmStrings.LineString): LineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineString]
  }
}


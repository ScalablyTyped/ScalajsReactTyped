package typingsJapgolly.d3InterpolatePath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathCommandObject extends js.Object {
  var `type`: String
  var x: Double
  var y: Double
}

object PathCommandObject {
  @scala.inline
  def apply(`type`: String, x: Double, y: Double): PathCommandObject = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommandObject]
  }
}


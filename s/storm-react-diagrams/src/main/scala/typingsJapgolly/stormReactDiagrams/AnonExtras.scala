package typingsJapgolly.stormReactDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtras extends js.Object {
  var color: String
  var extras: js.Any
  var id: String
  var name: String
  var ports: js.Array[AnonLinks]
  var selected: Boolean
  var `type`: String
  var x: Double
  var y: Double
}

object AnonExtras {
  @scala.inline
  def apply(
    color: String,
    extras: js.Any,
    id: String,
    name: String,
    ports: js.Array[AnonLinks],
    selected: Boolean,
    `type`: String,
    x: Double,
    y: Double
  ): AnonExtras = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtras]
  }
}


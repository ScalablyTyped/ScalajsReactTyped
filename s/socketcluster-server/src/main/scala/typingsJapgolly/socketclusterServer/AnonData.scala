package typingsJapgolly.socketclusterServer

import typingsJapgolly.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.Any
  var target: ^
  var `type`: String
}

object AnonData {
  @scala.inline
  def apply(data: js.Any, target: ^, `type`: String): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}


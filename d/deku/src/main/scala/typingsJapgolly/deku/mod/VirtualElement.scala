package typingsJapgolly.deku.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualElement extends js.Object {
  var `type`: String
}

object VirtualElement {
  @scala.inline
  def apply(`type`: String): VirtualElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualElement]
  }
}


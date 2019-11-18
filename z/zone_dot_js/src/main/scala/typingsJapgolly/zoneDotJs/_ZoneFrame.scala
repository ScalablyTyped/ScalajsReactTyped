package typingsJapgolly.zoneDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _ZoneFrame represents zone stack frame information
  */
trait _ZoneFrame extends js.Object {
  var parent: _ZoneFrame | Null
  var zone: Zone
}

object _ZoneFrame {
  @scala.inline
  def apply(zone: Zone, parent: _ZoneFrame = null): _ZoneFrame = {
    val __obj = js.Dynamic.literal(zone = zone.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ZoneFrame]
  }
}


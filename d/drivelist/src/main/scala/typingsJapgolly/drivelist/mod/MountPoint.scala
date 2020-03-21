package typingsJapgolly.drivelist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountPoint extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var path: String
}

object MountPoint {
  @scala.inline
  def apply(path: String, label: String = null): MountPoint = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountPoint]
  }
}


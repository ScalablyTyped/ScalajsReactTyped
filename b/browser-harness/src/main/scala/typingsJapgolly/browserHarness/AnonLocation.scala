package typingsJapgolly.browserHarness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocation extends js.Object {
  var args: js.UndefOr[js.Any] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var `type`: String
}

object AnonLocation {
  @scala.inline
  def apply(`type`: String, args: js.Any = null, location: String = null): AnonLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocation]
  }
}


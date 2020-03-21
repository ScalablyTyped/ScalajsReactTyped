package typingsJapgolly.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLight extends js.Object {
  var dark: js.UndefOr[String] = js.undefined
  var light: js.UndefOr[String] = js.undefined
}

object AnonLight {
  @scala.inline
  def apply(dark: String = null, light: String = null): AnonLight = {
    val __obj = js.Dynamic.literal()
    if (dark != null) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLight]
  }
}


package typingsJapgolly.gradientString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var hsvSpin: js.UndefOr[String] = js.undefined
  var interpolation: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(hsvSpin: String = null, interpolation: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (hsvSpin != null) __obj.updateDynamic("hsvSpin")(hsvSpin.asInstanceOf[js.Any])
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


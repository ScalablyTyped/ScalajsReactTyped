package typingsJapgolly.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStrong extends js.Object {
  var medium: js.UndefOr[Double] = js.undefined
  var strong: js.UndefOr[Double] = js.undefined
  var weak: js.UndefOr[Double] = js.undefined
}

object AnonStrong {
  @scala.inline
  def apply(medium: Int | Double = null, strong: Int | Double = null, weak: Int | Double = null): AnonStrong = {
    val __obj = js.Dynamic.literal()
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (strong != null) __obj.updateDynamic("strong")(strong.asInstanceOf[js.Any])
    if (weak != null) __obj.updateDynamic("weak")(weak.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStrong]
  }
}


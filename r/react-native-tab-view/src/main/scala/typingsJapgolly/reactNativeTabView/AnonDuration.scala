package typingsJapgolly.reactNativeTabView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object AnonDuration {
  @scala.inline
  def apply(duration: Int | Double = null): AnonDuration = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDuration]
  }
}


package typingsJapgolly.seneca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInterval extends js.Object {
  var interval: js.UndefOr[Double] = js.undefined
  var running: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object AnonInterval {
  @scala.inline
  def apply(
    interval: Int | Double = null,
    running: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null
  ): AnonInterval = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(running)) __obj.updateDynamic("running")(running.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInterval]
  }
}


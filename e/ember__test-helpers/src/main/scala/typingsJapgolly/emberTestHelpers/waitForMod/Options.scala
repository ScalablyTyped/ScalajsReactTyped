package typingsJapgolly.emberTestHelpers.waitForMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var timeoutMessage: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(count: Int | Double = null, timeout: Int | Double = null, timeoutMessage: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (timeoutMessage != null) __obj.updateDynamic("timeoutMessage")(timeoutMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


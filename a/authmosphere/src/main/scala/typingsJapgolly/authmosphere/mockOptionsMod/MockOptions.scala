package typingsJapgolly.authmosphere.mockOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockOptions extends js.Object {
  var times: js.UndefOr[Double] = js.undefined
  var url: String
}

object MockOptions {
  @scala.inline
  def apply(url: String, times: Int | Double = null): MockOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockOptions]
  }
}


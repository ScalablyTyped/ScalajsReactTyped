package typingsJapgolly.aliOss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTimeout extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object AnonTimeout {
  @scala.inline
  def apply(headers: js.Object = null, timeout: Int | Double = null): AnonTimeout = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTimeout]
  }
}


package typingsJapgolly.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionHoldOptions extends js.Object {
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var useUpdate: js.UndefOr[Boolean] = js.undefined
}

object SessionHoldOptions {
  @scala.inline
  def apply(extraHeaders: js.Array[String] = null, useUpdate: js.UndefOr[Boolean] = js.undefined): SessionHoldOptions = {
    val __obj = js.Dynamic.literal()
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(useUpdate)) __obj.updateDynamic("useUpdate")(useUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionHoldOptions]
  }
}


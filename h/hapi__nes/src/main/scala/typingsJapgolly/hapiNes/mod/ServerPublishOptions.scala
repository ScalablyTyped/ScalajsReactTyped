package typingsJapgolly.hapiNes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerPublishOptions extends js.Object {
  var internal: js.UndefOr[js.Any] = js.undefined
  var user: js.UndefOr[js.Any] = js.undefined
}

object ServerPublishOptions {
  @scala.inline
  def apply(internal: js.Any = null, user: js.Any = null): ServerPublishOptions = {
    val __obj = js.Dynamic.literal()
    if (internal != null) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerPublishOptions]
  }
}


package typingsJapgolly.dav.mod

import typingsJapgolly.dav.mod.transport.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCalendarObjectOptions extends js.Object {
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.undefined
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.undefined
}

object UpdateCalendarObjectOptions {
  @scala.inline
  def apply(sandbox: Sandbox = null, xhr: Transport = null): UpdateCalendarObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCalendarObjectOptions]
  }
}


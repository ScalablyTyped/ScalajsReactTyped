package typingsJapgolly.chromeApps.WebView

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionRequestHandler extends js.Object {
  /** Allow the permission request. */
  def allow(): Unit
  /** Deny the permission request. This is the default behavior if allow is not called. */
  def deny(): Unit
}

object PermissionRequestHandler {
  @scala.inline
  def apply(allow: Callback, deny: Callback): PermissionRequestHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allow")(allow.toJsFn)
    __obj.updateDynamic("deny")(deny.toJsFn)
    __obj.asInstanceOf[PermissionRequestHandler]
  }
}


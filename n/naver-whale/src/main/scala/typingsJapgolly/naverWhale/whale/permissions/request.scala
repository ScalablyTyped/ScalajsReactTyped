package typingsJapgolly.naverWhale.whale.permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.permissions.request")
@js.native
object request extends js.Object {
  def apply(permissions: typingsJapgolly.chrome.chrome.permissions.Permissions): Unit = js.native
  def apply(
    permissions: typingsJapgolly.chrome.chrome.permissions.Permissions,
    callback: js.Function1[/* granted */ Boolean, Unit]
  ): Unit = js.native
}


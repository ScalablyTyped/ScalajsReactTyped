package typingsJapgolly.naverWhale.whale.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.windows.update")
@js.native
object update extends js.Object {
  def apply(windowId: Double, updateInfo: typingsJapgolly.chrome.chrome.windows.UpdateInfo): Unit = js.native
  def apply(
    windowId: Double,
    updateInfo: typingsJapgolly.chrome.chrome.windows.UpdateInfo,
    callback: js.Function1[/* window */ typingsJapgolly.chrome.chrome.windows.Window, Unit]
  ): Unit = js.native
}


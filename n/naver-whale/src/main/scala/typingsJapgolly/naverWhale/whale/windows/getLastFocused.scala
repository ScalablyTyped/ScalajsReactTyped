package typingsJapgolly.naverWhale.whale.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.windows.getLastFocused")
@js.native
object getLastFocused extends js.Object {
  def apply(callback: js.Function1[/* window */ typingsJapgolly.chrome.chrome.windows.Window, Unit]): Unit = js.native
  def apply(
    getInfo: typingsJapgolly.chrome.chrome.windows.GetInfo,
    callback: js.Function1[/* window */ typingsJapgolly.chrome.chrome.windows.Window, Unit]
  ): Unit = js.native
}


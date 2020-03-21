package typingsJapgolly.naverWhale.whale.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.windows.getAll")
@js.native
object getAll extends js.Object {
  def apply(callback: js.Function1[/* windows */ js.Array[typingsJapgolly.chrome.chrome.windows.Window], Unit]): Unit = js.native
  def apply(
    getInfo: typingsJapgolly.chrome.chrome.windows.GetInfo,
    callback: js.Function1[/* windows */ js.Array[typingsJapgolly.chrome.chrome.windows.Window], Unit]
  ): Unit = js.native
}


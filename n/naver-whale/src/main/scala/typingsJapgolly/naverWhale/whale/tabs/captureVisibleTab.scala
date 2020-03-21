package typingsJapgolly.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.captureVisibleTab")
@js.native
object captureVisibleTab extends js.Object {
  def apply(callback: js.Function1[/* dataUrl */ String, Unit]): Unit = js.native
  def apply(
    options: typingsJapgolly.chrome.chrome.tabs.CaptureVisibleTabOptions,
    callback: js.Function1[/* dataUrl */ String, Unit]
  ): Unit = js.native
  def apply(windowId: Double, callback: js.Function1[/* dataUrl */ String, Unit]): Unit = js.native
  def apply(
    windowId: Double,
    options: typingsJapgolly.chrome.chrome.tabs.CaptureVisibleTabOptions,
    callback: js.Function1[/* dataUrl */ String, Unit]
  ): Unit = js.native
}


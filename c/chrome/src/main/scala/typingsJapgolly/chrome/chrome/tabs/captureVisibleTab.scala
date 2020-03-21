package typingsJapgolly.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.captureVisibleTab")
@js.native
object captureVisibleTab extends js.Object {
  def apply(callback: js.Function1[/* dataUrl */ String, Unit]): Unit = js.native
  def apply(options: CaptureVisibleTabOptions, callback: js.Function1[/* dataUrl */ String, Unit]): Unit = js.native
  def apply(windowId: Double, callback: js.Function1[/* dataUrl */ String, Unit]): Unit = js.native
  def apply(
    windowId: Double,
    options: CaptureVisibleTabOptions,
    callback: js.Function1[/* dataUrl */ String, Unit]
  ): Unit = js.native
}


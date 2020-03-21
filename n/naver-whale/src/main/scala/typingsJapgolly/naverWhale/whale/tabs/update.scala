package typingsJapgolly.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.update")
@js.native
object update extends js.Object {
  def apply(tabId: Double, updateProperties: typingsJapgolly.chrome.chrome.tabs.UpdateProperties): Unit = js.native
  def apply(
    tabId: Double,
    updateProperties: typingsJapgolly.chrome.chrome.tabs.UpdateProperties,
    callback: js.Function1[/* tab */ js.UndefOr[typingsJapgolly.chrome.chrome.tabs.Tab], Unit]
  ): Unit = js.native
  def apply(updateProperties: typingsJapgolly.chrome.chrome.tabs.UpdateProperties): Unit = js.native
  def apply(
    updateProperties: typingsJapgolly.chrome.chrome.tabs.UpdateProperties,
    callback: js.Function1[/* tab */ js.UndefOr[typingsJapgolly.chrome.chrome.tabs.Tab], Unit]
  ): Unit = js.native
}


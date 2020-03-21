package typingsJapgolly.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.executeScript")
@js.native
object executeScript extends js.Object {
  def apply(details: typingsJapgolly.chrome.chrome.tabs.InjectDetails): Unit = js.native
  def apply(
    details: typingsJapgolly.chrome.chrome.tabs.InjectDetails,
    callback: js.Function1[/* result */ js.Array[_], Unit]
  ): Unit = js.native
  def apply(tabId: Double, details: typingsJapgolly.chrome.chrome.tabs.InjectDetails): Unit = js.native
  def apply(
    tabId: Double,
    details: typingsJapgolly.chrome.chrome.tabs.InjectDetails,
    callback: js.Function1[/* result */ js.Array[_], Unit]
  ): Unit = js.native
}


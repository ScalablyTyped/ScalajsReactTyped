package typingsJapgolly.naverWhale.whale.tabs

import typingsJapgolly.chrome.chrome.runtime.Port
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.connect")
@js.native
object connect extends js.Object {
  def apply(tabId: Double): Port = js.native
  def apply(tabId: Double, connectInfo: typingsJapgolly.chrome.chrome.tabs.ConnectInfo): Port = js.native
}


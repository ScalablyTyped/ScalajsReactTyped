package typingsJapgolly.naverWhale.whale.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.connect")
@js.native
object connect extends js.Object {
  def apply(): typingsJapgolly.chrome.chrome.runtime.Port = js.native
  def apply(connectInfo: typingsJapgolly.chrome.chrome.runtime.ConnectInfo): typingsJapgolly.chrome.chrome.runtime.Port = js.native
  def apply(extensionId: String): typingsJapgolly.chrome.chrome.runtime.Port = js.native
  def apply(extensionId: String, connectInfo: typingsJapgolly.chrome.chrome.runtime.ConnectInfo): typingsJapgolly.chrome.chrome.runtime.Port = js.native
}


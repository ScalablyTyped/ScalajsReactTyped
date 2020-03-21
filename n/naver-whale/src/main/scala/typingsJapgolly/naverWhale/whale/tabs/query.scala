package typingsJapgolly.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.query")
@js.native
object query extends js.Object {
  def apply(
    queryInfo: typingsJapgolly.chrome.chrome.tabs.QueryInfo,
    callback: js.Function1[/* result */ js.Array[typingsJapgolly.chrome.chrome.tabs.Tab], Unit]
  ): Unit = js.native
}


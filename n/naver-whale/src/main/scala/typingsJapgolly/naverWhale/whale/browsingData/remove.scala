package typingsJapgolly.naverWhale.whale.browsingData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.browsingData.remove")
@js.native
object remove extends js.Object {
  def apply(
    options: typingsJapgolly.chrome.chrome.browsingData.RemovalOptions,
    dataToRemove: typingsJapgolly.chrome.chrome.browsingData.DataTypeSet
  ): Unit = js.native
  def apply(
    options: typingsJapgolly.chrome.chrome.browsingData.RemovalOptions,
    dataToRemove: typingsJapgolly.chrome.chrome.browsingData.DataTypeSet,
    callback: js.Function0[Unit]
  ): Unit = js.native
}


package typingsJapgolly.naverWhale.whale.gcm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.gcm.send")
@js.native
object send extends js.Object {
  def apply(
    message: typingsJapgolly.chrome.chrome.gcm.OutgoingMessage,
    callback: js.Function1[/* messageId */ String, Unit]
  ): Unit = js.native
}


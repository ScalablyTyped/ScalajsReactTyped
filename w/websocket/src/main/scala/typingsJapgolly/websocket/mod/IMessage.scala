package typingsJapgolly.websocket.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessage extends js.Object {
  var binaryData: js.UndefOr[Buffer] = js.undefined
  var `type`: String
  var utf8Data: js.UndefOr[String] = js.undefined
}

object IMessage {
  @scala.inline
  def apply(`type`: String, binaryData: Buffer = null, utf8Data: String = null): IMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (binaryData != null) __obj.updateDynamic("binaryData")(binaryData.asInstanceOf[js.Any])
    if (utf8Data != null) __obj.updateDynamic("utf8Data")(utf8Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage]
  }
}


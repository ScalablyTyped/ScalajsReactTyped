package typingsJapgolly.websocket.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageEvent extends js.Object {
  var data: String | Buffer | scala.scalajs.js.typedarray.ArrayBuffer
}

object IMessageEvent {
  @scala.inline
  def apply(data: String | Buffer | scala.scalajs.js.typedarray.ArrayBuffer): IMessageEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMessageEvent]
  }
}


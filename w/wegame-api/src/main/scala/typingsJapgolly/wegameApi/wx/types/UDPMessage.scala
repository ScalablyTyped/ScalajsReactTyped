package typingsJapgolly.wegameApi.wx.types

import typingsJapgolly.wegameApi.AnonAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UDPMessage extends js.Object {
  /**
    * 收到的消息
    */
  var message: scala.scalajs.js.typedarray.ArrayBuffer
  /**
    * 消息来源的结构化信息
    */
  var remoteInfo: AnonAddress
}

object UDPMessage {
  @scala.inline
  def apply(message: scala.scalajs.js.typedarray.ArrayBuffer, remoteInfo: AnonAddress): UDPMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], remoteInfo = remoteInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UDPMessage]
  }
}


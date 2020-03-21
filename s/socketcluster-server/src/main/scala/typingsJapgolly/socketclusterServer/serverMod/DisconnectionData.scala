package typingsJapgolly.socketclusterServer.serverMod

import typingsJapgolly.socketclusterServer.serversocketMod.DisconnectData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisconnectionData extends DisconnectData {
  var socket: typingsJapgolly.socketclusterServer.serversocketMod.^
}

object DisconnectionData {
  @scala.inline
  def apply(code: Double, reason: String, socket: typingsJapgolly.socketclusterServer.serversocketMod.^): DisconnectionData = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisconnectionData]
  }
}


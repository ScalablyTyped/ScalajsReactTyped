package typingsJapgolly.socketclusterServer.serverMod

import typingsJapgolly.socketclusterServer.serversocketMod.ConnectAbortData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionAbortData extends ConnectAbortData {
  var socket: typingsJapgolly.socketclusterServer.serversocketMod.^
}

object ConnectionAbortData {
  @scala.inline
  def apply(code: Double, reason: String, socket: typingsJapgolly.socketclusterServer.serversocketMod.^): ConnectionAbortData = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionAbortData]
  }
}


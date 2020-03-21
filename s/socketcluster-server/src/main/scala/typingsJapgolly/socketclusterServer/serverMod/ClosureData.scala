package typingsJapgolly.socketclusterServer.serverMod

import typingsJapgolly.socketclusterServer.serversocketMod.CloseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClosureData extends CloseData {
  var socket: typingsJapgolly.socketclusterServer.serversocketMod.^
}

object ClosureData {
  @scala.inline
  def apply(code: Double, reason: String, socket: typingsJapgolly.socketclusterServer.serversocketMod.^): ClosureData = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClosureData]
  }
}


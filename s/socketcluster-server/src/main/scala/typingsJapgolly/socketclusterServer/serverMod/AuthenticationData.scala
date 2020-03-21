package typingsJapgolly.socketclusterServer.serverMod

import typingsJapgolly.socketclusterServer.serversocketMod.AuthToken
import typingsJapgolly.socketclusterServer.serversocketMod.AuthenticateData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationData extends AuthenticateData {
  var socket: typingsJapgolly.socketclusterServer.serversocketMod.^
}

object AuthenticationData {
  @scala.inline
  def apply(socket: typingsJapgolly.socketclusterServer.serversocketMod.^, authToken: AuthToken = null): AuthenticationData = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    if (authToken != null) __obj.updateDynamic("authToken")(authToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationData]
  }
}


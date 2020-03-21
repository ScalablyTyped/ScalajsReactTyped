package typingsJapgolly.socketclusterServer.serverMod

import typingsJapgolly.socketclusterServer.serversocketMod.AuthToken
import typingsJapgolly.socketclusterServer.serversocketMod.StateChangeData
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.authenticated
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.unauthenticated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthStateChangeData extends StateChangeData {
  var socket: typingsJapgolly.socketclusterServer.serversocketMod.^
}

object AuthStateChangeData {
  @scala.inline
  def apply(
    newState: authenticated | unauthenticated,
    oldState: authenticated | unauthenticated,
    socket: typingsJapgolly.socketclusterServer.serversocketMod.^,
    authToken: AuthToken = null
  ): AuthStateChangeData = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    if (authToken != null) __obj.updateDynamic("authToken")(authToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthStateChangeData]
  }
}


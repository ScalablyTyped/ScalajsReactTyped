package typingsJapgolly.socketclusterServer.serverMod

import typingsJapgolly.socketclusterServer.serversocketMod.BadAuthTokenData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadSocketAuthTokenData extends BadAuthTokenData {
  var socket: typingsJapgolly.socketclusterServer.serversocketMod.^
}

object BadSocketAuthTokenData {
  @scala.inline
  def apply(
    authError: js.Error,
    signedAuthToken: String,
    socket: typingsJapgolly.socketclusterServer.serversocketMod.^
  ): BadSocketAuthTokenData = {
    val __obj = js.Dynamic.literal(authError = authError.asInstanceOf[js.Any], signedAuthToken = signedAuthToken.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BadSocketAuthTokenData]
  }
}


package typingsJapgolly.socketclusterClient.clientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthStatus extends js.Object {
  var authError: js.Error
  var isAuthenticated: AuthStates
}

object AuthStatus {
  @scala.inline
  def apply(authError: js.Error, isAuthenticated: AuthStates): AuthStatus = {
    val __obj = js.Dynamic.literal(authError = authError.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthStatus]
  }
}


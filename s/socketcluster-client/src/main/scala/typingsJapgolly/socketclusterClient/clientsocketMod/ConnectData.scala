package typingsJapgolly.socketclusterClient.clientsocketMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.socketclusterClient.transportMod.OnOpenValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectData extends OnOpenValue {
  def processPendingSubscriptions(): Unit
}

object ConnectData {
  @scala.inline
  def apply(
    id: String,
    isAuthenticated: Boolean,
    pingTimeout: Double,
    processPendingSubscriptions: Callback,
    authToken: js.Object = null
  ): ConnectData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any], pingTimeout = pingTimeout.asInstanceOf[js.Any])
    __obj.updateDynamic("processPendingSubscriptions")(processPendingSubscriptions.toJsFn)
    if (authToken != null) __obj.updateDynamic("authToken")(authToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectData]
  }
}


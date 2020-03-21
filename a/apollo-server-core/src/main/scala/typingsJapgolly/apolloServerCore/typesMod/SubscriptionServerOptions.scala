package typingsJapgolly.apolloServerCore.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.subscriptionsTransportWs.serverMod.ConnectionContext
import typingsJapgolly.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionServerOptions extends js.Object {
  var keepAlive: js.UndefOr[Double] = js.undefined
  var onConnect: js.UndefOr[
    js.Function3[
      /* connectionParams */ js.Object, 
      /* websocket */ ^, 
      /* context */ ConnectionContext, 
      _
    ]
  ] = js.undefined
  var onDisconnect: js.UndefOr[js.Function2[/* websocket */ ^, /* context */ ConnectionContext, _]] = js.undefined
  var path: String
}

object SubscriptionServerOptions {
  @scala.inline
  def apply(
    path: String,
    keepAlive: Int | Double = null,
    onConnect: (/* connectionParams */ js.Object, /* websocket */ ^, /* context */ ConnectionContext) => CallbackTo[js.Any] = null,
    onDisconnect: (/* websocket */ ^, /* context */ ConnectionContext) => CallbackTo[js.Any] = null
  ): SubscriptionServerOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (keepAlive != null) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (onConnect != null) __obj.updateDynamic("onConnect")(js.Any.fromFunction3((t0: /* connectionParams */ js.Object, t1: /* websocket */ typingsJapgolly.ws.mod.^, t2: /* context */ typingsJapgolly.subscriptionsTransportWs.serverMod.ConnectionContext) => onConnect(t0, t1, t2).runNow()))
    if (onDisconnect != null) __obj.updateDynamic("onDisconnect")(js.Any.fromFunction2((t0: /* websocket */ typingsJapgolly.ws.mod.^, t1: /* context */ typingsJapgolly.subscriptionsTransportWs.serverMod.ConnectionContext) => onDisconnect(t0, t1).runNow()))
    __obj.asInstanceOf[SubscriptionServerOptions]
  }
}


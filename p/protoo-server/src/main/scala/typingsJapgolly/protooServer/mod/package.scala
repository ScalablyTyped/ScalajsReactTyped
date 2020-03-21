package typingsJapgolly.protooServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AcceptFn = js.Function1[/* data */ js.Any, scala.Unit]
  type ConnectionRequestAcceptFn = js.Function0[typingsJapgolly.protooServer.mod.WebSocketTransport]
  type ConnectionRequestCb = js.Function3[
    /* info */ typingsJapgolly.protooServer.mod.ConnectionRequestInfo, 
    /* accept */ typingsJapgolly.protooServer.mod.ConnectionRequestAcceptFn, 
    /* reject */ typingsJapgolly.protooServer.mod.ConnectionRequestRejectFn, 
    scala.Unit
  ]
  type ConnectionRequestRejectFn = (js.Function2[/* code */ scala.Double, /* reason */ java.lang.String, scala.Unit]) with (js.Function1[/* error */ js.Error, scala.Unit])
  type EmptyCb = js.Function0[scala.Unit]
  type NotificationCb = js.Function1[/* notification */ typingsJapgolly.protooServer.mod.ProtooNotification, scala.Unit]
  type RejectFn = (js.Function1[/* errorCode */ js.UndefOr[js.Error], scala.Unit]) with (js.Function2[
    /* errorCode */ scala.Double, 
    /* errorReason */ js.Error | java.lang.String, 
    scala.Unit
  ])
  type RequestCb = js.Function3[
    /* request */ typingsJapgolly.protooServer.mod.ProtooRequest, 
    /* accept */ typingsJapgolly.protooServer.mod.AcceptFn, 
    /* reject */ typingsJapgolly.protooServer.mod.RejectFn, 
    scala.Unit
  ]
}

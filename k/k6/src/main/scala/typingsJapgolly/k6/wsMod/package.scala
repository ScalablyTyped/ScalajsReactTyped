package typingsJapgolly.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wsMod {
  type CloseEventHandler = js.Function1[/* code */ scala.Double, scala.Unit]
  type ErrorEventHandler = js.Function1[/* error */ typingsJapgolly.k6.wsMod.WebSocketError, scala.Unit]
  type EventHandler[ET /* <: typingsJapgolly.k6.wsMod.EventType */] = typingsJapgolly.k6.wsMod.PongEventHandler | typingsJapgolly.k6.wsMod.PingEventHandler | typingsJapgolly.k6.wsMod.OpenEventHandler | typingsJapgolly.k6.wsMod.MessageEventHandler | typingsJapgolly.k6.wsMod.ErrorEventHandler | typingsJapgolly.k6.wsMod.CloseEventHandler
  type Executor = js.Function1[/* socket */ typingsJapgolly.k6.wsMod.Socket, scala.Unit]
  type MessageEventHandler = js.Function1[/* message */ java.lang.String, scala.Unit]
  type OpenEventHandler = js.Function0[scala.Unit]
  type PingEventHandler = js.Function0[scala.Unit]
  type PongEventHandler = js.Function0[scala.Unit]
  type TimerHandler = js.Function0[scala.Unit]
}

package typingsJapgolly.socketty.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SockettyServer extends js.Object {
  /**
    * Specify a callback to be run when a new socket connects to the server.
    * @param callback The callback
    */
  def connection(callback: js.Function1[/* socket */ SockettySocket, Unit]): Unit
}

object SockettyServer {
  @scala.inline
  def apply(connection: js.Function1[/* socket */ SockettySocket, Unit] => Callback): SockettyServer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connection")(js.Any.fromFunction1((t0: js.Function1[/* socket */ typingsJapgolly.socketty.mod.SockettySocket, scala.Unit]) => connection(t0).runNow()))
    __obj.asInstanceOf[SockettyServer]
  }
}


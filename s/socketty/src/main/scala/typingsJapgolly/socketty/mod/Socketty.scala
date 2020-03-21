package typingsJapgolly.socketty.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Socketty extends js.Object {
  /**
    * Connect to a socketty server.
    * @param url The server url
    * @param callback The callback to be run when the connection is open
    * @return A Socket
    */
  def connect(url: String, callback: js.Function1[/* socket */ SockettySocket, Unit]): SockettySocket
  /**
    * Create a socketty server.
    * @param httpServer The HTTP server to use
    * @return A socketty server
    */
  def createServer(httpServer: js.Any): SockettyServer
}

object Socketty {
  @scala.inline
  def apply(
    connect: (String, js.Function1[/* socket */ SockettySocket, Unit]) => CallbackTo[SockettySocket],
    createServer: js.Any => CallbackTo[SockettyServer]
  ): Socketty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connect")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* socket */ typingsJapgolly.socketty.mod.SockettySocket, scala.Unit]) => connect(t0, t1).runNow()))
    __obj.updateDynamic("createServer")(js.Any.fromFunction1((t0: js.Any) => createServer(t0).runNow()))
    __obj.asInstanceOf[Socketty]
  }
}


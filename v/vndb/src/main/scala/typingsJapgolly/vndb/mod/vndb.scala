package typingsJapgolly.vndb.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.tlsMod.TLSSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object containing the socket and methods to interact with it
  */
trait vndb extends js.Object {
  var socket: TLSSocket
  /**
    * Close the connection to the VNDB API
    */
  def end(): js.Promise[Unit]
  /**
    * Send a message to the VNDB API, according to https://vndb.org/d11
    * @param message message to send to the VNDB API
    */
  def write(message: String): js.Promise[String]
}

object vndb {
  @scala.inline
  def apply(
    end: CallbackTo[js.Promise[Unit]],
    socket: TLSSocket,
    write: String => CallbackTo[js.Promise[String]]
  ): vndb = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: java.lang.String) => write(t0).runNow()))
    __obj.asInstanceOf[vndb]
  }
}


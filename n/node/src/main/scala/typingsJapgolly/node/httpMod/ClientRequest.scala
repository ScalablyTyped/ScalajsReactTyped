package typingsJapgolly.node.httpMod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.node.nodeStrings.abort
import typingsJapgolly.node.nodeStrings.connect
import typingsJapgolly.node.nodeStrings.continue
import typingsJapgolly.node.nodeStrings.information
import typingsJapgolly.node.nodeStrings.response
import typingsJapgolly.node.nodeStrings.socket
import typingsJapgolly.node.nodeStrings.timeout
import typingsJapgolly.node.nodeStrings.upgrade
import typingsJapgolly.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/nodejs/node/blob/master/lib/_http_client.js#L77
@JSImport("http", "ClientRequest")
@js.native
class ClientRequest protected () extends OutgoingMessage {
  def this(url: String) = this()
  def this(url: ClientRequestArgs) = this()
  def this(url: URL_) = this()
  def this(url: String, cb: js.Function1[/* res */ IncomingMessage, Unit]) = this()
  def this(url: ClientRequestArgs, cb: js.Function1[/* res */ IncomingMessage, Unit]) = this()
  def this(url: URL_, cb: js.Function1[/* res */ IncomingMessage, Unit]) = this()
  var aborted: Double = js.native
  var method: String = js.native
  var path: String = js.native
  def abort(): Unit = js.native
  @JSName("addListener")
  def addListener_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_connect(
    event: connect,
    listener: js.Function3[/* response */ IncomingMessage, /* socket */ Socket, /* head */ Buffer, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_continue(event: continue, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_information(event: information, listener: js.Function1[/* info */ InformationEvent, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_response(event: response, listener: js.Function1[/* response */ IncomingMessage, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_socket(event: socket, listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_upgrade(
    event: upgrade,
    listener: js.Function3[/* response */ IncomingMessage, /* socket */ Socket, /* head */ Buffer, Unit]
  ): this.type = js.native
  def onSocket(socket: Socket): Unit = js.native
  @JSName("on")
  def on_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_connect(
    event: connect,
    listener: js.Function3[/* response */ IncomingMessage, /* socket */ Socket, /* head */ Buffer, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_continue(event: continue, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_information(event: information, listener: js.Function1[/* info */ InformationEvent, Unit]): this.type = js.native
  @JSName("on")
  def on_response(event: response, listener: js.Function1[/* response */ IncomingMessage, Unit]): this.type = js.native
  @JSName("on")
  def on_socket(event: socket, listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
  @JSName("on")
  def on_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_upgrade(
    event: upgrade,
    listener: js.Function3[/* response */ IncomingMessage, /* socket */ Socket, /* head */ Buffer, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_connect(
    event: connect,
    listener: js.Function3[/* response */ IncomingMessage, /* socket */ Socket, /* head */ Buffer, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_continue(event: continue, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_information(event: information, listener: js.Function1[/* info */ InformationEvent, Unit]): this.type = js.native
  @JSName("once")
  def once_response(event: response, listener: js.Function1[/* response */ IncomingMessage, Unit]): this.type = js.native
  @JSName("once")
  def once_socket(event: socket, listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
  @JSName("once")
  def once_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_upgrade(
    event: upgrade,
    listener: js.Function3[/* response */ IncomingMessage, /* socket */ Socket, /* head */ Buffer, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_connect(
    event: connect,
    listener: js.Function3[/* response */ IncomingMessage, /* socket */ Socket, /* head */ Buffer, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_continue(event: continue, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_information(event: information, listener: js.Function1[/* info */ InformationEvent, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_response(event: response, listener: js.Function1[/* response */ IncomingMessage, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_socket(event: socket, listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_upgrade(
    event: upgrade,
    listener: js.Function3[/* response */ IncomingMessage, /* socket */ Socket, /* head */ Buffer, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connect(
    event: connect,
    listener: js.Function3[/* response */ IncomingMessage, /* socket */ Socket, /* head */ Buffer, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_continue(event: continue, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_information(event: information, listener: js.Function1[/* info */ InformationEvent, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_response(event: response, listener: js.Function1[/* response */ IncomingMessage, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_socket(event: socket, listener: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_upgrade(
    event: upgrade,
    listener: js.Function3[/* response */ IncomingMessage, /* socket */ Socket, /* head */ Buffer, Unit]
  ): this.type = js.native
  def setNoDelay(): Unit = js.native
  def setNoDelay(noDelay: Boolean): Unit = js.native
  def setSocketKeepAlive(): Unit = js.native
  def setSocketKeepAlive(enable: Boolean): Unit = js.native
  def setSocketKeepAlive(enable: Boolean, initialDelay: Double): Unit = js.native
}


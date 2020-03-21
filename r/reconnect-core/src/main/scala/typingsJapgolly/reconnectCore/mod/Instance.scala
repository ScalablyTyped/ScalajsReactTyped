package typingsJapgolly.reconnectCore.mod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.reconnectCore.reconnectCoreStrings.backoff
import typingsJapgolly.reconnectCore.reconnectCoreStrings.connect
import typingsJapgolly.reconnectCore.reconnectCoreStrings.connection
import typingsJapgolly.reconnectCore.reconnectCoreStrings.disconnect
import typingsJapgolly.reconnectCore.reconnectCoreStrings.error
import typingsJapgolly.reconnectCore.reconnectCoreStrings.fail
import typingsJapgolly.reconnectCore.reconnectCoreStrings.reconnect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance[ArgType, ConnectionType] extends EventEmitter {
  val connected: Boolean = js.native
  var reconnect: Boolean = js.native
  def connect(opts: ArgType): this.type = js.native
  def disconnect(): this.type = js.native
  def listen(opts: ArgType): this.type = js.native
  @JSName("on")
  def on_backoff(
    event: backoff,
    cb: js.Function3[/* n */ Double, /* delay */ Double, /* err */ js.UndefOr[js.Any], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connect(event: connect, cb: js.Function1[/* con */ ConnectionType, Unit]): this.type = js.native
  @JSName("on")
  def on_connection(event: connection, cb: js.Function1[/* con */ ConnectionType, Unit]): this.type = js.native
  @JSName("on")
  def on_disconnect(event: disconnect, cb: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_fail(event: fail, cb: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_reconnect(event: reconnect, cb: js.Function2[/* n */ Double, /* delay */ Double, Unit]): this.type = js.native
  def reset(): Unit = js.native
}


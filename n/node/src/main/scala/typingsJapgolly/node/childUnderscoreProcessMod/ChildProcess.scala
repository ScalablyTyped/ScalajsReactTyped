package typingsJapgolly.node.childUnderscoreProcessMod

import typingsJapgolly.node.Error
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.netMod.Server
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.node.nodeStrings.close
import typingsJapgolly.node.nodeStrings.disconnect
import typingsJapgolly.node.nodeStrings.error
import typingsJapgolly.node.nodeStrings.exit
import typingsJapgolly.node.nodeStrings.message
import typingsJapgolly.node.streamMod.Pipe
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildProcess extends EventEmitter {
  val channel: js.UndefOr[Pipe | Null] = js.native
  val connected: Boolean = js.native
  val killed: Boolean = js.native
  val pid: Double = js.native
  var stderr: Readable | Null = js.native
  var stdin: Writable | Null = js.native
  val stdio: js.Tuple5[
    Writable | Null, 
    Readable | Null, 
    Readable | Null, 
    js.UndefOr[Readable | Writable | Null], 
    js.UndefOr[Readable | Writable | Null]
  ] = js.native
  var stdout: Readable | Null = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function2[/* code */ Double, /* signal */ java.lang.String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_exit(
    event: exit,
    listener: js.Function2[/* code */ Double | Null, /* signal */ java.lang.String | Null, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_message(
    event: message,
    listener: js.Function2[/* message */ js.Any, /* sendHandle */ Socket | Server, Unit]
  ): this.type = js.native
  def disconnect(): Unit = js.native
  @JSName("emit")
  def emit_close(event: close, code: Double, signal: java.lang.String): Boolean = js.native
  @JSName("emit")
  def emit_disconnect(event: disconnect): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, err: Error): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit, code: Double): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit, code: Double, signal: java.lang.String): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit, code: Null, signal: java.lang.String): Boolean = js.native
  @JSName("emit")
  def emit_message(event: message, message: js.Any, sendHandle: Server): Boolean = js.native
  @JSName("emit")
  def emit_message(event: message, message: js.Any, sendHandle: Socket): Boolean = js.native
  def kill(): Unit = js.native
  def kill(signal: java.lang.String): Unit = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function2[/* code */ Double, /* signal */ java.lang.String, Unit]): this.type = js.native
  @JSName("on")
  def on_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_exit(
    event: exit,
    listener: js.Function2[/* code */ Double | Null, /* signal */ java.lang.String | Null, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    event: message,
    listener: js.Function2[/* message */ js.Any, /* sendHandle */ Socket | Server, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function2[/* code */ Double, /* signal */ java.lang.String, Unit]): this.type = js.native
  @JSName("once")
  def once_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_exit(
    event: exit,
    listener: js.Function2[/* code */ Double | Null, /* signal */ java.lang.String | Null, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_message(
    event: message,
    listener: js.Function2[/* message */ js.Any, /* sendHandle */ Socket | Server, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function2[/* code */ Double, /* signal */ java.lang.String, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_exit(
    event: exit,
    listener: js.Function2[/* code */ Double | Null, /* signal */ java.lang.String | Null, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(
    event: message,
    listener: js.Function2[/* message */ js.Any, /* sendHandle */ Socket | Server, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function2[/* code */ Double, /* signal */ java.lang.String, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(
    event: exit,
    listener: js.Function2[/* code */ Double | Null, /* signal */ java.lang.String | Null, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(
    event: message,
    listener: js.Function2[/* message */ js.Any, /* sendHandle */ Socket | Server, Unit]
  ): this.type = js.native
  def ref(): Unit = js.native
  def send(message: js.Any): Boolean = js.native
  def send(message: js.Any, callback: js.Function1[/* error */ Error | Null, Unit]): Boolean = js.native
  def send(message: js.Any, sendHandle: Server): Boolean = js.native
  def send(message: js.Any, sendHandle: Server, callback: js.Function1[/* error */ Error | Null, Unit]): Boolean = js.native
  def send(message: js.Any, sendHandle: Server, options: MessageOptions): Boolean = js.native
  def send(
    message: js.Any,
    sendHandle: Server,
    options: MessageOptions,
    callback: js.Function1[/* error */ Error | Null, Unit]
  ): Boolean = js.native
  def send(message: js.Any, sendHandle: Socket): Boolean = js.native
  def send(message: js.Any, sendHandle: Socket, callback: js.Function1[/* error */ Error | Null, Unit]): Boolean = js.native
  def send(message: js.Any, sendHandle: Socket, options: MessageOptions): Boolean = js.native
  def send(
    message: js.Any,
    sendHandle: Socket,
    options: MessageOptions,
    callback: js.Function1[/* error */ Error | Null, Unit]
  ): Boolean = js.native
  def unref(): Unit = js.native
}


package typingsJapgolly.node.streamMod

import typingsJapgolly.node.AnonChunk
import typingsJapgolly.node.nodeStrings.drain
import typingsJapgolly.node.nodeStrings.finish
import typingsJapgolly.node.nodeStrings.pipe
import typingsJapgolly.node.nodeStrings.unpipe
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Note: Duplex extends both Readable and Writable.
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.node.NodeJS.EventEmitter because Already inherited
- typingsJapgolly.node.eventsMod.EventEmitter because Already inherited
- typingsJapgolly.node.NodeJS.EventEmitter because Already inherited
- typingsJapgolly.node.childProcessMod.StdioNull because Already inherited
- typingsJapgolly.node.streamMod.internal because Already inherited
- typingsJapgolly.node.NodeJS.WritableStream because var conflicts: writable. Inlined 
- typingsJapgolly.node.streamMod.Stream because Already inherited
- typingsJapgolly.node.streamMod.Writable because Inheritance from two classes. Inlined writable, writableEnded, writableFinished, writableHighWaterMark, writableLength, writableObjectMode, writableCorked, _write, _writev, _destroy, _destroy, _final, write, write, write, write, setDefaultEncoding, end, end, end, end, end, end, cork, uncork, destroy, destroy, addListener_close, addListener_drain, addListener_error, addListener_finish, addListener_pipe, addListener_unpipe, addListener, addListener, emit_close, emit_drain, emit_error, emit_finish, emit_pipe, emit_unpipe, emit, emit, on_close, on_drain, on_error, on_finish, on_pipe, on_unpipe, on, on, once_close, once_drain, once_error, once_finish, once_pipe, once_unpipe, once, once, prependListener_close, prependListener_drain, prependListener_error, prependListener_finish, prependListener_pipe, prependListener_unpipe, prependListener, prependListener, prependOnceListener_close, prependOnceListener_drain, prependOnceListener_error, prependOnceListener_finish, prependOnceListener_pipe, prependOnceListener_unpipe, prependOnceListener, prependOnceListener, removeListener_close, removeListener_drain, removeListener_error, removeListener_finish, removeListener_pipe, removeListener_unpipe, removeListener, removeListener */ @JSImport("stream", "Duplex")
@js.native
class Duplex () extends Readable {
  def this(opts: DuplexOptions) = this()
  var _writev: js.UndefOr[
    js.Function2[
      /* chunks */ js.Array[AnonChunk], 
      /* callback */ js.Function1[js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  val writable: Boolean = js.native
  val writableCorked: Double = js.native
  val writableEnded: Boolean = js.native
  val writableFinished: Boolean = js.native
  val writableHighWaterMark: Double = js.native
  val writableLength: Double = js.native
  val writableObjectMode: Boolean = js.native
  def _final(callback: js.Function1[js.UndefOr[js.Error | Null], Unit]): Unit = js.native
  def _write(chunk: js.Any, encoding: String, callback: js.Function1[js.UndefOr[js.Error | Null], Unit]): Unit = js.native
  @JSName("addListener")
  def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  def cork(): Unit = js.native
  @JSName("emit")
  def emit_drain(event: drain): Boolean = js.native
  @JSName("emit")
  def emit_finish(event: finish): Boolean = js.native
  @JSName("emit")
  def emit_pipe(event: pipe, src: Readable): Boolean = js.native
  @JSName("emit")
  def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
  def end(): Unit = js.native
  def end(cb: js.Function0[Unit]): Unit = js.native
  def end(chunk: js.Any): Unit = js.native
  def end(chunk: js.Any, cb: js.Function0[Unit]): Unit = js.native
  def end(chunk: js.Any, encoding: String): Unit = js.native
  def end(chunk: js.Any, encoding: String, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("once")
  def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("once")
  def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  def setDefaultEncoding(encoding: String): this.type = js.native
  def uncork(): Unit = js.native
  def write(chunk: js.Any): Boolean = js.native
  def write(chunk: js.Any, cb: js.Function1[js.UndefOr[Error | Null], Unit]): Boolean = js.native
  def write(chunk: js.Any, encoding: String): Boolean = js.native
  def write(chunk: js.Any, encoding: String, cb: js.Function1[js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
}


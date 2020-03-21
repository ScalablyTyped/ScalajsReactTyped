package typingsJapgolly.readableStream.mod

import typingsJapgolly.node.BufferEncoding
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.nodeStrings.data
import typingsJapgolly.node.nodeStrings.end
import typingsJapgolly.node.nodeStrings.readable
import typingsJapgolly.readableStream.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.node.NodeJS.EventEmitter because Already inherited
- typingsJapgolly.node.eventsMod.EventEmitter because Already inherited
- typingsJapgolly.node.childProcessMod.StdioNull because Already inherited
- typingsJapgolly.node.streamMod.internal because Already inherited
- typingsJapgolly.node.streamMod.Stream because Already inherited
- typingsJapgolly.node.streamMod.Readable because Inheritance from two classes. Inlined readableHighWaterMark, readableLength, readableObjectMode, _destroy, _destroy, _read, addListener_close, addListener_data, addListener_end, addListener_error, addListener_readable, emit_close, emit_data, emit_end, emit_error, emit_readable, on_close, on_data, on_end, on_error, on_readable, once_close, once_data, once_end, once_error, once_readable, pipe, pipe, prependListener_close, prependListener_data, prependListener_end, prependListener_error, prependListener_readable, prependOnceListener_close, prependOnceListener_data, prependOnceListener_end, prependOnceListener_error, prependOnceListener_readable, push, push, removeListener_close, removeListener_data, removeListener_end, removeListener_error, removeListener_readable, unshift, unshift
- typingsJapgolly.node.streamMod.Duplex because Inheritance from two classes. Inlined _final, _write, addListener_drain, addListener_finish, addListener_pipe, addListener_unpipe, cork, emit_drain, emit_finish, emit_pipe, emit_unpipe, end, end, end, end, end, end, on_drain, on_finish, on_pipe, on_unpipe, once_drain, once_finish, once_pipe, once_unpipe, prependListener_drain, prependListener_finish, prependListener_pipe, prependListener_unpipe, prependOnceListener_drain, prependOnceListener_finish, prependOnceListener_pipe, prependOnceListener_unpipe, removeListener_drain, removeListener_finish, removeListener_pipe, removeListener_unpipe, setDefaultEncoding, uncork, write, write, write, write
- typingsJapgolly.readableStream.mod._Readable because Inheritance from two classes. Inlined _readableState, destroy, destroy, destroy, _undestroy */ @JSImport("readable-stream", "Duplex")
@js.native
// end-Readable
class Duplex ()
  extends Writable
     with ReadableStream {
  def this(options: DuplexOptions) = this()
  var _readableState: ReadableState = js.native
  var allowHalfOpen: Boolean = js.native
  val readableHighWaterMark: Double = js.native
  val readableLength: Double = js.native
  val readableObjectMode: Boolean = js.native
  def _read(): Unit = js.native
  def _read(size: Double): Unit = js.native
  @JSName("addListener")
  def addListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("emit")
  def emit_data(event: data, chunk: js.Any): Boolean = js.native
  @JSName("emit")
  def emit_end(event: end): Boolean = js.native
  @JSName("emit")
  def emit_readable(event: readable): Boolean = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  def pipe[S /* <: WritableStream */](dest: S, pipeOpts: AnonEnd): S = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: typingsJapgolly.node.AnonEnd): T = js.native
  @JSName("pipe")
  def pipe_S_WritableStream_S[S /* <: WritableStream */](dest: S): S = js.native
  @JSName("prependListener")
  def prependListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  def push(chunk: js.Any): Boolean = js.native
  def push(chunk: js.Any, encoding: String): Boolean = js.native
  @JSName("removeListener")
  def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  def unshift(chunk: js.Any): Unit = js.native
  def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
  @JSName("unshift")
  def unshift_Boolean(chunk: js.Any): Boolean = js.native
}

/* static members */
@JSImport("readable-stream", "Duplex")
@js.native
object Duplex extends js.Object {
  /**
    * This is a dummy function required to retain type compatibility to node.
    * @deprecated DO NOT USE
    */
  def from(source: js.Any): js.Any = js.native
}


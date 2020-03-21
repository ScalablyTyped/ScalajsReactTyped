package typingsJapgolly.levelup.mod

import typingsJapgolly.abstractLeveldown.mod.AbstractBatch
import typingsJapgolly.abstractLeveldown.mod.AbstractIteratorOptions
import typingsJapgolly.abstractLeveldown.mod.ErrorCallback
import typingsJapgolly.levelup.levelupStrings.batch
import typingsJapgolly.levelup.levelupStrings.clear
import typingsJapgolly.levelup.levelupStrings.closed
import typingsJapgolly.levelup.levelupStrings.closing
import typingsJapgolly.levelup.levelupStrings.del
import typingsJapgolly.levelup.levelupStrings.open
import typingsJapgolly.levelup.levelupStrings.opening
import typingsJapgolly.levelup.levelupStrings.put
import typingsJapgolly.levelup.levelupStrings.ready
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelUp[DB, Iterator] extends EventEmitter {
  var clear: InferDBClear[DB] = js.native
  var del: InferDBDel[DB] = js.native
  var get: InferDBGet[DB] = js.native
  var put: InferDBPut[DB] = js.native
  def batch(): LevelUpChain[_, _] = js.native
  def batch(array: js.Array[AbstractBatch[_, _]]): js.Promise[Unit] = js.native
  def batch(array: js.Array[AbstractBatch[_, _]], callback: js.Function1[/* err */ js.UndefOr[js.Any], _]): Unit = js.native
  def batch(array: js.Array[AbstractBatch[_, _]], options: js.Any): js.Promise[Unit] = js.native
  def batch(
    array: js.Array[AbstractBatch[_, _]],
    options: js.Any,
    callback: js.Function1[/* err */ js.UndefOr[js.Any], _]
  ): Unit = js.native
  def close(): Unit = js.native
  def close(callback: ErrorCallback): Unit = js.native
  @JSName("close")
  def close_Promise(): js.Promise[Unit] = js.native
  def createKeyStream(): ReadableStream = js.native
  def createKeyStream(options: AbstractIteratorOptions[_]): ReadableStream = js.native
  def createReadStream(): ReadableStream = js.native
  def createReadStream(options: AbstractIteratorOptions[_]): ReadableStream = js.native
  def createValueStream(): ReadableStream = js.native
  def createValueStream(options: AbstractIteratorOptions[_]): ReadableStream = js.native
  def isClosed(): Boolean = js.native
  def isOpen(): Boolean = js.native
  def iterator(): Iterator = js.native
  def iterator(options: AbstractIteratorOptions[_]): Iterator = js.native
  /*
    emitted when a batch operation has executed
    */
  @JSName("on")
  def on_batch(event: batch, cb: js.Function1[/* ary */ js.Array[_], Unit]): this.type = js.native
  /*
    emitted when clear is called
    */
  @JSName("on")
  def on_clear(event: clear, cb: js.Function1[/* opts */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_closed(event: closed, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_closing(event: closing, cb: js.Function0[Unit]): this.type = js.native
  /*
    emitted when a value is deleted
    */
  @JSName("on")
  def on_del(event: del, cb: js.Function1[/* key */ js.Any, Unit]): this.type = js.native
  /*
    emitted on given event
    */
  @JSName("on")
  def on_open(event: open, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_opening(event: opening, cb: js.Function0[Unit]): this.type = js.native
  /*
    emitted when a new value is 'put'
    */
  @JSName("on")
  def on_put(event: put, cb: js.Function2[/* key */ js.Any, /* value */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, cb: js.Function0[Unit]): this.type = js.native
  def open(): Unit = js.native
  def open(callback: ErrorCallback): Unit = js.native
  @JSName("open")
  def open_Promise(): js.Promise[Unit] = js.native
}


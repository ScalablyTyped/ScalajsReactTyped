package typingsJapgolly.streamMock

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.BufferEncoding
import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.streamMod.DuplexOptions
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/duplex/DuplexMock", JSImport.Namespace)
@js.native
object duplexMockMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.node.NodeJS.EventEmitter because Already inherited
  - typingsJapgolly.node.eventsMod.EventEmitter because Already inherited
  - typingsJapgolly.node.NodeJS.EventEmitter because Already inherited
  - typingsJapgolly.node.childProcessMod.StdioNull because Already inherited
  - typingsJapgolly.node.streamMod.internal because Already inherited
  - typingsJapgolly.node.NodeJS.ReadableStream because Already inherited
  - typingsJapgolly.node.NodeJS.WritableStream because var conflicts: writable. Inlined 
  - typingsJapgolly.node.streamMod.Stream because Already inherited
  - typingsJapgolly.node.streamMod.Readable because Already inherited
  - typingsJapgolly.node.streamMod.Writable because Inheritance from two classes. Inlined _destroy, _destroy, _final, _write, addListener_close, addListener_drain, addListener_error, addListener_finish, addListener_pipe, addListener_unpipe, cork, destroy, destroy, emit_close, emit_drain, emit_error, emit_finish, emit_pipe, emit_unpipe, end, end, end, end, on_close, on_drain, on_error, on_finish, on_pipe, on_unpipe, once_close, once_drain, once_error, once_finish, once_pipe, once_unpipe, prependListener_close, prependListener_drain, prependListener_error, prependListener_finish, prependListener_pipe, prependListener_unpipe, prependOnceListener_close, prependOnceListener_drain, prependOnceListener_error, prependOnceListener_finish, prependOnceListener_pipe, prependOnceListener_unpipe, removeListener_close, removeListener_drain, removeListener_error, removeListener_finish, removeListener_pipe, removeListener_unpipe, setDefaultEncoding, uncork, write, write, write, write
  - typingsJapgolly.streamMock.ireadablemockMod.IReadableMock because var conflicts: destroyed, readable. Inlined it
  - typingsJapgolly.streamMock.iwritablemockMod.IWritableMock because Inheritance from two classes. Inlined data, flatData */ @js.native
  trait DuplexMock extends Duplex {
    var _readableState: js.Any = js.native
    var _writableState: js.Any = js.native
    var data: js.Array[_] | Buffer = js.native
    var encoding: BufferEncoding = js.native
    var flatData: js.Array[_] | Buffer = js.native
    var it: IterableIterator[_] = js.native
    var objectMode: Boolean = js.native
  }
  
  @js.native
  class default () extends DuplexMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: DuplexOptions) = this()
    def this(source: js.Iterable[_], options: DuplexOptions) = this()
  }
  
}


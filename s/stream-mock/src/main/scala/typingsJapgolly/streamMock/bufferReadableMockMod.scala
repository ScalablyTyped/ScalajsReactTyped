package typingsJapgolly.streamMock

import typingsJapgolly.node.BufferEncoding
import typingsJapgolly.node.streamMod.ReadableOptions
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.streamMock.ireadablemockMod.IReadableMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/readable/BufferReadableMock", JSImport.Namespace)
@js.native
object bufferReadableMockMod extends js.Object {
  @js.native
  trait BufferReadableMock extends IReadableMock {
    var encoding: BufferEncoding = js.native
    def _read(): Unit = js.native
  }
  
  @js.native
  class default protected () extends BufferReadableMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
  }
  
}


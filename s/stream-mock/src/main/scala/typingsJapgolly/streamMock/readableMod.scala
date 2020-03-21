package typingsJapgolly.streamMock

import typingsJapgolly.node.streamMod.ReadableOptions
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.streamMock.bufferReadableMockMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/readable", JSImport.Namespace)
@js.native
object readableMod extends js.Object {
  @js.native
  class BufferReadableMock protected () extends default {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
  }
  
  @js.native
  class ObjectReadableMock protected ()
    extends typingsJapgolly.streamMock.objectReadableMockMod.default {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
  }
  
  @js.native
  class ReadableMock protected ()
    extends typingsJapgolly.streamMock.readableMockMod.default {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
  }
  
}


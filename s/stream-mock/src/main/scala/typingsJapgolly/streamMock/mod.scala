package typingsJapgolly.streamMock

import typingsJapgolly.node.streamMod.DuplexOptions
import typingsJapgolly.node.streamMod.ReadableOptions
import typingsJapgolly.node.streamMod.WritableOptions
import typingsJapgolly.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BufferReadableMock protected ()
    extends typingsJapgolly.streamMock.readableMod.BufferReadableMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
  }
  
  @js.native
  class BufferWritableMock ()
    extends typingsJapgolly.streamMock.writableMod.BufferWritableMock {
    def this(options: WritableOptions) = this()
  }
  
  @js.native
  class DuplexMock ()
    extends typingsJapgolly.streamMock.duplexMod.DuplexMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: DuplexOptions) = this()
    def this(source: js.Iterable[_], options: DuplexOptions) = this()
  }
  
  @js.native
  class ObjectReadableMock protected ()
    extends typingsJapgolly.streamMock.readableMod.ObjectReadableMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
  }
  
  @js.native
  class ObjectWritableMock ()
    extends typingsJapgolly.streamMock.writableMod.ObjectWritableMock {
    def this(options: WritableOptions) = this()
  }
  
  @js.native
  class ReadableMock protected ()
    extends typingsJapgolly.streamMock.readableMod.ReadableMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
  }
  
  @js.native
  class WritableMock ()
    extends typingsJapgolly.streamMock.writableMod.WritableMock {
    def this(options: WritableOptions) = this()
  }
  
}


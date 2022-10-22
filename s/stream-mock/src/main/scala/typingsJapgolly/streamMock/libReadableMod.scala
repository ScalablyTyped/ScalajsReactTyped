package typingsJapgolly.streamMock

import typingsJapgolly.node.streamMod.ReadableOptions
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.streamMock.libReadableBufferReadableMockMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReadableMod {
  
  @JSImport("stream-mock/lib/readable", "BufferReadableMock")
  @js.native
  open class BufferReadableMock protected () extends default {
    def this(source: js.Iterable[Any]) = this()
    def this(source: ArrayLike[Any]) = this()
    def this(source: js.Iterable[Any], options: ReadableOptions) = this()
    def this(source: ArrayLike[Any], options: ReadableOptions) = this()
  }
  
  @JSImport("stream-mock/lib/readable", "ObjectReadableMock")
  @js.native
  open class ObjectReadableMock protected ()
    extends typingsJapgolly.streamMock.libReadableObjectReadableMockMod.default {
    def this(source: js.Iterable[Any]) = this()
    def this(source: ArrayLike[Any]) = this()
    def this(source: js.Iterable[Any], options: ReadableOptions) = this()
    def this(source: ArrayLike[Any], options: ReadableOptions) = this()
  }
  
  @JSImport("stream-mock/lib/readable", "ReadableMock")
  @js.native
  open class ReadableMock protected ()
    extends typingsJapgolly.streamMock.libReadableReadableMockMod.default {
    def this(source: js.Iterable[Any]) = this()
    def this(source: ArrayLike[Any]) = this()
    def this(source: js.Iterable[Any], options: ReadableOptions) = this()
    def this(source: ArrayLike[Any], options: ReadableOptions) = this()
  }
}

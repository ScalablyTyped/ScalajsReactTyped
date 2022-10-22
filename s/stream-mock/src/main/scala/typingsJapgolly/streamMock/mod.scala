package typingsJapgolly.streamMock

import typingsJapgolly.node.streamMod.DuplexOptions
import typingsJapgolly.node.streamMod.ReadableOptions
import typingsJapgolly.node.streamMod.WritableOptions
import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stream-mock", "BufferReadableMock")
  @js.native
  open class BufferReadableMock protected ()
    extends typingsJapgolly.streamMock.libReadableMod.BufferReadableMock {
    def this(source: js.Iterable[Any]) = this()
    def this(source: ArrayLike[Any]) = this()
    def this(source: js.Iterable[Any], options: ReadableOptions) = this()
    def this(source: ArrayLike[Any], options: ReadableOptions) = this()
  }
  
  @JSImport("stream-mock", "BufferWritableMock")
  @js.native
  open class BufferWritableMock ()
    extends typingsJapgolly.streamMock.libWritableMod.BufferWritableMock {
    def this(options: WritableOptions) = this()
  }
  
  @JSImport("stream-mock", "DuplexMock")
  @js.native
  open class DuplexMock ()
    extends typingsJapgolly.streamMock.libDuplexMod.DuplexMock {
    def this(source: js.Iterable[Any]) = this()
    def this(source: ArrayLike[Any]) = this()
    def this(source: js.Iterable[Any], options: DuplexOptions) = this()
    def this(source: Unit, options: DuplexOptions) = this()
    def this(source: ArrayLike[Any], options: DuplexOptions) = this()
  }
  
  @JSImport("stream-mock", "ObjectReadableMock")
  @js.native
  open class ObjectReadableMock protected ()
    extends typingsJapgolly.streamMock.libReadableMod.ObjectReadableMock {
    def this(source: js.Iterable[Any]) = this()
    def this(source: ArrayLike[Any]) = this()
    def this(source: js.Iterable[Any], options: ReadableOptions) = this()
    def this(source: ArrayLike[Any], options: ReadableOptions) = this()
  }
  
  @JSImport("stream-mock", "ObjectWritableMock")
  @js.native
  open class ObjectWritableMock ()
    extends typingsJapgolly.streamMock.libWritableMod.ObjectWritableMock {
    def this(options: WritableOptions) = this()
  }
  
  @JSImport("stream-mock", "ReadableMock")
  @js.native
  open class ReadableMock protected ()
    extends typingsJapgolly.streamMock.libReadableMod.ReadableMock {
    def this(source: js.Iterable[Any]) = this()
    def this(source: ArrayLike[Any]) = this()
    def this(source: js.Iterable[Any], options: ReadableOptions) = this()
    def this(source: ArrayLike[Any], options: ReadableOptions) = this()
  }
  
  @JSImport("stream-mock", "WritableMock")
  @js.native
  open class WritableMock ()
    extends typingsJapgolly.streamMock.libWritableMod.WritableMock {
    def this(options: WritableOptions) = this()
  }
}

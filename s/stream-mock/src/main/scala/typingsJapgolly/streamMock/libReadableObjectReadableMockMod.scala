package typingsJapgolly.streamMock

import typingsJapgolly.node.streamMod.ReadableOptions
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.streamMock.libReadableIreadablemockMod.IReadableMock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReadableObjectReadableMockMod {
  
  @JSImport("stream-mock/lib/readable/ObjectReadableMock", JSImport.Default)
  @js.native
  open class default protected () extends ObjectReadableMock {
    def this(source: js.Iterable[Any]) = this()
    def this(source: ArrayLike[Any]) = this()
    def this(source: js.Iterable[Any], options: ReadableOptions) = this()
    def this(source: ArrayLike[Any], options: ReadableOptions) = this()
  }
  
  @js.native
  trait ObjectReadableMock extends IReadableMock {
    
    def _read(): Unit = js.native
  }
}

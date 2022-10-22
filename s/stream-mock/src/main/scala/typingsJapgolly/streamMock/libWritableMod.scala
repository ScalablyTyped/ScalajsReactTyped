package typingsJapgolly.streamMock

import typingsJapgolly.node.streamMod.WritableOptions
import typingsJapgolly.streamMock.libWritableBufferWritableMockMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWritableMod {
  
  @JSImport("stream-mock/lib/writable", "BufferWritableMock")
  @js.native
  open class BufferWritableMock () extends default {
    def this(options: WritableOptions) = this()
  }
  
  @JSImport("stream-mock/lib/writable", "ObjectWritableMock")
  @js.native
  open class ObjectWritableMock ()
    extends typingsJapgolly.streamMock.libWritableObjectWritableMockMod.default {
    def this(options: WritableOptions) = this()
  }
  
  @JSImport("stream-mock/lib/writable", "WritableMock")
  @js.native
  open class WritableMock ()
    extends typingsJapgolly.streamMock.libWritableWritableMockMod.default {
    def this(options: WritableOptions) = this()
  }
}

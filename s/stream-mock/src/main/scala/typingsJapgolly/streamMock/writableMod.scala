package typingsJapgolly.streamMock

import typingsJapgolly.node.streamMod.WritableOptions
import typingsJapgolly.streamMock.bufferWritableMockMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/writable", JSImport.Namespace)
@js.native
object writableMod extends js.Object {
  @js.native
  class BufferWritableMock () extends default {
    def this(options: WritableOptions) = this()
  }
  
  @js.native
  class ObjectWritableMock ()
    extends typingsJapgolly.streamMock.objectWritableMockMod.default {
    def this(options: WritableOptions) = this()
  }
  
  @js.native
  class WritableMock ()
    extends typingsJapgolly.streamMock.writableMockMod.default {
    def this(options: WritableOptions) = this()
  }
  
}


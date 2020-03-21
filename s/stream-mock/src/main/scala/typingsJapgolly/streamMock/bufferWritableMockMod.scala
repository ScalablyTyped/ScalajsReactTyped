package typingsJapgolly.streamMock

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.BufferEncoding
import typingsJapgolly.node.streamMod.WritableOptions
import typingsJapgolly.streamMock.iwritablemockMod.IWritableMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/writable/BufferWritableMock", JSImport.Namespace)
@js.native
object bufferWritableMockMod extends js.Object {
  @js.native
  trait BufferWritableMock extends IWritableMock {
    @JSName("data")
    var data_BufferWritableMock: js.Array[Buffer] = js.native
    @JSName("flatData")
    var flatData_BufferWritableMock: Buffer = js.native
    def _write(
      chunk: String,
      encoding: BufferEncoding,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def _write(
      chunk: Buffer,
      encoding: BufferEncoding,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
  }
  
  @js.native
  class default () extends BufferWritableMock {
    def this(options: WritableOptions) = this()
  }
  
}


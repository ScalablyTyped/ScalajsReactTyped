package typingsJapgolly.streamMock

import typingsJapgolly.node.BufferEncoding
import typingsJapgolly.node.streamMod.WritableOptions
import typingsJapgolly.streamMock.iwritablemockMod.IWritableMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/writable/ObjectWritableMock", JSImport.Namespace)
@js.native
object objectWritableMockMod extends js.Object {
  @js.native
  trait ObjectWritableMock extends IWritableMock {
    @JSName("data")
    var data_ObjectWritableMock: js.Array[_] = js.native
    @JSName("flatData")
    var flatData_ObjectWritableMock: js.Array[_] = js.native
    def _write(
      chunk: js.Any,
      _encoding: BufferEncoding,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
  }
  
  @js.native
  class default () extends ObjectWritableMock {
    def this(options: WritableOptions) = this()
  }
  
}


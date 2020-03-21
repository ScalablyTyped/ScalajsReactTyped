package typingsJapgolly.streamMock

import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/readable/IReadableMock", JSImport.Namespace)
@js.native
object ireadablemockMod extends js.Object {
  @js.native
  trait IReadableMock extends Readable {
    var it: IterableIterator[_] = js.native
  }
  
}


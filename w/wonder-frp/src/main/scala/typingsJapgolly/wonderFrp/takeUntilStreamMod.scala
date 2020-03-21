package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.baseStreamMod.BaseStream
import typingsJapgolly.wonderFrp.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/TakeUntilStream", JSImport.Namespace)
@js.native
object takeUntilStreamMod extends js.Object {
  @js.native
  class TakeUntilStream protected () extends BaseStream {
    def this(source: Stream, otherStream: Stream) = this()
    var _otherStream: js.Any = js.native
    var _source: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object TakeUntilStream extends js.Object {
    def create(source: Stream, otherSteam: Stream): TakeUntilStream = js.native
  }
  
}


package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.baseStreamMod.BaseStream
import typingsJapgolly.wonderFrp.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/DoStream", JSImport.Namespace)
@js.native
object doStreamMod extends js.Object {
  @js.native
  class DoStream protected () extends BaseStream {
    def this(source: Stream, onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
    var _observer: js.Any = js.native
    var _source: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object DoStream extends js.Object {
    def create(source: Stream): DoStream = js.native
    def create(source: Stream, onNext: js.Function): DoStream = js.native
    def create(source: Stream, onNext: js.Function, onError: js.Function): DoStream = js.native
    def create(source: Stream, onNext: js.Function, onError: js.Function, onCompleted: js.Function): DoStream = js.native
  }
  
}


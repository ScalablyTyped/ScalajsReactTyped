package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.coreStreamMod.Stream
import typingsJapgolly.wonderFrp.streamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/IgnoreElementsStream", JSImport.Namespace)
@js.native
object streamIgnoreElementsStreamMod extends js.Object {
  @js.native
  class IgnoreElementsStream protected () extends BaseStream {
    def this(source: Stream) = this()
    var _source: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object IgnoreElementsStream extends js.Object {
    def create(source: Stream): IgnoreElementsStream = js.native
  }
  
}


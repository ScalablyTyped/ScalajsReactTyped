package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.baseStreamMod.BaseStream
import typingsJapgolly.wonderFrp.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/ConcatStream", JSImport.Namespace)
@js.native
object concatStreamMod extends js.Object {
  @js.native
  class ConcatStream protected () extends BaseStream {
    def this(sources: js.Array[Stream]) = this()
    var _sources: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object ConcatStream extends js.Object {
    def create(sources: js.Array[Stream]): ConcatStream = js.native
  }
  
}


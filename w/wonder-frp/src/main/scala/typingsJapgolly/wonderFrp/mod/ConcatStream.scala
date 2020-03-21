package typingsJapgolly.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "ConcatStream")
@js.native
class ConcatStream protected ()
  extends typingsJapgolly.wonderFrp.concatStreamMod.ConcatStream {
  def this(sources: js.Array[typingsJapgolly.wonderFrp.streamMod.Stream]) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "ConcatStream")
@js.native
object ConcatStream extends js.Object {
  def create(sources: js.Array[typingsJapgolly.wonderFrp.streamMod.Stream]): typingsJapgolly.wonderFrp.concatStreamMod.ConcatStream = js.native
}


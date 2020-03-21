package typingsJapgolly.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "RepeatStream")
@js.native
class RepeatStream protected ()
  extends typingsJapgolly.wonderFrp.repeatStreamMod.RepeatStream {
  def this(source: typingsJapgolly.wonderFrp.streamMod.Stream, count: Double) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "RepeatStream")
@js.native
object RepeatStream extends js.Object {
  def create(source: typingsJapgolly.wonderFrp.streamMod.Stream, count: Double): typingsJapgolly.wonderFrp.repeatStreamMod.RepeatStream = js.native
}


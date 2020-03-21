package typingsJapgolly.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MergeStream")
@js.native
class MergeStream protected ()
  extends typingsJapgolly.wonderFrp.mergeStreamMod.MergeStream {
  def this(source: typingsJapgolly.wonderFrp.streamMod.Stream, maxConcurrent: Double) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MergeStream")
@js.native
object MergeStream extends js.Object {
  def create(source: typingsJapgolly.wonderFrp.streamMod.Stream, maxConcurrent: Double): typingsJapgolly.wonderFrp.mergeStreamMod.MergeStream = js.native
}


package typingsJapgolly.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "SkipUntilStream")
@js.native
class SkipUntilStream protected ()
  extends typingsJapgolly.wonderFrp.skipUntilStreamMod.SkipUntilStream {
  def this(
    source: typingsJapgolly.wonderFrp.streamMod.Stream,
    otherStream: typingsJapgolly.wonderFrp.streamMod.Stream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "SkipUntilStream")
@js.native
object SkipUntilStream extends js.Object {
  def create(
    source: typingsJapgolly.wonderFrp.streamMod.Stream,
    otherSteam: typingsJapgolly.wonderFrp.streamMod.Stream
  ): typingsJapgolly.wonderFrp.skipUntilStreamMod.SkipUntilStream = js.native
}


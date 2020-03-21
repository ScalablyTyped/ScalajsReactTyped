package typingsJapgolly.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "TakeUntilStream")
@js.native
class TakeUntilStream protected ()
  extends typingsJapgolly.wonderFrp.takeUntilStreamMod.TakeUntilStream {
  def this(
    source: typingsJapgolly.wonderFrp.streamMod.Stream,
    otherStream: typingsJapgolly.wonderFrp.streamMod.Stream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "TakeUntilStream")
@js.native
object TakeUntilStream extends js.Object {
  def create(
    source: typingsJapgolly.wonderFrp.streamMod.Stream,
    otherSteam: typingsJapgolly.wonderFrp.streamMod.Stream
  ): typingsJapgolly.wonderFrp.takeUntilStreamMod.TakeUntilStream = js.native
}


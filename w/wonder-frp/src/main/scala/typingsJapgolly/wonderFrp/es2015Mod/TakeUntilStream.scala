package typingsJapgolly.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "TakeUntilStream")
@js.native
class TakeUntilStream protected ()
  extends typingsJapgolly.wonderFrp.streamTakeUntilStreamMod.TakeUntilStream {
  def this(
    source: typingsJapgolly.wonderFrp.coreStreamMod.Stream,
    otherStream: typingsJapgolly.wonderFrp.coreStreamMod.Stream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "TakeUntilStream")
@js.native
object TakeUntilStream extends js.Object {
  def create(
    source: typingsJapgolly.wonderFrp.coreStreamMod.Stream,
    otherSteam: typingsJapgolly.wonderFrp.coreStreamMod.Stream
  ): typingsJapgolly.wonderFrp.streamTakeUntilStreamMod.TakeUntilStream = js.native
}


package typingsJapgolly.wonderFrp.mod

import typingsJapgolly.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "SkipUntilSourceObserver")
@js.native
class SkipUntilSourceObserver protected ()
  extends typingsJapgolly.wonderFrp.skipUntilSourceObserverMod.SkipUntilSourceObserver {
  def this(
    prevObserver: IObserver,
    skipUntilStream: typingsJapgolly.wonderFrp.skipUntilStreamMod.SkipUntilStream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "SkipUntilSourceObserver")
@js.native
object SkipUntilSourceObserver extends js.Object {
  def create(
    prevObserver: IObserver,
    skipUntilStream: typingsJapgolly.wonderFrp.skipUntilStreamMod.SkipUntilStream
  ): typingsJapgolly.wonderFrp.skipUntilSourceObserverMod.SkipUntilSourceObserver = js.native
}


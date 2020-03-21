package typingsJapgolly.wonderFrp.mod

import typingsJapgolly.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "SkipUntilOtherObserver")
@js.native
class SkipUntilOtherObserver protected ()
  extends typingsJapgolly.wonderFrp.skipUntilOtherObserverMod.SkipUntilOtherObserver {
  def this(
    prevObserver: IObserver,
    skipUntilStream: typingsJapgolly.wonderFrp.skipUntilStreamMod.SkipUntilStream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "SkipUntilOtherObserver")
@js.native
object SkipUntilOtherObserver extends js.Object {
  def create(
    prevObserver: IObserver,
    skipUntilStream: typingsJapgolly.wonderFrp.skipUntilStreamMod.SkipUntilStream
  ): typingsJapgolly.wonderFrp.skipUntilOtherObserverMod.SkipUntilOtherObserver = js.native
}


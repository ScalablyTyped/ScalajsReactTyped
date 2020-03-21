package typingsJapgolly.wonderFrp.es2015Mod

import typingsJapgolly.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "SkipUntilOtherObserver")
@js.native
class SkipUntilOtherObserver protected ()
  extends typingsJapgolly.wonderFrp.observerSkipUntilOtherObserverMod.SkipUntilOtherObserver {
  def this(
    prevObserver: IObserver,
    skipUntilStream: typingsJapgolly.wonderFrp.streamSkipUntilStreamMod.SkipUntilStream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "SkipUntilOtherObserver")
@js.native
object SkipUntilOtherObserver extends js.Object {
  def create(
    prevObserver: IObserver,
    skipUntilStream: typingsJapgolly.wonderFrp.streamSkipUntilStreamMod.SkipUntilStream
  ): typingsJapgolly.wonderFrp.observerSkipUntilOtherObserverMod.SkipUntilOtherObserver = js.native
}


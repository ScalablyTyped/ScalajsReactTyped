package typingsJapgolly.wonderFrp.mod

import typingsJapgolly.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "TakeUntilObserver")
@js.native
class TakeUntilObserver protected ()
  extends typingsJapgolly.wonderFrp.takeUntilObserverMod.TakeUntilObserver {
  def this(prevObserver: IObserver) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "TakeUntilObserver")
@js.native
object TakeUntilObserver extends js.Object {
  def create(prevObserver: IObserver): typingsJapgolly.wonderFrp.takeUntilObserverMod.TakeUntilObserver = js.native
}


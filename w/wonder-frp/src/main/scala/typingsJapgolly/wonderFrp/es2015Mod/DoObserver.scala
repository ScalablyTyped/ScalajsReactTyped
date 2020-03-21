package typingsJapgolly.wonderFrp.es2015Mod

import typingsJapgolly.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "DoObserver")
@js.native
class DoObserver protected ()
  extends typingsJapgolly.wonderFrp.observerDoObserverMod.DoObserver {
  def this(currentObserver: IObserver, prevObserver: IObserver) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "DoObserver")
@js.native
object DoObserver extends js.Object {
  def create(currentObserver: IObserver, prevObserver: IObserver): typingsJapgolly.wonderFrp.observerDoObserverMod.DoObserver = js.native
}


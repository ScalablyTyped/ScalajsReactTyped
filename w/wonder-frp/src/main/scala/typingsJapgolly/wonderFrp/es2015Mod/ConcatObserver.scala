package typingsJapgolly.wonderFrp.es2015Mod

import typingsJapgolly.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "ConcatObserver")
@js.native
class ConcatObserver protected ()
  extends typingsJapgolly.wonderFrp.observerConcatObserverMod.ConcatObserver {
  def this(currentObserver: IObserver, startNextStream: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "ConcatObserver")
@js.native
object ConcatObserver extends js.Object {
  def create(currentObserver: IObserver, startNextStream: js.Function): typingsJapgolly.wonderFrp.observerConcatObserverMod.ConcatObserver = js.native
}


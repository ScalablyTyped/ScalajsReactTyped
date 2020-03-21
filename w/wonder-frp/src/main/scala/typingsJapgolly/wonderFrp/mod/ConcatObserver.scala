package typingsJapgolly.wonderFrp.mod

import typingsJapgolly.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "ConcatObserver")
@js.native
class ConcatObserver protected ()
  extends typingsJapgolly.wonderFrp.concatObserverMod.ConcatObserver {
  def this(currentObserver: IObserver, startNextStream: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "ConcatObserver")
@js.native
object ConcatObserver extends js.Object {
  def create(currentObserver: IObserver, startNextStream: js.Function): typingsJapgolly.wonderFrp.concatObserverMod.ConcatObserver = js.native
}


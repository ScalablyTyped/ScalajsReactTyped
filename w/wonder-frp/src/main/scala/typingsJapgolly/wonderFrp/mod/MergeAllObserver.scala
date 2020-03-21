package typingsJapgolly.wonderFrp.mod

import typingsJapgolly.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MergeAllObserver")
@js.native
class MergeAllObserver protected ()
  extends typingsJapgolly.wonderFrp.mergeAllObserverMod.MergeAllObserver {
  def this(
    currentObserver: IObserver,
    groupDisposable: typingsJapgolly.wonderFrp.groupDisposableMod.GroupDisposable
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MergeAllObserver")
@js.native
object MergeAllObserver extends js.Object {
  def create(
    currentObserver: IObserver,
    groupDisposable: typingsJapgolly.wonderFrp.groupDisposableMod.GroupDisposable
  ): typingsJapgolly.wonderFrp.mergeAllObserverMod.MergeAllObserver = js.native
}


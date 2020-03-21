package typingsJapgolly.wonderFrp.es2015Mod

import typingsJapgolly.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "MergeAllObserver")
@js.native
class MergeAllObserver protected ()
  extends typingsJapgolly.wonderFrp.observerMergeAllObserverMod.MergeAllObserver {
  def this(
    currentObserver: IObserver,
    groupDisposable: typingsJapgolly.wonderFrp.disposableGroupDisposableMod.GroupDisposable
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "MergeAllObserver")
@js.native
object MergeAllObserver extends js.Object {
  def create(
    currentObserver: IObserver,
    groupDisposable: typingsJapgolly.wonderFrp.disposableGroupDisposableMod.GroupDisposable
  ): typingsJapgolly.wonderFrp.observerMergeAllObserverMod.MergeAllObserver = js.native
}


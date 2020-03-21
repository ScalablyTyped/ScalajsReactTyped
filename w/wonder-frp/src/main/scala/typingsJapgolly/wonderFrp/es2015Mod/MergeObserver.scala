package typingsJapgolly.wonderFrp.es2015Mod

import typingsJapgolly.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "MergeObserver")
@js.native
class MergeObserver protected ()
  extends typingsJapgolly.wonderFrp.observerMergeObserverMod.MergeObserver {
  def this(
    currentObserver: IObserver,
    maxConcurrent: Double,
    groupDisposable: typingsJapgolly.wonderFrp.disposableGroupDisposableMod.GroupDisposable
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "MergeObserver")
@js.native
object MergeObserver extends js.Object {
  def create(
    currentObserver: IObserver,
    maxConcurrent: Double,
    groupDisposable: typingsJapgolly.wonderFrp.disposableGroupDisposableMod.GroupDisposable
  ): typingsJapgolly.wonderFrp.observerMergeObserverMod.MergeObserver = js.native
}


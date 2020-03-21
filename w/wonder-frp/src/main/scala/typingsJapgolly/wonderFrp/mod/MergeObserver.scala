package typingsJapgolly.wonderFrp.mod

import typingsJapgolly.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MergeObserver")
@js.native
class MergeObserver protected ()
  extends typingsJapgolly.wonderFrp.mergeObserverMod.MergeObserver {
  def this(
    currentObserver: IObserver,
    maxConcurrent: Double,
    groupDisposable: typingsJapgolly.wonderFrp.groupDisposableMod.GroupDisposable
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MergeObserver")
@js.native
object MergeObserver extends js.Object {
  def create(
    currentObserver: IObserver,
    maxConcurrent: Double,
    groupDisposable: typingsJapgolly.wonderFrp.groupDisposableMod.GroupDisposable
  ): typingsJapgolly.wonderFrp.mergeObserverMod.MergeObserver = js.native
}


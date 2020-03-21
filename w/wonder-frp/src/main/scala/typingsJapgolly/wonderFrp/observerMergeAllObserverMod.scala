package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.coreObserverMod.Observer
import typingsJapgolly.wonderFrp.disposableGroupDisposableMod.GroupDisposable
import typingsJapgolly.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/MergeAllObserver", JSImport.Namespace)
@js.native
object observerMergeAllObserverMod extends js.Object {
  @js.native
  class MergeAllObserver protected () extends Observer {
    def this(currentObserver: IObserver, groupDisposable: GroupDisposable) = this()
    var _groupDisposable: js.Any = js.native
    var currentObserver: IObserver = js.native
    var done: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MergeAllObserver extends js.Object {
    def create(currentObserver: IObserver, groupDisposable: GroupDisposable): MergeAllObserver = js.native
  }
  
}


package typingsJapgolly.wonderFrp.distCommonjsMod

import typingsJapgolly.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "MergeAllObserver")
@js.native
open class MergeAllObserver protected ()
  extends typingsJapgolly.wonderFrp.distCommonjsObserverMergeAllObserverMod.MergeAllObserver {
  def this(
    currentObserver: IObserver,
    groupDisposable: typingsJapgolly.wonderFrp.distCommonjsDisposableGroupDisposableMod.GroupDisposable
  ) = this()
}
/* static members */
object MergeAllObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "MergeAllObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    currentObserver: IObserver,
    groupDisposable: typingsJapgolly.wonderFrp.distCommonjsDisposableGroupDisposableMod.GroupDisposable
  ): typingsJapgolly.wonderFrp.distCommonjsObserverMergeAllObserverMod.MergeAllObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(currentObserver.asInstanceOf[js.Any], groupDisposable.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsObserverMergeAllObserverMod.MergeAllObserver]
}

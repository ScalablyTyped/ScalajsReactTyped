package typingsJapgolly.wonderFrp.es2015Mod

import typingsJapgolly.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "FilterObserver")
@js.native
class FilterObserver protected ()
  extends typingsJapgolly.wonderFrp.observerFilterObserverMod.FilterObserver {
  def this(
    prevObserver: IObserver,
    predicate: js.Function1[/* value */ js.Any, Boolean],
    source: typingsJapgolly.wonderFrp.coreStreamMod.Stream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "FilterObserver")
@js.native
object FilterObserver extends js.Object {
  def create(
    prevObserver: IObserver,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typingsJapgolly.wonderFrp.coreStreamMod.Stream], 
      Boolean
    ],
    source: typingsJapgolly.wonderFrp.coreStreamMod.Stream
  ): typingsJapgolly.wonderFrp.observerFilterObserverMod.FilterObserver = js.native
}


package typingsJapgolly.wonderFrp.mod

import typingsJapgolly.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "FilterWithStateObserver")
@js.native
class FilterWithStateObserver ()
  extends typingsJapgolly.wonderFrp.filterWithStateObserverMod.FilterWithStateObserver

/* static members */
@JSImport("wonder-frp/dist/commonjs", "FilterWithStateObserver")
@js.native
object FilterWithStateObserver extends js.Object {
  def create(
    prevObserver: IObserver,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typingsJapgolly.wonderFrp.streamMod.Stream], 
      Boolean
    ],
    source: typingsJapgolly.wonderFrp.streamMod.Stream
  ): typingsJapgolly.wonderFrp.filterWithStateObserverMod.FilterWithStateObserver = js.native
}


package typingsJapgolly.wonderFrp.mod

import typingsJapgolly.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MapObserver")
@js.native
class MapObserver protected ()
  extends typingsJapgolly.wonderFrp.mapObserverMod.MapObserver {
  def this(currentObserver: IObserver, selector: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MapObserver")
@js.native
object MapObserver extends js.Object {
  def create(currentObserver: IObserver, selector: js.Function): typingsJapgolly.wonderFrp.mapObserverMod.MapObserver = js.native
}


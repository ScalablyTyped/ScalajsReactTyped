package typingsJapgolly.wonderFrp.es2015Mod

import typingsJapgolly.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "MapObserver")
@js.native
class MapObserver protected ()
  extends typingsJapgolly.wonderFrp.observerMapObserverMod.MapObserver {
  def this(currentObserver: IObserver, selector: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "MapObserver")
@js.native
object MapObserver extends js.Object {
  def create(currentObserver: IObserver, selector: js.Function): typingsJapgolly.wonderFrp.observerMapObserverMod.MapObserver = js.native
}


package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.coreObserverMod.Observer
import typingsJapgolly.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/MapObserver", JSImport.Namespace)
@js.native
object observerMapObserverMod extends js.Object {
  @js.native
  class MapObserver protected () extends Observer {
    def this(currentObserver: IObserver, selector: js.Function) = this()
    var _currentObserver: js.Any = js.native
    var _selector: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object MapObserver extends js.Object {
    def create(currentObserver: IObserver, selector: js.Function): MapObserver = js.native
  }
  
}


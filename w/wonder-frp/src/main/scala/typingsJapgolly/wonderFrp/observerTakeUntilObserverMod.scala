package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.coreObserverMod.Observer
import typingsJapgolly.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/TakeUntilObserver", JSImport.Namespace)
@js.native
object observerTakeUntilObserverMod extends js.Object {
  @js.native
  class TakeUntilObserver protected () extends Observer {
    def this(prevObserver: IObserver) = this()
    var _prevObserver: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object TakeUntilObserver extends js.Object {
    def create(prevObserver: IObserver): TakeUntilObserver = js.native
  }
  
}


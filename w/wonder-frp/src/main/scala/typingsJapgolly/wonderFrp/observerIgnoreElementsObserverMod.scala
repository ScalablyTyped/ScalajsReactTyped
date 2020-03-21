package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.coreObserverMod.Observer
import typingsJapgolly.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/observer/IgnoreElementsObserver", JSImport.Namespace)
@js.native
object observerIgnoreElementsObserverMod extends js.Object {
  @js.native
  class IgnoreElementsObserver protected () extends Observer {
    def this(currentObserver: IObserver) = this()
    var _currentObserver: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object IgnoreElementsObserver extends js.Object {
    def create(currentObserver: IObserver): IgnoreElementsObserver = js.native
  }
  
}


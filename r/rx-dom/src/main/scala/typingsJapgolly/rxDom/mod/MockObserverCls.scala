package typingsJapgolly.rxDom.mod

import typingsJapgolly.rxCore.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "MockObserverCls")
@js.native
class MockObserverCls[T] protected ()
  extends typingsJapgolly.rx.mod.MockObserverCls[T] {
  def this(scheduler: IScheduler) = this()
}


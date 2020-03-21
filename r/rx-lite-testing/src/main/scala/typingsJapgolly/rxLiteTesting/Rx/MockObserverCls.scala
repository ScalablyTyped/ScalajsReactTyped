package typingsJapgolly.rxLiteTesting.Rx

import typingsJapgolly.rxCore.Rx.IScheduler
import typingsJapgolly.rxCore.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.MockObserver")
@js.native
class MockObserverCls[T] protected () extends MockObserver[T] {
  def this(scheduler: IScheduler) = this()
  /* CompleteClass */
  override var messages: js.Array[Recorded] = js.native
  /* CompleteClass */
  override def checked(): Observer[_] = js.native
}


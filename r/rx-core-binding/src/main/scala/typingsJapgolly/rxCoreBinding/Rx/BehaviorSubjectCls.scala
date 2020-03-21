package typingsJapgolly.rxCoreBinding.Rx

import typingsJapgolly.rxCore.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.BehaviorSubject")
@js.native
class BehaviorSubjectCls[T] protected () extends BehaviorSubject[T] {
  def this(initialValue: T) = this()
  /* CompleteClass */
  override def checked(): Observer[_] = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
}


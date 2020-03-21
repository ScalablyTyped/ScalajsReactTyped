package typingsJapgolly.rxCoreBinding.mod

import typingsJapgolly.rxCore.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-core-binding", "BehaviorSubject")
@js.native
class BehaviorSubjectCls[T] protected ()
  extends typingsJapgolly.rxCoreBinding.Rx.BehaviorSubject[T] {
  def this(initialValue: T) = this()
  /* CompleteClass */
  override def checked(): Observer[_] = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
}


package typingsJapgolly.rxCoreBinding.mod

import typingsJapgolly.rxCore.Rx.IScheduler
import typingsJapgolly.rxCore.Rx.Observer
import typingsJapgolly.rxCoreBinding.Rx.ISubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-core-binding", "ReplaySubject")
@js.native
class ReplaySubjectCls[T] () extends ISubject[T] {
  def this(bufferSize: Double) = this()
  def this(bufferSize: Double, window: Double) = this()
  def this(bufferSize: Double, window: Double, scheduler: IScheduler) = this()
  /* CompleteClass */
  override def checked(): Observer[_] = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
}


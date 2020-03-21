package typingsJapgolly.rx.mod

import typingsJapgolly.rxCore.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "ReplaySubjectCls")
@js.native
class ReplaySubjectCls[T] ()
  extends typingsJapgolly.rxCoreBinding.Rx.ReplaySubjectCls[T] {
  def this(bufferSize: Double) = this()
  def this(bufferSize: Double, window: Double) = this()
  def this(bufferSize: Double, window: Double, scheduler: IScheduler) = this()
}


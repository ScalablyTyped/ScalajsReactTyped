package typingsJapgolly.rxDom.mod

import typingsJapgolly.rxCore.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "ReplaySubjectCls")
@js.native
class ReplaySubjectCls[T] ()
  extends typingsJapgolly.rx.mod.ReplaySubjectCls[T] {
  def this(bufferSize: Double) = this()
  def this(bufferSize: Double, window: Double) = this()
  def this(bufferSize: Double, window: Double, scheduler: IScheduler) = this()
}


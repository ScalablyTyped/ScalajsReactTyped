package typingsJapgolly.rxjs.timeIntervalMod

import typingsJapgolly.rxjs.typesMod.OperatorFunction
import typingsJapgolly.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/timeInterval", "timeInterval")
@js.native
object timeInterval extends js.Object {
  def apply[T](): OperatorFunction[T, TimeInterval_[T]] = js.native
  def apply[T](scheduler: SchedulerLike): OperatorFunction[T, TimeInterval_[T]] = js.native
}


package typingsJapgolly.rxjs.timestampMod

import typingsJapgolly.rxjs.typesMod.OperatorFunction
import typingsJapgolly.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/timestamp", "timestamp")
@js.native
object timestamp extends js.Object {
  def apply[T](): OperatorFunction[T, Timestamp_[T]] = js.native
  def apply[T](scheduler: SchedulerLike): OperatorFunction[T, Timestamp_[T]] = js.native
}


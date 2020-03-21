package typingsJapgolly.rxjs.mod

import typingsJapgolly.rxjs.typesMod.ObservableInput
import typingsJapgolly.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "scheduled")
@js.native
object scheduled extends js.Object {
  def apply[T](input: ObservableInput[T], scheduler: SchedulerLike): Observable_[T] = js.native
}


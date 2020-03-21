package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.mod.Observable_
import typingsJapgolly.rxjs.typesMod.ObservableInput
import typingsJapgolly.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduled/scheduled", JSImport.Namespace)
@js.native
object scheduledMod extends js.Object {
  def scheduled[T](input: ObservableInput[T], scheduler: SchedulerLike): Observable_[T] = js.native
}


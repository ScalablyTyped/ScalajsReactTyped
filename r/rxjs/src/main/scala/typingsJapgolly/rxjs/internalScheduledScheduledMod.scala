package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalTypesMod.ObservableInput
import typingsJapgolly.rxjs.internalTypesMod.SchedulerLike
import typingsJapgolly.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduled/scheduled", JSImport.Namespace)
@js.native
object internalScheduledScheduledMod extends js.Object {
  def scheduled[T](input: ObservableInput[T], scheduler: SchedulerLike): Observable[T] = js.native
}


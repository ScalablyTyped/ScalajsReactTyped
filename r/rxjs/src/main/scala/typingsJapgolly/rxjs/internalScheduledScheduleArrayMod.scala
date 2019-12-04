package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.internalTypesMod.SchedulerLike
import typingsJapgolly.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduled/scheduleArray", JSImport.Namespace)
@js.native
object internalScheduledScheduleArrayMod extends js.Object {
  def scheduleArray[T](input: ArrayLike[T], scheduler: SchedulerLike): Observable[T] = js.native
}


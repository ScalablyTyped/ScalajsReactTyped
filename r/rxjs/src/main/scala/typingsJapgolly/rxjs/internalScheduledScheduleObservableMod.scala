package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.internalTypesMod.InteropObservable
import typingsJapgolly.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduled/scheduleObservable", JSImport.Namespace)
@js.native
object internalScheduledScheduleObservableMod extends js.Object {
  def scheduleObservable[T](input: InteropObservable[T], scheduler: SchedulerLike): Observable[T] = js.native
}


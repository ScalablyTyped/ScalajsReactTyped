package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduled/scheduleIterable", JSImport.Namespace)
@js.native
object scheduleIterableMod extends js.Object {
  def scheduleIterable[T](input: js.Iterable[T], scheduler: SchedulerLike): Observable[T] = js.native
}


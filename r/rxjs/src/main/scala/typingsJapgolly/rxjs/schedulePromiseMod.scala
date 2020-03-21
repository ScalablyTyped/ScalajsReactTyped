package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduled/schedulePromise", JSImport.Namespace)
@js.native
object schedulePromiseMod extends js.Object {
  def schedulePromise[T](input: js.Thenable[T], scheduler: SchedulerLike): Observable[T] = js.native
}


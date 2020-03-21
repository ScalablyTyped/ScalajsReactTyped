package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/fromPromise", JSImport.Namespace)
@js.native
object fromPromiseMod extends js.Object {
  def fromPromise[T](input: js.Thenable[T]): Observable[T] = js.native
  def fromPromise[T](input: js.Thenable[T], scheduler: SchedulerLike): Observable[T] = js.native
}


package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.internalTypesMod.SchedulerLike
import typingsJapgolly.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/fromArray", JSImport.Namespace)
@js.native
object internalObservableFromArrayMod extends js.Object {
  def fromArray[T](input: ArrayLike[T]): Observable[T] = js.native
  def fromArray[T](input: ArrayLike[T], scheduler: SchedulerLike): Observable[T] = js.native
}


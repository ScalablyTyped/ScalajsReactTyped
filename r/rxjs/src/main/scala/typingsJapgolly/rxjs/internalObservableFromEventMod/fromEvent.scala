package typingsJapgolly.rxjs.internalObservableFromEventMod

import typingsJapgolly.rxjs.internalObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/fromEvent", "fromEvent")
@js.native
object fromEvent extends js.Object {
  def apply[T](target: FromEventTarget[T], eventName: String): Observable[T] = js.native
  def apply[T](target: FromEventTarget[T], eventName: String, options: EventListenerOptions): Observable[T] = js.native
  def apply[T](
    target: FromEventTarget[T],
    eventName: String,
    options: EventListenerOptions,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = js.native
  def apply[T](
    target: FromEventTarget[T],
    eventName: String,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = js.native
}


package typingsJapgolly.rxjs.rxjsMod

import typingsJapgolly.rxjs.internalObservableFromEventMod.EventListenerOptions
import typingsJapgolly.rxjs.internalObservableFromEventMod.FromEventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "fromEvent")
@js.native
object fromEvent extends js.Object {
  def apply[T](target: FromEventTarget[T], eventName: String): typingsJapgolly.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T](target: FromEventTarget[T], eventName: String, options: EventListenerOptions): typingsJapgolly.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T](
    target: FromEventTarget[T],
    eventName: String,
    options: EventListenerOptions,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T](
    target: FromEventTarget[T],
    eventName: String,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[T] = js.native
}


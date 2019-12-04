package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typingsJapgolly.rxjs.internalTypesMod.SubscribableOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/debounce", JSImport.Namespace)
@js.native
object internalOperatorsDebounceMod extends js.Object {
  def debounce[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[_]]): MonoTypeOperatorFunction[T] = js.native
}


package typingsJapgolly.rxjs.internalOperatorsThrottleMod

import typingsJapgolly.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typingsJapgolly.rxjs.internalTypesMod.SubscribableOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/throttle", "throttle")
@js.native
object throttle extends js.Object {
  def apply[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[_]]): MonoTypeOperatorFunction[T] = js.native
  def apply[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[_]], config: ThrottleConfig): MonoTypeOperatorFunction[T] = js.native
}


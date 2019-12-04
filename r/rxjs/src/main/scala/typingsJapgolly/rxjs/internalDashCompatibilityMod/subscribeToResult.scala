package typingsJapgolly.rxjs.internalDashCompatibilityMod

import typingsJapgolly.rxjs.internalSubscriptionMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "subscribeToResult")
@js.native
object subscribeToResult extends js.Object {
  def apply[T, R](
    outerSubscriber: typingsJapgolly.rxjs.internalOuterSubscriberMod.OuterSubscriber[T, R],
    result: js.Any
  ): Subscription = js.native
  def apply[T, R](
    outerSubscriber: typingsJapgolly.rxjs.internalOuterSubscriberMod.OuterSubscriber[T, R],
    result: js.Any,
    outerValue: T
  ): Subscription = js.native
  def apply[T, R](
    outerSubscriber: typingsJapgolly.rxjs.internalOuterSubscriberMod.OuterSubscriber[T, R],
    result: js.Any,
    outerValue: T,
    outerIndex: Double
  ): Subscription = js.native
  def apply[T, R](
    outerSubscriber: typingsJapgolly.rxjs.internalOuterSubscriberMod.OuterSubscriber[T, R],
    result: js.Any,
    outerValue: T,
    outerIndex: Double,
    destination: typingsJapgolly.rxjs.internalSubscriberMod.Subscriber[_]
  ): Subscription = js.native
}


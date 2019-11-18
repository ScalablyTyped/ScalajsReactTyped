package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalInnerSubscriberMod.InnerSubscriber
import typingsJapgolly.rxjs.internalSubscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/OuterSubscriber", JSImport.Namespace)
@js.native
object internalOuterSubscriberMod extends js.Object {
  @js.native
  class OuterSubscriber[T, R] () extends Subscriber[T] {
    def notifyComplete(innerSub: InnerSubscriber[T, R]): Unit = js.native
    def notifyError(error: js.Any, innerSub: InnerSubscriber[T, R]): Unit = js.native
    def notifyNext(
      outerValue: T,
      innerValue: R,
      outerIndex: Double,
      innerIndex: Double,
      innerSub: InnerSubscriber[T, R]
    ): Unit = js.native
  }
  
}


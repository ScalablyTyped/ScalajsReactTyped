package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.subscriberMod.Subscriber
import typingsJapgolly.rxjs.typesMod.PartialObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/util/toSubscriber", JSImport.Namespace)
@js.native
object toSubscriberMod extends js.Object {
  def toSubscriber[T](): Subscriber[T] = js.native
  def toSubscriber[T](nextOrObserver: js.Function1[/* value */ T, Unit]): Subscriber[T] = js.native
  def toSubscriber[T](nextOrObserver: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ js.Any, Unit]): Subscriber[T] = js.native
  def toSubscriber[T](
    nextOrObserver: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): Subscriber[T] = js.native
  def toSubscriber[T](nextOrObserver: PartialObserver[T]): Subscriber[T] = js.native
  def toSubscriber[T](nextOrObserver: PartialObserver[T], error: js.Function1[/* error */ js.Any, Unit]): Subscriber[T] = js.native
  def toSubscriber[T](
    nextOrObserver: PartialObserver[T],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): Subscriber[T] = js.native
}


package typingsJapgolly.rxjs.internalCompatibilityMod

import typingsJapgolly.rxjs.typesMod.PartialObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "toSubscriber")
@js.native
object toSubscriber extends js.Object {
  def apply[T](): typingsJapgolly.rxjs.subscriberMod.Subscriber[T] = js.native
  def apply[T](nextOrObserver: js.Function1[/* value */ T, Unit]): typingsJapgolly.rxjs.subscriberMod.Subscriber[T] = js.native
  def apply[T](nextOrObserver: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ js.Any, Unit]): typingsJapgolly.rxjs.subscriberMod.Subscriber[T] = js.native
  def apply[T](
    nextOrObserver: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): typingsJapgolly.rxjs.subscriberMod.Subscriber[T] = js.native
  def apply[T](nextOrObserver: PartialObserver[T]): typingsJapgolly.rxjs.subscriberMod.Subscriber[T] = js.native
  def apply[T](nextOrObserver: PartialObserver[T], error: js.Function1[/* error */ js.Any, Unit]): typingsJapgolly.rxjs.subscriberMod.Subscriber[T] = js.native
  def apply[T](
    nextOrObserver: PartialObserver[T],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): typingsJapgolly.rxjs.subscriberMod.Subscriber[T] = js.native
}


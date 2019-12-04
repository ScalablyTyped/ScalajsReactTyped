package typingsJapgolly.rxjs.internalDashCompatibilityMod

import typingsJapgolly.rxjs.internalSubscriptionMod.Subscription
import typingsJapgolly.rxjs.internalTypesMod.ObservableInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "subscribeTo")
@js.native
object subscribeTo extends js.Object {
  def apply[T](result: ObservableInput[T]): js.Function1[
    /* subscriber */ typingsJapgolly.rxjs.internalSubscriberMod.Subscriber[T], 
    Unit | Subscription
  ] = js.native
}


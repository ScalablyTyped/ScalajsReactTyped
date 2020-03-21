package typingsJapgolly.rxjs.internalCompatibilityMod

import typingsJapgolly.rxjs.subscriptionMod.Subscription
import typingsJapgolly.rxjs.typesMod.ObservableInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "subscribeTo")
@js.native
object subscribeTo extends js.Object {
  def apply[T](result: ObservableInput[T]): js.Function1[
    /* subscriber */ typingsJapgolly.rxjs.subscriberMod.Subscriber[T], 
    Unit | Subscription
  ] = js.native
}


package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.subscriberMod.Subscriber
import typingsJapgolly.rxjs.subscriptionMod.Subscription
import typingsJapgolly.rxjs.typesMod.ObservableInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/util/subscribeTo", JSImport.Namespace)
@js.native
object subscribeToMod extends js.Object {
  def subscribeTo[T](result: ObservableInput[T]): js.Function1[/* subscriber */ Subscriber[T], Unit | Subscription] = js.native
}


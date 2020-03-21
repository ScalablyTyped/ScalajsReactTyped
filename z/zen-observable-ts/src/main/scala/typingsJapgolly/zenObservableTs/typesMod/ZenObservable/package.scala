package typingsJapgolly.zenObservableTs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ZenObservable {
  type Subscriber[T] = js.Function1[
    /* observer */ typingsJapgolly.zenObservableTs.typesMod.ZenObservable.SubscriptionObserver[T], 
    scala.Unit | js.Function0[scala.Unit] | typingsJapgolly.zenObservableTs.typesMod.ZenObservable.Subscription
  ]
}

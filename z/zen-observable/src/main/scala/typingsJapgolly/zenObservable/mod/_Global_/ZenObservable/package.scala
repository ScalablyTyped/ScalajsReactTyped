package typingsJapgolly.zenObservable.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ZenObservable {
  type Subscriber[T] = js.Function1[
    /* observer */ typingsJapgolly.zenObservable.mod._Global_.ZenObservable.SubscriptionObserver[T], 
    scala.Unit | js.Function0[scala.Unit] | typingsJapgolly.zenObservable.mod._Global_.ZenObservable.Subscription
  ]
}

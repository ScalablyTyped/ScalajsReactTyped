package typingsJapgolly.apolloClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/util/Observable", JSImport.Namespace)
@js.native
object observableMod extends js.Object {
  @js.native
  class Observable[T] ()
    extends typingsJapgolly.zenObservableTs.zenObservableMod.Observable[T]
  
  type Observer[T] = typingsJapgolly.zenObservable.mod._Global_.ZenObservable.Observer[T]
  type Subscription = typingsJapgolly.zenObservable.mod._Global_.ZenObservable.Subscription
}


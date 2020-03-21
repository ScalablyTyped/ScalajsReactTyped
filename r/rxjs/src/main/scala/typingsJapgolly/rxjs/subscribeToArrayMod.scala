package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.subscriberMod.Subscriber
import typingsJapgolly.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/util/subscribeToArray", JSImport.Namespace)
@js.native
object subscribeToArrayMod extends js.Object {
  def subscribeToArray[T](array: ArrayLike[T]): js.Function1[/* subscriber */ Subscriber[T], Unit] = js.native
}


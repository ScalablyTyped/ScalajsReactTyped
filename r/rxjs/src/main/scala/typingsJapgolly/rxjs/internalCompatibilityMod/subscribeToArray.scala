package typingsJapgolly.rxjs.internalCompatibilityMod

import typingsJapgolly.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "subscribeToArray")
@js.native
object subscribeToArray extends js.Object {
  def apply[T](array: ArrayLike[T]): js.Function1[/* subscriber */ typingsJapgolly.rxjs.subscriberMod.Subscriber[T], Unit] = js.native
}


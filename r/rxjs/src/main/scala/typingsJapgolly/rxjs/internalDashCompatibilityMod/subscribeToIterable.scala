package typingsJapgolly.rxjs.internalDashCompatibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "subscribeToIterable")
@js.native
object subscribeToIterable extends js.Object {
  def apply[T](iterable: js.Iterable[T]): js.Function1[
    /* subscriber */ typingsJapgolly.rxjs.internalSubscriberMod.Subscriber[T], 
    typingsJapgolly.rxjs.internalSubscriberMod.Subscriber[T]
  ] = js.native
}


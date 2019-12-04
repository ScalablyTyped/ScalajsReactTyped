package typingsJapgolly.rxjs.internalDashCompatibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "subscribeToPromise")
@js.native
object subscribeToPromise extends js.Object {
  def apply[T](promise: js.Thenable[T]): js.Function1[
    /* subscriber */ typingsJapgolly.rxjs.internalSubscriberMod.Subscriber[T], 
    typingsJapgolly.rxjs.internalSubscriberMod.Subscriber[T]
  ] = js.native
}


package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.subscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/util/subscribeToPromise", JSImport.Namespace)
@js.native
object subscribeToPromiseMod extends js.Object {
  def subscribeToPromise[T](promise: js.Thenable[T]): js.Function1[/* subscriber */ Subscriber[T], Subscriber[T]] = js.native
}


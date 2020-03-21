package typingsJapgolly.stripe.mod

import typingsJapgolly.std.AsyncIterableIterator
import typingsJapgolly.std.Promise
import typingsJapgolly.stripe.AnonLimit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IListPromise[T]
  extends AsyncIterableIterator[T]
     with Promise[IList[T]] {
  def autoPagingEach(handler: js.Function1[/* item */ T, js.Promise[Unit]]): Unit = js.native
  def autoPagingToArray(opts: AnonLimit): js.Promise[js.Array[T]] = js.native
}


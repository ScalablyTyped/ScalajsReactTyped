package typingsJapgolly.requestretry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallOnrejected extends js.Object {
  def apply[TResult](): js.Promise[_ | TResult] = js.native
  def apply[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[_ | TResult] = js.native
}


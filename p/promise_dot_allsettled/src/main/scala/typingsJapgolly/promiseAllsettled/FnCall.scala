package typingsJapgolly.promiseAllsettled

import typingsJapgolly.promiseAllsettled.implementationMod.PromiseResultTuple
import typingsJapgolly.promiseAllsettled.implementationMod.PromiseTuple
import typingsJapgolly.promiseAllsettled.typesMod.PromiseResult
import typingsJapgolly.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(): js.Promise[js.Array[js.Any]] = js.native
  def apply[T /* <: Array[js.Any] */](iterable: PromiseTuple[T]): js.Promise[PromiseResultTuple[T]] = js.native
  def apply[T](iterable: Iterable[js.Promise[T] | T]): js.Promise[js.Array[PromiseResult[T, _]]] = js.native
}


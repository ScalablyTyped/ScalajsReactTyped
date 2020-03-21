package typingsJapgolly.qRetry.mod

import typingsJapgolly.q.mod.IWhenable
import typingsJapgolly.q.mod.PromiseState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "allSettled")
@js.native
object allSettled extends js.Object {
  def apply[T](promises: IWhenable[js.Array[IWhenable[T]]]): typingsJapgolly.q.mod.Promise[js.Array[PromiseState[T]]] = js.native
}


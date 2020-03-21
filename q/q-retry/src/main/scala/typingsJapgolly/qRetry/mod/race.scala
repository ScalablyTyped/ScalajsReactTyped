package typingsJapgolly.qRetry.mod

import typingsJapgolly.q.mod.IWhenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "race")
@js.native
object race extends js.Object {
  def apply[T](promises: js.Array[IWhenable[T]]): typingsJapgolly.q.mod.Promise[T] = js.native
}


package typingsJapgolly.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "timesSeries")
@js.native
object timesSeries extends js.Object {
  def apply[T, E](n: Double, iterator: AsyncResultIterator[Double, T, E]): js.Promise[T] = js.native
  def apply[T, E](n: Double, iterator: AsyncResultIterator[Double, T, E], callback: AsyncResultArrayCallback[T, E]): Unit = js.native
}


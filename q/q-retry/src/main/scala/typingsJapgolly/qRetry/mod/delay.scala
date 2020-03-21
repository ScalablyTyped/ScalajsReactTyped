package typingsJapgolly.qRetry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "delay")
@js.native
object delay extends js.Object {
  def apply(ms: Double): typingsJapgolly.q.mod.Promise[Unit] = js.native
  def apply[T](promiseOrValue: T, ms: Double): typingsJapgolly.q.mod.Promise[T] = js.native
  def apply[T](promiseOrValue: typingsJapgolly.q.mod.Promise[T], ms: Double): typingsJapgolly.q.mod.Promise[T] = js.native
}


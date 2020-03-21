package typingsJapgolly.lifeomicAttempt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lifeomic/attempt", "retry")
@js.native
object retry extends js.Object {
  def apply[T](attemptFunc: AttemptFunction[T]): js.Promise[T] = js.native
  def apply[T](attemptFunc: AttemptFunction[T], attemptOptions: PartialAttemptOptions[T]): js.Promise[T] = js.native
}


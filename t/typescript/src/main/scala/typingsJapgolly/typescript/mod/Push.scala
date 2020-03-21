package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Array that is only intended to be pushed to, never read. */
trait Push[T] extends js.Object {
  def push(values: T*): Unit
}

object Push {
  @scala.inline
  def apply[T](push: /* repeated */ T => Callback): Push[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: /* repeated */ T) => push(t0).runNow()))
    __obj.asInstanceOf[Push[T]]
  }
}


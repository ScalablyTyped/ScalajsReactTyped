package typingsJapgolly.reactAddonsLinkedStateMixin.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactLink[T] extends js.Object {
  var value: T
  def requestChange(newValue: T): Unit
}

object ReactLink {
  @scala.inline
  def apply[T](requestChange: T => Callback, value: T): ReactLink[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("requestChange")(js.Any.fromFunction1((t0: T) => requestChange(t0).runNow()))
    __obj.asInstanceOf[ReactLink[T]]
  }
}


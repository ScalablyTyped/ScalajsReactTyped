package typingsJapgolly.promiseAbortable.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortSignal extends js.Object {
  val aborted: Boolean
  def onabort(reason: js.Any): Unit
}

object AbortSignal {
  @scala.inline
  def apply(aborted: Boolean, onabort: js.Any => Callback): AbortSignal = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any])
    __obj.updateDynamic("onabort")(js.Any.fromFunction1((t0: js.Any) => onabort(t0).runNow()))
    __obj.asInstanceOf[AbortSignal]
  }
}


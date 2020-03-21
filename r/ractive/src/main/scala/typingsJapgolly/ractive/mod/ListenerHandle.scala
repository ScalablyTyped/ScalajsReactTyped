package typingsJapgolly.ractive.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerHandle extends js.Object {
  /**
  	 * Removes the listener from the event.j
  	 */
  def cancel(): Unit
}

object ListenerHandle {
  @scala.inline
  def apply(cancel: Callback): ListenerHandle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.asInstanceOf[ListenerHandle]
  }
}


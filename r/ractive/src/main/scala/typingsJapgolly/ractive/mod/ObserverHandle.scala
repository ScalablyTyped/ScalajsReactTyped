package typingsJapgolly.ractive.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserverHandle extends js.Object {
  /**
  	 * Removes the listener or observer.j
  	 */
  def cancel(): Unit
  /**
  	 * @returns true if the callback is not going to be called
  	 */
  def isSilenced(): Boolean
  /**
  	 * Resume calling the callback with changes or events.
  	 */
  def resume(): Unit
  /**
  	 * Stops further firings of the callback. Any related observers will still stay up-to-date, so the old value will be updated as the data changes.
  	 */
  def silence(): Unit
}

object ObserverHandle {
  @scala.inline
  def apply(cancel: Callback, isSilenced: CallbackTo[Boolean], resume: Callback, silence: Callback): ObserverHandle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("isSilenced")(isSilenced.toJsFn)
    __obj.updateDynamic("resume")(resume.toJsFn)
    __obj.updateDynamic("silence")(silence.toJsFn)
    __obj.asInstanceOf[ObserverHandle]
  }
}


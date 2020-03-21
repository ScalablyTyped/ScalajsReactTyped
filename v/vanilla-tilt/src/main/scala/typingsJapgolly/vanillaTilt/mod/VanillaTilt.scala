package typingsJapgolly.vanillaTilt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VanillaTilt extends js.Object {
  /**
    * Start listening to events
    */
  def addEventListeners(): Unit
  /**
    * Destroys the instance and removes the listeners.
    */
  def destroy(): Unit
  /**
    * Get values of instance
    */
  def getValues(): TiltValues
  /**
    * Stop listening to events
    */
  def removeEventListener(): Unit
  /**
    * Resets the styling
    */
  def reset(): Unit
}

object VanillaTilt {
  @scala.inline
  def apply(
    addEventListeners: Callback,
    destroy: Callback,
    getValues: CallbackTo[TiltValues],
    removeEventListener: Callback,
    reset: Callback
  ): VanillaTilt = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListeners")(addEventListeners.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getValues")(getValues.toJsFn)
    __obj.updateDynamic("removeEventListener")(removeEventListener.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[VanillaTilt]
  }
}


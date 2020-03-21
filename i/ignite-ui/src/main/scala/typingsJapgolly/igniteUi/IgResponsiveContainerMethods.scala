package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgResponsiveContainerMethods extends js.Object {
  /**
  	 * Adds a callback to the callback collection.
  	 *
  	 * @param callback The function to call when requirements are met.
  	 * @param owner The owner object of the function.
  	 * @param reactionStep The sensitivity of the size change recognition.
  	 * @param reactionDirection The dimensions the changes of which to be traced.
  	 */
  def addCallback(callback: js.Function, owner: js.Object, reactionStep: Double, reactionDirection: js.Object): Unit
  /**
  	 * Destroys the ResponsiveContainer widget
  	 */
  def destroy(): Unit
  /**
  	 * Removes a callback from the callbacks collection.
  	 *
  	 * @param callbackId The callback id to remove.
  	 */
  def removeCallback(callbackId: Double): Unit
  /**
  	 * Starts the automatic size check procedure
  	 */
  def startPoller(): Unit
  /**
  	 * Stops the automatic size check procedure
  	 */
  def stopPoller(): Unit
}

object IgResponsiveContainerMethods {
  @scala.inline
  def apply(
    addCallback: (js.Function, js.Object, Double, js.Object) => Callback,
    destroy: Callback,
    removeCallback: Double => Callback,
    startPoller: Callback,
    stopPoller: Callback
  ): IgResponsiveContainerMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addCallback")(js.Any.fromFunction4((t0: js.Function, t1: js.Object, t2: scala.Double, t3: js.Object) => addCallback(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("removeCallback")(js.Any.fromFunction1((t0: scala.Double) => removeCallback(t0).runNow()))
    __obj.updateDynamic("startPoller")(startPoller.toJsFn)
    __obj.updateDynamic("stopPoller")(stopPoller.toJsFn)
    __obj.asInstanceOf[IgResponsiveContainerMethods]
  }
}


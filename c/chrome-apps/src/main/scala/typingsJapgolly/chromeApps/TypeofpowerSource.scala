package typingsJapgolly.chromeApps

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.chrome.events.Event
import typingsJapgolly.chromeApps.chrome.system.powerSource.PowerSourceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofpowerSource extends js.Object {
  /**
    * Event for changes in the set of connected power sources.
    */
  val onPowerChanged: Event[js.Function1[/* powerSourceInfo */ js.Array[PowerSourceInfo], Unit]]
  /**
    * Requests information on attached power sources.
    * @param callback The callback to invoke with the results or undefined if the power source information is not known.
    */
  def getPowerSourceInfo(callback: js.Function1[/* powerSourceInfo */ js.UndefOr[js.Array[PowerSourceInfo]], Unit]): Unit
  /**
    * Requests a power source status update.
    * Resulting power source status updates are observable using *onPowerChanged*.
    */
  def requestStatusUpdate(): Unit
}

object TypeofpowerSource {
  @scala.inline
  def apply(
    getPowerSourceInfo: js.Function1[/* powerSourceInfo */ js.UndefOr[js.Array[PowerSourceInfo]], Unit] => Callback,
    onPowerChanged: Event[js.Function1[/* powerSourceInfo */ js.Array[PowerSourceInfo], Unit]],
    requestStatusUpdate: Callback
  ): TypeofpowerSource = {
    val __obj = js.Dynamic.literal(onPowerChanged = onPowerChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("getPowerSourceInfo")(js.Any.fromFunction1((t0: js.Function1[
  /* powerSourceInfo */ js.UndefOr[js.Array[typingsJapgolly.chromeApps.chrome.system.powerSource.PowerSourceInfo]], 
  scala.Unit]) => getPowerSourceInfo(t0).runNow()))
    __obj.updateDynamic("requestStatusUpdate")(requestStatusUpdate.toJsFn)
    __obj.asInstanceOf[TypeofpowerSource]
  }
}


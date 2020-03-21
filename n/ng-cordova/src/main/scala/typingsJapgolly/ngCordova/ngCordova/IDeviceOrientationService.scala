package typingsJapgolly.ngCordova.ngCordova

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceOrientationService extends js.Object {
  def clearWatch(watchID: Double): Unit
  def getCurrentHeading(): IPromise[IDeviceOrientationHeading]
  def watchHeading(options: IDeviceOrientationWatchOptions): IDeviceOrientationWatchPromise
}

object IDeviceOrientationService {
  @scala.inline
  def apply(
    clearWatch: Double => Callback,
    getCurrentHeading: CallbackTo[IPromise[IDeviceOrientationHeading]],
    watchHeading: IDeviceOrientationWatchOptions => CallbackTo[IDeviceOrientationWatchPromise]
  ): IDeviceOrientationService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearWatch")(js.Any.fromFunction1((t0: scala.Double) => clearWatch(t0).runNow()))
    __obj.updateDynamic("getCurrentHeading")(getCurrentHeading.toJsFn)
    __obj.updateDynamic("watchHeading")(js.Any.fromFunction1((t0: typingsJapgolly.ngCordova.ngCordova.IDeviceOrientationWatchOptions) => watchHeading(t0).runNow()))
    __obj.asInstanceOf[IDeviceOrientationService]
  }
}


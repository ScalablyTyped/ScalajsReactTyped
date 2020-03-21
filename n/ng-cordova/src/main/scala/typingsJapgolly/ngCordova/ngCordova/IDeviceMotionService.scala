package typingsJapgolly.ngCordova.ngCordova

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceMotionService extends js.Object {
  def clearWatch(watchId: Double): Unit
  def getCurrentAcceleration(): IPromise[IDeviceMotionAcceleration]
  def watchAcceleration(options: IDeviceMotionAccelerometerOptions): IDeviceMotionWatchPromise
}

object IDeviceMotionService {
  @scala.inline
  def apply(
    clearWatch: Double => Callback,
    getCurrentAcceleration: CallbackTo[IPromise[IDeviceMotionAcceleration]],
    watchAcceleration: IDeviceMotionAccelerometerOptions => CallbackTo[IDeviceMotionWatchPromise]
  ): IDeviceMotionService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearWatch")(js.Any.fromFunction1((t0: scala.Double) => clearWatch(t0).runNow()))
    __obj.updateDynamic("getCurrentAcceleration")(getCurrentAcceleration.toJsFn)
    __obj.updateDynamic("watchAcceleration")(js.Any.fromFunction1((t0: typingsJapgolly.ngCordova.ngCordova.IDeviceMotionAccelerometerOptions) => watchAcceleration(t0).runNow()))
    __obj.asInstanceOf[IDeviceMotionService]
  }
}


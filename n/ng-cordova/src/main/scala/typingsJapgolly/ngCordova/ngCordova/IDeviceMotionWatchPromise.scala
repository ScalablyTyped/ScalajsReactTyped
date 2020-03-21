package typingsJapgolly.ngCordova.ngCordova

import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeviceMotionWatchPromise extends IPromise[IDeviceMotionAcceleration] {
  var watchID: Double = js.native
  def cancel(): Unit = js.native
  def clearWatch(): Unit = js.native
  def clearWatch(watchId: Double): Unit = js.native
}


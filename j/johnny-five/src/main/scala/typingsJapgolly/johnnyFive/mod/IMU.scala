package typingsJapgolly.johnnyFive.mod

import typingsJapgolly.johnnyFive.johnnyFiveStrings.calibrated
import typingsJapgolly.johnnyFive.johnnyFiveStrings.change
import typingsJapgolly.johnnyFive.johnnyFiveStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "IMU")
@js.native
class IMU protected () extends js.Object {
  def this(option: IMUGeneralOption) = this()
  def this(option: IMUMPU6050Option) = this()
  val accelerometer: Accelerometer = js.native
  val compass: Compass = js.native
  val gyro: Gyro = js.native
  val orientation: Orientiation = js.native
  val thermometer: Thermometer = js.native
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_calibrated(event: calibrated, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: change, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
}


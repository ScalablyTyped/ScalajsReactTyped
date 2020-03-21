package typingsJapgolly.reactNativeSensorManager.mod.reactNativeAugmentingMod

import typingsJapgolly.reactNativeSensorManager.AnonAzimuth
import typingsJapgolly.reactNativeSensorManager.AnonIsNear
import typingsJapgolly.reactNativeSensorManager.AnonLight
import typingsJapgolly.reactNativeSensorManager.AnonSteps
import typingsJapgolly.reactNativeSensorManager.AnonTemp
import typingsJapgolly.reactNativeSensorManager.AnonX
import typingsJapgolly.reactNativeSensorManager.reactNativeSensorManagerStrings.Accelerometer
import typingsJapgolly.reactNativeSensorManager.reactNativeSensorManagerStrings.Gyroscope
import typingsJapgolly.reactNativeSensorManager.reactNativeSensorManagerStrings.LightSensor
import typingsJapgolly.reactNativeSensorManager.reactNativeSensorManagerStrings.Magnetometer
import typingsJapgolly.reactNativeSensorManager.reactNativeSensorManagerStrings.Orientation
import typingsJapgolly.reactNativeSensorManager.reactNativeSensorManagerStrings.Proximity
import typingsJapgolly.reactNativeSensorManager.reactNativeSensorManagerStrings.StepCounter
import typingsJapgolly.reactNativeSensorManager.reactNativeSensorManagerStrings.Thermometer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceEventEmitterStatic extends js.Object {
  @JSName("addListener")
  def addListener_Accelerometer(event: Accelerometer, callback: js.Function1[/* data */ AnonX, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_Gyroscope(event: Gyroscope, callback: js.Function1[/* data */ AnonX, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_LightSensor(event: LightSensor, callback: js.Function1[/* data */ AnonLight, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_Magnetometer(event: Magnetometer, callback: js.Function1[/* data */ AnonX, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_Orientation(event: Orientation, callback: js.Function1[/* data */ AnonAzimuth, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_Proximity(event: Proximity, callback: js.Function1[/* data */ AnonIsNear, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_StepCounter(event: StepCounter, callback: js.Function1[/* data */ AnonSteps, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_Thermometer(event: Thermometer, callback: js.Function1[/* data */ AnonTemp, Unit]): js.Any = js.native
}


package typingsJapgolly.reactNativeSensorManager.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SensorManager extends js.Object {
  def startAccelerometer(delay: Double): Unit
  def startGyroscope(delay: Double): Unit
  def startLightSensor(delay: Double): Unit
  def startMagnetometer(delay: Double): Unit
  def startMotionValue(delay: Double): Unit
  def startOrientation(delay: Double): Unit
  def startProximity(delay: Double): Unit
  def startStepCounter(delay: Double): Unit
  def startThermometer(delay: Double): Unit
  def stopAccelerometer(): Unit
  def stopGyroscope(): Unit
  def stopLightSensor(): Unit
  def stopMagnetometer(): Unit
  def stopMotionValue(): Unit
  def stopOrientation(): Unit
  def stopProximity(): Unit
  def stopStepCounter(): Unit
  def stopThermometer(): Unit
}

object SensorManager {
  @scala.inline
  def apply(
    startAccelerometer: Double => Callback,
    startGyroscope: Double => Callback,
    startLightSensor: Double => Callback,
    startMagnetometer: Double => Callback,
    startMotionValue: Double => Callback,
    startOrientation: Double => Callback,
    startProximity: Double => Callback,
    startStepCounter: Double => Callback,
    startThermometer: Double => Callback,
    stopAccelerometer: Callback,
    stopGyroscope: Callback,
    stopLightSensor: Callback,
    stopMagnetometer: Callback,
    stopMotionValue: Callback,
    stopOrientation: Callback,
    stopProximity: Callback,
    stopStepCounter: Callback,
    stopThermometer: Callback
  ): SensorManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("startAccelerometer")(js.Any.fromFunction1((t0: scala.Double) => startAccelerometer(t0).runNow()))
    __obj.updateDynamic("startGyroscope")(js.Any.fromFunction1((t0: scala.Double) => startGyroscope(t0).runNow()))
    __obj.updateDynamic("startLightSensor")(js.Any.fromFunction1((t0: scala.Double) => startLightSensor(t0).runNow()))
    __obj.updateDynamic("startMagnetometer")(js.Any.fromFunction1((t0: scala.Double) => startMagnetometer(t0).runNow()))
    __obj.updateDynamic("startMotionValue")(js.Any.fromFunction1((t0: scala.Double) => startMotionValue(t0).runNow()))
    __obj.updateDynamic("startOrientation")(js.Any.fromFunction1((t0: scala.Double) => startOrientation(t0).runNow()))
    __obj.updateDynamic("startProximity")(js.Any.fromFunction1((t0: scala.Double) => startProximity(t0).runNow()))
    __obj.updateDynamic("startStepCounter")(js.Any.fromFunction1((t0: scala.Double) => startStepCounter(t0).runNow()))
    __obj.updateDynamic("startThermometer")(js.Any.fromFunction1((t0: scala.Double) => startThermometer(t0).runNow()))
    __obj.updateDynamic("stopAccelerometer")(stopAccelerometer.toJsFn)
    __obj.updateDynamic("stopGyroscope")(stopGyroscope.toJsFn)
    __obj.updateDynamic("stopLightSensor")(stopLightSensor.toJsFn)
    __obj.updateDynamic("stopMagnetometer")(stopMagnetometer.toJsFn)
    __obj.updateDynamic("stopMotionValue")(stopMotionValue.toJsFn)
    __obj.updateDynamic("stopOrientation")(stopOrientation.toJsFn)
    __obj.updateDynamic("stopProximity")(stopProximity.toJsFn)
    __obj.updateDynamic("stopStepCounter")(stopStepCounter.toJsFn)
    __obj.updateDynamic("stopThermometer")(stopThermometer.toJsFn)
    __obj.asInstanceOf[SensorManager]
  }
}


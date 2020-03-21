package typingsJapgolly.winrtUwp.Windows.Devices.Sensors

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.Graphics.Display.DisplayOrientations
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.readingchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an orientation sensor. */
@JSGlobal("Windows.Devices.Sensors.OrientationSensor")
@js.native
abstract class OrientationSensor () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: String = js.native
  /** Gets the minimum report interval supported by the sensor. */
  var minimumReportInterval: Double = js.native
  /** Occurs each time the orientation sensor reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[OrientationSensor, OrientationSensorReadingChangedEventArgs] = js.native
  /** Gets or sets the transformation that needs to be applied to sensor data. Transformations to be applied are tied to the display orientation with which to align the sensor data. */
  var readingTransform: DisplayOrientations = js.native
  /** Gets the sensor reading type. */
  var readingType: SensorReadingType = js.native
  /** Gets or sets the report interval supported by the sensor. */
  var reportInterval: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[OrientationSensor, OrientationSensorReadingChangedEventArgs]
  ): Unit = js.native
  /**
    * Gets the current sensor reading.
    * @return The current sensor reading.
    */
  def getCurrentReading(): OrientationSensorReading = js.native
  /** Occurs each time the orientation sensor reports a new sensor reading. */
  def onreadingchanged(ev: OrientationSensorReadingChangedEventArgs with WinRTEvent[OrientationSensor]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[OrientationSensor, OrientationSensorReadingChangedEventArgs]
  ): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.OrientationSensor")
@js.native
object OrientationSensor extends js.Object {
  /**
    * Gets the default orientation sensor.
    * @return The default orientation sensor or null if no orientation sensors are found.
    */
  def getDefault(): OrientationSensor = js.native
  /**
    * Gets the default orientation sensor.
    * @return The default orientation sensor or null if no orientation sensors are found.
    */
  def getDefaultForRelativeReadings(): OrientationSensor = js.native
}


package typingsJapgolly.winrtUwp.Windows.Devices.Sensors

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.Graphics.Display.DisplayOrientations
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.readingchanged
import typingsJapgolly.winrtUwp.winrtUwpStrings.shaken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an accelerometer sensor. */
@js.native
trait Accelerometer extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[Accelerometer, AccelerometerReadingChangedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shaken(`type`: shaken, listener: TypedEventHandler[Accelerometer, AccelerometerShakenEventArgs]): Unit = js.native
  
  /** Gets the device identifier. */
  var deviceId: String = js.native
  
  /**
    * Gets the current accelerometer reading.
    * @return This method has no parameters.
    */
  def getCurrentReading(): AccelerometerReading = js.native
  
  /** Gets the maximum number of events that can be batched by the sensor. */
  var maxBatchSize: Double = js.native
  
  /** Gets the minimum report interval supported by the accelerometer. */
  var minimumReportInterval: Double = js.native
  
  /** Occurs each time the accelerometer reports a new sensor reading. */
  def onreadingchanged(ev: AccelerometerReadingChangedEventArgs & WinRTEvent[Accelerometer]): Unit = js.native
  /** Occurs each time the accelerometer reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[Accelerometer, AccelerometerReadingChangedEventArgs] = js.native
  
  /** Occurs when the accelerometer detects that the PC has been shaken. */
  def onshaken(ev: AccelerometerShakenEventArgs & WinRTEvent[Accelerometer]): Unit = js.native
  /** Occurs when the accelerometer detects that the PC has been shaken. */
  @JSName("onshaken")
  var onshaken_Original: TypedEventHandler[Accelerometer, AccelerometerShakenEventArgs] = js.native
  
  /** Gets or sets the transformation that needs to be applied to sensor data. Transformations to be applied are tied to the display orientation with which to align the sensor data. */
  var readingTransform: DisplayOrientations = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[Accelerometer, AccelerometerReadingChangedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shaken(`type`: shaken, listener: TypedEventHandler[Accelerometer, AccelerometerShakenEventArgs]): Unit = js.native
  
  /** Gets or sets the current report interval for the accelerometer. */
  var reportInterval: Double = js.native
  
  /** Gets or sets the delay between batches of sensor information. */
  var reportLatency: Double = js.native
}

package typingsJapgolly.winrtUwp.Windows.Devices.Sensors

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.Graphics.Display.DisplayOrientations
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.orientationchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a simple orientation sensor. */
@js.native
trait SimpleOrientationSensor extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchanged(
    `type`: orientationchanged,
    listener: TypedEventHandler[SimpleOrientationSensor, SimpleOrientationSensorOrientationChangedEventArgs]
  ): Unit = js.native
  
  /** Gets the device identifier. */
  var deviceId: String = js.native
  
  /**
    * Gets the default simple orientation sensor.
    * @return The default simple orientation sensor.
    */
  def getCurrentOrientation(): SimpleOrientation = js.native
  
  /** Occurs each time the simple orientation sensor reports a new sensor reading */
  def onorientationchanged(ev: SimpleOrientationSensorOrientationChangedEventArgs & WinRTEvent[SimpleOrientationSensor]): Unit = js.native
  /** Occurs each time the simple orientation sensor reports a new sensor reading */
  @JSName("onorientationchanged")
  var onorientationchanged_Original: TypedEventHandler[SimpleOrientationSensor, SimpleOrientationSensorOrientationChangedEventArgs] = js.native
  
  /** Gets or sets the transformation that needs to be applied to sensor data. Transformations to be applied are tied to the display orientation with which to align the sensor data. */
  var readingTransform: DisplayOrientations = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchanged(
    `type`: orientationchanged,
    listener: TypedEventHandler[SimpleOrientationSensor, SimpleOrientationSensorOrientationChangedEventArgs]
  ): Unit = js.native
}

package typingsJapgolly.winrtUwp.Windows.Devices.Sensors

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.readingchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides an interface for an altimetric sensor to measure the relative altitude. */
@JSGlobal("Windows.Devices.Sensors.Altimeter")
@js.native
abstract class Altimeter () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: String = js.native
  /** The smallest report interval that is supported by this altimeter sensor. */
  var minimumReportInterval: Double = js.native
  /** Occurs each time the altimeter sensor reports a new value. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[Altimeter, AltimeterReadingChangedEventArgs] = js.native
  /** Gets or sets the current report interval for the altimeter. */
  var reportInterval: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(`type`: readingchanged, listener: TypedEventHandler[Altimeter, AltimeterReadingChangedEventArgs]): Unit = js.native
  /**
    * Gets the current reading for the altimeter.
    * @return The current alititude reading for this sensor.
    */
  def getCurrentReading(): AltimeterReading = js.native
  /** Occurs each time the altimeter sensor reports a new value. */
  def onreadingchanged(ev: AltimeterReadingChangedEventArgs with WinRTEvent[Altimeter]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(`type`: readingchanged, listener: TypedEventHandler[Altimeter, AltimeterReadingChangedEventArgs]): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.Altimeter")
@js.native
object Altimeter extends js.Object {
  /**
    * Returns the default altimeter sensor.
    * @return The default altimeter.
    */
  def getDefault(): Altimeter = js.native
}


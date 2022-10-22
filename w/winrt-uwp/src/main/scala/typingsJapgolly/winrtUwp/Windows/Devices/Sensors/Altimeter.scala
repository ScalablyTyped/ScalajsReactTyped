package typingsJapgolly.winrtUwp.Windows.Devices.Sensors

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.readingchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an interface for an altimetric sensor to measure the relative altitude. */
@js.native
trait Altimeter extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(`type`: readingchanged, listener: TypedEventHandler[Altimeter, AltimeterReadingChangedEventArgs]): Unit = js.native
  
  /** Gets the device identifier. */
  var deviceId: String = js.native
  
  /**
    * Gets the current reading for the altimeter.
    * @return The current alititude reading for this sensor.
    */
  def getCurrentReading(): AltimeterReading = js.native
  
  /** The smallest report interval that is supported by this altimeter sensor. */
  var minimumReportInterval: Double = js.native
  
  /** Occurs each time the altimeter sensor reports a new value. */
  def onreadingchanged(ev: AltimeterReadingChangedEventArgs & WinRTEvent[Altimeter]): Unit = js.native
  /** Occurs each time the altimeter sensor reports a new value. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[Altimeter, AltimeterReadingChangedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(`type`: readingchanged, listener: TypedEventHandler[Altimeter, AltimeterReadingChangedEventArgs]): Unit = js.native
  
  /** Gets or sets the current report interval for the altimeter. */
  var reportInterval: Double = js.native
}

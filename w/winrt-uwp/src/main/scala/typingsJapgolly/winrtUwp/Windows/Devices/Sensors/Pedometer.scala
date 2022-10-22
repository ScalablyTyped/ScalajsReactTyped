package typingsJapgolly.winrtUwp.Windows.Devices.Sensors

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.readingchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an interface for a pedometer to measure the number of steps taken. */
@js.native
trait Pedometer extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(`type`: readingchanged, listener: TypedEventHandler[Pedometer, PedometerReadingChangedEventArgs]): Unit = js.native
  
  /** Gets the device identifier. */
  var deviceId: String = js.native
  
  var getCurrentReadings: Any = js.native
  
  /* unmapped type */
  /** The smallest report interval that is supported by this pedometer. */
  var minimumReportInterval: Double = js.native
  
  /** Occurs each time the pedometer reports a new value. */
  def onreadingchanged(ev: PedometerReadingChangedEventArgs & WinRTEvent[Pedometer]): Unit = js.native
  /** Occurs each time the pedometer reports a new value. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[Pedometer, PedometerReadingChangedEventArgs] = js.native
  
  /** Gets the power that the sensor consumes. */
  var powerInMilliwatts: Double = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(`type`: readingchanged, listener: TypedEventHandler[Pedometer, PedometerReadingChangedEventArgs]): Unit = js.native
  
  /** Gets or sets the current report interval for the pedometer. */
  var reportInterval: Double = js.native
}

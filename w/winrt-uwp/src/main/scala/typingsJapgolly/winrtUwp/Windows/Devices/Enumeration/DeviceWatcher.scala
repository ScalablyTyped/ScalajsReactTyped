package typingsJapgolly.winrtUwp.Windows.Devices.Enumeration

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.DeviceWatcherTrigger
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.added
import typingsJapgolly.winrtUwp.winrtUwpStrings.enumerationcompleted
import typingsJapgolly.winrtUwp.winrtUwpStrings.removed
import typingsJapgolly.winrtUwp.winrtUwpStrings.stopped
import typingsJapgolly.winrtUwp.winrtUwpStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enumerates devices dynamically, so that the app receives notifications if devices are added, removed, or changed after the initial enumeration is complete. */
@js.native
trait DeviceWatcher extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_added(`type`: added, listener: TypedEventHandler[DeviceWatcher, DeviceInformation]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[DeviceWatcher, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removed(`type`: removed, listener: TypedEventHandler[DeviceWatcher, DeviceInformationUpdate]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(`type`: stopped, listener: TypedEventHandler[DeviceWatcher, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updated(`type`: updated, listener: TypedEventHandler[DeviceWatcher, DeviceInformationUpdate]): Unit = js.native
  
  /**
    * Gets a DeviceWatcherTrigger object monitoring for changes to the list of devices.
    * @param requestedEventKinds A list of the specific updates you want to monitor.
    * @return The watcher trigger to monitor for the specified changes.
    */
  def getBackgroundTrigger(requestedEventKinds: IIterable[DeviceWatcherEventKind]): DeviceWatcherTrigger = js.native
  
  /** Event that is raised when a device is added to the collection enumerated by the DeviceWatcher . */
  def onadded(ev: DeviceInformation & WinRTEvent[DeviceWatcher]): Unit = js.native
  /** Event that is raised when a device is added to the collection enumerated by the DeviceWatcher . */
  @JSName("onadded")
  var onadded_Original: TypedEventHandler[DeviceWatcher, DeviceInformation] = js.native
  
  /** Event that is raised when the enumeration of devices completes. */
  def onenumerationcompleted(ev: Any & WinRTEvent[DeviceWatcher]): Unit = js.native
  /** Event that is raised when the enumeration of devices completes. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: TypedEventHandler[DeviceWatcher, Any] = js.native
  
  /** Event that is raised when a device is removed from the collection of enumerated devices. */
  def onremoved(ev: DeviceInformationUpdate & WinRTEvent[DeviceWatcher]): Unit = js.native
  /** Event that is raised when a device is removed from the collection of enumerated devices. */
  @JSName("onremoved")
  var onremoved_Original: TypedEventHandler[DeviceWatcher, DeviceInformationUpdate] = js.native
  
  /** Event that is raised when the enumeration operation has been stopped. */
  def onstopped(ev: Any & WinRTEvent[DeviceWatcher]): Unit = js.native
  /** Event that is raised when the enumeration operation has been stopped. */
  @JSName("onstopped")
  var onstopped_Original: TypedEventHandler[DeviceWatcher, Any] = js.native
  
  /** Event that is raised when a device is updated in the collection of enumerated devices. */
  def onupdated(ev: DeviceInformationUpdate & WinRTEvent[DeviceWatcher]): Unit = js.native
  /** Event that is raised when a device is updated in the collection of enumerated devices. */
  @JSName("onupdated")
  var onupdated_Original: TypedEventHandler[DeviceWatcher, DeviceInformationUpdate] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_added(`type`: added, listener: TypedEventHandler[DeviceWatcher, DeviceInformation]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[DeviceWatcher, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removed(`type`: removed, listener: TypedEventHandler[DeviceWatcher, DeviceInformationUpdate]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(`type`: stopped, listener: TypedEventHandler[DeviceWatcher, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updated(`type`: updated, listener: TypedEventHandler[DeviceWatcher, DeviceInformationUpdate]): Unit = js.native
  
  /** Starts a search for devices, and subscribes to device enumeration events. */
  def start(): Unit = js.native
  
  /** The status of the DeviceWatcher . */
  var status: DeviceWatcherStatus = js.native
  
  /** Stop raising the events that add, update and remove enumeration results. */
  def stop(): Unit = js.native
}

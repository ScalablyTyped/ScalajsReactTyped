package typingsJapgolly.winrtUwp.Windows.System.RemoteSystems

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Watches for activity related to the discovery of remote systems and raises the appropriate events. */
trait RemoteSystemWatcher extends StObject {
  
  /** This event is raised when the initial remote system discovery process completes. */
  def onenumerationcompleted(ev: RemoteSystemEnumerationCompletedEventArgs & WinRTEvent[RemoteSystemWatcher]): Unit
  /** This event is raised when the initial remote system discovery process completes. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: TypedEventHandler[RemoteSystemWatcher, RemoteSystemEnumerationCompletedEventArgs]
  
  /** This event is raised when an error occurs during discovery. The discovery process will continue if possible. For example, if the error occurs with a value of RemoteSystemWatcherError.InternetNotAvailable (see **RemoteSystemWatcherError**), proximal discovery will continue because the error applies only to cloud discovery (see **RemoteSystemDiscoveryType**). */
  def onerroroccured(ev: RemoteSystemWatcherErrorOccurredEventArgs & WinRTEvent[RemoteSystemWatcher]): Unit
  /** This event is raised when an error occurs during discovery. The discovery process will continue if possible. For example, if the error occurs with a value of RemoteSystemWatcherError.InternetNotAvailable (see **RemoteSystemWatcherError**), proximal discovery will continue because the error applies only to cloud discovery (see **RemoteSystemDiscoveryType**). */
  @JSName("onerroroccured")
  var onerroroccured_Original: TypedEventHandler[RemoteSystemWatcher, RemoteSystemWatcherErrorOccurredEventArgs]
  
  /** The event that is raised when a new remote system (device) is discovered. */
  def onremotesystemadded(ev: RemoteSystemAddedEventArgs & WinRTEvent[RemoteSystemWatcher]): Unit
  /** The event that is raised when a new remote system (device) is discovered. */
  @JSName("onremotesystemadded")
  var onremotesystemadded_Original: TypedEventHandler[RemoteSystemWatcher, RemoteSystemAddedEventArgs]
  
  /** The event that is raised when a previously discovered remote system (device) is no longer visible. */
  def onremotesystemremoved(ev: RemoteSystemRemovedEventArgs & WinRTEvent[RemoteSystemWatcher]): Unit
  /** The event that is raised when a previously discovered remote system (device) is no longer visible. */
  @JSName("onremotesystemremoved")
  var onremotesystemremoved_Original: TypedEventHandler[RemoteSystemWatcher, RemoteSystemRemovedEventArgs]
  
  /** Raised when a remote system (device) that was previously discovered in this discovery session changes from proximally connected to cloud connected, or the reverse. It is also raised when a remote system changes one of its monitored properties (see the properties of the RemoteSystem class). */
  def onremotesystemupdated(ev: RemoteSystemUpdatedEventArgs & WinRTEvent[RemoteSystemWatcher]): Unit
  /** Raised when a remote system (device) that was previously discovered in this discovery session changes from proximally connected to cloud connected, or the reverse. It is also raised when a remote system changes one of its monitored properties (see the properties of the RemoteSystem class). */
  @JSName("onremotesystemupdated")
  var onremotesystemupdated_Original: TypedEventHandler[RemoteSystemWatcher, RemoteSystemUpdatedEventArgs]
  
  /** Starts watching for discoverable remote systems. The discovery process runs until the Stop method is called or an error occurs. A RemoteSystemWatcher object can have its Start method called again at a later time. */
  def start(): Unit
  
  /** Stops watching for discoverable remote systems. */
  def stop(): Unit
}
object RemoteSystemWatcher {
  
  inline def apply(
    onenumerationcompleted: /* ev */ RemoteSystemEnumerationCompletedEventArgs & WinRTEvent[RemoteSystemWatcher] => Callback,
    onerroroccured: /* ev */ RemoteSystemWatcherErrorOccurredEventArgs & WinRTEvent[RemoteSystemWatcher] => Callback,
    onremotesystemadded: /* ev */ RemoteSystemAddedEventArgs & WinRTEvent[RemoteSystemWatcher] => Callback,
    onremotesystemremoved: /* ev */ RemoteSystemRemovedEventArgs & WinRTEvent[RemoteSystemWatcher] => Callback,
    onremotesystemupdated: /* ev */ RemoteSystemUpdatedEventArgs & WinRTEvent[RemoteSystemWatcher] => Callback,
    start: Callback,
    stop: Callback
  ): RemoteSystemWatcher = {
    val __obj = js.Dynamic.literal(onenumerationcompleted = js.Any.fromFunction1((t0: /* ev */ RemoteSystemEnumerationCompletedEventArgs & WinRTEvent[RemoteSystemWatcher]) => onenumerationcompleted(t0).runNow()), onerroroccured = js.Any.fromFunction1((t0: /* ev */ RemoteSystemWatcherErrorOccurredEventArgs & WinRTEvent[RemoteSystemWatcher]) => onerroroccured(t0).runNow()), onremotesystemadded = js.Any.fromFunction1((t0: /* ev */ RemoteSystemAddedEventArgs & WinRTEvent[RemoteSystemWatcher]) => onremotesystemadded(t0).runNow()), onremotesystemremoved = js.Any.fromFunction1((t0: /* ev */ RemoteSystemRemovedEventArgs & WinRTEvent[RemoteSystemWatcher]) => onremotesystemremoved(t0).runNow()), onremotesystemupdated = js.Any.fromFunction1((t0: /* ev */ RemoteSystemUpdatedEventArgs & WinRTEvent[RemoteSystemWatcher]) => onremotesystemupdated(t0).runNow()), start = start.toJsFn, stop = stop.toJsFn)
    __obj.asInstanceOf[RemoteSystemWatcher]
  }
  
  extension [Self <: RemoteSystemWatcher](x: Self) {
    
    inline def setOnenumerationcompleted(
      value: /* ev */ RemoteSystemEnumerationCompletedEventArgs & WinRTEvent[RemoteSystemWatcher] => Callback
    ): Self = StObject.set(x, "onenumerationcompleted", js.Any.fromFunction1((t0: /* ev */ RemoteSystemEnumerationCompletedEventArgs & WinRTEvent[RemoteSystemWatcher]) => value(t0).runNow()))
    
    inline def setOnerroroccured(
      value: /* ev */ RemoteSystemWatcherErrorOccurredEventArgs & WinRTEvent[RemoteSystemWatcher] => Callback
    ): Self = StObject.set(x, "onerroroccured", js.Any.fromFunction1((t0: /* ev */ RemoteSystemWatcherErrorOccurredEventArgs & WinRTEvent[RemoteSystemWatcher]) => value(t0).runNow()))
    
    inline def setOnremotesystemadded(value: /* ev */ RemoteSystemAddedEventArgs & WinRTEvent[RemoteSystemWatcher] => Callback): Self = StObject.set(x, "onremotesystemadded", js.Any.fromFunction1((t0: /* ev */ RemoteSystemAddedEventArgs & WinRTEvent[RemoteSystemWatcher]) => value(t0).runNow()))
    
    inline def setOnremotesystemremoved(value: /* ev */ RemoteSystemRemovedEventArgs & WinRTEvent[RemoteSystemWatcher] => Callback): Self = StObject.set(x, "onremotesystemremoved", js.Any.fromFunction1((t0: /* ev */ RemoteSystemRemovedEventArgs & WinRTEvent[RemoteSystemWatcher]) => value(t0).runNow()))
    
    inline def setOnremotesystemupdated(value: /* ev */ RemoteSystemUpdatedEventArgs & WinRTEvent[RemoteSystemWatcher] => Callback): Self = StObject.set(x, "onremotesystemupdated", js.Any.fromFunction1((t0: /* ev */ RemoteSystemUpdatedEventArgs & WinRTEvent[RemoteSystemWatcher]) => value(t0).runNow()))
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}

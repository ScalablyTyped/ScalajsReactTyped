package typingsJapgolly.winrtUwp.Windows.Devices.Perception

import typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DeviceWatcherStatus
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.enumerationcompleted
import typingsJapgolly.winrtUwp.winrtUwpStrings.sourceadded
import typingsJapgolly.winrtUwp.winrtUwpStrings.sourceremoved
import typingsJapgolly.winrtUwp.winrtUwpStrings.stopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Monitors changes to the list of depth frame sources, and provides notifications when the list changes. */
@js.native
trait PerceptionDepthFrameSourceWatcher extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[PerceptionDepthFrameSourceWatcher, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceadded(
    `type`: sourceadded,
    listener: TypedEventHandler[PerceptionDepthFrameSourceWatcher, PerceptionDepthFrameSourceAddedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceremoved(
    `type`: sourceremoved,
    listener: TypedEventHandler[PerceptionDepthFrameSourceWatcher, PerceptionDepthFrameSourceRemovedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(`type`: stopped, listener: TypedEventHandler[PerceptionDepthFrameSourceWatcher, Any]): Unit = js.native
  
  /** Subscribes to the EnumerationCompleted event. This event is fired after the initial enumeration of known depth frame sources is complete. */
  def onenumerationcompleted(ev: Any & WinRTEvent[PerceptionDepthFrameSourceWatcher]): Unit = js.native
  /** Subscribes to the EnumerationCompleted event. This event is fired after the initial enumeration of known depth frame sources is complete. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: TypedEventHandler[PerceptionDepthFrameSourceWatcher, Any] = js.native
  
  /** Subscribes to the SourceAdded event. */
  def onsourceadded(ev: PerceptionDepthFrameSourceAddedEventArgs & WinRTEvent[PerceptionDepthFrameSourceWatcher]): Unit = js.native
  /** Subscribes to the SourceAdded event. */
  @JSName("onsourceadded")
  var onsourceadded_Original: TypedEventHandler[PerceptionDepthFrameSourceWatcher, PerceptionDepthFrameSourceAddedEventArgs] = js.native
  
  /** Subscribes to the SourceRemoved event. This event is fired once for every depth frame source that is removed. */
  def onsourceremoved(ev: PerceptionDepthFrameSourceRemovedEventArgs & WinRTEvent[PerceptionDepthFrameSourceWatcher]): Unit = js.native
  /** Subscribes to the SourceRemoved event. This event is fired once for every depth frame source that is removed. */
  @JSName("onsourceremoved")
  var onsourceremoved_Original: TypedEventHandler[PerceptionDepthFrameSourceWatcher, PerceptionDepthFrameSourceRemovedEventArgs] = js.native
  
  /** Subscribes to the Stopped event. This event is fired when the IPerceptionColorFrameSourceWatcher has stopped listening for changes to the list of depth frame sources. */
  def onstopped(ev: Any & WinRTEvent[PerceptionDepthFrameSourceWatcher]): Unit = js.native
  /** Subscribes to the Stopped event. This event is fired when the IPerceptionColorFrameSourceWatcher has stopped listening for changes to the list of depth frame sources. */
  @JSName("onstopped")
  var onstopped_Original: TypedEventHandler[PerceptionDepthFrameSourceWatcher, Any] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[PerceptionDepthFrameSourceWatcher, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceadded(
    `type`: sourceadded,
    listener: TypedEventHandler[PerceptionDepthFrameSourceWatcher, PerceptionDepthFrameSourceAddedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceremoved(
    `type`: sourceremoved,
    listener: TypedEventHandler[PerceptionDepthFrameSourceWatcher, PerceptionDepthFrameSourceRemovedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(`type`: stopped, listener: TypedEventHandler[PerceptionDepthFrameSourceWatcher, Any]): Unit = js.native
  
  /** When this method is called, the depth frame source watcher enumerates any existing depth frame sources it has not already enumerated by firing a SourceAdded event for each one. An EnumerationCompleted event is fired when this enumeration is complete. The depth frame source then starts watching for new depth frame sources. */
  def start(): Unit = js.native
  
  /** Gets the operational status of the depth frame source watcher. */
  var status: DeviceWatcherStatus = js.native
  
  /** When this method is called, the depth frame source watcher stops looking for changes to the depth frame source list. This operation is not immediate; the Stopped event will be triggered when the Stop operation is complete. */
  def stop(): Unit = js.native
}

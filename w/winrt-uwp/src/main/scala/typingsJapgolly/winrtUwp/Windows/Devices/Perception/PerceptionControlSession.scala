package typingsJapgolly.winrtUwp.Windows.Devices.Perception

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.controllost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a control session on a controllable frame source. */
@js.native
trait PerceptionControlSession extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_controllost(`type`: controllost, listener: TypedEventHandler[PerceptionControlSession, Any]): Unit = js.native
  
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): Unit = js.native
  
  /** Subscribes to the ControlLost event. This event is triggered when control of the session is lost to another client. */
  def oncontrollost(ev: Any & WinRTEvent[PerceptionControlSession]): Unit = js.native
  /** Subscribes to the ControlLost event. This event is triggered when control of the session is lost to another client. */
  @JSName("oncontrollost")
  var oncontrollost_Original: TypedEventHandler[PerceptionControlSession, Any] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_controllost(`type`: controllost, listener: TypedEventHandler[PerceptionControlSession, Any]): Unit = js.native
  
  /**
    * Creates a property change request. This request is asynchronously processed, and is not guaranteed to succeed. The property change result should be inspected to determine if the property change was actually accepted and, if it was not, the reason why the property change was not accepted.
    * @param name The name of the property to change.
    * @param value The new property value.
    * @return This method asynchronously returns the result of the property change request.
    */
  def trySetPropertyAsync(name: String, value: Any): IPromiseWithIAsyncOperation[PerceptionFrameSourcePropertyChangeResult] = js.native
}

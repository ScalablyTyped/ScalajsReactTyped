package typingsJapgolly.winrtUwp.Windows.Graphics.Printing3D

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.completed
import typingsJapgolly.winrtUwp.winrtUwpStrings.sourcechanged
import typingsJapgolly.winrtUwp.winrtUwpStrings.submitting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a 3D print job. */
@js.native
trait Print3DTask extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_completed(`type`: completed, listener: TypedEventHandler[Print3DTask, Print3DTaskCompletedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourcechanged(`type`: sourcechanged, listener: TypedEventHandler[Print3DTask, Print3DTaskSourceChangedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submitting(`type`: submitting, listener: TypedEventHandler[Print3DTask, Any]): Unit = js.native
  
  /** Occurs when the print request has been sent to the 3D printer and the 3D print job has been created. */
  def oncompleted(ev: Print3DTaskCompletedEventArgs & WinRTEvent[Print3DTask]): Unit = js.native
  /** Occurs when the print request has been sent to the 3D printer and the 3D print job has been created. */
  @JSName("oncompleted")
  var oncompleted_Original: TypedEventHandler[Print3DTask, Print3DTaskCompletedEventArgs] = js.native
  
  /** Occurs when the workflow modifies the 3D print package. */
  def onsourcechanged(ev: Print3DTaskSourceChangedEventArgs & WinRTEvent[Print3DTask]): Unit = js.native
  /** Occurs when the workflow modifies the 3D print package. */
  @JSName("onsourcechanged")
  var onsourcechanged_Original: TypedEventHandler[Print3DTask, Print3DTaskSourceChangedEventArgs] = js.native
  
  /** Occurs when the 3D print package has been submitted to the 3D printer. */
  def onsubmitting(ev: Any & WinRTEvent[Print3DTask]): Unit = js.native
  /** Occurs when the 3D print package has been submitted to the 3D printer. */
  @JSName("onsubmitting")
  var onsubmitting_Original: TypedEventHandler[Print3DTask, Any] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_completed(`type`: completed, listener: TypedEventHandler[Print3DTask, Print3DTaskCompletedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourcechanged(`type`: sourcechanged, listener: TypedEventHandler[Print3DTask, Print3DTaskSourceChangedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submitting(`type`: submitting, listener: TypedEventHandler[Print3DTask, Any]): Unit = js.native
  
  /** Gets the 3D print package to be printed. */
  var source: Printing3D3MFPackage = js.native
}

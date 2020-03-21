package typingsJapgolly.winrtUwp.Windows.UI.ViewManagement

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.Rect
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.hiding
import typingsJapgolly.winrtUwp.winrtUwpStrings.showing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables an app to register to receive notifications when the input pane is about to be displayed or hidden, and to determine which portion of the application's window is being obscured by the input pane. */
@JSGlobal("Windows.UI.ViewManagement.InputPane")
@js.native
abstract class InputPane () extends js.Object {
  /** Gets the region of the app window obscured by the input pane. */
  var occludedRect: Rect = js.native
  /** Occurs when the input pane is about to be hidden by sliding out of view. */
  @JSName("onhiding")
  var onhiding_Original: TypedEventHandler[InputPane, InputPaneVisibilityEventArgs] = js.native
  /** Occurs when the input pane is about to be displayed by sliding into view. */
  @JSName("onshowing")
  var onshowing_Original: TypedEventHandler[InputPane, InputPaneVisibilityEventArgs] = js.native
  /** Gets or sets a value that indicates whether the input pane is shown. */
  var visible: Boolean = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiding(`type`: hiding, listener: TypedEventHandler[InputPane, InputPaneVisibilityEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_showing(`type`: showing, listener: TypedEventHandler[InputPane, InputPaneVisibilityEventArgs]): Unit = js.native
  /** Occurs when the input pane is about to be hidden by sliding out of view. */
  def onhiding(ev: InputPaneVisibilityEventArgs with WinRTEvent[InputPane]): Unit = js.native
  /** Occurs when the input pane is about to be displayed by sliding into view. */
  def onshowing(ev: InputPaneVisibilityEventArgs with WinRTEvent[InputPane]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hiding(`type`: hiding, listener: TypedEventHandler[InputPane, InputPaneVisibilityEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_showing(`type`: showing, listener: TypedEventHandler[InputPane, InputPaneVisibilityEventArgs]): Unit = js.native
  /**
    * Hides the InputPane if it is showing.
    * @return true if the InputPane was hidden successfully; otherwise false.
    */
  def tryHide(): Boolean = js.native
  /**
    * Shows the InputPane if it is hidden.
    * @return true if the InputPane was shown successfully; otherwise false.
    */
  def tryShow(): Boolean = js.native
}

/* static members */
@JSGlobal("Windows.UI.ViewManagement.InputPane")
@js.native
object InputPane extends js.Object {
  /**
    * Gets the InputPane object associated with the application window that is currently visible.
    * @return The input pane.
    */
  def getForCurrentView(): InputPane = js.native
}


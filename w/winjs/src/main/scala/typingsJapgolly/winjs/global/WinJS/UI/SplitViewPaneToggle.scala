package typingsJapgolly.winjs.global.WinJS.UI

import org.scalajs.dom.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Displays a button which is used for opening and closing a SplitView's pane.
  **/
@JSGlobal("WinJS.UI.SplitViewPaneToggle")
@js.native
/**
  * Creates a new SplitViewPaneToggle.
  * @constructor
  * @param element The DOM element hosts the new SplitViewPaneToggle.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
open class SplitViewPaneToggle ()
  extends StObject
     with typingsJapgolly.winjs.WinJS.UI.SplitViewPaneToggle {
  def this(element: HTMLButtonElement) = this()
  def this(element: HTMLButtonElement, options: Any) = this()
  def this(element: Unit, options: Any) = this()
}
object SplitViewPaneToggle {
  
  @JSGlobal("WinJS.UI.SplitViewPaneToggle")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.SplitViewPaneToggle.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}

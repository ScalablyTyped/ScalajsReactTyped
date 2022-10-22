package typingsJapgolly.winjs.mod.UI

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Displays NavBarCommands in an overlayed navigation pane that opens and closes at the top or bottom of the main view.
  **/
@JSImport("winjs", "UI.NavBar")
@js.native
//#region Constructors
/**
  * Creates a new NavBar.
  * @constructor
  * @param element The DOM element that will host the new NavBar.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
open class NavBar ()
  extends StObject
     with typingsJapgolly.winjs.WinJS.UI.NavBar {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: Any) = this()
  def this(element: Unit, options: Any) = this()
}
object NavBar {
  
  @JSImport("winjs", "UI.NavBar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This object supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  /* static member */
  @JSImport("winjs", "UI.NavBar.isDeclarativeControlContainer")
  @js.native
  def isDeclarativeControlContainer: Any = js.native
  inline def isDeclarativeControlContainer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDeclarativeControlContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.NavBar.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}

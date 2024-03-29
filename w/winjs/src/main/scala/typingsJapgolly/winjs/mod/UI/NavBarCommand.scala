package typingsJapgolly.winjs.mod.UI

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a navigation command in a NavBarContainer.
  **/
@JSImport("winjs", "UI.NavBarCommand")
@js.native
//#region Constructors
/**
  * Creates a new NavBarCommand.
  * @constructor
  * @param element The DOM element hosts the new NavBarCommand.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
open class NavBarCommand ()
  extends StObject
     with typingsJapgolly.winjs.WinJS.UI.NavBarCommand {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: Any) = this()
  def this(element: Unit, options: Any) = this()
}
object NavBarCommand {
  
  @JSImport("winjs", "UI.NavBarCommand")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.NavBarCommand.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}

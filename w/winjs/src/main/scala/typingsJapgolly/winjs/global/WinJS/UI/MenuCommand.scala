package typingsJapgolly.winjs.global.WinJS.UI

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a command to be displayed in a Menu object.
  **/
@JSGlobal("WinJS.UI.MenuCommand")
@js.native
//#region Constructors
/**
  * Creates a new MenuCommand object.
  * @constructor
  * @param element The DOM element that will host the control.
  * @param options The set of properties and values to apply to the new MenuCommand.
  **/
open class MenuCommand ()
  extends StObject
     with typingsJapgolly.winjs.WinJS.UI.MenuCommand {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: Any) = this()
  def this(element: Unit, options: Any) = this()
}
object MenuCommand {
  
  @JSGlobal("WinJS.UI.MenuCommand")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.MenuCommand.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}

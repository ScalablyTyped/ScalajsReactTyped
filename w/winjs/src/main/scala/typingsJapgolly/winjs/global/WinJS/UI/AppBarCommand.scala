package typingsJapgolly.winjs.global.WinJS.UI

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a command to be displayed in an app bar.
  **/
@JSGlobal("WinJS.UI.AppBarCommand")
@js.native
//#region Constructors
/**
  * Creates a new AppBarCommand object.
  * @constructor
  * @param element The DOM element that will host the control.
  * @param options The set of properties and values to apply to the new AppBarCommand.
  **/
open class AppBarCommand ()
  extends StObject
     with typingsJapgolly.winjs.WinJS.UI.AppBarCommand {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: Any) = this()
  def this(element: Unit, options: Any) = this()
}
object AppBarCommand {
  
  @JSGlobal("WinJS.UI.AppBarCommand")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.AppBarCommand.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}

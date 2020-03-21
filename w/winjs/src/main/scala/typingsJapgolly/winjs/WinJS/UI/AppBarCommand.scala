package typingsJapgolly.winjs.WinJS.UI

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
class AppBarCommand () extends ICommand {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSGlobal("WinJS.UI.AppBarCommand")
@js.native
object AppBarCommand extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}


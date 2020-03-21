package typingsJapgolly.winjs.mod.UI

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows users to pick a date value.
  **/
@JSImport("winjs", "UI.DatePicker")
@js.native
//#region Constructors
/**
  * Initializes a new instance of the DatePicker control.
  * @constructor
  * @param element The DOM element associated with the DatePicker control.
  * @param options The set of options to be applied initially to the DatePicker control. The options are the following: calendar, current, datePattern, disabled, maxYear, minYear, monthPattern, yearPattern.
  **/
class DatePicker ()
  extends typingsJapgolly.winjs.WinJS.UI.DatePicker {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSImport("winjs", "UI.DatePicker")
@js.native
object DatePicker extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code. Use render instead.
    **/
  def getInformation(startDate: js.Any, endDate: js.Any): js.Any = js.native
  def getInformation(startDate: js.Any, endDate: js.Any, calendar: js.Any): js.Any = js.native
  def getInformation(startDate: js.Any, endDate: js.Any, calendar: js.Any, datePatterns: js.Any): js.Any = js.native
}


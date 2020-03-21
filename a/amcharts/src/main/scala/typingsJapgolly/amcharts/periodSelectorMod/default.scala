package typingsJapgolly.amcharts.periodSelectorMod

import typingsJapgolly.amcharts.AnonCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/PeriodSelector", JSImport.Default)
@js.native
class default () extends PeriodSelector {
  /**
    * Date format of date input fields.
    * Check [[http://help.adobe.com/en_US/FlashPlatform/reference/actionscript/3/mx/formatters/DateFormatter.html
    * @default "DD-MM-YYYY"
    */
  /* CompleteClass */
  override var dateFormat: String = js.native
  /**
    * Text displayed next to "from" date input field. From:
    */
  /* CompleteClass */
  override var fromText: String = js.native
  /**
    * Specifies if period buttons with date range bigger than available data should be hidden.
    * @default true
    */
  /* CompleteClass */
  override var hideOutOfScopePeriods: Boolean = js.native
  /**
    * Width of date input fields, in pixels. Works only if period selector is horizontal.
    * @default 100
    */
  /* CompleteClass */
  override var inputFieldWidth: Double = js.native
  /**
    * Specifies whether period selector displays "from" and "to" date input fields.
    * @default true
    */
  /* CompleteClass */
  override var inputFieldsEnabled: Boolean = js.native
  /**
    * Array of predefined period objects. Period object has 4 properties - period, count, label and selected.
    * Possible period values are:
    * "ss" - seconds,
    * "mm" - minutes,
    * "hh" - hours,
    * "DD" - days,
    * "MM" - months,
    * "YYYY" - years.
    * Property "count" specifies how many periods this button will select.
    * "label" will be displayed on a button.
    * "selected" is a boolean which specifies if this button is selected when chart is initialized or not.
    * Example: {period:"DD", count:10, label:"10 days", selected:false}.
    */
  /* CompleteClass */
  override var periods: js.Array[_] = js.native
  /**
    * Text displayed next to predefined period buttons. Zoom:
    */
  /* CompleteClass */
  override var periodsText: String = js.native
  /**
    * Possible values: "right", "left", "top", "bottom". bottom
    */
  /* CompleteClass */
  override var position: String = js.native
  /**
    * Specifies whether predefined period buttons should select a period from the beginning or the end of the data.
    */
  /* CompleteClass */
  override var selectFromStart: Boolean = js.native
  /**
    * Text displayed next to "to" date input field. To:
    */
  /* CompleteClass */
  override var toText: String = js.native
  /**
    * Width of a period selector, when position is "left" or "right".
    * @default 180
    */
  /* CompleteClass */
  override var width: Double = js.native
  /**
    * Adds event listener to the object.
    * @param handler - Dispatched when dates in period selector input fields are changed or
    * user clicks on one of the predefined period buttons.
    */
  /* CompleteClass */
  override def addListener(`type`: String, handler: js.Function1[/* e */ AnonCount, Unit]): Unit = js.native
  /**
    * Removes event listener from chart object.
    */
  /* CompleteClass */
  override def removeListener(chart: typingsJapgolly.amcharts.amChartMod.default, `type`: String, handler: js.Any): Unit = js.native
}


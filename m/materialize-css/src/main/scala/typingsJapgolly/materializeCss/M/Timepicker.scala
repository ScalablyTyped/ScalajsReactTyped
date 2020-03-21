package typingsJapgolly.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialTimepickerOptions
import typingsJapgolly.materializeCss.materializeCssStrings.hours
import typingsJapgolly.materializeCss.materializeCssStrings.minutes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Timepicker")
@js.native
class Timepicker () extends Component[TimepickerOptions] {
  /**
    * If the picker is open.
    */
  var isOpen: Boolean = js.native
  /**
    * The selected time.
    */
  var time: String = js.native
  /**
    * Close timepicker
    */
  def close(): Unit = js.native
  /**
    * Open timepicker
    */
  def open(): Unit = js.native
  /**
    * Show hours or minutes view on timepicker
    * @param view The name of the view you want to switch to, 'hours' or 'minutes'.
    */
  @JSName("showView")
  def showView_hours(view: hours): Unit = js.native
  @JSName("showView")
  def showView_minutes(view: minutes): Unit = js.native
}

/* static members */
@JSGlobal("M.Timepicker")
@js.native
object Timepicker extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Timepicker = js.native
  /**
    * Init Timepickers
    */
  def init(els: MElements): js.Array[Timepicker] = js.native
  def init(els: MElements, options: PartialTimepickerOptions): js.Array[Timepicker] = js.native
  /**
    * Init Timepicker
    */
  def init(els: typingsJapgolly.std.Element): Timepicker = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialTimepickerOptions): Timepicker = js.native
}


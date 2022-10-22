package typingsJapgolly.timepicker

import typingsJapgolly.timepicker.timepickerStrings.getSecondsFromMidnight
import typingsJapgolly.timepicker.timepickerStrings.getTime
import typingsJapgolly.timepicker.timepickerStrings.hide
import typingsJapgolly.timepicker.timepickerStrings.isVisible
import typingsJapgolly.timepicker.timepickerStrings.option
import typingsJapgolly.timepicker.timepickerStrings.remove
import typingsJapgolly.timepicker.timepickerStrings.setTime
import typingsJapgolly.timepicker.timepickerStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def timepicker(options: JQueryTimepickerOptions): JQuery = js.native
  /** Get the time as an integer, expressed as seconds from 12am. */
  @JSName("timepicker")
  def timepicker_getSecondsFromMidnight(methodName: getSecondsFromMidnight): Double = js.native
  /** Get the time using a Javascript Date object, relative to a Date object (default: today's date). */
  @JSName("timepicker")
  def timepicker_getTime(methodName: getTime): js.Date = js.native
  @JSName("timepicker")
  def timepicker_getTime(methodName: getTime, date: js.Date): js.Date = js.native
  /** Close the timepicker dropdown. */
  @JSName("timepicker")
  def timepicker_hide(methodName: hide): Unit = js.native
  /** Check if the timepicker attached to *a specific input* is visible. Not compatible with the `useSelect` option. */
  @JSName("timepicker")
  def timepicker_isVisible(methodName: isVisible): Boolean = js.native
  /** Change the settings of an existing timepicker. Calling ```option``` on a visible timepicker will cause the picker to be hidden. */
  @JSName("timepicker")
  def timepicker_option(methodName: option, options: JQueryTimepickerOptions): Unit = js.native
  /** Unbind an existing timepicker element. */
  @JSName("timepicker")
  def timepicker_remove(methodName: remove): Unit = js.native
  // tslint:disable-line:unified-signatures
  /** Set the time using a Javascript Date object. */
  @JSName("timepicker")
  def timepicker_setTime(methodName: setTime, date: js.Date): Unit = js.native
  /** Display the timepicker dropdown. */
  @JSName("timepicker")
  def timepicker_show(methodName: show): Unit = js.native
}

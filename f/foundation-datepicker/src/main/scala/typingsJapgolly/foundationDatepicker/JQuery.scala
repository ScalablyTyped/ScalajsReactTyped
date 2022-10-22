package typingsJapgolly.foundationDatepicker

import org.scalajs.dom.HTMLElement
import typingsJapgolly.foundationDatepicker.FoundationDatepicker.Event
import typingsJapgolly.foundationDatepicker.FoundationDatepicker.OutOfRangeEvent
import typingsJapgolly.foundationDatepicker.FoundationDatepicker.Settings
import typingsJapgolly.foundationDatepicker.foundationDatepickerStrings.changeDate
import typingsJapgolly.foundationDatepicker.foundationDatepickerStrings.hide
import typingsJapgolly.foundationDatepicker.foundationDatepickerStrings.outOfRange
import typingsJapgolly.foundationDatepicker.foundationDatepickerStrings.place
import typingsJapgolly.foundationDatepicker.foundationDatepickerStrings.show
import typingsJapgolly.foundationDatepicker.foundationDatepickerStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery[TElement] extends StObject {
  
  def fdatepicker(): JQuery[HTMLElement] = js.native
  def fdatepicker(option: show | hide | place): JQuery[HTMLElement] = js.native
  def fdatepicker(option: Settings): JQuery[HTMLElement] = js.native
  @JSName("fdatepicker")
  def fdatepicker_update(option: update, value: String): JQuery[HTMLElement] = js.native
  @JSName("fdatepicker")
  def fdatepicker_update(option: update, value: js.Date): JQuery[HTMLElement] = js.native
  
  def on(events: show | hide | changeDate, handler: js.Function1[/* eventObject */ Event, Unit]): JQuery[HTMLElement] = js.native
  @JSName("on")
  def on_outOfRange(events: outOfRange, handler: js.Function1[/* eventObject */ OutOfRangeEvent, Unit]): JQuery[HTMLElement] = js.native
}

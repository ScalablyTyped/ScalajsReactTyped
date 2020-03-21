package typingsJapgolly.dojo.dojox.mobile

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dojoStrings.date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/SpinWheelTimePicker.html
  *
  * A SpinWheel-based time picker widget.
  * SpinWheelTimePicker is a time picker widget. It is a subclass of
  * dojox/mobile/SpinWheel. It has two slots: hour and minute.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.dojo.dojox.mobile.TimePickerMixin because Inheritance from two classes. Inlined date, reset */ @JSGlobal("dojox.mobile.SpinWheelTimePicker")
@js.native
class SpinWheelTimePicker () extends SpinWheel {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * A Date object corresponding to the current values of the picker.
    *
    */
  var date: js.Date = js.native
  @JSName("get")
  def get_date(property: date): js.Date = js.native
  @JSName("set")
  def set_date(property: date, value: js.Date): Unit = js.native
  @JSName("watch")
  def watch_date(
    property: date,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Date], 
      /* newValue */ js.UndefOr[js.Date], 
      Unit
    ]
  ): AnonUnwatch = js.native
}


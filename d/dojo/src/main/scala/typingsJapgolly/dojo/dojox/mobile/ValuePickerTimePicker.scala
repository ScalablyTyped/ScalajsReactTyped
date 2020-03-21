package typingsJapgolly.dojo.dojox.mobile

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dojoStrings.date
import typingsJapgolly.dojo.dojoStrings.hourMinusBtnLabel
import typingsJapgolly.dojo.dojoStrings.hourMinusBtnLabelRef
import typingsJapgolly.dojo.dojoStrings.hourPlusBtnLabel
import typingsJapgolly.dojo.dojoStrings.hourPlusBtnLabelRef
import typingsJapgolly.dojo.dojoStrings.is24h
import typingsJapgolly.dojo.dojoStrings.minuteMinusBtnLabel
import typingsJapgolly.dojo.dojoStrings.minuteMinusBtnLabelRef
import typingsJapgolly.dojo.dojoStrings.minutePlusBtnLabel
import typingsJapgolly.dojo.dojoStrings.minutePlusBtnLabelRef
import typingsJapgolly.dojo.dojoStrings.readOnly
import typingsJapgolly.dojo.dojoStrings.values12
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/ValuePickerTimePicker.html
  *
  * A ValuePicker-based time picker widget.
  * ValuePickerTimePicker is a time picker widget. It is a subclass of
  * dojox.mobile.ValuePicker. It has two slots: hour and minute.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.dojo.dojox.mobile.TimePickerMixin because Inheritance from two classes. Inlined date, reset */ @JSGlobal("dojox.mobile.ValuePickerTimePicker")
@js.native
class ValuePickerTimePicker () extends ValuePicker {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * A Date object corresponding to the current values of the picker.
    *
    */
  var date: js.Date = js.native
  /**
    * (Accessibility) Label for hour minus button
    *
    */
  var hourMinusBtnLabel: String = js.native
  /**
    * (Accessibility) Reference to a node id containing text label for the hour minus button
    *
    */
  var hourMinusBtnLabelRef: String = js.native
  /**
    * (Accessibility) Label for hour plus button
    *
    */
  var hourPlusBtnLabel: String = js.native
  /**
    * (Accessibility) Reference to a node id containing text label for the hour plus button
    *
    */
  var hourPlusBtnLabelRef: String = js.native
  /**
    * If true, the time is displayed in 24h format.
    * Otherwise, displayed in AM/PM mode.
    *
    */
  var is24h: Boolean = js.native
  /**
    * (Accessibility) Label for minute minus button
    *
    */
  var minuteMinusBtnLabel: String = js.native
  /**
    * (Accessibility) Reference to a node id containing text label for the minute minus button
    *
    */
  var minuteMinusBtnLabelRef: String = js.native
  /**
    * (Accessibility) Label for minute plus button
    *
    */
  var minutePlusBtnLabel: String = js.native
  /**
    * (Accessibility) Reference to a node id containing text label for the minute plus button
    *
    */
  var minutePlusBtnLabelRef: String = js.native
  /**
    * If true, slot input fields are read-only. Only the plus and
    * minus buttons can be used to change the values.
    * Note that changing the value of the property after the widget
    * creation has no effect.
    *
    */
  var readOnly: Boolean = js.native
  /**
    * The time value, as an array in 12h format: [hour12, minute, ampm] (ex. ["10","06","PM"]).
    * Warning: Do not use this property directly, make sure to call set() or get() methods.
    *
    */
  var values12: js.Array[_] = js.native
  @JSName("get")
  def get_date(property: date): js.Date = js.native
  @JSName("get")
  def get_hourMinusBtnLabel(property: hourMinusBtnLabel): String = js.native
  @JSName("get")
  def get_hourMinusBtnLabelRef(property: hourMinusBtnLabelRef): String = js.native
  @JSName("get")
  def get_hourPlusBtnLabel(property: hourPlusBtnLabel): String = js.native
  @JSName("get")
  def get_hourPlusBtnLabelRef(property: hourPlusBtnLabelRef): String = js.native
  @JSName("get")
  def get_is24h(property: is24h): Boolean = js.native
  @JSName("get")
  def get_minuteMinusBtnLabel(property: minuteMinusBtnLabel): String = js.native
  @JSName("get")
  def get_minuteMinusBtnLabelRef(property: minuteMinusBtnLabelRef): String = js.native
  @JSName("get")
  def get_minutePlusBtnLabel(property: minutePlusBtnLabel): String = js.native
  @JSName("get")
  def get_minutePlusBtnLabelRef(property: minutePlusBtnLabelRef): String = js.native
  @JSName("get")
  def get_readOnly(property: readOnly): Boolean = js.native
  @JSName("get")
  def get_values12(property: values12): js.Array[_] = js.native
  /**
    * The handler for the AM/PM button.
    *
    */
  def onBtnClick(): Unit = js.native
  @JSName("set")
  def set_date(property: date, value: js.Date): Unit = js.native
  @JSName("set")
  def set_hourMinusBtnLabel(property: hourMinusBtnLabel, value: String): Unit = js.native
  @JSName("set")
  def set_hourMinusBtnLabelRef(property: hourMinusBtnLabelRef, value: String): Unit = js.native
  @JSName("set")
  def set_hourPlusBtnLabel(property: hourPlusBtnLabel, value: String): Unit = js.native
  @JSName("set")
  def set_hourPlusBtnLabelRef(property: hourPlusBtnLabelRef, value: String): Unit = js.native
  @JSName("set")
  def set_is24h(property: is24h, value: Boolean): Unit = js.native
  @JSName("set")
  def set_minuteMinusBtnLabel(property: minuteMinusBtnLabel, value: String): Unit = js.native
  @JSName("set")
  def set_minuteMinusBtnLabelRef(property: minuteMinusBtnLabelRef, value: String): Unit = js.native
  @JSName("set")
  def set_minutePlusBtnLabel(property: minutePlusBtnLabel, value: String): Unit = js.native
  @JSName("set")
  def set_minutePlusBtnLabelRef(property: minutePlusBtnLabelRef, value: String): Unit = js.native
  @JSName("set")
  def set_readOnly(property: readOnly, value: Boolean): Unit = js.native
  @JSName("set")
  def set_values12(property: values12, value: js.Array[_]): Unit = js.native
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
  @JSName("watch")
  def watch_hourMinusBtnLabel(
    property: hourMinusBtnLabel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_hourMinusBtnLabelRef(
    property: hourMinusBtnLabelRef,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_hourPlusBtnLabel(
    property: hourPlusBtnLabel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_hourPlusBtnLabelRef(
    property: hourPlusBtnLabelRef,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_is24h(
    property: is24h,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_minuteMinusBtnLabel(
    property: minuteMinusBtnLabel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_minuteMinusBtnLabelRef(
    property: minuteMinusBtnLabelRef,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_minutePlusBtnLabel(
    property: minutePlusBtnLabel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_minutePlusBtnLabelRef(
    property: minutePlusBtnLabelRef,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_readOnly(
    property: readOnly,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_values12(
    property: values12,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): AnonUnwatch = js.native
}


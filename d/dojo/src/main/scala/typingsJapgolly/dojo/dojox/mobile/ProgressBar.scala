package typingsJapgolly.dojo.dojox.mobile

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dijit.WidgetBase
import typingsJapgolly.dojo.dojoStrings.label
import typingsJapgolly.dojo.dojoStrings.maximum
import typingsJapgolly.dojo.dojoStrings.style
import typingsJapgolly.dojo.dojoStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/ProgressBar.html
  *
  * A widget that shows the progress of a task.
  * The current progress can be specified either using a number (0 to maximum)
  * or percentage (0% to 100%). The setter of the 'value' property can be used to
  * update the degree of completion of the task.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.mobile.ProgressBar")
@js.native
class ProgressBar () extends WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * A text to be shown at the center of the progress bar.
    *
    */
  var label: String = js.native
  /**
    * Maximum value.
    *
    */
  var maximum: Double = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_ProgressBar: String = js.native
  /**
    * Number ("0" to maximum) or percentage ("0%" to "100%")
    * indicating the degree of completion of the task.
    *
    */
  var value: String = js.native
  @JSName("get")
  def get_label(property: label): String = js.native
  @JSName("get")
  def get_maximum(property: maximum): Double = js.native
  @JSName("get")
  def get_value(property: value): String = js.native
  /**
    * User-defined function called when progress updates.
    *
    * @param percent
    */
  def onChange(percent: Double): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  @JSName("set")
  def set_label(property: label, value: String): Unit = js.native
  @JSName("set")
  def set_maximum(property: maximum, value: Double): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("watch")
  def watch_label(
    property: label,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_maximum(
    property: maximum,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_value(
    property: value,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}


package typingsJapgolly.dojo.dojox.gauges

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dijit.Widget
import typingsJapgolly.dojo.dojoStrings.color
import typingsJapgolly.dojo.dojoStrings.high
import typingsJapgolly.dojo.dojoStrings.hover
import typingsJapgolly.dojo.dojoStrings.low
import typingsJapgolly.dojo.dojoStrings.size
import typingsJapgolly.dojo.dojoStrings.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gauges/Range.html
  *
  * a range to be used in a _Gauge
  * a range widget, which has given properties.  drawn by a _Gauge.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.gauges.Range")
@js.native
class Range () extends Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * the color of the range.  This must be an object of one of two forms:
    * {'color': 'color-name'}
    * OR
    * (for a gradient:)
    * {'type': 'linear', 'colors': [{offset: 0, color:'#C0C0C0'}, {offset: 1, color: '#E0E0E0'}] }
    *
    */
  var color: js.Object = js.native
  /**
    * the high value of the range
    *
    */
  var high: Double = js.native
  /**
    * the text to put in the tooltip for the gauge
    *
    */
  var hover: String = js.native
  /**
    * the low value of the range
    *
    */
  var low: Double = js.native
  /**
    * for a circular gauge (such as an AnalogGauge), this dictates the size of the arc
    *
    */
  var size: Double = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_Range: String = js.native
  @JSName("get")
  def get_color(property: color): js.Object = js.native
  @JSName("get")
  def get_high(property: high): Double = js.native
  @JSName("get")
  def get_hover(property: hover): String = js.native
  @JSName("get")
  def get_low(property: low): Double = js.native
  @JSName("get")
  def get_size(property: size): Double = js.native
  @JSName("set")
  def set_color(property: color, value: js.Object): Unit = js.native
  @JSName("set")
  def set_high(property: high, value: Double): Unit = js.native
  @JSName("set")
  def set_hover(property: hover, value: String): Unit = js.native
  @JSName("set")
  def set_low(property: low, value: Double): Unit = js.native
  @JSName("set")
  def set_size(property: size, value: Double): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("watch")
  def watch_color(
    property: color,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_high(
    property: high,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_hover(
    property: hover,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_low(
    property: low,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_size(
    property: size,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
}


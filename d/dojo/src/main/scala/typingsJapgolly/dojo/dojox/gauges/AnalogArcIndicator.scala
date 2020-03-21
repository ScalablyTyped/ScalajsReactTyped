package typingsJapgolly.dojo.dojox.gauges

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gauges/AnalogArcIndicator.html
  *
  * An indicator for the AnalogGauge that draws a segment of arc.
  * The segment of arc starts at the start angle of the gauge and ends at the
  * angle that corresponds to the value of the indicator.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.gauges.AnalogArcIndicator")
@js.native
class AnalogArcIndicator () extends AnalogIndicatorBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Override of dojox.gauges._Indicator.draw
    *
    * @param group
    * @param dontAnimate               Optional
    */
  def draw(group: js.Any, dontAnimate: Boolean): Unit = js.native
}


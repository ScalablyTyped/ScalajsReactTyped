package typingsJapgolly.dojo.dijit.form

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dojoStrings.constraints
import typingsJapgolly.dojo.dojoStrings.labelStyle
import typingsJapgolly.dojo.dojoStrings.labels
import typingsJapgolly.dojo.dojoStrings.maximum
import typingsJapgolly.dojo.dojoStrings.minimum
import typingsJapgolly.dojo.dojoStrings.numericMargin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/HorizontalRuleLabels.html
  *
  * Labels for dijit/form/HorizontalSlider
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.form.HorizontalRuleLabels")
@js.native
class HorizontalRuleLabels () extends HorizontalRule {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * pattern, places, lang, et al (see dojo.number) for generated numeric labels when labels[] are not specified
    * 
    */
  var constraints: js.Object = js.native
  /**
    * CSS style to apply to individual text labels
    * 
    */
  var labelStyle: String = js.native
  /**
    * Array of text labels to render - evenly spaced from left-to-right or bottom-to-top.
    * Alternately, minimum and maximum can be specified, to get numeric labels.
    * 
    */
  var labels: js.Object = js.native
  /**
    * 
    */
  var maximum: Double = js.native
  /**
    * 
    */
  var minimum: Double = js.native
  /**
    * Number of generated numeric labels that should be rendered as '' on the ends when labels[] are not specified
    * 
    */
  var numericMargin: Double = js.native
  /**
    * Overridable function to return array of labels to use for this slider.
    * Can specify a getLabels() method instead of a labels[] array, or min/max attributes.
    * 
    */
  def getLabels(): js.Any = js.native
  @JSName("get")
  def get_constraints(property: constraints): js.Object = js.native
  @JSName("get")
  def get_labelStyle(property: labelStyle): String = js.native
  @JSName("get")
  def get_labels(property: labels): js.Object = js.native
  @JSName("get")
  def get_maximum(property: maximum): Double = js.native
  @JSName("get")
  def get_minimum(property: minimum): Double = js.native
  @JSName("get")
  def get_numericMargin(property: numericMargin): Double = js.native
  @JSName("set")
  def set_constraints(property: constraints, value: js.Object): Unit = js.native
  @JSName("set")
  def set_labelStyle(property: labelStyle, value: String): Unit = js.native
  @JSName("set")
  def set_labels(property: labels, value: js.Object): Unit = js.native
  @JSName("set")
  def set_maximum(property: maximum, value: Double): Unit = js.native
  @JSName("set")
  def set_minimum(property: minimum, value: Double): Unit = js.native
  @JSName("set")
  def set_numericMargin(property: numericMargin, value: Double): Unit = js.native
  @JSName("watch")
  def watch_constraints(
    property: constraints,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_labelStyle(
    property: labelStyle,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_labels(
    property: labels,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
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
  def watch_minimum(
    property: minimum,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_numericMargin(
    property: numericMargin,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
}


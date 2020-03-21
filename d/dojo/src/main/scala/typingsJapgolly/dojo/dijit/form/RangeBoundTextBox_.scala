package typingsJapgolly.dojo.dijit.form

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dijit.form.RangeBoundTextBox.Constraints
import typingsJapgolly.dojo.dojoStrings.pattern
import typingsJapgolly.dojo.dojoStrings.rangeMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/RangeBoundTextBox.html
  *
  * Base class for textbox form widgets which defines a range of valid values.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree.     
  */
@JSGlobal("dijit.form.RangeBoundTextBox")
@js.native
class RangeBoundTextBox_ () extends MappedTextBox {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * The message to display if value is out-of-range
    * 
    */
  var rangeMessage: String = js.native
  /**
    * Replaceable function to convert a value to a properly formatted string.
    * 
    * @param value             
    * @param constraints             
    */
  def format(value: js.Object, constraints: js.Object): String = js.native
  @JSName("get")
  def get_rangeMessage(property: rangeMessage): String = js.native
  /**
    * Tests if the value is in the min/max range specified in constraints
    * 
    * @param isFocused             
    */
  def isInRange(isFocused: Boolean): js.Any = js.native
  /**
    * 
    * @param isFocused             
    */
  @JSName("isValid")
  def isValid_MRangeBoundTextBox_(isFocused: Boolean): js.Any = js.native
  /**
    * Overridable function used to validate the range of the numeric input value.
    * 
    * @param primitive             
    * @param constraints             
    */
  def rangeCheck(primitive: Double, constraints: Constraints): Boolean = js.native
  @JSName("set")
  def set_pattern(property: pattern, value: js.Any): Unit = js.native
  @JSName("set")
  def set_rangeMessage(property: rangeMessage, value: String): Unit = js.native
  @JSName("watch")
  def watch_rangeMessage(
    property: rangeMessage,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}


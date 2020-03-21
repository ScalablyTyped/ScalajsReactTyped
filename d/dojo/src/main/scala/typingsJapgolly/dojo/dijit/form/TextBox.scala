package typingsJapgolly.dojo.dijit.form

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dojoStrings.displayedValue
import typingsJapgolly.dojo.dojoStrings.lowercase
import typingsJapgolly.dojo.dojoStrings.maxLength
import typingsJapgolly.dojo.dojoStrings.placeHolder
import typingsJapgolly.dojo.dojoStrings.propercase
import typingsJapgolly.dojo.dojoStrings.selectOnClick
import typingsJapgolly.dojo.dojoStrings.trim
import typingsJapgolly.dojo.dojoStrings.uppercase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/TextBox.html
  *
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.dojo.dijit.form.TextBoxMixin because Inheritance from two classes. Inlined displayedValue, lowercase, maxLength, placeHolder, propercase, selectOnClick, trim, uppercase, filter, format, parse, postCreate, reset, selectInputText, onInput */ @JSGlobal("dijit.form.TextBox")
@js.native
class TextBox () extends FormValueWidget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * For subclasses like ComboBox where the displayed value
    * (ex: Kentucky) and the serialized value (ex: KY) are different,
    * this represents the displayed value.
    * 
    * Setting 'displayedValue' through set('displayedValue', ...)
    * updates 'value', and vice-versa.  Otherwise 'value' is updated
    * from 'displayedValue' periodically, like onBlur etc.
    * 
    * TODO: move declaration to MappedTextBox?
    * Problem is that ComboBox references displayedValue,
    * for benefit of FilteringSelect.
    * 
    */
  var displayedValue: String = js.native
  /**
    * Converts all characters to lowercase if true.  Default is false.
    * 
    */
  var lowercase: Boolean = js.native
  /**
    * HTML INPUT tag maxLength declaration.
    * 
    */
  var maxLength: String = js.native
  /**
    * Defines a hint to help users fill out the input field (as defined in HTML 5).
    * This should only contain plain text (no html markup).
    * 
    */
  var placeHolder: String = js.native
  /**
    * Converts the first character of each word to uppercase if true.
    * 
    */
  var propercase: Boolean = js.native
  /**
    * If true, all text will be selected when focused with mouse
    * 
    */
  var selectOnClick: Boolean = js.native
  /**
    * Removes leading and trailing whitespace if true.  Default is false.
    * 
    */
  var trim: Boolean = js.native
  /**
    * Converts all characters to uppercase if true.  Default is false.
    * 
    */
  var uppercase: Boolean = js.native
  /**
    * Auto-corrections (such as trimming) that are applied to textbox
    * value on blur or form submit.
    * For MappedTextBox subclasses, this is called twice
    * 
    * once with the display value
    * once the value as set/returned by set('value', ...)
    * and get('value'), ex: a Number for NumberTextBox.
    * 
    * In the latter case it does corrections like converting null to NaN.  In
    * the former case the NumberTextBox.filter() method calls this.inherited()
    * to execute standard trimming code in TextBox.filter().
    * 
    * TODO: break this into two methods in 2.0
    * 
    * @param val             
    */
  def filter(`val`: js.Any): js.Any = js.native
  /**
    * Replaceable function to convert a value to a properly formatted string.
    * 
    * @param value             
    * @param constraints             
    */
  def format(value: String, constraints: js.Object): String = js.native
  /**
    * Deprecated.  Use get('displayedValue') instead.
    * 
    */
  def getDisplayedValue(): js.Any = js.native
  @JSName("get")
  def get_displayedValue(property: displayedValue): String = js.native
  @JSName("get")
  def get_lowercase(property: lowercase): Boolean = js.native
  @JSName("get")
  def get_maxLength(property: maxLength): String = js.native
  @JSName("get")
  def get_placeHolder(property: placeHolder): String = js.native
  @JSName("get")
  def get_propercase(property: propercase): Boolean = js.native
  @JSName("get")
  def get_selectOnClick(property: selectOnClick): Boolean = js.native
  @JSName("get")
  def get_trim(property: trim): Boolean = js.native
  @JSName("get")
  def get_uppercase(property: uppercase): Boolean = js.native
  /**
    * Connect to this function to receive notifications of various user data-input events.
    * Return false to cancel the event and prevent it from being processed.
    * 
    * @param event keydown | keypress | cut | paste | input             
    */
  def onInput(event: js.Any): Unit = js.native
  /**
    * Replaceable function to convert a formatted string to a value
    * 
    * @param value             
    * @param constraints             
    */
  def parse(value: String, constraints: js.Object): String = js.native
  /**
    * Select text in the input element argument, from start (default 0), to stop (default end).
    * 
    * @param element             
    * @param start               Optional            
    * @param stop               Optional            
    */
  def selectInputText(element: HTMLElement, start: Double, stop: Double): Unit = js.native
  /**
    * Deprecated.  Use set('displayedValue', ...) instead.
    * 
    * @param value             
    */
  def setDisplayedValue(value: String): Unit = js.native
  @JSName("set")
  def set_displayedValue(property: displayedValue, value: String): Unit = js.native
  @JSName("set")
  def set_lowercase(property: lowercase, value: Boolean): Unit = js.native
  @JSName("set")
  def set_maxLength(property: maxLength, value: String): Unit = js.native
  @JSName("set")
  def set_placeHolder(property: placeHolder, value: String): Unit = js.native
  @JSName("set")
  def set_propercase(property: propercase, value: Boolean): Unit = js.native
  @JSName("set")
  def set_selectOnClick(property: selectOnClick, value: Boolean): Unit = js.native
  @JSName("set")
  def set_trim(property: trim, value: Boolean): Unit = js.native
  @JSName("set")
  def set_uppercase(property: uppercase, value: Boolean): Unit = js.native
  @JSName("watch")
  def watch_displayedValue(
    property: displayedValue,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_lowercase(
    property: lowercase,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_maxLength(
    property: maxLength,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_placeHolder(
    property: placeHolder,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_propercase(
    property: propercase,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_selectOnClick(
    property: selectOnClick,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_trim(
    property: trim,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_uppercase(
    property: uppercase,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
}


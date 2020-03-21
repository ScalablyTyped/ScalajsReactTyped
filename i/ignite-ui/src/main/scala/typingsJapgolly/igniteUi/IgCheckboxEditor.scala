package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgCheckboxEditor
  extends /**
	 * Option for igCheckboxEditor
	 */
/* optionName */ StringDictionary[js.Any] {
  var allowNullValue: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Fired when the input field of the editor loses focus.
  	 */
  var blur: js.UndefOr[BlurEvent] = js.undefined
  /**
  	 * Gets/Sets whether the checkbox is checked.
  	 *
  	 */
  var checked: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets the disabled attribute for the input. If set to true the input is disabled, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is not submitted.
  	 *
  	 */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Fired when the input field of the editor gets focus.
  	 */
  var focus: js.UndefOr[IgFocusEvent] = js.undefined
  /**
  	 * Gets/Sets the height of the control.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will fit the editor inside its parent container, if no other heights are defined.
  	 */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Gets/Sets a custom class on the checkbox. Custom image can be used this way.
  	 * The following jQuery classes can be used in addition http://api.jqueryui.com/theming/icons/
  	 *
  	 */
  var iconClass: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the name attribute of the value input. This input is used to sent the value to the server. In case the target element is input and it has name attribute, but the developer has set the inputName option, so this option overwrites the value input and removes the attribute from the element.
  	 *
  	 */
  var inputName: js.UndefOr[String] = js.undefined
  /**
  	 * Fired on keydown event.
  	 * Return false in order to cancel key action.
  	 */
  var keydown: js.UndefOr[KeydownEvent] = js.undefined
  /**
  	 * Fired on keypress event.
  	 * Return false in order to cancel key action.
  	 */
  var keypress: js.UndefOr[KeypressEvent] = js.undefined
  /**
  	 * Fired on keyup event.
  	 */
  var keyup: js.UndefOr[KeyupEvent] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Fired on mousedown event.
  	 */
  var mousedown: js.UndefOr[MousedownEvent] = js.undefined
  /**
  	 * Fired on mousemove at any part of editor including the drop-down list.
  	 */
  var mousemove: js.UndefOr[MousemoveEvent] = js.undefined
  /**
  	 * Fired on mouseleave at any part of editor including the drop-down list.
  	 */
  var mouseout: js.UndefOr[MouseoutEvent] = js.undefined
  /**
  	 * Fired on mouseover at any part of editor including the drop-down list.
  	 */
  var mouseover: js.UndefOr[MouseoverEvent] = js.undefined
  /**
  	 * Fired on mouseup event.
  	 */
  var mouseup: js.UndefOr[MouseupEvent] = js.undefined
  var nullValue: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets the readonly attribute. Does not allow editing. Disables changing the checkbox state as an interaction, but it still can be changed programmatically. On submit the current value is sent into the request.
  	 *
  	 */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Fired after rendering of the editor has finished.
  	 */
  var rendered: js.UndefOr[RenderedEvent] = js.undefined
  /**
  	 * Fired before rendering of the editor has finished.
  	 */
  var rendering: js.UndefOr[RenderingEvent] = js.undefined
  /**
  	 * Gets/Sets size of the checkbox based on preset styles.For different sizes, define 'width' and 'height' options instead.
  	 *
  	 *
  	 * Valid values:
  	 * "verysmall" The size of the Checkbox editor is very small.
  	 * "small" The size of the Checkbox editor is small.
  	 * "normal" The size of the Checkbox editor is normal.
  	 * "large" The size of the Checkbox editor is large.
  	 */
  var size: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets tabIndex attribute for the editor input.
  	 *
  	 */
  var tabIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets/Sets options supported by the [igValidator](ui.igvalidator#options) widget.
  	 * Note: Validation rules of [igValidator](ui.igvalidator#options), such as min and max value/length are applied separately triggering errors,
  	 * while the corresponding options of the editor prevent values violating the defined rules from being entered.
  	 *
  	 */
  var validatorOptions: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets value in editor. The effect of setting/getting that option depends on type of editor and on dataMode options for every type of editor.
  	 *
  	 */
  var value: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Fired after the editor's value has been changed.
  	 */
  var valueChanged: js.UndefOr[ValueChangedEvent] = js.undefined
  /**
  	 * Fired before changing the editor's value.
  	 * Return false in order to cancel change.
  	 */
  var valueChanging: js.UndefOr[ValueChangingEvent] = js.undefined
  /**
  	 * Gets/Sets the width of the control.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will stretch to fit data, if no other widths are defined.
  	 */
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgCheckboxEditor {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igCheckboxEditor
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    allowNullValue: js.UndefOr[Boolean] = js.undefined,
    blur: (/* event */ Event_, /* ui */ BlurEventUIParam) => Callback = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focus: (/* event */ Event_, /* ui */ IgFocusEventUIParam) => Callback = null,
    height: String | Double = null,
    iconClass: String = null,
    inputName: String = null,
    keydown: (/* event */ Event_, /* ui */ KeydownEventUIParam) => Callback = null,
    keypress: (/* event */ Event_, /* ui */ KeypressEventUIParam) => Callback = null,
    keyup: (/* event */ Event_, /* ui */ KeyupEventUIParam) => Callback = null,
    language: String = null,
    locale: js.Any = null,
    mousedown: (/* event */ Event_, /* ui */ MousedownEventUIParam) => Callback = null,
    mousemove: (/* event */ Event_, /* ui */ MousemoveEventUIParam) => Callback = null,
    mouseout: (/* event */ Event_, /* ui */ MouseoutEventUIParam) => Callback = null,
    mouseover: (/* event */ Event_, /* ui */ MouseoverEventUIParam) => Callback = null,
    mouseup: (/* event */ Event_, /* ui */ MouseupEventUIParam) => Callback = null,
    nullValue: js.Any = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    regional: String | js.Object = null,
    rendered: (/* event */ Event_, /* ui */ RenderedEventUIParam) => Callback = null,
    rendering: (/* event */ Event_, /* ui */ RenderingEventUIParam) => Callback = null,
    size: String = null,
    tabIndex: Int | Double = null,
    validatorOptions: js.Any = null,
    value: js.Any = null,
    valueChanged: (/* event */ Event_, /* ui */ ValueChangedEventUIParam) => Callback = null,
    valueChanging: (/* event */ Event_, /* ui */ ValueChangingEventUIParam) => Callback = null,
    width: String | Double = null
  ): IgCheckboxEditor = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowNullValue)) __obj.updateDynamic("allowNullValue")(allowNullValue.asInstanceOf[js.Any])
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.BlurEventUIParam) => blur(t0, t1).runNow()))
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.IgFocusEventUIParam) => focus(t0, t1).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (inputName != null) __obj.updateDynamic("inputName")(inputName.asInstanceOf[js.Any])
    if (keydown != null) __obj.updateDynamic("keydown")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.KeydownEventUIParam) => keydown(t0, t1).runNow()))
    if (keypress != null) __obj.updateDynamic("keypress")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.KeypressEventUIParam) => keypress(t0, t1).runNow()))
    if (keyup != null) __obj.updateDynamic("keyup")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.KeyupEventUIParam) => keyup(t0, t1).runNow()))
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mousedown != null) __obj.updateDynamic("mousedown")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.MousedownEventUIParam) => mousedown(t0, t1).runNow()))
    if (mousemove != null) __obj.updateDynamic("mousemove")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.MousemoveEventUIParam) => mousemove(t0, t1).runNow()))
    if (mouseout != null) __obj.updateDynamic("mouseout")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.MouseoutEventUIParam) => mouseout(t0, t1).runNow()))
    if (mouseover != null) __obj.updateDynamic("mouseover")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.MouseoverEventUIParam) => mouseover(t0, t1).runNow()))
    if (mouseup != null) __obj.updateDynamic("mouseup")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.MouseupEventUIParam) => mouseup(t0, t1).runNow()))
    if (nullValue != null) __obj.updateDynamic("nullValue")(nullValue.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (rendered != null) __obj.updateDynamic("rendered")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.RenderedEventUIParam) => rendered(t0, t1).runNow()))
    if (rendering != null) __obj.updateDynamic("rendering")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.RenderingEventUIParam) => rendering(t0, t1).runNow()))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (validatorOptions != null) __obj.updateDynamic("validatorOptions")(validatorOptions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueChanged != null) __obj.updateDynamic("valueChanged")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ValueChangedEventUIParam) => valueChanged(t0, t1).runNow()))
    if (valueChanging != null) __obj.updateDynamic("valueChanging")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ValueChangingEventUIParam) => valueChanging(t0, t1).runNow()))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgCheckboxEditor]
  }
}


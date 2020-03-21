package typingsJapgolly.ionicCore.componentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.ionicCore.ionicCoreStrings.decimal
import typingsJapgolly.ionicCore.ionicCoreStrings.email
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.ionicCoreStrings.none
import typingsJapgolly.ionicCore.ionicCoreStrings.number
import typingsJapgolly.ionicCore.ionicCoreStrings.numeric
import typingsJapgolly.ionicCore.ionicCoreStrings.off
import typingsJapgolly.ionicCore.ionicCoreStrings.on
import typingsJapgolly.ionicCore.ionicCoreStrings.password
import typingsJapgolly.ionicCore.ionicCoreStrings.search
import typingsJapgolly.ionicCore.ionicCoreStrings.tel
import typingsJapgolly.ionicCore.ionicCoreStrings.text
import typingsJapgolly.ionicCore.ionicCoreStrings.url
import typingsJapgolly.ionicCore.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSearchbar extends js.Object {
  /**
    * If `true`, enable searchbar animation.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the input's autocomplete property.
    */
  var autocomplete: js.UndefOr[on | off] = js.undefined
  /**
    * Set the input's autocorrect property.
    */
  var autocorrect: js.UndefOr[on | off] = js.undefined
  /**
    * Set the cancel button icon. Only applies to `md` mode.
    */
  var cancelButtonIcon: js.UndefOr[String] = js.undefined
  /**
    * Set the the cancel button text. Only applies to `ios` mode.
    */
  var cancelButtonText: js.UndefOr[String] = js.undefined
  /**
    * Set the clear icon. Defaults to `"close-circle"` for `ios` and `"close"` for `md`.
    */
  var clearIcon: js.UndefOr[String] = js.undefined
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke.
    */
  var debounce: js.UndefOr[Double] = js.undefined
  /**
    * If `true`, the user cannot interact with the input.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A hint to the browser for which keyboard to display. Possible values: `"none"`, `"text"`, `"tel"`, `"url"`, `"email"`, `"numeric"`, `"decimal"`, and `"search"`.
    */
  var inputmode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * Emitted when the input loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the cancel button is clicked.
    */
  var onIonCancel: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the value has changed.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the clear input button is clicked.
    */
  var onIonClear: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the input has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when a keyboard input ocurred.
    */
  var onIonInput: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Set the input's placeholder. `placeholder` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * The icon to use as the search icon.
    */
  var searchIcon: js.UndefOr[String] = js.undefined
  /**
    * Sets the behavior for the cancel button. Defaults to `"never"`. Setting to `"focus"` shows the cancel button on focus. Setting to `"never"` hides the cancel button. Setting to `"always"` shows the cancel button regardless of focus state.
    */
  var showCancelButton: js.UndefOr[Boolean | String] = js.undefined
  /**
    * If `true`, enable spellcheck on the input.
    */
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the type of the input.
    */
  var `type`: js.UndefOr[text | password | email | number | search | tel | url] = js.undefined
  /**
    * the value of the searchbar.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}

object IonSearchbar {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    autocomplete: on | off = null,
    autocorrect: on | off = null,
    cancelButtonIcon: String = null,
    cancelButtonText: String = null,
    clearIcon: String = null,
    color: Color = null,
    debounce: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inputmode: none | text | tel | url | email | numeric | decimal | search = null,
    mode: ios | md = null,
    onIonBlur: /* event */ CustomEvent => Callback = null,
    onIonCancel: /* event */ CustomEvent => Callback = null,
    onIonChange: /* event */ CustomEvent => Callback = null,
    onIonClear: /* event */ CustomEvent => Callback = null,
    onIonFocus: /* event */ CustomEvent => Callback = null,
    onIonInput: /* event */ CustomEvent => Callback = null,
    placeholder: String = null,
    searchIcon: String = null,
    showCancelButton: Boolean | String = null,
    spellcheck: js.UndefOr[Boolean] = js.undefined,
    `type`: text | password | email | number | search | tel | url = null,
    value: String = null
  ): IonSearchbar = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (autocorrect != null) __obj.updateDynamic("autocorrect")(autocorrect.asInstanceOf[js.Any])
    if (cancelButtonIcon != null) __obj.updateDynamic("cancelButtonIcon")(cancelButtonIcon.asInstanceOf[js.Any])
    if (cancelButtonText != null) __obj.updateDynamic("cancelButtonText")(cancelButtonText.asInstanceOf[js.Any])
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (inputmode != null) __obj.updateDynamic("inputmode")(inputmode.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onIonBlur != null) __obj.updateDynamic("onIonBlur")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonBlur(t0).runNow()))
    if (onIonCancel != null) __obj.updateDynamic("onIonCancel")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonCancel(t0).runNow()))
    if (onIonChange != null) __obj.updateDynamic("onIonChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonChange(t0).runNow()))
    if (onIonClear != null) __obj.updateDynamic("onIonClear")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonClear(t0).runNow()))
    if (onIonFocus != null) __obj.updateDynamic("onIonFocus")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonFocus(t0).runNow()))
    if (onIonInput != null) __obj.updateDynamic("onIonInput")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonInput(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (searchIcon != null) __obj.updateDynamic("searchIcon")(searchIcon.asInstanceOf[js.Any])
    if (showCancelButton != null) __obj.updateDynamic("showCancelButton")(showCancelButton.asInstanceOf[js.Any])
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSearchbar]
  }
}


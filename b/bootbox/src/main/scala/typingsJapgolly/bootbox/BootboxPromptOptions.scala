package typingsJapgolly.bootbox

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bootbox.bootboxStrings.`extra-large`
import typingsJapgolly.bootbox.bootboxStrings.checkbox
import typingsJapgolly.bootbox.bootboxStrings.date
import typingsJapgolly.bootbox.bootboxStrings.email
import typingsJapgolly.bootbox.bootboxStrings.large
import typingsJapgolly.bootbox.bootboxStrings.lg
import typingsJapgolly.bootbox.bootboxStrings.number
import typingsJapgolly.bootbox.bootboxStrings.password
import typingsJapgolly.bootbox.bootboxStrings.radio
import typingsJapgolly.bootbox.bootboxStrings.range
import typingsJapgolly.bootbox.bootboxStrings.select
import typingsJapgolly.bootbox.bootboxStrings.sm
import typingsJapgolly.bootbox.bootboxStrings.small
import typingsJapgolly.bootbox.bootboxStrings.text
import typingsJapgolly.bootbox.bootboxStrings.textarea
import typingsJapgolly.bootbox.bootboxStrings.time
import typingsJapgolly.bootbox.bootboxStrings.xl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Bootbox options available for prompt modals */
trait BootboxPromptOptions extends BootboxBaseOptions[String] {
  @JSName("buttons")
  var buttons_BootboxPromptOptions: js.UndefOr[BootboxConfirmPromptButtonMap] = js.undefined
  var inputOptions: js.UndefOr[js.Array[AnonGroup]] = js.undefined
  var inputType: js.UndefOr[
    text | textarea | email | select | checkbox | date | time | number | password | radio | range
  ] = js.undefined
  @JSName("title")
  var title_BootboxPromptOptions: String
  var value: js.UndefOr[String] = js.undefined
  @JSName("callback")
  def callback_MBootboxPromptOptions(result: String): js.Any
}

object BootboxPromptOptions {
  @scala.inline
  def apply(
    callback: String => CallbackTo[js.Any],
    title: String,
    animate: js.UndefOr[Boolean] = js.undefined,
    backdrop: js.UndefOr[Boolean] = js.undefined,
    buttons: BootboxConfirmPromptButtonMap = null,
    className: String = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    inputOptions: js.Array[AnonGroup] = null,
    inputType: text | textarea | email | select | checkbox | date | time | number | password | radio | range = null,
    locale: String = null,
    onEscape: js.Function0[_] | Boolean = null,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    size: small | sm | large | lg | `extra-large` | xl = null,
    value: String = null
  ): BootboxPromptOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: java.lang.String) => callback(t0).runNow()))
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(backdrop)) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (inputOptions != null) __obj.updateDynamic("inputOptions")(inputOptions.asInstanceOf[js.Any])
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onEscape != null) __obj.updateDynamic("onEscape")(onEscape.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxPromptOptions]
  }
}


package typingsJapgolly.bootbox

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Text
import typingsJapgolly.bootbox.bootboxStrings.`extra-large`
import typingsJapgolly.bootbox.bootboxStrings.large
import typingsJapgolly.bootbox.bootboxStrings.lg
import typingsJapgolly.bootbox.bootboxStrings.sm
import typingsJapgolly.bootbox.bootboxStrings.small
import typingsJapgolly.bootbox.bootboxStrings.xl
import typingsJapgolly.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Bootbox options available for alert modals */
trait BootboxAlertOptions extends BootboxDialogOptions[Unit] {
  @JSName("buttons")
  var buttons_BootboxAlertOptions: js.UndefOr[BootboxAlertButtonMap] = js.undefined
  @JSName("callback")
  var callback_BootboxAlertOptions: js.UndefOr[js.Function0[_]] = js.undefined
}

object BootboxAlertOptions {
  @scala.inline
  def apply(
    message: JQuery_[HTMLElement] | js.Array[_] | Element | DocumentFragment | Text | String | (js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery_[HTMLElement]]),
    animate: js.UndefOr[Boolean] = js.undefined,
    backdrop: js.UndefOr[Boolean] = js.undefined,
    buttons: BootboxAlertButtonMap = null,
    callback: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    centerVertical: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    onEscape: js.Function0[_] | Boolean = null,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    size: small | sm | large | lg | `extra-large` | xl = null,
    swapButtonOrder: js.UndefOr[Boolean] = js.undefined,
    title: String | Element = null
  ): BootboxAlertOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(backdrop)) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    callback.foreach(p => __obj.updateDynamic("callback")(p.toJsFn))
    if (!js.isUndefined(centerVertical)) __obj.updateDynamic("centerVertical")(centerVertical.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onEscape != null) __obj.updateDynamic("onEscape")(onEscape.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(swapButtonOrder)) __obj.updateDynamic("swapButtonOrder")(swapButtonOrder.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxAlertOptions]
  }
}


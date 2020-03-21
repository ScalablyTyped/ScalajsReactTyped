package typingsJapgolly.inboxsdk.mod.Widgets

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalOptions extends js.Object {
  var buttons: js.UndefOr[js.Array[ModalButtonDescriptor]] = js.undefined
  var chrome: js.UndefOr[Boolean] = js.undefined
  var constrainTitleWidth: js.UndefOr[Boolean] = js.undefined
  var el: HTMLElement
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object ModalOptions {
  @scala.inline
  def apply(
    el: HTMLElement,
    buttons: js.Array[ModalButtonDescriptor] = null,
    chrome: js.UndefOr[Boolean] = js.undefined,
    constrainTitleWidth: js.UndefOr[Boolean] = js.undefined,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): ModalOptions = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(chrome)) __obj.updateDynamic("chrome")(chrome.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainTitleWidth)) __obj.updateDynamic("constrainTitleWidth")(constrainTitleWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalOptions]
  }
}


package typingsJapgolly.braftEditor

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.braftEditor.braftEditorStrings.modal
import typingsJapgolly.braftEditor.mod.ExtendControlType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabled extends ExtendControlType {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var html: js.UndefOr[String | Null] = js.undefined
  var key: String
  var modal: AnonBottomText
  var onClick: js.UndefOr[js.Function] = js.undefined
  var text: js.UndefOr[String | Node] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: modal
}

object AnonDisabled {
  @scala.inline
  def apply(
    key: String,
    modal: AnonBottomText,
    `type`: modal,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    onClick: js.Function = null,
    text: String | Node = null,
    title: String = null
  ): AnonDisabled = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisabled]
  }
}


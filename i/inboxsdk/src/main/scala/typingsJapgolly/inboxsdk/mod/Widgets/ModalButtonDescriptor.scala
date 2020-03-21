package typingsJapgolly.inboxsdk.mod.Widgets

import japgolly.scalajs.react.Callback
import typingsJapgolly.inboxsdk.inboxsdkStrings.PRIMARY_ACTION
import typingsJapgolly.inboxsdk.inboxsdkStrings.SECONDARY_ACTION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalButtonDescriptor extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var orderHint: js.UndefOr[Double] = js.undefined
  var text: String
  var title: String
  var `type`: js.UndefOr[PRIMARY_ACTION | SECONDARY_ACTION] = js.undefined
  def onClick(): Unit
}

object ModalButtonDescriptor {
  @scala.inline
  def apply(
    onClick: Callback,
    text: String,
    title: String,
    color: String = null,
    orderHint: Int | Double = null,
    `type`: PRIMARY_ACTION | SECONDARY_ACTION = null
  ): ModalButtonDescriptor = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(onClick.toJsFn)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalButtonDescriptor]
  }
}


package typingsJapgolly.antd.formItemInputMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.formItemMod.ValidateStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormItemInputMiscProps extends js.Object {
  var children: Node
  var errors: js.Array[Node]
  var hasFeedback: js.UndefOr[Boolean] = js.undefined
  var prefixCls: String
  var validateStatus: js.UndefOr[ValidateStatus] = js.undefined
  def onDomErrorVisibleChange(visible: Boolean): Unit
}

object FormItemInputMiscProps {
  @scala.inline
  def apply(
    errors: js.Array[Node],
    onDomErrorVisibleChange: Boolean => Callback,
    prefixCls: String,
    children: VdomNode = null,
    hasFeedback: js.UndefOr[Boolean] = js.undefined,
    validateStatus: ValidateStatus = null
  ): FormItemInputMiscProps = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.updateDynamic("onDomErrorVisibleChange")(js.Any.fromFunction1((t0: scala.Boolean) => onDomErrorVisibleChange(t0).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(hasFeedback)) __obj.updateDynamic("hasFeedback")(hasFeedback.asInstanceOf[js.Any])
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(validateStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormItemInputMiscProps]
  }
}


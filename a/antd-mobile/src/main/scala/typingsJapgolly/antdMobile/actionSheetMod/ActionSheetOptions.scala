package typingsJapgolly.antdMobile.actionSheetMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetOptions extends js.Object {
  var cancelButtonIndex: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var destructiveButtonIndex: js.UndefOr[Double] = js.undefined
  var maskClosable: js.UndefOr[Boolean] = js.undefined
  var maskTransitionName: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[Node] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
}

object ActionSheetOptions {
  @scala.inline
  def apply(
    cancelButtonIndex: Int | Double = null,
    className: String = null,
    destructiveButtonIndex: Int | Double = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskTransitionName: String = null,
    message: VdomNode = null,
    title: VdomNode = null,
    transitionName: String = null
  ): ActionSheetOptions = {
    val __obj = js.Dynamic.literal()
    if (cancelButtonIndex != null) __obj.updateDynamic("cancelButtonIndex")(cancelButtonIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (destructiveButtonIndex != null) __obj.updateDynamic("destructiveButtonIndex")(destructiveButtonIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetOptions]
  }
}


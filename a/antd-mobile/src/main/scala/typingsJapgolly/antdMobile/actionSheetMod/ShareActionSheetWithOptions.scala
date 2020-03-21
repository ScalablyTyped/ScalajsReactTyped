package typingsJapgolly.antdMobile.actionSheetMod

import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareActionSheetWithOptions extends ActionSheetOptions {
  var badges: js.UndefOr[js.Array[BadgesOption]] = js.undefined
  var options: js.Array[js.Array[ShareOption] | ShareOption]
}

object ShareActionSheetWithOptions {
  @scala.inline
  def apply(
    options: js.Array[js.Array[ShareOption] | ShareOption],
    badges: js.Array[BadgesOption] = null,
    cancelButtonIndex: Int | Double = null,
    className: String = null,
    destructiveButtonIndex: Int | Double = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskTransitionName: String = null,
    message: VdomNode = null,
    title: VdomNode = null,
    transitionName: String = null
  ): ShareActionSheetWithOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (badges != null) __obj.updateDynamic("badges")(badges.asInstanceOf[js.Any])
    if (cancelButtonIndex != null) __obj.updateDynamic("cancelButtonIndex")(cancelButtonIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (destructiveButtonIndex != null) __obj.updateDynamic("destructiveButtonIndex")(destructiveButtonIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareActionSheetWithOptions]
  }
}


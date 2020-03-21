package typingsJapgolly.reactNativeZssRichTextEditor.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RichTextToolbarOptionalProps extends js.Object {
  // An array of actions to be provided by this toolbar.
  var actions: js.Array[ACTIONS]
  var iconMap: IconsMap
  var iconTint: String
  var onPressAddImage: FunctionWithZeroArgs
  // Functions called when the addLink or addImage actions are tapped.
  var onPressAddLink: FunctionWithZeroArgs
  var selectedButtonStyle: ElementStyles
  var selectedIconTint: String
  var unselectedButtonStyle: ElementStyles
  def renderAction(): Node
}

object RichTextToolbarOptionalProps {
  @scala.inline
  def apply(
    actions: js.Array[ACTIONS],
    iconMap: IconsMap,
    iconTint: String,
    onPressAddImage: Callback,
    onPressAddLink: Callback,
    renderAction: CallbackTo[Node],
    selectedIconTint: String,
    selectedButtonStyle: ElementStyles = null,
    unselectedButtonStyle: ElementStyles = null
  ): RichTextToolbarOptionalProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], iconMap = iconMap.asInstanceOf[js.Any], iconTint = iconTint.asInstanceOf[js.Any], selectedIconTint = selectedIconTint.asInstanceOf[js.Any])
    __obj.updateDynamic("onPressAddImage")(onPressAddImage.toJsFn)
    __obj.updateDynamic("onPressAddLink")(onPressAddLink.toJsFn)
    __obj.updateDynamic("renderAction")(renderAction.toJsFn)
    if (selectedButtonStyle != null) __obj.updateDynamic("selectedButtonStyle")(selectedButtonStyle.asInstanceOf[js.Any])
    if (unselectedButtonStyle != null) __obj.updateDynamic("unselectedButtonStyle")(unselectedButtonStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichTextToolbarOptionalProps]
  }
}


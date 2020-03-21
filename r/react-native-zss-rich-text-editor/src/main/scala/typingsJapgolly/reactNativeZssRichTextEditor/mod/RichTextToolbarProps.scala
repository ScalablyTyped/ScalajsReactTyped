package typingsJapgolly.reactNativeZssRichTextEditor.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<react-native-zss-rich-text-editor.react-native-zss-rich-text-editor.RichTextToolbarOptionalProps> */
trait RichTextToolbarProps extends js.Object {
  var actions: js.UndefOr[js.Array[ACTIONS]] = js.undefined
  var iconMap: js.UndefOr[IconsMap] = js.undefined
  var iconTint: js.UndefOr[String] = js.undefined
  var onPressAddImage: js.UndefOr[FunctionWithZeroArgs] = js.undefined
  var onPressAddLink: js.UndefOr[FunctionWithZeroArgs] = js.undefined
  var renderAction: js.UndefOr[js.Function0[Node]] = js.undefined
  var selectedButtonStyle: js.UndefOr[ElementStyles] = js.undefined
  var selectedIconTint: js.UndefOr[String] = js.undefined
  var unselectedButtonStyle: js.UndefOr[ElementStyles] = js.undefined
  // Must provide a function that returns a ref to a RichTextEditor component.
  def getEditor(): RichTextEditor
}

object RichTextToolbarProps {
  @scala.inline
  def apply(
    getEditor: CallbackTo[RichTextEditor],
    actions: js.Array[ACTIONS] = null,
    iconMap: IconsMap = null,
    iconTint: String = null,
    onPressAddImage: js.UndefOr[Callback] = js.undefined,
    onPressAddLink: js.UndefOr[Callback] = js.undefined,
    renderAction: js.UndefOr[CallbackTo[Node]] = js.undefined,
    selectedButtonStyle: ElementStyles = null,
    selectedIconTint: String = null,
    unselectedButtonStyle: ElementStyles = null
  ): RichTextToolbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEditor")(getEditor.toJsFn)
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (iconMap != null) __obj.updateDynamic("iconMap")(iconMap.asInstanceOf[js.Any])
    if (iconTint != null) __obj.updateDynamic("iconTint")(iconTint.asInstanceOf[js.Any])
    onPressAddImage.foreach(p => __obj.updateDynamic("onPressAddImage")(p.toJsFn))
    onPressAddLink.foreach(p => __obj.updateDynamic("onPressAddLink")(p.toJsFn))
    renderAction.foreach(p => __obj.updateDynamic("renderAction")(p.toJsFn))
    if (selectedButtonStyle != null) __obj.updateDynamic("selectedButtonStyle")(selectedButtonStyle.asInstanceOf[js.Any])
    if (selectedIconTint != null) __obj.updateDynamic("selectedIconTint")(selectedIconTint.asInstanceOf[js.Any])
    if (unselectedButtonStyle != null) __obj.updateDynamic("unselectedButtonStyle")(unselectedButtonStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichTextToolbarProps]
  }
}


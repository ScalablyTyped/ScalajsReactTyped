package typingsJapgolly.reactNativeZssRichTextEditor.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeZssRichTextEditor.PartialRichTextToolbarPro
import typingsJapgolly.reactNativeZssRichTextEditor.mod.ACTIONS
import typingsJapgolly.reactNativeZssRichTextEditor.mod.ElementStyles
import typingsJapgolly.reactNativeZssRichTextEditor.mod.IconsMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RichTextToolbar {
  def apply(
    actions: js.Array[ACTIONS] = null,
    getEditor: js.UndefOr[CallbackTo[typingsJapgolly.reactNativeZssRichTextEditor.mod.RichTextEditor]] = js.undefined,
    iconMap: IconsMap = null,
    iconTint: String = null,
    onPressAddImage: js.UndefOr[Callback] = js.undefined,
    onPressAddLink: js.UndefOr[Callback] = js.undefined,
    renderAction: js.UndefOr[CallbackTo[Node]] = js.undefined,
    selectedButtonStyle: ElementStyles = null,
    selectedIconTint: String = null,
    unselectedButtonStyle: ElementStyles = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PartialRichTextToolbarPro, 
    typingsJapgolly.reactNativeZssRichTextEditor.mod.RichTextToolbar, 
    Unit, 
    PartialRichTextToolbarPro
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    getEditor.foreach(p => __obj.updateDynamic("getEditor")(p.toJsFn))
    if (iconMap != null) __obj.updateDynamic("iconMap")(iconMap.asInstanceOf[js.Any])
    if (iconTint != null) __obj.updateDynamic("iconTint")(iconTint.asInstanceOf[js.Any])
    onPressAddImage.foreach(p => __obj.updateDynamic("onPressAddImage")(p.toJsFn))
    onPressAddLink.foreach(p => __obj.updateDynamic("onPressAddLink")(p.toJsFn))
    renderAction.foreach(p => __obj.updateDynamic("renderAction")(p.toJsFn))
    if (selectedButtonStyle != null) __obj.updateDynamic("selectedButtonStyle")(selectedButtonStyle.asInstanceOf[js.Any])
    if (selectedIconTint != null) __obj.updateDynamic("selectedIconTint")(selectedIconTint.asInstanceOf[js.Any])
    if (unselectedButtonStyle != null) __obj.updateDynamic("unselectedButtonStyle")(unselectedButtonStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeZssRichTextEditor.PartialRichTextToolbarPro, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeZssRichTextEditor.mod.RichTextToolbar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeZssRichTextEditor.PartialRichTextToolbarPro])(children: _*)
  }
  @JSImport("react-native-zss-rich-text-editor", "RichTextToolbar")
  @js.native
  object componentImport extends js.Object
  
}


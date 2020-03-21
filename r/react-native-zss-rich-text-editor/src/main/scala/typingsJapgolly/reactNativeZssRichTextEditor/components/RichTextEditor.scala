package typingsJapgolly.reactNativeZssRichTextEditor.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeZssRichTextEditor.PartialRichTextEditorProp
import typingsJapgolly.reactNativeZssRichTextEditor.mod.ContentInset
import typingsJapgolly.reactNativeZssRichTextEditor.mod.RichTextStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RichTextEditor {
  def apply(
    contentInset: ContentInset = null,
    contentPlaceholder: String = null,
    customCSS: RichTextStyles = null,
    editorInitializedCallback: js.UndefOr[Callback] = js.undefined,
    enableOnChange: js.UndefOr[Boolean] = js.undefined,
    footerHeight: Int | Double = null,
    hiddenTitle: js.UndefOr[Boolean] = js.undefined,
    initialContentHTML: String = null,
    initialTitleHTML: String = null,
    titlePlaceholder: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PartialRichTextEditorProp, 
    typingsJapgolly.reactNativeZssRichTextEditor.mod.RichTextEditor, 
    Unit, 
    PartialRichTextEditorProp
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (contentPlaceholder != null) __obj.updateDynamic("contentPlaceholder")(contentPlaceholder.asInstanceOf[js.Any])
    if (customCSS != null) __obj.updateDynamic("customCSS")(customCSS.asInstanceOf[js.Any])
    editorInitializedCallback.foreach(p => __obj.updateDynamic("editorInitializedCallback")(p.toJsFn))
    if (!js.isUndefined(enableOnChange)) __obj.updateDynamic("enableOnChange")(enableOnChange.asInstanceOf[js.Any])
    if (footerHeight != null) __obj.updateDynamic("footerHeight")(footerHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(hiddenTitle)) __obj.updateDynamic("hiddenTitle")(hiddenTitle.asInstanceOf[js.Any])
    if (initialContentHTML != null) __obj.updateDynamic("initialContentHTML")(initialContentHTML.asInstanceOf[js.Any])
    if (initialTitleHTML != null) __obj.updateDynamic("initialTitleHTML")(initialTitleHTML.asInstanceOf[js.Any])
    if (titlePlaceholder != null) __obj.updateDynamic("titlePlaceholder")(titlePlaceholder.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeZssRichTextEditor.PartialRichTextEditorProp, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeZssRichTextEditor.mod.RichTextEditor](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeZssRichTextEditor.PartialRichTextEditorProp])(children: _*)
  }
  @JSImport("react-native-zss-rich-text-editor", "RichTextEditor")
  @js.native
  object componentImport extends js.Object
  
}


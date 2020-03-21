package typingsJapgolly.reactNativeZssRichTextEditor

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeZssRichTextEditor.mod.ContentInset
import typingsJapgolly.reactNativeZssRichTextEditor.mod.FunctionWithZeroArgs
import typingsJapgolly.reactNativeZssRichTextEditor.mod.RichTextStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-zss-rich-text-editor.react-native-zss-rich-text-editor.RichTextEditorProps> */
trait PartialRichTextEditorProp extends js.Object {
  var contentInset: js.UndefOr[ContentInset] = js.undefined
  var contentPlaceholder: js.UndefOr[String] = js.undefined
  var customCSS: js.UndefOr[RichTextStyles] = js.undefined
  var editorInitializedCallback: js.UndefOr[FunctionWithZeroArgs] = js.undefined
  var enableOnChange: js.UndefOr[Boolean] = js.undefined
  var footerHeight: js.UndefOr[Double] = js.undefined
  var hiddenTitle: js.UndefOr[Boolean] = js.undefined
  var initialContentHTML: js.UndefOr[String] = js.undefined
  var initialTitleHTML: js.UndefOr[String] = js.undefined
  var titlePlaceholder: js.UndefOr[String] = js.undefined
}

object PartialRichTextEditorProp {
  @scala.inline
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
    titlePlaceholder: String = null
  ): PartialRichTextEditorProp = {
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
    __obj.asInstanceOf[PartialRichTextEditorProp]
  }
}


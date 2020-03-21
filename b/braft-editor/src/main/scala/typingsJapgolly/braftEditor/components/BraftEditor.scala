package typingsJapgolly.braftEditor.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.braftEditor.AnonFamily
import typingsJapgolly.braftEditor.braftEditorStrings.`zh-hant`
import typingsJapgolly.braftEditor.braftEditorStrings.center
import typingsJapgolly.braftEditor.braftEditorStrings.en
import typingsJapgolly.braftEditor.braftEditorStrings.fr
import typingsJapgolly.braftEditor.braftEditorStrings.jpn
import typingsJapgolly.braftEditor.braftEditorStrings.justify
import typingsJapgolly.braftEditor.braftEditorStrings.kr
import typingsJapgolly.braftEditor.braftEditorStrings.left
import typingsJapgolly.braftEditor.braftEditorStrings.pl
import typingsJapgolly.braftEditor.braftEditorStrings.right
import typingsJapgolly.braftEditor.braftEditorStrings.ru
import typingsJapgolly.braftEditor.braftEditorStrings.tr
import typingsJapgolly.braftEditor.braftEditorStrings.zh
import typingsJapgolly.braftEditor.mod.BraftEditorProps
import typingsJapgolly.braftEditor.mod.BuiltInControlType
import typingsJapgolly.braftEditor.mod.ControlType
import typingsJapgolly.braftEditor.mod.EditorState
import typingsJapgolly.braftEditor.mod.ExtendControlType
import typingsJapgolly.braftEditor.mod.HooksType
import typingsJapgolly.braftEditor.mod.ImageControlType
import typingsJapgolly.braftEditor.mod.MediaType
import typingsJapgolly.braftEditor.mod.default
import typingsJapgolly.immutable.Immutable.Map
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BraftEditor {
  def apply(
    allowInsertLinkText: js.UndefOr[Boolean] = js.undefined,
    blockRenderMap: (Map[_, _]) | js.Function = null,
    blockRendererFn: js.Function = null,
    className: String = null,
    colors: js.Array[String] = null,
    componentBelowControlBar: VdomNode = null,
    contentClassName: String = null,
    contentStyle: CSSProperties = null,
    controlBarClassName: String = null,
    controlBarStyle: CSSProperties = null,
    controls: js.Array[ControlType] = null,
    converts: js.Object = null,
    defaultLinkTarget: String = null,
    defaultValue: EditorState = null,
    draftProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraftEditorProps */ js.Any = null,
    editorId: String = null,
    emojis: js.Array[String] = null,
    excludeControls: js.Array[BuiltInControlType] = null,
    extendControls: js.Array[ExtendControlType] = null,
    fixPlaceholder: js.UndefOr[Boolean] = js.undefined,
    fontFamilies: js.Array[AnonFamily] = null,
    fontSizes: js.Array[Double] = null,
    handleBeforeInput: js.Function = null,
    handleDroppedFiles: js.Function = null,
    handleKeyCommand: js.Function = null,
    handlePastedFiles: js.Function = null,
    handlePastedText: js.Function = null,
    handleReturn: js.Function = null,
    headings: js.Array[String] = null,
    hooks: HooksType = null,
    id: String = null,
    imageControls: js.Array[ImageControlType] = null,
    imageResizable: js.UndefOr[Boolean] = js.undefined,
    language: zh | `zh-hant` | en | tr | ru | jpn | kr | pl | fr | (js.Function2[/* languages */ js.Any, /* context */ js.Any, _]) = null,
    letterSpacings: js.Array[Double] = null,
    lineHeights: js.Array[Double] = null,
    media: MediaType = null,
    onBlur: js.Function = null,
    onChange: /* editorState */ EditorState => Callback = null,
    onDelete: js.Function = null,
    onFocus: js.Function = null,
    onFullscreen: js.Function = null,
    onSave: js.Function = null,
    onTab: js.Function = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    stripPastedStyles: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    textAligns: js.Array[left | center | right | justify] = null,
    textBackgroundColor: js.UndefOr[Boolean] = js.undefined,
    value: EditorState = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[BraftEditorProps, default, Unit, BraftEditorProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(allowInsertLinkText)) __obj.updateDynamic("allowInsertLinkText")(allowInsertLinkText.asInstanceOf[js.Any])
    if (blockRenderMap != null) __obj.updateDynamic("blockRenderMap")(blockRenderMap.asInstanceOf[js.Any])
    if (blockRendererFn != null) __obj.updateDynamic("blockRendererFn")(blockRendererFn.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (componentBelowControlBar != null) __obj.updateDynamic("componentBelowControlBar")(componentBelowControlBar.rawNode.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (controlBarClassName != null) __obj.updateDynamic("controlBarClassName")(controlBarClassName.asInstanceOf[js.Any])
    if (controlBarStyle != null) __obj.updateDynamic("controlBarStyle")(controlBarStyle.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (converts != null) __obj.updateDynamic("converts")(converts.asInstanceOf[js.Any])
    if (defaultLinkTarget != null) __obj.updateDynamic("defaultLinkTarget")(defaultLinkTarget.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (draftProps != null) __obj.updateDynamic("draftProps")(draftProps.asInstanceOf[js.Any])
    if (editorId != null) __obj.updateDynamic("editorId")(editorId.asInstanceOf[js.Any])
    if (emojis != null) __obj.updateDynamic("emojis")(emojis.asInstanceOf[js.Any])
    if (excludeControls != null) __obj.updateDynamic("excludeControls")(excludeControls.asInstanceOf[js.Any])
    if (extendControls != null) __obj.updateDynamic("extendControls")(extendControls.asInstanceOf[js.Any])
    if (!js.isUndefined(fixPlaceholder)) __obj.updateDynamic("fixPlaceholder")(fixPlaceholder.asInstanceOf[js.Any])
    if (fontFamilies != null) __obj.updateDynamic("fontFamilies")(fontFamilies.asInstanceOf[js.Any])
    if (fontSizes != null) __obj.updateDynamic("fontSizes")(fontSizes.asInstanceOf[js.Any])
    if (handleBeforeInput != null) __obj.updateDynamic("handleBeforeInput")(handleBeforeInput.asInstanceOf[js.Any])
    if (handleDroppedFiles != null) __obj.updateDynamic("handleDroppedFiles")(handleDroppedFiles.asInstanceOf[js.Any])
    if (handleKeyCommand != null) __obj.updateDynamic("handleKeyCommand")(handleKeyCommand.asInstanceOf[js.Any])
    if (handlePastedFiles != null) __obj.updateDynamic("handlePastedFiles")(handlePastedFiles.asInstanceOf[js.Any])
    if (handlePastedText != null) __obj.updateDynamic("handlePastedText")(handlePastedText.asInstanceOf[js.Any])
    if (handleReturn != null) __obj.updateDynamic("handleReturn")(handleReturn.asInstanceOf[js.Any])
    if (headings != null) __obj.updateDynamic("headings")(headings.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imageControls != null) __obj.updateDynamic("imageControls")(imageControls.asInstanceOf[js.Any])
    if (!js.isUndefined(imageResizable)) __obj.updateDynamic("imageResizable")(imageResizable.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (letterSpacings != null) __obj.updateDynamic("letterSpacings")(letterSpacings.asInstanceOf[js.Any])
    if (lineHeights != null) __obj.updateDynamic("lineHeights")(lineHeights.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* editorState */ typingsJapgolly.braftEditor.mod.EditorState) => onChange(t0).runNow()))
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus.asInstanceOf[js.Any])
    if (onFullscreen != null) __obj.updateDynamic("onFullscreen")(onFullscreen.asInstanceOf[js.Any])
    if (onSave != null) __obj.updateDynamic("onSave")(onSave.asInstanceOf[js.Any])
    if (onTab != null) __obj.updateDynamic("onTab")(onTab.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(stripPastedStyles)) __obj.updateDynamic("stripPastedStyles")(stripPastedStyles.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textAligns != null) __obj.updateDynamic("textAligns")(textAligns.asInstanceOf[js.Any])
    if (!js.isUndefined(textBackgroundColor)) __obj.updateDynamic("textBackgroundColor")(textBackgroundColor.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.braftEditor.mod.BraftEditorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.braftEditor.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.braftEditor.mod.BraftEditorProps])(children: _*)
  }
  @JSImport("braft-editor", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}


package typingsJapgolly.braftEditor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.File
import typingsJapgolly.braftEditor.anon.Audio
import typingsJapgolly.braftEditor.anon.Embed
import typingsJapgolly.braftEditor.anon.Error
import typingsJapgolly.braftEditor.anon.Family
import typingsJapgolly.braftEditor.braftEditorStrings.`vi-vn`
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
import typingsJapgolly.draftJs.mod.Draft.Model.Encoding.RawDraftContentState
import typingsJapgolly.immutable.mod.Map
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("braft-editor", JSImport.Default)
  @js.native
  open class default () extends BraftEditor
  /* static members */
  object default {
    
    @JSImport("braft-editor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def createEditorState(content: String): EditorState = ^.asInstanceOf[js.Dynamic].applyDynamic("createEditorState")(content.asInstanceOf[js.Any]).asInstanceOf[EditorState]
    inline def createEditorState(content: String, options: js.Object): EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditorState")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EditorState]
    inline def createEditorState(content: Any): EditorState = ^.asInstanceOf[js.Dynamic].applyDynamic("createEditorState")(content.asInstanceOf[js.Any]).asInstanceOf[EditorState]
    inline def createEditorState(content: Any, options: js.Object): EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditorState")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EditorState]
    
    inline def use(`extension`: js.Array[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(`extension`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def use(`extension`: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(`extension`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @js.native
  trait BraftEditor
    extends Component[BraftEditorProps, js.Object, Any] {
    
    def clearEditorContent(): Unit = js.native
    
    def forceRender(): Unit = js.native
    
    def getDraftInstance(): Any = js.native
    
    def getFinderInstance(): Any = js.native
    
    def getValue(): EditorState = js.native
    
    def redo(): Unit = js.native
    
    def setValue(editorState: EditorState): Unit = js.native
    
    def undo(): Unit = js.native
  }
  
  trait BraftEditorProps extends StObject {
    
    var allowInsertLinkText: js.UndefOr[Boolean] = js.undefined
    
    var blockRenderMap: js.UndefOr[(Map[Any, Any]) | js.Function] = js.undefined
    
    var blockRendererFn: js.UndefOr[js.Function] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var colors: js.UndefOr[js.Array[String]] = js.undefined
    
    var componentBelowControlBar: js.UndefOr[Node] = js.undefined
    
    var contentClassName: js.UndefOr[String] = js.undefined
    
    var contentStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var controlBarClassName: js.UndefOr[String] = js.undefined
    
    var controlBarStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var controls: js.UndefOr[js.Array[ControlType]] = js.undefined
    
    var converts: js.UndefOr[js.Object] = js.undefined
    
    var defaultLinkTarget: js.UndefOr[String] = js.undefined
    
    var defaultValue: js.UndefOr[EditorState] = js.undefined
    
    var draftProps: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraftEditorProps */ Any
      ] = js.undefined
    
    var editorId: js.UndefOr[String] = js.undefined
    
    var emojis: js.UndefOr[js.Array[String]] = js.undefined
    
    var excludeControls: js.UndefOr[js.Array[BuiltInControlType]] = js.undefined
    
    var extendControls: js.UndefOr[js.Array[ExtendControlType]] = js.undefined
    
    var fixPlaceholder: js.UndefOr[Boolean] = js.undefined
    
    var fontFamilies: js.UndefOr[js.Array[Family]] = js.undefined
    
    var fontSizes: js.UndefOr[js.Array[Double]] = js.undefined
    
    var handleBeforeInput: js.UndefOr[js.Function] = js.undefined
    
    var handleDroppedFiles: js.UndefOr[js.Function] = js.undefined
    
    var handleKeyCommand: js.UndefOr[js.Function] = js.undefined
    
    var handlePastedFiles: js.UndefOr[js.Function] = js.undefined
    
    var handlePastedText: js.UndefOr[js.Function] = js.undefined
    
    var handleReturn: js.UndefOr[js.Function] = js.undefined
    
    var headings: js.UndefOr[js.Array[String]] = js.undefined
    
    var hooks: js.UndefOr[HooksType] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var imageControls: js.UndefOr[js.Array[ImageControlType]] = js.undefined
    
    var imageEqualRatio: js.UndefOr[Boolean] = js.undefined
    
    var imageResizable: js.UndefOr[Boolean] = js.undefined
    
    var language: js.UndefOr[
        zh | `zh-hant` | en | tr | ru | jpn | kr | pl | fr | `vi-vn` | (js.Function2[/* languages */ Any, /* context */ Any, Any])
      ] = js.undefined
    
    var letterSpacings: js.UndefOr[js.Array[Double]] = js.undefined
    
    var lineHeights: js.UndefOr[js.Array[Double]] = js.undefined
    
    var media: js.UndefOr[MediaType] = js.undefined
    
    var onBlur: js.UndefOr[js.Function] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* editorState */ EditorState, Unit]] = js.undefined
    
    var onDelete: js.UndefOr[js.Function] = js.undefined
    
    var onFocus: js.UndefOr[js.Function] = js.undefined
    
    var onFullscreen: js.UndefOr[js.Function] = js.undefined
    
    var onSave: js.UndefOr[js.Function] = js.undefined
    
    var onTab: js.UndefOr[js.Function] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var stripPastedStyles: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var textAligns: js.UndefOr[js.Array[left | center | right | justify]] = js.undefined
    
    var textBackgroundColor: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[EditorState] = js.undefined
  }
  object BraftEditorProps {
    
    inline def apply(): BraftEditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BraftEditorProps]
    }
    
    extension [Self <: BraftEditorProps](x: Self) {
      
      inline def setAllowInsertLinkText(value: Boolean): Self = StObject.set(x, "allowInsertLinkText", value.asInstanceOf[js.Any])
      
      inline def setAllowInsertLinkTextUndefined: Self = StObject.set(x, "allowInsertLinkText", js.undefined)
      
      inline def setBlockRenderMap(value: (Map[Any, Any]) | js.Function): Self = StObject.set(x, "blockRenderMap", value.asInstanceOf[js.Any])
      
      inline def setBlockRenderMapUndefined: Self = StObject.set(x, "blockRenderMap", js.undefined)
      
      inline def setBlockRendererFn(value: js.Function): Self = StObject.set(x, "blockRendererFn", value.asInstanceOf[js.Any])
      
      inline def setBlockRendererFnUndefined: Self = StObject.set(x, "blockRendererFn", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setComponentBelowControlBar(value: VdomNode): Self = StObject.set(x, "componentBelowControlBar", value.rawNode.asInstanceOf[js.Any])
      
      inline def setComponentBelowControlBarNull: Self = StObject.set(x, "componentBelowControlBar", null)
      
      inline def setComponentBelowControlBarUndefined: Self = StObject.set(x, "componentBelowControlBar", js.undefined)
      
      inline def setComponentBelowControlBarVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "componentBelowControlBar", js.Array(value*))
      
      inline def setComponentBelowControlBarVdomElement(value: VdomElement): Self = StObject.set(x, "componentBelowControlBar", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setControlBarClassName(value: String): Self = StObject.set(x, "controlBarClassName", value.asInstanceOf[js.Any])
      
      inline def setControlBarClassNameUndefined: Self = StObject.set(x, "controlBarClassName", js.undefined)
      
      inline def setControlBarStyle(value: CSSProperties): Self = StObject.set(x, "controlBarStyle", value.asInstanceOf[js.Any])
      
      inline def setControlBarStyleUndefined: Self = StObject.set(x, "controlBarStyle", js.undefined)
      
      inline def setControls(value: js.Array[ControlType]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setControlsVarargs(value: ControlType*): Self = StObject.set(x, "controls", js.Array(value*))
      
      inline def setConverts(value: js.Object): Self = StObject.set(x, "converts", value.asInstanceOf[js.Any])
      
      inline def setConvertsUndefined: Self = StObject.set(x, "converts", js.undefined)
      
      inline def setDefaultLinkTarget(value: String): Self = StObject.set(x, "defaultLinkTarget", value.asInstanceOf[js.Any])
      
      inline def setDefaultLinkTargetUndefined: Self = StObject.set(x, "defaultLinkTarget", js.undefined)
      
      inline def setDefaultValue(value: EditorState): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDraftProps(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraftEditorProps */ Any
      ): Self = StObject.set(x, "draftProps", value.asInstanceOf[js.Any])
      
      inline def setDraftPropsUndefined: Self = StObject.set(x, "draftProps", js.undefined)
      
      inline def setEditorId(value: String): Self = StObject.set(x, "editorId", value.asInstanceOf[js.Any])
      
      inline def setEditorIdUndefined: Self = StObject.set(x, "editorId", js.undefined)
      
      inline def setEmojis(value: js.Array[String]): Self = StObject.set(x, "emojis", value.asInstanceOf[js.Any])
      
      inline def setEmojisUndefined: Self = StObject.set(x, "emojis", js.undefined)
      
      inline def setEmojisVarargs(value: String*): Self = StObject.set(x, "emojis", js.Array(value*))
      
      inline def setExcludeControls(value: js.Array[BuiltInControlType]): Self = StObject.set(x, "excludeControls", value.asInstanceOf[js.Any])
      
      inline def setExcludeControlsUndefined: Self = StObject.set(x, "excludeControls", js.undefined)
      
      inline def setExcludeControlsVarargs(value: BuiltInControlType*): Self = StObject.set(x, "excludeControls", js.Array(value*))
      
      inline def setExtendControls(value: js.Array[ExtendControlType]): Self = StObject.set(x, "extendControls", value.asInstanceOf[js.Any])
      
      inline def setExtendControlsUndefined: Self = StObject.set(x, "extendControls", js.undefined)
      
      inline def setExtendControlsVarargs(value: ExtendControlType*): Self = StObject.set(x, "extendControls", js.Array(value*))
      
      inline def setFixPlaceholder(value: Boolean): Self = StObject.set(x, "fixPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setFixPlaceholderUndefined: Self = StObject.set(x, "fixPlaceholder", js.undefined)
      
      inline def setFontFamilies(value: js.Array[Family]): Self = StObject.set(x, "fontFamilies", value.asInstanceOf[js.Any])
      
      inline def setFontFamiliesUndefined: Self = StObject.set(x, "fontFamilies", js.undefined)
      
      inline def setFontFamiliesVarargs(value: Family*): Self = StObject.set(x, "fontFamilies", js.Array(value*))
      
      inline def setFontSizes(value: js.Array[Double]): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
      
      inline def setFontSizesUndefined: Self = StObject.set(x, "fontSizes", js.undefined)
      
      inline def setFontSizesVarargs(value: Double*): Self = StObject.set(x, "fontSizes", js.Array(value*))
      
      inline def setHandleBeforeInput(value: js.Function): Self = StObject.set(x, "handleBeforeInput", value.asInstanceOf[js.Any])
      
      inline def setHandleBeforeInputUndefined: Self = StObject.set(x, "handleBeforeInput", js.undefined)
      
      inline def setHandleDroppedFiles(value: js.Function): Self = StObject.set(x, "handleDroppedFiles", value.asInstanceOf[js.Any])
      
      inline def setHandleDroppedFilesUndefined: Self = StObject.set(x, "handleDroppedFiles", js.undefined)
      
      inline def setHandleKeyCommand(value: js.Function): Self = StObject.set(x, "handleKeyCommand", value.asInstanceOf[js.Any])
      
      inline def setHandleKeyCommandUndefined: Self = StObject.set(x, "handleKeyCommand", js.undefined)
      
      inline def setHandlePastedFiles(value: js.Function): Self = StObject.set(x, "handlePastedFiles", value.asInstanceOf[js.Any])
      
      inline def setHandlePastedFilesUndefined: Self = StObject.set(x, "handlePastedFiles", js.undefined)
      
      inline def setHandlePastedText(value: js.Function): Self = StObject.set(x, "handlePastedText", value.asInstanceOf[js.Any])
      
      inline def setHandlePastedTextUndefined: Self = StObject.set(x, "handlePastedText", js.undefined)
      
      inline def setHandleReturn(value: js.Function): Self = StObject.set(x, "handleReturn", value.asInstanceOf[js.Any])
      
      inline def setHandleReturnUndefined: Self = StObject.set(x, "handleReturn", js.undefined)
      
      inline def setHeadings(value: js.Array[String]): Self = StObject.set(x, "headings", value.asInstanceOf[js.Any])
      
      inline def setHeadingsUndefined: Self = StObject.set(x, "headings", js.undefined)
      
      inline def setHeadingsVarargs(value: String*): Self = StObject.set(x, "headings", js.Array(value*))
      
      inline def setHooks(value: HooksType): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setImageControls(value: js.Array[ImageControlType]): Self = StObject.set(x, "imageControls", value.asInstanceOf[js.Any])
      
      inline def setImageControlsUndefined: Self = StObject.set(x, "imageControls", js.undefined)
      
      inline def setImageControlsVarargs(value: ImageControlType*): Self = StObject.set(x, "imageControls", js.Array(value*))
      
      inline def setImageEqualRatio(value: Boolean): Self = StObject.set(x, "imageEqualRatio", value.asInstanceOf[js.Any])
      
      inline def setImageEqualRatioUndefined: Self = StObject.set(x, "imageEqualRatio", js.undefined)
      
      inline def setImageResizable(value: Boolean): Self = StObject.set(x, "imageResizable", value.asInstanceOf[js.Any])
      
      inline def setImageResizableUndefined: Self = StObject.set(x, "imageResizable", js.undefined)
      
      inline def setLanguage(
        value: zh | `zh-hant` | en | tr | ru | jpn | kr | pl | fr | `vi-vn` | (js.Function2[/* languages */ Any, /* context */ Any, Any])
      ): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageFunction2(value: (/* languages */ Any, /* context */ Any) => Any): Self = StObject.set(x, "language", js.Any.fromFunction2(value))
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLetterSpacings(value: js.Array[Double]): Self = StObject.set(x, "letterSpacings", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingsUndefined: Self = StObject.set(x, "letterSpacings", js.undefined)
      
      inline def setLetterSpacingsVarargs(value: Double*): Self = StObject.set(x, "letterSpacings", js.Array(value*))
      
      inline def setLineHeights(value: js.Array[Double]): Self = StObject.set(x, "lineHeights", value.asInstanceOf[js.Any])
      
      inline def setLineHeightsUndefined: Self = StObject.set(x, "lineHeights", js.undefined)
      
      inline def setLineHeightsVarargs(value: Double*): Self = StObject.set(x, "lineHeights", js.Array(value*))
      
      inline def setMedia(value: MediaType): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setOnBlur(value: js.Function): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* editorState */ EditorState => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* editorState */ EditorState) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnDelete(value: js.Function): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
      
      inline def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      inline def setOnFocus(value: js.Function): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnFullscreen(value: js.Function): Self = StObject.set(x, "onFullscreen", value.asInstanceOf[js.Any])
      
      inline def setOnFullscreenUndefined: Self = StObject.set(x, "onFullscreen", js.undefined)
      
      inline def setOnSave(value: js.Function): Self = StObject.set(x, "onSave", value.asInstanceOf[js.Any])
      
      inline def setOnSaveUndefined: Self = StObject.set(x, "onSave", js.undefined)
      
      inline def setOnTab(value: js.Function): Self = StObject.set(x, "onTab", value.asInstanceOf[js.Any])
      
      inline def setOnTabUndefined: Self = StObject.set(x, "onTab", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setStripPastedStyles(value: Boolean): Self = StObject.set(x, "stripPastedStyles", value.asInstanceOf[js.Any])
      
      inline def setStripPastedStylesUndefined: Self = StObject.set(x, "stripPastedStyles", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextAligns(value: js.Array[left | center | right | justify]): Self = StObject.set(x, "textAligns", value.asInstanceOf[js.Any])
      
      inline def setTextAlignsUndefined: Self = StObject.set(x, "textAligns", js.undefined)
      
      inline def setTextAlignsVarargs(value: (left | center | right | justify)*): Self = StObject.set(x, "textAligns", js.Array(value*))
      
      inline def setTextBackgroundColor(value: Boolean): Self = StObject.set(x, "textBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setTextBackgroundColorUndefined: Self = StObject.set(x, "textBackgroundColor", js.undefined)
      
      inline def setValue(value: EditorState): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.braftEditor.braftEditorStrings.blockquote
    - typingsJapgolly.braftEditor.braftEditorStrings.bold
    - typingsJapgolly.braftEditor.braftEditorStrings.code
    - typingsJapgolly.braftEditor.braftEditorStrings.clear
    - typingsJapgolly.braftEditor.braftEditorStrings.emoji
    - typingsJapgolly.braftEditor.braftEditorStrings.`font-family`
    - typingsJapgolly.braftEditor.braftEditorStrings.`font-size`
    - typingsJapgolly.braftEditor.braftEditorStrings.fullscreen
    - typingsJapgolly.braftEditor.braftEditorStrings.headings
    - typingsJapgolly.braftEditor.braftEditorStrings.hr
    - typingsJapgolly.braftEditor.braftEditorStrings.italic
    - typingsJapgolly.braftEditor.braftEditorStrings.`letter-spacing`
    - typingsJapgolly.braftEditor.braftEditorStrings.`line-height`
    - typingsJapgolly.braftEditor.braftEditorStrings.link
    - typingsJapgolly.braftEditor.braftEditorStrings.`list-ol`
    - typingsJapgolly.braftEditor.braftEditorStrings.`list-ul`
    - typingsJapgolly.braftEditor.braftEditorStrings.media
    - typingsJapgolly.braftEditor.braftEditorStrings.redo
    - typingsJapgolly.braftEditor.braftEditorStrings.`remove-styles`
    - typingsJapgolly.braftEditor.braftEditorStrings.separator
    - typingsJapgolly.braftEditor.braftEditorStrings.`strike-through`
    - typingsJapgolly.braftEditor.braftEditorStrings.superscript
    - typingsJapgolly.braftEditor.braftEditorStrings.subscript
    - typingsJapgolly.braftEditor.braftEditorStrings.`text-align`
    - typingsJapgolly.braftEditor.braftEditorStrings.`text-color`
    - typingsJapgolly.braftEditor.braftEditorStrings.`text-indent`
    - typingsJapgolly.braftEditor.braftEditorStrings.underline
    - typingsJapgolly.braftEditor.braftEditorStrings.undo
    - typingsJapgolly.braftEditor.braftEditorStrings.table
  */
  trait BuiltInControlType
    extends StObject
       with ControlType
  object BuiltInControlType {
    
    inline def blockquote: typingsJapgolly.braftEditor.braftEditorStrings.blockquote = "blockquote".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.blockquote]
    
    inline def bold: typingsJapgolly.braftEditor.braftEditorStrings.bold = "bold".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.bold]
    
    inline def clear: typingsJapgolly.braftEditor.braftEditorStrings.clear = "clear".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.clear]
    
    inline def code: typingsJapgolly.braftEditor.braftEditorStrings.code = "code".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.code]
    
    inline def emoji: typingsJapgolly.braftEditor.braftEditorStrings.emoji = "emoji".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.emoji]
    
    inline def `font-family`: typingsJapgolly.braftEditor.braftEditorStrings.`font-family` = "font-family".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`font-family`]
    
    inline def `font-size`: typingsJapgolly.braftEditor.braftEditorStrings.`font-size` = "font-size".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`font-size`]
    
    inline def fullscreen: typingsJapgolly.braftEditor.braftEditorStrings.fullscreen = "fullscreen".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.fullscreen]
    
    inline def headings: typingsJapgolly.braftEditor.braftEditorStrings.headings = "headings".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.headings]
    
    inline def hr: typingsJapgolly.braftEditor.braftEditorStrings.hr = "hr".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.hr]
    
    inline def italic: typingsJapgolly.braftEditor.braftEditorStrings.italic = "italic".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.italic]
    
    inline def `letter-spacing`: typingsJapgolly.braftEditor.braftEditorStrings.`letter-spacing` = "letter-spacing".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`letter-spacing`]
    
    inline def `line-height`: typingsJapgolly.braftEditor.braftEditorStrings.`line-height` = "line-height".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`line-height`]
    
    inline def link: typingsJapgolly.braftEditor.braftEditorStrings.link = "link".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.link]
    
    inline def `list-ol`: typingsJapgolly.braftEditor.braftEditorStrings.`list-ol` = "list-ol".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`list-ol`]
    
    inline def `list-ul`: typingsJapgolly.braftEditor.braftEditorStrings.`list-ul` = "list-ul".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`list-ul`]
    
    inline def media: typingsJapgolly.braftEditor.braftEditorStrings.media = "media".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.media]
    
    inline def redo: typingsJapgolly.braftEditor.braftEditorStrings.redo = "redo".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.redo]
    
    inline def `remove-styles`: typingsJapgolly.braftEditor.braftEditorStrings.`remove-styles` = "remove-styles".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`remove-styles`]
    
    inline def separator: typingsJapgolly.braftEditor.braftEditorStrings.separator = "separator".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.separator]
    
    inline def `strike-through`: typingsJapgolly.braftEditor.braftEditorStrings.`strike-through` = "strike-through".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`strike-through`]
    
    inline def subscript: typingsJapgolly.braftEditor.braftEditorStrings.subscript = "subscript".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.subscript]
    
    inline def superscript: typingsJapgolly.braftEditor.braftEditorStrings.superscript = "superscript".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.superscript]
    
    inline def table: typingsJapgolly.braftEditor.braftEditorStrings.table = "table".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.table]
    
    inline def `text-align`: typingsJapgolly.braftEditor.braftEditorStrings.`text-align` = "text-align".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`text-align`]
    
    inline def `text-color`: typingsJapgolly.braftEditor.braftEditorStrings.`text-color` = "text-color".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`text-color`]
    
    inline def `text-indent`: typingsJapgolly.braftEditor.braftEditorStrings.`text-indent` = "text-indent".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`text-indent`]
    
    inline def underline: typingsJapgolly.braftEditor.braftEditorStrings.underline = "underline".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.underline]
    
    inline def undo: typingsJapgolly.braftEditor.braftEditorStrings.undo = "undo".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.undo]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.braftEditor.mod.BuiltInControlType
    - typingsJapgolly.braftEditor.anon.Key
    - typingsJapgolly.braftEditor.mod.ExtendControlType
  */
  trait ControlType extends StObject
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined  */ @js.native
  trait EditorState
    extends typingsJapgolly.draftJs.mod.EditorState {
    
    def isEmpty(): Boolean = js.native
    
    def setConvertOptions(): Unit = js.native
    def setConvertOptions(option: js.Object): Unit = js.native
    
    def toHTML(): String = js.native
    def toHTML(option: js.Object): String = js.native
    
    def toRAW(): RawDraftContentState | String = js.native
    def toRAW(noStringify: Boolean): RawDraftContentState | String = js.native
    
    def toText(): String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.braftEditor.braftEditorStrings.separator
    - typingsJapgolly.braftEditor.anon.ClassName
    - typingsJapgolly.braftEditor.anon.ArrowActive
    - typingsJapgolly.braftEditor.anon.Disabled
    - typingsJapgolly.braftEditor.anon.Component
  */
  trait ExtendControlType
    extends StObject
       with ControlType
  
  type HookFunc = js.Function1[/* any */ Any, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.braftEditor.braftEditorStrings.`toggle-link`
    - typingsJapgolly.braftEditor.braftEditorStrings.`open-braft-finder`
    - typingsJapgolly.braftEditor.braftEditorStrings.`toggle-inline-style`
    - typingsJapgolly.braftEditor.braftEditorStrings.`change-block-type`
    - typingsJapgolly.braftEditor.braftEditorStrings.`exec-editor-command`
    - typingsJapgolly.braftEditor.braftEditorStrings.`insert-emoji`
    - typingsJapgolly.braftEditor.braftEditorStrings.`toggle-font-family`
    - typingsJapgolly.braftEditor.braftEditorStrings.`toggle-font-size`
    - typingsJapgolly.braftEditor.braftEditorStrings.`toggle-letter-spacing`
    - typingsJapgolly.braftEditor.braftEditorStrings.`toggle-line-height`
    - typingsJapgolly.braftEditor.braftEditorStrings.`toggle-text-alignment`
    - typingsJapgolly.braftEditor.braftEditorStrings.`toggle-text-color`
    - typingsJapgolly.braftEditor.braftEditorStrings.`toggle-text-background-color`
    - typingsJapgolly.braftEditor.braftEditorStrings.`select-medias`
    - typingsJapgolly.braftEditor.braftEditorStrings.`deselect-medias`
    - typingsJapgolly.braftEditor.braftEditorStrings.`remove-medias`
    - typingsJapgolly.braftEditor.braftEditorStrings.`insert-medias`
    - typingsJapgolly.braftEditor.braftEditorStrings.`select-files`
  */
  trait HookType extends StObject
  object HookType {
    
    inline def `change-block-type`: typingsJapgolly.braftEditor.braftEditorStrings.`change-block-type` = "change-block-type".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`change-block-type`]
    
    inline def `deselect-medias`: typingsJapgolly.braftEditor.braftEditorStrings.`deselect-medias` = "deselect-medias".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`deselect-medias`]
    
    inline def `exec-editor-command`: typingsJapgolly.braftEditor.braftEditorStrings.`exec-editor-command` = "exec-editor-command".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`exec-editor-command`]
    
    inline def `insert-emoji`: typingsJapgolly.braftEditor.braftEditorStrings.`insert-emoji` = "insert-emoji".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`insert-emoji`]
    
    inline def `insert-medias`: typingsJapgolly.braftEditor.braftEditorStrings.`insert-medias` = "insert-medias".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`insert-medias`]
    
    inline def `open-braft-finder`: typingsJapgolly.braftEditor.braftEditorStrings.`open-braft-finder` = "open-braft-finder".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`open-braft-finder`]
    
    inline def `remove-medias`: typingsJapgolly.braftEditor.braftEditorStrings.`remove-medias` = "remove-medias".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`remove-medias`]
    
    inline def `select-files`: typingsJapgolly.braftEditor.braftEditorStrings.`select-files` = "select-files".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`select-files`]
    
    inline def `select-medias`: typingsJapgolly.braftEditor.braftEditorStrings.`select-medias` = "select-medias".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`select-medias`]
    
    inline def `toggle-font-family`: typingsJapgolly.braftEditor.braftEditorStrings.`toggle-font-family` = "toggle-font-family".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`toggle-font-family`]
    
    inline def `toggle-font-size`: typingsJapgolly.braftEditor.braftEditorStrings.`toggle-font-size` = "toggle-font-size".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`toggle-font-size`]
    
    inline def `toggle-inline-style`: typingsJapgolly.braftEditor.braftEditorStrings.`toggle-inline-style` = "toggle-inline-style".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`toggle-inline-style`]
    
    inline def `toggle-letter-spacing`: typingsJapgolly.braftEditor.braftEditorStrings.`toggle-letter-spacing` = "toggle-letter-spacing".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`toggle-letter-spacing`]
    
    inline def `toggle-line-height`: typingsJapgolly.braftEditor.braftEditorStrings.`toggle-line-height` = "toggle-line-height".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`toggle-line-height`]
    
    inline def `toggle-link`: typingsJapgolly.braftEditor.braftEditorStrings.`toggle-link` = "toggle-link".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`toggle-link`]
    
    inline def `toggle-text-alignment`: typingsJapgolly.braftEditor.braftEditorStrings.`toggle-text-alignment` = "toggle-text-alignment".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`toggle-text-alignment`]
    
    inline def `toggle-text-background-color`: typingsJapgolly.braftEditor.braftEditorStrings.`toggle-text-background-color` = "toggle-text-background-color".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`toggle-text-background-color`]
    
    inline def `toggle-text-color`: typingsJapgolly.braftEditor.braftEditorStrings.`toggle-text-color` = "toggle-text-color".asInstanceOf[typingsJapgolly.braftEditor.braftEditorStrings.`toggle-text-color`]
  }
  
  trait HooksType extends StObject {
    
    var `change-block-type`: js.UndefOr[HookFunc] = js.undefined
    
    var `deselect-medias`: js.UndefOr[HookFunc] = js.undefined
    
    var `exec-editor-command`: js.UndefOr[HookFunc] = js.undefined
    
    var `insert-emoji`: js.UndefOr[HookFunc] = js.undefined
    
    var `insert-medias`: js.UndefOr[HookFunc] = js.undefined
    
    var `open-braft-finder`: js.UndefOr[HookFunc] = js.undefined
    
    var `remove-medias`: js.UndefOr[HookFunc] = js.undefined
    
    var `select-files`: js.UndefOr[HookFunc] = js.undefined
    
    var `select-medias`: js.UndefOr[HookFunc] = js.undefined
    
    var `set-image-alignment`: js.UndefOr[HookFunc] = js.undefined
    
    var `set-image-float`: js.UndefOr[HookFunc] = js.undefined
    
    var `set-image-link`: js.UndefOr[HookFunc] = js.undefined
    
    var `set-image-link-target`: js.UndefOr[HookFunc] = js.undefined
    
    var `set-image-size`: js.UndefOr[HookFunc] = js.undefined
    
    var `toggle-font-family`: js.UndefOr[HookFunc] = js.undefined
    
    var `toggle-font-size`: js.UndefOr[HookFunc] = js.undefined
    
    var `toggle-inline-style`: js.UndefOr[HookFunc] = js.undefined
    
    var `toggle-letter-spacing`: js.UndefOr[HookFunc] = js.undefined
    
    var `toggle-line-height`: js.UndefOr[HookFunc] = js.undefined
    
    var `toggle-link`: js.UndefOr[HookFunc] = js.undefined
    
    var `toggle-text-alignment`: js.UndefOr[HookFunc] = js.undefined
    
    var `toggle-text-background-color`: js.UndefOr[HookFunc] = js.undefined
    
    var `toggle-text-color`: js.UndefOr[HookFunc] = js.undefined
  }
  object HooksType {
    
    inline def apply(): HooksType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HooksType]
    }
    
    extension [Self <: HooksType](x: Self) {
      
      inline def `setChange-block-type`(value: /* any */ Any => Any): Self = StObject.set(x, "change-block-type", js.Any.fromFunction1(value))
      
      inline def `setChange-block-typeUndefined`: Self = StObject.set(x, "change-block-type", js.undefined)
      
      inline def `setDeselect-medias`(value: /* any */ Any => Any): Self = StObject.set(x, "deselect-medias", js.Any.fromFunction1(value))
      
      inline def `setDeselect-mediasUndefined`: Self = StObject.set(x, "deselect-medias", js.undefined)
      
      inline def `setExec-editor-command`(value: /* any */ Any => Any): Self = StObject.set(x, "exec-editor-command", js.Any.fromFunction1(value))
      
      inline def `setExec-editor-commandUndefined`: Self = StObject.set(x, "exec-editor-command", js.undefined)
      
      inline def `setInsert-emoji`(value: /* any */ Any => Any): Self = StObject.set(x, "insert-emoji", js.Any.fromFunction1(value))
      
      inline def `setInsert-emojiUndefined`: Self = StObject.set(x, "insert-emoji", js.undefined)
      
      inline def `setInsert-medias`(value: /* any */ Any => Any): Self = StObject.set(x, "insert-medias", js.Any.fromFunction1(value))
      
      inline def `setInsert-mediasUndefined`: Self = StObject.set(x, "insert-medias", js.undefined)
      
      inline def `setOpen-braft-finder`(value: /* any */ Any => Any): Self = StObject.set(x, "open-braft-finder", js.Any.fromFunction1(value))
      
      inline def `setOpen-braft-finderUndefined`: Self = StObject.set(x, "open-braft-finder", js.undefined)
      
      inline def `setRemove-medias`(value: /* any */ Any => Any): Self = StObject.set(x, "remove-medias", js.Any.fromFunction1(value))
      
      inline def `setRemove-mediasUndefined`: Self = StObject.set(x, "remove-medias", js.undefined)
      
      inline def `setSelect-files`(value: /* any */ Any => Any): Self = StObject.set(x, "select-files", js.Any.fromFunction1(value))
      
      inline def `setSelect-filesUndefined`: Self = StObject.set(x, "select-files", js.undefined)
      
      inline def `setSelect-medias`(value: /* any */ Any => Any): Self = StObject.set(x, "select-medias", js.Any.fromFunction1(value))
      
      inline def `setSelect-mediasUndefined`: Self = StObject.set(x, "select-medias", js.undefined)
      
      inline def `setSet-image-alignment`(value: /* any */ Any => Any): Self = StObject.set(x, "set-image-alignment", js.Any.fromFunction1(value))
      
      inline def `setSet-image-alignmentUndefined`: Self = StObject.set(x, "set-image-alignment", js.undefined)
      
      inline def `setSet-image-float`(value: /* any */ Any => Any): Self = StObject.set(x, "set-image-float", js.Any.fromFunction1(value))
      
      inline def `setSet-image-floatUndefined`: Self = StObject.set(x, "set-image-float", js.undefined)
      
      inline def `setSet-image-link`(value: /* any */ Any => Any): Self = StObject.set(x, "set-image-link", js.Any.fromFunction1(value))
      
      inline def `setSet-image-link-target`(value: /* any */ Any => Any): Self = StObject.set(x, "set-image-link-target", js.Any.fromFunction1(value))
      
      inline def `setSet-image-link-targetUndefined`: Self = StObject.set(x, "set-image-link-target", js.undefined)
      
      inline def `setSet-image-linkUndefined`: Self = StObject.set(x, "set-image-link", js.undefined)
      
      inline def `setSet-image-size`(value: /* any */ Any => Any): Self = StObject.set(x, "set-image-size", js.Any.fromFunction1(value))
      
      inline def `setSet-image-sizeUndefined`: Self = StObject.set(x, "set-image-size", js.undefined)
      
      inline def `setToggle-font-family`(value: /* any */ Any => Any): Self = StObject.set(x, "toggle-font-family", js.Any.fromFunction1(value))
      
      inline def `setToggle-font-familyUndefined`: Self = StObject.set(x, "toggle-font-family", js.undefined)
      
      inline def `setToggle-font-size`(value: /* any */ Any => Any): Self = StObject.set(x, "toggle-font-size", js.Any.fromFunction1(value))
      
      inline def `setToggle-font-sizeUndefined`: Self = StObject.set(x, "toggle-font-size", js.undefined)
      
      inline def `setToggle-inline-style`(value: /* any */ Any => Any): Self = StObject.set(x, "toggle-inline-style", js.Any.fromFunction1(value))
      
      inline def `setToggle-inline-styleUndefined`: Self = StObject.set(x, "toggle-inline-style", js.undefined)
      
      inline def `setToggle-letter-spacing`(value: /* any */ Any => Any): Self = StObject.set(x, "toggle-letter-spacing", js.Any.fromFunction1(value))
      
      inline def `setToggle-letter-spacingUndefined`: Self = StObject.set(x, "toggle-letter-spacing", js.undefined)
      
      inline def `setToggle-line-height`(value: /* any */ Any => Any): Self = StObject.set(x, "toggle-line-height", js.Any.fromFunction1(value))
      
      inline def `setToggle-line-heightUndefined`: Self = StObject.set(x, "toggle-line-height", js.undefined)
      
      inline def `setToggle-link`(value: /* any */ Any => Any): Self = StObject.set(x, "toggle-link", js.Any.fromFunction1(value))
      
      inline def `setToggle-linkUndefined`: Self = StObject.set(x, "toggle-link", js.undefined)
      
      inline def `setToggle-text-alignment`(value: /* any */ Any => Any): Self = StObject.set(x, "toggle-text-alignment", js.Any.fromFunction1(value))
      
      inline def `setToggle-text-alignmentUndefined`: Self = StObject.set(x, "toggle-text-alignment", js.undefined)
      
      inline def `setToggle-text-background-color`(value: /* any */ Any => Any): Self = StObject.set(x, "toggle-text-background-color", js.Any.fromFunction1(value))
      
      inline def `setToggle-text-background-colorUndefined`: Self = StObject.set(x, "toggle-text-background-color", js.undefined)
      
      inline def `setToggle-text-color`(value: /* any */ Any => Any): Self = StObject.set(x, "toggle-text-color", js.Any.fromFunction1(value))
      
      inline def `setToggle-text-colorUndefined`: Self = StObject.set(x, "toggle-text-color", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.braftEditor.braftEditorStrings.`float-left`
    - typingsJapgolly.braftEditor.braftEditorStrings.`float-right`
    - typingsJapgolly.braftEditor.braftEditorStrings.`align-left`
    - typingsJapgolly.braftEditor.braftEditorStrings.`align-center`
    - typingsJapgolly.braftEditor.braftEditorStrings.`align-right`
    - typingsJapgolly.braftEditor.braftEditorStrings.link
    - typingsJapgolly.braftEditor.braftEditorStrings.size
    - typingsJapgolly.braftEditor.braftEditorStrings.remove
    - typingsJapgolly.braftEditor.anon.OnClick
  */
  trait ImageControlType extends StObject
  
  trait MediaType extends StObject {
    
    var accepts: js.UndefOr[Audio] = js.undefined
    
    var externals: js.UndefOr[Embed] = js.undefined
    
    var items: js.UndefOr[js.Array[Any]] = js.undefined
    
    var onChange: js.UndefOr[js.Function] = js.undefined
    
    var onInsert: js.UndefOr[js.Function] = js.undefined
    
    var pasteImage: js.UndefOr[Boolean] = js.undefined
    
    var uploadFn: js.UndefOr[js.Function1[/* params */ Error, Unit]] = js.undefined
    
    var validateFn: js.UndefOr[js.Function1[/* file */ File, Boolean | PromiseLike[Any]]] = js.undefined
  }
  object MediaType {
    
    inline def apply(): MediaType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaType]
    }
    
    extension [Self <: MediaType](x: Self) {
      
      inline def setAccepts(value: Audio): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
      
      inline def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
      
      inline def setExternals(value: Embed): Self = StObject.set(x, "externals", value.asInstanceOf[js.Any])
      
      inline def setExternalsUndefined: Self = StObject.set(x, "externals", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnInsert(value: js.Function): Self = StObject.set(x, "onInsert", value.asInstanceOf[js.Any])
      
      inline def setOnInsertUndefined: Self = StObject.set(x, "onInsert", js.undefined)
      
      inline def setPasteImage(value: Boolean): Self = StObject.set(x, "pasteImage", value.asInstanceOf[js.Any])
      
      inline def setPasteImageUndefined: Self = StObject.set(x, "pasteImage", js.undefined)
      
      inline def setUploadFn(value: /* params */ Error => Callback): Self = StObject.set(x, "uploadFn", js.Any.fromFunction1((t0: /* params */ Error) => value(t0).runNow()))
      
      inline def setUploadFnUndefined: Self = StObject.set(x, "uploadFn", js.undefined)
      
      inline def setValidateFn(value: /* file */ File => Boolean | PromiseLike[Any]): Self = StObject.set(x, "validateFn", js.Any.fromFunction1(value))
      
      inline def setValidateFnUndefined: Self = StObject.set(x, "validateFn", js.undefined)
    }
  }
}

package typingsJapgolly.braftEditor.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
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
import typingsJapgolly.braftEditor.mod.BraftEditorProps
import typingsJapgolly.braftEditor.mod.BuiltInControlType
import typingsJapgolly.braftEditor.mod.ControlType
import typingsJapgolly.braftEditor.mod.EditorState
import typingsJapgolly.braftEditor.mod.ExtendControlType
import typingsJapgolly.braftEditor.mod.HooksType
import typingsJapgolly.braftEditor.mod.ImageControlType
import typingsJapgolly.braftEditor.mod.MediaType
import typingsJapgolly.braftEditor.mod.default
import typingsJapgolly.immutable.mod.Map
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BraftEditor {
  
  @JSImport("braft-editor", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def allowInsertLinkText(value: Boolean): this.type = set("allowInsertLinkText", value.asInstanceOf[js.Any])
    
    inline def blockRenderMap(value: (Map[Any, Any]) | js.Function): this.type = set("blockRenderMap", value.asInstanceOf[js.Any])
    
    inline def blockRendererFn(value: js.Function): this.type = set("blockRendererFn", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def colors(value: js.Array[String]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def componentBelowControlBar(value: VdomNode): this.type = set("componentBelowControlBar", value.rawNode.asInstanceOf[js.Any])
    
    inline def componentBelowControlBarNull: this.type = set("componentBelowControlBar", null)
    
    inline def componentBelowControlBarVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("componentBelowControlBar", js.Array(value*))
    
    inline def componentBelowControlBarVdomElement(value: VdomElement): this.type = set("componentBelowControlBar", value.rawElement.asInstanceOf[js.Any])
    
    inline def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    
    inline def contentStyle(value: CSSProperties): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    inline def controlBarClassName(value: String): this.type = set("controlBarClassName", value.asInstanceOf[js.Any])
    
    inline def controlBarStyle(value: CSSProperties): this.type = set("controlBarStyle", value.asInstanceOf[js.Any])
    
    inline def controls(value: js.Array[ControlType]): this.type = set("controls", value.asInstanceOf[js.Any])
    
    inline def controlsVarargs(value: ControlType*): this.type = set("controls", js.Array(value*))
    
    inline def converts(value: js.Object): this.type = set("converts", value.asInstanceOf[js.Any])
    
    inline def defaultLinkTarget(value: String): this.type = set("defaultLinkTarget", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: EditorState): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def draftProps(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraftEditorProps */ Any
    ): this.type = set("draftProps", value.asInstanceOf[js.Any])
    
    inline def editorId(value: String): this.type = set("editorId", value.asInstanceOf[js.Any])
    
    inline def emojis(value: js.Array[String]): this.type = set("emojis", value.asInstanceOf[js.Any])
    
    inline def emojisVarargs(value: String*): this.type = set("emojis", js.Array(value*))
    
    inline def excludeControls(value: js.Array[BuiltInControlType]): this.type = set("excludeControls", value.asInstanceOf[js.Any])
    
    inline def excludeControlsVarargs(value: BuiltInControlType*): this.type = set("excludeControls", js.Array(value*))
    
    inline def extendControls(value: js.Array[ExtendControlType]): this.type = set("extendControls", value.asInstanceOf[js.Any])
    
    inline def extendControlsVarargs(value: ExtendControlType*): this.type = set("extendControls", js.Array(value*))
    
    inline def fixPlaceholder(value: Boolean): this.type = set("fixPlaceholder", value.asInstanceOf[js.Any])
    
    inline def fontFamilies(value: js.Array[Family]): this.type = set("fontFamilies", value.asInstanceOf[js.Any])
    
    inline def fontFamiliesVarargs(value: Family*): this.type = set("fontFamilies", js.Array(value*))
    
    inline def fontSizes(value: js.Array[Double]): this.type = set("fontSizes", value.asInstanceOf[js.Any])
    
    inline def fontSizesVarargs(value: Double*): this.type = set("fontSizes", js.Array(value*))
    
    inline def handleBeforeInput(value: js.Function): this.type = set("handleBeforeInput", value.asInstanceOf[js.Any])
    
    inline def handleDroppedFiles(value: js.Function): this.type = set("handleDroppedFiles", value.asInstanceOf[js.Any])
    
    inline def handleKeyCommand(value: js.Function): this.type = set("handleKeyCommand", value.asInstanceOf[js.Any])
    
    inline def handlePastedFiles(value: js.Function): this.type = set("handlePastedFiles", value.asInstanceOf[js.Any])
    
    inline def handlePastedText(value: js.Function): this.type = set("handlePastedText", value.asInstanceOf[js.Any])
    
    inline def handleReturn(value: js.Function): this.type = set("handleReturn", value.asInstanceOf[js.Any])
    
    inline def headings(value: js.Array[String]): this.type = set("headings", value.asInstanceOf[js.Any])
    
    inline def headingsVarargs(value: String*): this.type = set("headings", js.Array(value*))
    
    inline def hooks(value: HooksType): this.type = set("hooks", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def imageControls(value: js.Array[ImageControlType]): this.type = set("imageControls", value.asInstanceOf[js.Any])
    
    inline def imageControlsVarargs(value: ImageControlType*): this.type = set("imageControls", js.Array(value*))
    
    inline def imageEqualRatio(value: Boolean): this.type = set("imageEqualRatio", value.asInstanceOf[js.Any])
    
    inline def imageResizable(value: Boolean): this.type = set("imageResizable", value.asInstanceOf[js.Any])
    
    inline def language(
      value: zh | `zh-hant` | en | tr | ru | jpn | kr | pl | fr | `vi-vn` | (js.Function2[/* languages */ Any, /* context */ Any, Any])
    ): this.type = set("language", value.asInstanceOf[js.Any])
    
    inline def languageFunction2(value: (/* languages */ Any, /* context */ Any) => Any): this.type = set("language", js.Any.fromFunction2(value))
    
    inline def letterSpacings(value: js.Array[Double]): this.type = set("letterSpacings", value.asInstanceOf[js.Any])
    
    inline def letterSpacingsVarargs(value: Double*): this.type = set("letterSpacings", js.Array(value*))
    
    inline def lineHeights(value: js.Array[Double]): this.type = set("lineHeights", value.asInstanceOf[js.Any])
    
    inline def lineHeightsVarargs(value: Double*): this.type = set("lineHeights", js.Array(value*))
    
    inline def media(value: MediaType): this.type = set("media", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: js.Function): this.type = set("onBlur", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* editorState */ EditorState => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* editorState */ EditorState) => value(t0).runNow()))
    
    inline def onDelete(value: js.Function): this.type = set("onDelete", value.asInstanceOf[js.Any])
    
    inline def onFocus(value: js.Function): this.type = set("onFocus", value.asInstanceOf[js.Any])
    
    inline def onFullscreen(value: js.Function): this.type = set("onFullscreen", value.asInstanceOf[js.Any])
    
    inline def onSave(value: js.Function): this.type = set("onSave", value.asInstanceOf[js.Any])
    
    inline def onTab(value: js.Function): this.type = set("onTab", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def stripPastedStyles(value: Boolean): this.type = set("stripPastedStyles", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def textAligns(value: js.Array[left | center | right | justify]): this.type = set("textAligns", value.asInstanceOf[js.Any])
    
    inline def textAlignsVarargs(value: (left | center | right | justify)*): this.type = set("textAligns", js.Array(value*))
    
    inline def textBackgroundColor(value: Boolean): this.type = set("textBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def value(value: EditorState): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: BraftEditor.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BraftEditorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.reactDraftWysiwyg.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.draftJs.mod.Draft.Model.Constants.DraftEditorCommand
import typingsJapgolly.draftJs.mod.Draft.Model.Constants.DraftHandleValue
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactDraftWysiwyg.mod.ContentBlock
import typingsJapgolly.reactDraftWysiwyg.mod.EditorProps
import typingsJapgolly.reactDraftWysiwyg.mod.EditorState
import typingsJapgolly.reactDraftWysiwyg.mod.RawDraftContentState
import typingsJapgolly.reactDraftWysiwyg.mod.SyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Editor {
  
  @JSImport("react-draft-wysiwyg", "Editor")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactDraftWysiwyg.mod.Editor] {
    
    inline def ariaActiveDescendantID(value: String): this.type = set("ariaActiveDescendantID", value.asInstanceOf[js.Any])
    
    inline def ariaAutoComplete(value: String): this.type = set("ariaAutoComplete", value.asInstanceOf[js.Any])
    
    inline def ariaDescribedBy(value: String): this.type = set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    inline def ariaExpanded(value: String): this.type = set("ariaExpanded", value.asInstanceOf[js.Any])
    
    inline def ariaHasPopup(value: String): this.type = set("ariaHasPopup", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaOwneeID(value: String): this.type = set("ariaOwneeID", value.asInstanceOf[js.Any])
    
    inline def contentState(value: RawDraftContentState): this.type = set("contentState", value.asInstanceOf[js.Any])
    
    inline def customBlockRenderFunc(value: /* block */ ContentBlock => Any): this.type = set("customBlockRenderFunc", js.Any.fromFunction1(value))
    
    inline def customDecorators(value: js.Array[js.Object]): this.type = set("customDecorators", value.asInstanceOf[js.Any])
    
    inline def customDecoratorsVarargs(value: js.Object*): this.type = set("customDecorators", js.Array(value*))
    
    inline def customStyleMap(value: js.Object): this.type = set("customStyleMap", value.asInstanceOf[js.Any])
    
    inline def defaultContentState(value: RawDraftContentState): this.type = set("defaultContentState", value.asInstanceOf[js.Any])
    
    inline def defaultEditorState(value: EditorState): this.type = set("defaultEditorState", value.asInstanceOf[js.Any])
    
    inline def editorClassName(value: String): this.type = set("editorClassName", value.asInstanceOf[js.Any])
    
    inline def editorRef(value: /* ref */ js.Object => Callback): this.type = set("editorRef", js.Any.fromFunction1((t0: /* ref */ js.Object) => value(t0).runNow()))
    
    inline def editorState(value: EditorState): this.type = set("editorState", value.asInstanceOf[js.Any])
    
    inline def editorStyle(value: CSSProperties): this.type = set("editorStyle", value.asInstanceOf[js.Any])
    
    inline def handleKeyCommand(
      value: (/* command */ DraftEditorCommand, /* editorState */ EditorState, /* eventTimeStamp */ Double) => DraftHandleValue
    ): this.type = set("handleKeyCommand", js.Any.fromFunction3(value))
    
    inline def handlePastedText(
      value: (/* text */ String, /* html */ String, /* editorState */ EditorState, /* onChange */ js.Function1[/* editorState */ EditorState, Unit]) => Boolean
    ): this.type = set("handlePastedText", js.Any.fromFunction4(value))
    
    inline def handleReturn(value: (ReactKeyboardEventFrom[js.Object & Element], /* editorState */ EditorState) => Boolean): this.type = set("handleReturn", js.Any.fromFunction2(value))
    
    inline def hashtag(value: js.Object): this.type = set("hashtag", value.asInstanceOf[js.Any])
    
    inline def initialContentState(value: RawDraftContentState): this.type = set("initialContentState", value.asInstanceOf[js.Any])
    
    inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def localization(value: js.Object): this.type = set("localization", value.asInstanceOf[js.Any])
    
    inline def mention(value: js.Object): this.type = set("mention", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* event */ SyntheticEvent => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* event */ SyntheticEvent) => value(t0).runNow()))
    
    inline def onChange(value: /* contentState */ RawDraftContentState => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* contentState */ RawDraftContentState) => value(t0).runNow()))
    
    inline def onContentStateChange(value: /* contentState */ RawDraftContentState => Callback): this.type = set("onContentStateChange", js.Any.fromFunction1((t0: /* contentState */ RawDraftContentState) => value(t0).runNow()))
    
    inline def onEditorStateChange(value: /* editorState */ EditorState => Callback): this.type = set("onEditorStateChange", js.Any.fromFunction1((t0: /* editorState */ EditorState) => value(t0).runNow()))
    
    inline def onFocus(value: /* event */ SyntheticEvent => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* event */ SyntheticEvent) => value(t0).runNow()))
    
    inline def onTab(value: ReactKeyboardEventFrom[js.Object & Element] => Callback): this.type = set("onTab", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[js.Object & Element]) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def spellCheck(value: Boolean): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    inline def stripPastedStyles(value: Boolean): this.type = set("stripPastedStyles", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def textAlignment(value: String): this.type = set("textAlignment", value.asInstanceOf[js.Any])
    
    inline def toolbar(value: js.Object): this.type = set("toolbar", value.asInstanceOf[js.Any])
    
    inline def toolbarClassName(value: String): this.type = set("toolbarClassName", value.asInstanceOf[js.Any])
    
    inline def toolbarCustomButtons(value: js.Array[japgolly.scalajs.react.facade.React.Element]): this.type = set("toolbarCustomButtons", value.asInstanceOf[js.Any])
    
    inline def toolbarCustomButtonsVarargs(value: japgolly.scalajs.react.facade.React.Element*): this.type = set("toolbarCustomButtons", js.Array(value*))
    
    inline def toolbarHidden(value: Boolean): this.type = set("toolbarHidden", value.asInstanceOf[js.Any])
    
    inline def toolbarOnFocus(value: Boolean): this.type = set("toolbarOnFocus", value.asInstanceOf[js.Any])
    
    inline def toolbarStyle(value: js.Object): this.type = set("toolbarStyle", value.asInstanceOf[js.Any])
    
    inline def uploadCallback(value: /* file */ js.Object => js.Promise[js.Object]): this.type = set("uploadCallback", js.Any.fromFunction1(value))
    
    inline def webDriverTestID(value: String): this.type = set("webDriverTestID", value.asInstanceOf[js.Any])
    
    inline def wrapperClassName(value: String): this.type = set("wrapperClassName", value.asInstanceOf[js.Any])
    
    inline def wrapperId(value: Double): this.type = set("wrapperId", value.asInstanceOf[js.Any])
    
    inline def wrapperStyle(value: CSSProperties): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Editor.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: EditorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

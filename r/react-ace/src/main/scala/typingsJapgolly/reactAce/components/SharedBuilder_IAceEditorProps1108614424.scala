package typingsJapgolly.reactAce.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.aceBuilds.mod.Ace.Annotation
import typingsJapgolly.aceBuilds.mod.Ace.Editor
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactAce.anon.TypeofAceBuilds
import typingsJapgolly.reactAce.libTypesMod.IAceOptions
import typingsJapgolly.reactAce.libTypesMod.ICommand
import typingsJapgolly.reactAce.libTypesMod.IEditorProps
import typingsJapgolly.reactAce.libTypesMod.IMarker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_IAceEditorProps1108614424[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def annotations(value: js.Array[Annotation]): this.type = set("annotations", value.asInstanceOf[js.Any])
  
  inline def annotationsVarargs(value: Annotation*): this.type = set("annotations", js.Array(value*))
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def commands(value: js.Array[ICommand]): this.type = set("commands", value.asInstanceOf[js.Any])
  
  inline def commandsVarargs(value: ICommand*): this.type = set("commands", js.Array(value*))
  
  inline def cursorStart(value: Double): this.type = set("cursorStart", value.asInstanceOf[js.Any])
  
  inline def debounceChangePeriod(value: Double): this.type = set("debounceChangePeriod", value.asInstanceOf[js.Any])
  
  inline def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  inline def editorProps(value: IEditorProps): this.type = set("editorProps", value.asInstanceOf[js.Any])
  
  inline def enableBasicAutocompletion(value: Boolean | js.Array[String]): this.type = set("enableBasicAutocompletion", value.asInstanceOf[js.Any])
  
  inline def enableBasicAutocompletionVarargs(value: String*): this.type = set("enableBasicAutocompletion", js.Array(value*))
  
  inline def enableLiveAutocompletion(value: Boolean | js.Array[String]): this.type = set("enableLiveAutocompletion", value.asInstanceOf[js.Any])
  
  inline def enableLiveAutocompletionVarargs(value: String*): this.type = set("enableLiveAutocompletion", js.Array(value*))
  
  inline def enableSnippets(value: Boolean): this.type = set("enableSnippets", value.asInstanceOf[js.Any])
  
  inline def focus(value: Boolean): this.type = set("focus", value.asInstanceOf[js.Any])
  
  inline def fontSize(value: Double | String): this.type = set("fontSize", value.asInstanceOf[js.Any])
  
  inline def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
  
  inline def highlightActiveLine(value: Boolean): this.type = set("highlightActiveLine", value.asInstanceOf[js.Any])
  
  inline def keyboardHandler(value: String): this.type = set("keyboardHandler", value.asInstanceOf[js.Any])
  
  inline def markers(value: js.Array[IMarker]): this.type = set("markers", value.asInstanceOf[js.Any])
  
  inline def markersVarargs(value: IMarker*): this.type = set("markers", js.Array(value*))
  
  inline def maxLines(value: Double): this.type = set("maxLines", value.asInstanceOf[js.Any])
  
  inline def minLines(value: Double): this.type = set("minLines", value.asInstanceOf[js.Any])
  
  inline def mode(value: String | js.Object): this.type = set("mode", value.asInstanceOf[js.Any])
  
  inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  
  inline def navigateToFileEnd(value: Boolean): this.type = set("navigateToFileEnd", value.asInstanceOf[js.Any])
  
  inline def onBeforeLoad(value: /* ace */ TypeofAceBuilds => Callback): this.type = set("onBeforeLoad", js.Any.fromFunction1((t0: /* ace */ TypeofAceBuilds) => value(t0).runNow()))
  
  inline def onBlur(value: (/* event */ Any, /* editor */ js.UndefOr[Editor]) => Callback): this.type = set("onBlur", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ js.UndefOr[Editor]) => (value(t0, t1)).runNow()))
  
  inline def onChange(value: (/* value */ String, /* event */ js.UndefOr[Any]) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* value */ String, t1: /* event */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
  
  inline def onCopy(value: /* value */ String => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
  
  inline def onCursorChange(value: (/* value */ Any, /* event */ js.UndefOr[Any]) => Callback): this.type = set("onCursorChange", js.Any.fromFunction2((t0: /* value */ Any, t1: /* event */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
  
  inline def onFocus(value: (/* event */ Any, /* editor */ js.UndefOr[Editor]) => Callback): this.type = set("onFocus", js.Any.fromFunction2((t0: /* event */ Any, t1: /* editor */ js.UndefOr[Editor]) => (value(t0, t1)).runNow()))
  
  inline def onInput(value: /* event */ js.UndefOr[Any] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: /* event */ js.UndefOr[Any]) => value(t0).runNow()))
  
  inline def onLoad(value: /* editor */ Editor => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: /* editor */ Editor) => value(t0).runNow()))
  
  inline def onPaste(value: /* value */ String => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
  
  inline def onScroll(value: /* editor */ IEditorProps => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: /* editor */ IEditorProps) => value(t0).runNow()))
  
  inline def onSelection(value: (/* selectedText */ String, /* event */ js.UndefOr[Any]) => Callback): this.type = set("onSelection", js.Any.fromFunction2((t0: /* selectedText */ String, t1: /* event */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
  
  inline def onSelectionChange(value: (/* value */ Any, /* event */ js.UndefOr[Any]) => Callback): this.type = set("onSelectionChange", js.Any.fromFunction2((t0: /* value */ Any, t1: /* event */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
  
  inline def onValidate(value: /* annotations */ js.Array[Annotation] => Callback): this.type = set("onValidate", js.Any.fromFunction1((t0: /* annotations */ js.Array[Annotation]) => value(t0).runNow()))
  
  inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  
  inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
  
  inline def scrollMargin(value: js.Array[Double]): this.type = set("scrollMargin", value.asInstanceOf[js.Any])
  
  inline def scrollMarginVarargs(value: Double*): this.type = set("scrollMargin", js.Array(value*))
  
  inline def setOptions(value: IAceOptions): this.type = set("setOptions", value.asInstanceOf[js.Any])
  
  inline def showGutter(value: Boolean): this.type = set("showGutter", value.asInstanceOf[js.Any])
  
  inline def showPrintMargin(value: Boolean): this.type = set("showPrintMargin", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def tabSize(value: Double): this.type = set("tabSize", value.asInstanceOf[js.Any])
  
  inline def theme(value: String): this.type = set("theme", value.asInstanceOf[js.Any])
  
  inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  
  inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  
  inline def wrapEnabled(value: Boolean): this.type = set("wrapEnabled", value.asInstanceOf[js.Any])
}

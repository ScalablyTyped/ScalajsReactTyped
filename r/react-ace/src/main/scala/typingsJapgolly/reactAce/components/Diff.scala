package typingsJapgolly.reactAce.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactAce.libDiffMod.IDiffEditorProps
import typingsJapgolly.reactAce.libTypesMod.IEditorProps
import typingsJapgolly.reactAce.mod.diff
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Diff {
  
  @JSImport("react-ace", "diff")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[diff] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def cursorStart(value: Double): this.type = set("cursorStart", value.asInstanceOf[js.Any])
    
    inline def editorProps(value: js.Object): this.type = set("editorProps", value.asInstanceOf[js.Any])
    
    inline def enableBasicAutocompletion(value: Boolean | js.Array[String]): this.type = set("enableBasicAutocompletion", value.asInstanceOf[js.Any])
    
    inline def enableBasicAutocompletionVarargs(value: String*): this.type = set("enableBasicAutocompletion", js.Array(value*))
    
    inline def enableLiveAutocompletion(value: Boolean | js.Array[String]): this.type = set("enableLiveAutocompletion", value.asInstanceOf[js.Any])
    
    inline def enableLiveAutocompletionVarargs(value: String*): this.type = set("enableLiveAutocompletion", js.Array(value*))
    
    inline def focus(value: Boolean): this.type = set("focus", value.asInstanceOf[js.Any])
    
    inline def fontSize(value: Double): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    inline def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def highlightActiveLine(value: Boolean): this.type = set("highlightActiveLine", value.asInstanceOf[js.Any])
    
    inline def maxLines(value: Double): this.type = set("maxLines", value.asInstanceOf[js.Any])
    
    inline def minLines(value: Double): this.type = set("minLines", value.asInstanceOf[js.Any])
    
    inline def mode(value: String): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onChange(value: (/* value */ js.Array[String], /* event */ js.UndefOr[Any]) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* value */ js.Array[String], t1: /* event */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def onLoad(value: /* editor */ IEditorProps => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: /* editor */ IEditorProps) => value(t0).runNow()))
    
    inline def onPaste(value: /* value */ String => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onScroll(value: /* editor */ IEditorProps => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: /* editor */ IEditorProps) => value(t0).runNow()))
    
    inline def orientation(value: String): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def scrollMargin(value: js.Array[Double]): this.type = set("scrollMargin", value.asInstanceOf[js.Any])
    
    inline def scrollMarginVarargs(value: Double*): this.type = set("scrollMargin", js.Array(value*))
    
    inline def setOptions(value: js.Object): this.type = set("setOptions", value.asInstanceOf[js.Any])
    
    inline def showGutter(value: Boolean): this.type = set("showGutter", value.asInstanceOf[js.Any])
    
    inline def showPrintMargin(value: Boolean): this.type = set("showPrintMargin", value.asInstanceOf[js.Any])
    
    inline def splits(value: Double): this.type = set("splits", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabSize(value: Double): this.type = set("tabSize", value.asInstanceOf[js.Any])
    
    inline def theme(value: String): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Array[String]): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: String*): this.type = set("value", js.Array(value*))
    
    inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def wrapEnabled(value: Boolean): this.type = set("wrapEnabled", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Diff.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDiffEditorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

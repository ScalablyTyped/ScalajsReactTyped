package typingsJapgolly.reactSplitPane.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactSplitPane.mod.Size
import typingsJapgolly.reactSplitPane.mod.SplitPaneProps
import typingsJapgolly.reactSplitPane.mod.default
import typingsJapgolly.reactSplitPane.reactSplitPaneStrings.first
import typingsJapgolly.reactSplitPane.reactSplitPaneStrings.horizontal
import typingsJapgolly.reactSplitPane.reactSplitPaneStrings.second
import typingsJapgolly.reactSplitPane.reactSplitPaneStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSplitPane {
  
  @JSImport("react-split-pane", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def allowResize(value: Boolean): this.type = set("allowResize", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultSize(value: Size): this.type = set("defaultSize", value.asInstanceOf[js.Any])
    
    inline def maxSize(value: Size): this.type = set("maxSize", value.asInstanceOf[js.Any])
    
    inline def minSize(value: Size): this.type = set("minSize", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* newSize */ Double => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* newSize */ Double) => value(t0).runNow()))
    
    inline def onDragFinished(value: /* newSize */ Double => Callback): this.type = set("onDragFinished", js.Any.fromFunction1((t0: /* newSize */ Double) => value(t0).runNow()))
    
    inline def onDragStarted(value: Callback): this.type = set("onDragStarted", value.toJsFn)
    
    inline def onResizerClick(value: /* event */ MouseEvent => Callback): this.type = set("onResizerClick", js.Any.fromFunction1((t0: /* event */ MouseEvent) => value(t0).runNow()))
    
    inline def onResizerDoubleClick(value: /* event */ MouseEvent => Callback): this.type = set("onResizerDoubleClick", js.Any.fromFunction1((t0: /* event */ MouseEvent) => value(t0).runNow()))
    
    inline def pane1Style(value: CSSProperties): this.type = set("pane1Style", value.asInstanceOf[js.Any])
    
    inline def pane2Style(value: CSSProperties): this.type = set("pane2Style", value.asInstanceOf[js.Any])
    
    inline def paneStyle(value: CSSProperties): this.type = set("paneStyle", value.asInstanceOf[js.Any])
    
    inline def primary(value: first | second): this.type = set("primary", value.asInstanceOf[js.Any])
    
    inline def resizerClassName(value: String): this.type = set("resizerClassName", value.asInstanceOf[js.Any])
    
    inline def resizerStyle(value: CSSProperties): this.type = set("resizerStyle", value.asInstanceOf[js.Any])
    
    inline def size(value: Size): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def split(value: vertical | horizontal): this.type = set("split", value.asInstanceOf[js.Any])
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactSplitPane.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SplitPaneProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

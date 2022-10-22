package typingsJapgolly.reactLazylog.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Range
import org.scalajs.dom.RequestInit
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactLazylog.buildLazyLogMod.LazyLogProps
import typingsJapgolly.reactLazylog.buildLazyLogMod.WebsocketOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LazyLog {
  
  inline def apply(url: String): Builder = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LazyLogProps]))
  }
  
  @JSImport("react-lazylog", "LazyLog")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactLazylog.mod.LazyLog] {
    
    inline def caseInsensitive(value: Boolean): this.type = set("caseInsensitive", value.asInstanceOf[js.Any])
    
    inline def containerStyle(value: CSSProperties): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def enableSearch(value: Boolean): this.type = set("enableSearch", value.asInstanceOf[js.Any])
    
    inline def extraLines(value: Double): this.type = set("extraLines", value.asInstanceOf[js.Any])
    
    inline def fetchOptions(value: RequestInit): this.type = set("fetchOptions", value.asInstanceOf[js.Any])
    
    inline def follow(value: Boolean): this.type = set("follow", value.asInstanceOf[js.Any])
    
    inline def formatPart(value: /* text */ String => Node): this.type = set("formatPart", js.Any.fromFunction1(value))
    
    inline def height(value: String | Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def highlight(value: Double | js.Array[Double]): this.type = set("highlight", value.asInstanceOf[js.Any])
    
    inline def highlightLineClassName(value: String): this.type = set("highlightLineClassName", value.asInstanceOf[js.Any])
    
    inline def highlightVarargs(value: Double*): this.type = set("highlight", js.Array(value*))
    
    inline def lineClassName(value: String): this.type = set("lineClassName", value.asInstanceOf[js.Any])
    
    inline def loadingComponent(value: Any): this.type = set("loadingComponent", value.asInstanceOf[js.Any])
    
    inline def onError(value: /* error */ Any => Any): this.type = set("onError", js.Any.fromFunction1(value))
    
    inline def onHighlight(value: /* range */ Range => Any): this.type = set("onHighlight", js.Any.fromFunction1(value))
    
    inline def onLoad(value: CallbackTo[Any]): this.type = set("onLoad", value.toJsFn)
    
    inline def overscanRowCount(value: Double): this.type = set("overscanRowCount", value.asInstanceOf[js.Any])
    
    inline def rowHeight(value: Double): this.type = set("rowHeight", value.asInstanceOf[js.Any])
    
    inline def scrollToLine(value: Double): this.type = set("scrollToLine", value.asInstanceOf[js.Any])
    
    inline def selectableLines(value: Boolean): this.type = set("selectableLines", value.asInstanceOf[js.Any])
    
    inline def stream(value: Boolean): this.type = set("stream", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
    
    inline def websocket(value: Boolean): this.type = set("websocket", value.asInstanceOf[js.Any])
    
    inline def websocketOptions(value: WebsocketOptions): this.type = set("websocketOptions", value.asInstanceOf[js.Any])
    
    inline def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LazyLogProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

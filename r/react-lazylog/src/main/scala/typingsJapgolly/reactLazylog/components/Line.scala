package typingsJapgolly.reactLazylog.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactLazylog.anon.Text
import typingsJapgolly.reactLazylog.buildLineMod.LineProps
import typingsJapgolly.reactLazylog.buildLineMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Line {
  
  inline def apply(data: js.Array[Text], number: Double, rowHeight: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LineProps]))
  }
  
  @JSImport("react-lazylog/build/Line", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def formatPart(value: /* text */ String => Node): this.type = set("formatPart", js.Any.fromFunction1(value))
    
    inline def highlight(value: Boolean): this.type = set("highlight", value.asInstanceOf[js.Any])
    
    inline def onLineNumberClick(value: ReactMouseEventFrom[HTMLAnchorElement & Element] => Callback): this.type = set("onLineNumberClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & Element]) => value(t0).runNow()))
    
    inline def onRowClick(value: CallbackTo[Any]): this.type = set("onRowClick", value.toJsFn)
    
    inline def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

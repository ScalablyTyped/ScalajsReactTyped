package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Table.TableRowColumnProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableRowColumn {
  
  @JSImport("material-ui", "TableRowColumn")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.TableRowColumn] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
    
    inline def columnNumber(value: Double): this.type = set("columnNumber", value.asInstanceOf[js.Any])
    
    inline def hoverable(value: Boolean): this.type = set("hoverable", value.asInstanceOf[js.Any])
    
    inline def onClick(value: (/* e */ ReactMouseEventFrom[js.Object & Element], /* column */ Double) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[js.Object & Element], t1: /* column */ Double) => (value(t0, t1)).runNow()))
    
    inline def onHover(value: (/* e */ ReactMouseEventFrom[js.Object & Element], /* column */ Double) => Callback): this.type = set("onHover", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[js.Object & Element], t1: /* column */ Double) => (value(t0, t1)).runNow()))
    
    inline def onHoverExit(value: (/* e */ ReactMouseEventFrom[js.Object & Element], /* column */ Double) => Callback): this.type = set("onHoverExit", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[js.Object & Element], t1: /* column */ Double) => (value(t0, t1)).runNow()))
    
    inline def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TableRowColumn.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableRowColumnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

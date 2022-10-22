package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Table.TableRowProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableRow {
  
  @JSImport("material-ui", "TableRow")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.TableRow] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def displayBorder(value: Boolean): this.type = set("displayBorder", value.asInstanceOf[js.Any])
    
    inline def hoverable(value: Boolean): this.type = set("hoverable", value.asInstanceOf[js.Any])
    
    inline def hovered(value: Boolean): this.type = set("hovered", value.asInstanceOf[js.Any])
    
    inline def onCellClick(
      value: (/* e */ ReactMouseEventFrom[js.Object & Element], /* row */ Double, /* column */ Double) => Callback
    ): this.type = set("onCellClick", js.Any.fromFunction3((t0: /* e */ ReactMouseEventFrom[js.Object & Element], t1: /* row */ Double, t2: /* column */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def onCellHover(
      value: (/* e */ ReactMouseEventFrom[js.Object & Element], /* row */ Double, /* column */ Double) => Callback
    ): this.type = set("onCellHover", js.Any.fromFunction3((t0: /* e */ ReactMouseEventFrom[js.Object & Element], t1: /* row */ Double, t2: /* column */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def onCellHoverExit(
      value: (/* e */ ReactMouseEventFrom[js.Object & Element], /* row */ Double, /* column */ Double) => Callback
    ): this.type = set("onCellHoverExit", js.Any.fromFunction3((t0: /* e */ ReactMouseEventFrom[js.Object & Element], t1: /* row */ Double, t2: /* column */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def onRowClick(value: (/* e */ ReactMouseEventFrom[js.Object & Element], /* row */ Double) => Callback): this.type = set("onRowClick", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[js.Object & Element], t1: /* row */ Double) => (value(t0, t1)).runNow()))
    
    inline def onRowHover(value: (/* e */ ReactMouseEventFrom[js.Object & Element], /* row */ Double) => Callback): this.type = set("onRowHover", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[js.Object & Element], t1: /* row */ Double) => (value(t0, t1)).runNow()))
    
    inline def onRowHoverExit(value: (/* e */ ReactMouseEventFrom[js.Object & Element], /* row */ Double) => Callback): this.type = set("onRowHoverExit", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[js.Object & Element], t1: /* row */ Double) => (value(t0, t1)).runNow()))
    
    inline def rowNumber(value: Double): this.type = set("rowNumber", value.asInstanceOf[js.Any])
    
    inline def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    inline def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def striped(value: Boolean): this.type = set("striped", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TableRow.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableRowProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

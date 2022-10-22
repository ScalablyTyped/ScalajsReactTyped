package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Table.TableBodyProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableBody {
  
  @JSImport("material-ui", "TableBody")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.TableBody] {
    
    inline def allRowsSelected(value: Boolean): this.type = set("allRowsSelected", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def deselectOnClickaway(value: Boolean): this.type = set("deselectOnClickaway", value.asInstanceOf[js.Any])
    
    inline def displayRowCheckbox(value: Boolean): this.type = set("displayRowCheckbox", value.asInstanceOf[js.Any])
    
    inline def multiSelectable(value: Boolean): this.type = set("multiSelectable", value.asInstanceOf[js.Any])
    
    inline def onCellClick(value: (/* row */ Double, /* column */ Double) => Callback): this.type = set("onCellClick", js.Any.fromFunction2((t0: /* row */ Double, t1: /* column */ Double) => (value(t0, t1)).runNow()))
    
    inline def onCellHover(value: (/* row */ Double, /* column */ Double) => Callback): this.type = set("onCellHover", js.Any.fromFunction2((t0: /* row */ Double, t1: /* column */ Double) => (value(t0, t1)).runNow()))
    
    inline def onCellHoverExit(value: (/* row */ Double, /* column */ Double) => Callback): this.type = set("onCellHoverExit", js.Any.fromFunction2((t0: /* row */ Double, t1: /* column */ Double) => (value(t0, t1)).runNow()))
    
    inline def onRowHover(value: /* row */ Double => Callback): this.type = set("onRowHover", js.Any.fromFunction1((t0: /* row */ Double) => value(t0).runNow()))
    
    inline def onRowHoverExit(value: /* row */ Double => Callback): this.type = set("onRowHoverExit", js.Any.fromFunction1((t0: /* row */ Double) => value(t0).runNow()))
    
    inline def onRowSelection(value: /* selectedRows */ js.Array[Double] | String => Callback): this.type = set("onRowSelection", js.Any.fromFunction1((t0: /* selectedRows */ js.Array[Double] | String) => value(t0).runNow()))
    
    inline def preScanRows(value: Boolean): this.type = set("preScanRows", value.asInstanceOf[js.Any])
    
    inline def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    inline def showRowHover(value: Boolean): this.type = set("showRowHover", value.asInstanceOf[js.Any])
    
    inline def stripedRows(value: Boolean): this.type = set("stripedRows", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TableBody.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableBodyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

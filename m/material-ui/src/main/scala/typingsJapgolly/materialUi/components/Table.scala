package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Table.TableProps
import typingsJapgolly.materialUi.materialUiStrings.all
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  @JSImport("material-ui", "Table")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.Table] {
    
    inline def allRowsSelected(value: Boolean): this.type = set("allRowsSelected", value.asInstanceOf[js.Any])
    
    inline def bodyStyle(value: CSSProperties): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def fixedFooter(value: Boolean): this.type = set("fixedFooter", value.asInstanceOf[js.Any])
    
    inline def fixedHeader(value: Boolean): this.type = set("fixedHeader", value.asInstanceOf[js.Any])
    
    inline def footerStyle(value: CSSProperties): this.type = set("footerStyle", value.asInstanceOf[js.Any])
    
    inline def headerStyle(value: CSSProperties): this.type = set("headerStyle", value.asInstanceOf[js.Any])
    
    inline def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def multiSelectable(value: Boolean): this.type = set("multiSelectable", value.asInstanceOf[js.Any])
    
    inline def onCellClick(value: (/* row */ Double, /* column */ Double) => Callback): this.type = set("onCellClick", js.Any.fromFunction2((t0: /* row */ Double, t1: /* column */ Double) => (value(t0, t1)).runNow()))
    
    inline def onCellHover(value: (/* row */ Double, /* column */ Double) => Callback): this.type = set("onCellHover", js.Any.fromFunction2((t0: /* row */ Double, t1: /* column */ Double) => (value(t0, t1)).runNow()))
    
    inline def onCellHoverExit(value: (/* row */ Double, /* column */ Double) => Callback): this.type = set("onCellHoverExit", js.Any.fromFunction2((t0: /* row */ Double, t1: /* column */ Double) => (value(t0, t1)).runNow()))
    
    inline def onRowHover(value: /* row */ Double => Callback): this.type = set("onRowHover", js.Any.fromFunction1((t0: /* row */ Double) => value(t0).runNow()))
    
    inline def onRowHoverExit(value: /* row */ Double => Callback): this.type = set("onRowHoverExit", js.Any.fromFunction1((t0: /* row */ Double) => value(t0).runNow()))
    
    inline def onRowSelection(value: /* selectedRows */ js.Array[Double] | all => Callback): this.type = set("onRowSelection", js.Any.fromFunction1((t0: /* selectedRows */ js.Array[Double] | all) => value(t0).runNow()))
    
    inline def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def wrapperStyle(value: CSSProperties): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Table.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

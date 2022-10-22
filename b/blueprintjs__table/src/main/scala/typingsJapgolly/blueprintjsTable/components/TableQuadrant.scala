package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsTable.libEsmCommonGridMod.Grid
import typingsJapgolly.blueprintjsTable.libEsmQuadrantsTableQuadrantMod.ITableQuadrantProps
import typingsJapgolly.blueprintjsTable.libEsmQuadrantsTableQuadrantMod.QuadrantType
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableQuadrant {
  
  inline def apply(
    bodyRenderer: (QuadrantType, js.UndefOr[Boolean | Unit], js.UndefOr[Boolean]) => js.UndefOr[Element],
    grid: Grid,
    quadrantType: QuadrantType
  ): Builder = {
    val __props = js.Dynamic.literal(bodyRenderer = js.Any.fromFunction3(bodyRenderer), grid = grid.asInstanceOf[js.Any], quadrantType = quadrantType.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ITableQuadrantProps]))
  }
  
  @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrant", "TableQuadrant")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsTable.libEsmQuadrantsTableQuadrantMod.TableQuadrant] {
    
    inline def bodyRef(value: Ref[HTMLDivElement]): this.type = set("bodyRef", value.asInstanceOf[js.Any])
    
    inline def bodyRefFunction1(value: HTMLDivElement | Null => Callback): this.type = set("bodyRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def bodyRefNull: this.type = set("bodyRef", null)
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def columnHeaderCellRenderer(value: /* showFrozenColumnsOnly */ Boolean => js.UndefOr[Element]): this.type = set("columnHeaderCellRenderer", js.Any.fromFunction1(value))
    
    inline def enableColumnHeader(value: Boolean): this.type = set("enableColumnHeader", value.asInstanceOf[js.Any])
    
    inline def enableRowHeader(value: Boolean): this.type = set("enableRowHeader", value.asInstanceOf[js.Any])
    
    inline def menuRenderer(value: CallbackTo[js.UndefOr[Element]]): this.type = set("menuRenderer", value.toJsFn)
    
    inline def onScroll(value: ReactUIEventFrom[HTMLDivElement] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLDivElement]) => value(t0).runNow()))
    
    inline def onWheel(value: ReactWheelEventFrom[HTMLDivElement] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLDivElement]) => value(t0).runNow()))
    
    inline def quadrantRef(value: Ref[HTMLDivElement]): this.type = set("quadrantRef", value.asInstanceOf[js.Any])
    
    inline def quadrantRefFunction1(value: HTMLDivElement | Null => Callback): this.type = set("quadrantRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def quadrantRefNull: this.type = set("quadrantRef", null)
    
    inline def rowHeaderCellRenderer(value: /* showFrozenRowsOnly */ Boolean => js.UndefOr[Element]): this.type = set("rowHeaderCellRenderer", js.Any.fromFunction1(value))
    
    inline def scrollContainerRef(value: Ref[HTMLDivElement]): this.type = set("scrollContainerRef", value.asInstanceOf[js.Any])
    
    inline def scrollContainerRefFunction1(value: HTMLDivElement | Null => Callback): this.type = set("scrollContainerRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def scrollContainerRefNull: this.type = set("scrollContainerRef", null)
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITableQuadrantProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

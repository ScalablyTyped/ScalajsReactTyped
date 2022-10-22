package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsTable.libEsmCommonGridMod.Grid
import typingsJapgolly.blueprintjsTable.libEsmQuadrantsTableQuadrantMod.QuadrantType
import typingsJapgolly.blueprintjsTable.libEsmQuadrantsTableQuadrantStackMod.ITableQuadrantStackProps
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.TableLoadingOption
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableQuadrantStack {
  
  inline def apply(
    bodyRenderer: (QuadrantType, js.UndefOr[Boolean | Unit], js.UndefOr[Boolean]) => js.UndefOr[Element],
    didHeadersMount: Boolean,
    grid: Grid,
    numFrozenColumns: Double,
    numFrozenRows: Double
  ): Builder = {
    val __props = js.Dynamic.literal(bodyRenderer = js.Any.fromFunction3(bodyRenderer), didHeadersMount = didHeadersMount.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], numFrozenColumns = numFrozenColumns.asInstanceOf[js.Any], numFrozenRows = numFrozenRows.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ITableQuadrantStackProps]))
  }
  
  @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrantStack", "TableQuadrantStack")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.blueprintjsTable.libEsmQuadrantsTableQuadrantStackMod.TableQuadrantStack
        ] {
    
    inline def bodyRef(value: Ref[HTMLDivElement]): this.type = set("bodyRef", value.asInstanceOf[js.Any])
    
    inline def bodyRefFunction1(value: HTMLDivElement | Null => Callback): this.type = set("bodyRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def bodyRefNull: this.type = set("bodyRef", null)
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def columnHeaderRef(value: Ref[HTMLDivElement]): this.type = set("columnHeaderRef", value.asInstanceOf[js.Any])
    
    inline def columnHeaderRefFunction1(value: HTMLDivElement | Null => Callback): this.type = set("columnHeaderRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def columnHeaderRefNull: this.type = set("columnHeaderRef", null)
    
    inline def columnHeaderRenderer(
      value: (/* refHandler */ Ref[HTMLDivElement], /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double] | Null, Unit], /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], /* showFrozenColumnsOnly */ js.UndefOr[Boolean]) => js.UndefOr[Element]
    ): this.type = set("columnHeaderRenderer", js.Any.fromFunction4(value))
    
    inline def enableColumnHeader(value: Boolean): this.type = set("enableColumnHeader", value.asInstanceOf[js.Any])
    
    inline def enableColumnInteractionBar(value: Boolean): this.type = set("enableColumnInteractionBar", value.asInstanceOf[js.Any])
    
    inline def enableRowHeader(value: Boolean): this.type = set("enableRowHeader", value.asInstanceOf[js.Any])
    
    inline def handleColumnResizeGuide(value: /* verticalGuides */ js.Array[Double] => Callback): this.type = set("handleColumnResizeGuide", js.Any.fromFunction1((t0: /* verticalGuides */ js.Array[Double]) => value(t0).runNow()))
    
    inline def handleColumnsReordering(value: /* verticalGuides */ js.Array[Double] => Callback): this.type = set("handleColumnsReordering", js.Any.fromFunction1((t0: /* verticalGuides */ js.Array[Double]) => value(t0).runNow()))
    
    inline def handleRowResizeGuide(value: /* horizontalGuides */ js.Array[Double] => Callback): this.type = set("handleRowResizeGuide", js.Any.fromFunction1((t0: /* horizontalGuides */ js.Array[Double]) => value(t0).runNow()))
    
    inline def handleRowsReordering(value: /* horizontalGuides */ js.Array[Double] => Callback): this.type = set("handleRowsReordering", js.Any.fromFunction1((t0: /* horizontalGuides */ js.Array[Double]) => value(t0).runNow()))
    
    inline def isHorizontalScrollDisabled(value: Boolean): this.type = set("isHorizontalScrollDisabled", value.asInstanceOf[js.Any])
    
    inline def isVerticalScrollDisabled(value: Boolean): this.type = set("isVerticalScrollDisabled", value.asInstanceOf[js.Any])
    
    inline def loadingOptions(value: js.Array[TableLoadingOption]): this.type = set("loadingOptions", value.asInstanceOf[js.Any])
    
    inline def loadingOptionsVarargs(value: TableLoadingOption*): this.type = set("loadingOptions", js.Array(value*))
    
    inline def menuRenderer(value: /* refHandler */ js.UndefOr[Ref[HTMLDivElement]] => Element): this.type = set("menuRenderer", js.Any.fromFunction1(value))
    
    inline def numColumns(value: Double): this.type = set("numColumns", value.asInstanceOf[js.Any])
    
    inline def numRows(value: Double): this.type = set("numRows", value.asInstanceOf[js.Any])
    
    inline def onScroll(value: ReactEventFrom[HTMLElement] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def quadrantRef(value: Ref[HTMLDivElement]): this.type = set("quadrantRef", value.asInstanceOf[js.Any])
    
    inline def quadrantRefFunction1(value: HTMLDivElement | Null => Callback): this.type = set("quadrantRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def quadrantRefNull: this.type = set("quadrantRef", null)
    
    inline def rowHeaderRef(value: Ref[HTMLDivElement]): this.type = set("rowHeaderRef", value.asInstanceOf[js.Any])
    
    inline def rowHeaderRefFunction1(value: HTMLDivElement | Null => Callback): this.type = set("rowHeaderRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def rowHeaderRefNull: this.type = set("rowHeaderRef", null)
    
    inline def rowHeaderRenderer(
      value: (/* refHandler */ Ref[HTMLDivElement], /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double] | Null, Unit], /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], /* showFrozenRowsOnly */ js.UndefOr[Boolean]) => js.UndefOr[Element]
    ): this.type = set("rowHeaderRenderer", js.Any.fromFunction4(value))
    
    inline def scrollContainerRef(value: Ref[HTMLDivElement]): this.type = set("scrollContainerRef", value.asInstanceOf[js.Any])
    
    inline def scrollContainerRefFunction1(value: HTMLDivElement | Null => Callback): this.type = set("scrollContainerRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def scrollContainerRefNull: this.type = set("scrollContainerRef", null)
    
    inline def throttleScrolling(value: Boolean): this.type = set("throttleScrolling", value.asInstanceOf[js.Any])
    
    inline def viewSyncDelay(value: Double): this.type = set("viewSyncDelay", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITableQuadrantStackProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsTable.esmRegionsMod.TableLoadingOption
import typingsJapgolly.blueprintjsTable.gridMod.Grid
import typingsJapgolly.blueprintjsTable.tableQuadrantMod.QuadrantType
import typingsJapgolly.blueprintjsTable.tableQuadrantStackMod.ITableQuadrantStackProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableQuadrantStack {
  def apply(
    grid: Grid,
    bodyRenderer: (QuadrantType, js.UndefOr[Boolean], js.UndefOr[Boolean]) => CallbackTo[Element],
    bodyRef: /* ref */ HTMLElement | Null => CallbackTo[js.Any] = null,
    className: String = null,
    columnHeaderCellRenderer: (/* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], /* showFrozenColumnsOnly */ js.UndefOr[Boolean]) => CallbackTo[Element] = null,
    columnHeaderRef: /* ref */ HTMLElement | Null => Callback = null,
    enableColumnInteractionBar: js.UndefOr[Boolean] = js.undefined,
    enableRowHeader: js.UndefOr[Boolean] = js.undefined,
    handleColumnResizeGuide: /* verticalGuides */ js.Array[Double] => Callback = null,
    handleColumnsReordering: /* verticalGuides */ js.Array[Double] => Callback = null,
    handleRowResizeGuide: /* horizontalGuides */ js.Array[Double] => Callback = null,
    handleRowsReordering: /* horizontalGuides */ js.Array[Double] => Callback = null,
    isHorizontalScrollDisabled: js.UndefOr[Boolean] = js.undefined,
    isVerticalScrollDisabled: js.UndefOr[Boolean] = js.undefined,
    loadingOptions: js.Array[TableLoadingOption] = null,
    menuRenderer: /* refHandler */ js.Function1[/* ref */ HTMLElement, Unit] => CallbackTo[Element] = null,
    numColumns: Int | Double = null,
    numFrozenColumns: Int | Double = null,
    numFrozenRows: Int | Double = null,
    numRows: Int | Double = null,
    onScroll: ReactEventFrom[HTMLElement] => Callback = null,
    quadrantRef: /* ref */ HTMLElement | Null => Callback = null,
    rowHeaderCellRenderer: (/* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], /* showFrozenRowsOnly */ js.UndefOr[Boolean]) => CallbackTo[Element] = null,
    rowHeaderRef: /* ref */ HTMLElement | Null => CallbackTo[js.Any] = null,
    scrollContainerRef: /* ref */ HTMLElement | Null => CallbackTo[js.Any] = null,
    throttleScrolling: js.UndefOr[Boolean] = js.undefined,
    viewSyncDelay: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ITableQuadrantStackProps, 
    typingsJapgolly.blueprintjsTable.tableQuadrantStackMod.TableQuadrantStack, 
    Unit, 
    ITableQuadrantStackProps
  ] = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any])
  
      __obj.updateDynamic("bodyRenderer")(js.Any.fromFunction3((t0: typingsJapgolly.blueprintjsTable.tableQuadrantMod.QuadrantType, t1: js.UndefOr[scala.Boolean], t2: js.UndefOr[scala.Boolean]) => bodyRenderer(t0, t1, t2).runNow()))
    if (bodyRef != null) __obj.updateDynamic("bodyRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLElement | scala.Null) => bodyRef(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnHeaderCellRenderer != null) __obj.updateDynamic("columnHeaderCellRenderer")(js.Any.fromFunction4((t0: /* refHandler */ js.Function1[/* ref */ org.scalajs.dom.raw.HTMLElement, scala.Unit], t1: /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[scala.Double], scala.Unit], t2: /* reorderingHandler */ js.Function3[
  /* oldIndex */ scala.Double, 
  /* newIndex */ scala.Double, 
  /* length */ scala.Double, 
  scala.Unit], t3: /* showFrozenColumnsOnly */ js.UndefOr[scala.Boolean]) => columnHeaderCellRenderer(t0, t1, t2, t3).runNow()))
    if (columnHeaderRef != null) __obj.updateDynamic("columnHeaderRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLElement | scala.Null) => columnHeaderRef(t0).runNow()))
    if (!js.isUndefined(enableColumnInteractionBar)) __obj.updateDynamic("enableColumnInteractionBar")(enableColumnInteractionBar.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowHeader)) __obj.updateDynamic("enableRowHeader")(enableRowHeader.asInstanceOf[js.Any])
    if (handleColumnResizeGuide != null) __obj.updateDynamic("handleColumnResizeGuide")(js.Any.fromFunction1((t0: /* verticalGuides */ js.Array[scala.Double]) => handleColumnResizeGuide(t0).runNow()))
    if (handleColumnsReordering != null) __obj.updateDynamic("handleColumnsReordering")(js.Any.fromFunction1((t0: /* verticalGuides */ js.Array[scala.Double]) => handleColumnsReordering(t0).runNow()))
    if (handleRowResizeGuide != null) __obj.updateDynamic("handleRowResizeGuide")(js.Any.fromFunction1((t0: /* horizontalGuides */ js.Array[scala.Double]) => handleRowResizeGuide(t0).runNow()))
    if (handleRowsReordering != null) __obj.updateDynamic("handleRowsReordering")(js.Any.fromFunction1((t0: /* horizontalGuides */ js.Array[scala.Double]) => handleRowsReordering(t0).runNow()))
    if (!js.isUndefined(isHorizontalScrollDisabled)) __obj.updateDynamic("isHorizontalScrollDisabled")(isHorizontalScrollDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isVerticalScrollDisabled)) __obj.updateDynamic("isVerticalScrollDisabled")(isVerticalScrollDisabled.asInstanceOf[js.Any])
    if (loadingOptions != null) __obj.updateDynamic("loadingOptions")(loadingOptions.asInstanceOf[js.Any])
    if (menuRenderer != null) __obj.updateDynamic("menuRenderer")(js.Any.fromFunction1((t0: /* refHandler */ js.Function1[/* ref */ org.scalajs.dom.raw.HTMLElement, scala.Unit]) => menuRenderer(t0).runNow()))
    if (numColumns != null) __obj.updateDynamic("numColumns")(numColumns.asInstanceOf[js.Any])
    if (numFrozenColumns != null) __obj.updateDynamic("numFrozenColumns")(numFrozenColumns.asInstanceOf[js.Any])
    if (numFrozenRows != null) __obj.updateDynamic("numFrozenRows")(numFrozenRows.asInstanceOf[js.Any])
    if (numRows != null) __obj.updateDynamic("numRows")(numRows.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onScroll(t0).runNow()))
    if (quadrantRef != null) __obj.updateDynamic("quadrantRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLElement | scala.Null) => quadrantRef(t0).runNow()))
    if (rowHeaderCellRenderer != null) __obj.updateDynamic("rowHeaderCellRenderer")(js.Any.fromFunction4((t0: /* refHandler */ js.Function1[/* ref */ org.scalajs.dom.raw.HTMLElement, scala.Unit], t1: /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[scala.Double], scala.Unit], t2: /* reorderingHandler */ js.Function3[
  /* oldIndex */ scala.Double, 
  /* newIndex */ scala.Double, 
  /* length */ scala.Double, 
  scala.Unit], t3: /* showFrozenRowsOnly */ js.UndefOr[scala.Boolean]) => rowHeaderCellRenderer(t0, t1, t2, t3).runNow()))
    if (rowHeaderRef != null) __obj.updateDynamic("rowHeaderRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLElement | scala.Null) => rowHeaderRef(t0).runNow()))
    if (scrollContainerRef != null) __obj.updateDynamic("scrollContainerRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLElement | scala.Null) => scrollContainerRef(t0).runNow()))
    if (!js.isUndefined(throttleScrolling)) __obj.updateDynamic("throttleScrolling")(throttleScrolling.asInstanceOf[js.Any])
    if (viewSyncDelay != null) __obj.updateDynamic("viewSyncDelay")(viewSyncDelay.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.tableQuadrantStackMod.ITableQuadrantStackProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.tableQuadrantStackMod.TableQuadrantStack](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.tableQuadrantStackMod.ITableQuadrantStackProps])(children: _*)
  }
  @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrantStack", "TableQuadrantStack")
  @js.native
  object componentImport extends js.Object
  
}


package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsTable.libEsmCommonCellTypesMod.FocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.libEsmCommonMod.Grid
import typingsJapgolly.blueprintjsTable.libEsmHeadersHeaderMod.IInternalHeaderProps
import typingsJapgolly.blueprintjsTable.libEsmInteractionsDragTypesMod.IClientCoordinates
import typingsJapgolly.blueprintjsTable.libEsmInteractionsDragTypesMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.libEsmInteractionsResizeHandleMod.Orientation
import typingsJapgolly.blueprintjsTable.libEsmLocatorMod.ILocator
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.Region
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.RegionCardinality
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Header {
  
  inline def apply(
    convertPointToIndex: (Double, js.UndefOr[Boolean]) => Double,
    fullRegionCardinality: RegionCardinality,
    getCellExtremaClasses: (Double, Double) => js.Array[String],
    getCellIndexClass: Double => String,
    getCellSize: Double => Double,
    getDragCoordinate: IClientCoordinates => Double,
    getIndexClass: Double => String,
    getMouseCoordinate: MouseEvent => Double,
    ghostCellRenderer: (Double, js.Array[String]) => Element,
    grid: Grid,
    handleResizeEnd: (Double, Double) => Callback,
    handleSizeChanged: (Double, Double) => Callback,
    headerCellIsReorderablePropName: String,
    headerCellIsSelectedPropName: String,
    headerCellRenderer: Double => Element | Null,
    indexEnd: Double,
    indexStart: Double,
    isCellSelected: Double => Boolean,
    isGhostIndex: Double => Boolean,
    locator: ILocator,
    maxSize: Double,
    minSize: Double,
    onFocusedCell: FocusedCellCoordinates => Callback,
    onLayoutLock: js.UndefOr[Boolean] => Callback,
    onReordered: (Double, Double, Double) => Callback,
    onReordering: (Double, Double, Double) => Callback,
    onResizeGuide: js.UndefOr[js.Array[Double]] => Callback,
    onSelection: js.Array[Region] => Callback,
    resizeOrientation: Orientation,
    selectedRegions: js.Array[Region],
    toRegion: (Double, js.UndefOr[Double]) => Region,
    wrapCells: js.Array[japgolly.scalajs.react.facade.React.Element] => Element
  ): Builder = {
    val __props = js.Dynamic.literal(convertPointToIndex = js.Any.fromFunction2(convertPointToIndex), fullRegionCardinality = fullRegionCardinality.asInstanceOf[js.Any], getCellExtremaClasses = js.Any.fromFunction2(getCellExtremaClasses), getCellIndexClass = js.Any.fromFunction1(getCellIndexClass), getCellSize = js.Any.fromFunction1(getCellSize), getDragCoordinate = js.Any.fromFunction1(getDragCoordinate), getIndexClass = js.Any.fromFunction1(getIndexClass), getMouseCoordinate = js.Any.fromFunction1(getMouseCoordinate), ghostCellRenderer = js.Any.fromFunction2(ghostCellRenderer), grid = grid.asInstanceOf[js.Any], handleResizeEnd = js.Any.fromFunction2((t0: Double, t1: Double) => (handleResizeEnd(t0, t1)).runNow()), handleSizeChanged = js.Any.fromFunction2((t0: Double, t1: Double) => (handleSizeChanged(t0, t1)).runNow()), headerCellIsReorderablePropName = headerCellIsReorderablePropName.asInstanceOf[js.Any], headerCellIsSelectedPropName = headerCellIsSelectedPropName.asInstanceOf[js.Any], headerCellRenderer = js.Any.fromFunction1(headerCellRenderer), indexEnd = indexEnd.asInstanceOf[js.Any], indexStart = indexStart.asInstanceOf[js.Any], isCellSelected = js.Any.fromFunction1(isCellSelected), isGhostIndex = js.Any.fromFunction1(isGhostIndex), locator = locator.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], onFocusedCell = js.Any.fromFunction1((t0: FocusedCellCoordinates) => onFocusedCell(t0).runNow()), onLayoutLock = js.Any.fromFunction1((t0: js.UndefOr[Boolean]) => onLayoutLock(t0).runNow()), onReordered = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (onReordered(t0, t1, t2)).runNow()), onReordering = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (onReordering(t0, t1, t2)).runNow()), onResizeGuide = js.Any.fromFunction1((t0: js.UndefOr[js.Array[Double]]) => onResizeGuide(t0).runNow()), onSelection = js.Any.fromFunction1((t0: js.Array[Region]) => onSelection(t0).runNow()), resizeOrientation = resizeOrientation.asInstanceOf[js.Any], selectedRegions = selectedRegions.asInstanceOf[js.Any], toRegion = js.Any.fromFunction2(toRegion), wrapCells = js.Any.fromFunction1(wrapCells))
    new Builder(js.Array(this.component, __props.asInstanceOf[IInternalHeaderProps]))
  }
  
  @JSImport("@blueprintjs/table/lib/esm/headers/header", "Header")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsTable.libEsmHeadersHeaderMod.Header] {
    
    inline def enableMultipleSelection(value: Boolean): this.type = set("enableMultipleSelection", value.asInstanceOf[js.Any])
    
    inline def focusedCell(value: FocusedCellCoordinates): this.type = set("focusedCell", value.asInstanceOf[js.Any])
    
    inline def handleResizeDoubleClick(value: /* index */ Double => Callback): this.type = set("handleResizeDoubleClick", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
    
    inline def isResizable(value: Boolean): this.type = set("isResizable", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def onSelectionEnd(value: /* regions */ js.Array[Region] => Callback): this.type = set("onSelectionEnd", js.Any.fromFunction1((t0: /* regions */ js.Array[Region]) => value(t0).runNow()))
    
    inline def selectedRegionTransform(
      value: (/* region */ Region, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => Region
    ): this.type = set("selectedRegionTransform", js.Any.fromFunction3(value))
  }
  
  def withProps(p: IInternalHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

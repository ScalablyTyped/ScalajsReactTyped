package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.commonMod.Grid
import typingsJapgolly.blueprintjsTable.draggableMod.IClientCoordinates
import typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion
import typingsJapgolly.blueprintjsTable.esmRegionsMod.RegionCardinality
import typingsJapgolly.blueprintjsTable.headerMod.IInternalHeaderProps
import typingsJapgolly.blueprintjsTable.locatorMod.ILocator
import typingsJapgolly.blueprintjsTable.resizeHandleMod.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Header {
  def apply(
    fullRegionCardinality: RegionCardinality,
    grid: Grid,
    headerCellIsReorderablePropName: String,
    headerCellIsSelectedPropName: String,
    indexEnd: Double,
    indexStart: Double,
    locator: ILocator,
    maxSize: Double,
    minSize: Double,
    resizeOrientation: Orientation,
    selectedRegions: js.Array[IRegion],
    getCellExtremaClasses: (Double, Double) => CallbackTo[js.Array[String]],
    getCellIndexClass: Double => CallbackTo[String],
    getCellSize: Double => CallbackTo[Double],
    getDragCoordinate: IClientCoordinates => CallbackTo[Double],
    getIndexClass: Double => CallbackTo[String],
    getMouseCoordinate: MouseEvent => CallbackTo[Double],
    ghostCellRenderer: (Double, js.Array[String]) => CallbackTo[Element],
    handleResizeEnd: (Double, Double) => Callback,
    handleSizeChanged: (Double, Double) => Callback,
    headerCellRenderer: Double => CallbackTo[Element],
    isCellSelected: Double => CallbackTo[Boolean],
    isGhostIndex: Double => CallbackTo[Boolean],
    onFocusedCell: IFocusedCellCoordinates => Callback,
    onLayoutLock: js.UndefOr[Boolean] => Callback,
    onReordered: (Double, Double, Double) => Callback,
    onReordering: (Double, Double, Double) => Callback,
    onResizeGuide: js.Array[Double] => Callback,
    onSelection: js.Array[IRegion] => Callback,
    toRegion: (Double, js.UndefOr[Double]) => CallbackTo[IRegion],
    wrapCells: js.Array[Element] => CallbackTo[Element],
    convertPointToIndex: (/* clientXOrY */ Double, /* useMidpoint */ js.UndefOr[Boolean]) => CallbackTo[Double] = null,
    enableMultipleSelection: js.UndefOr[Boolean] = js.undefined,
    focusedCell: IFocusedCellCoordinates = null,
    handleResizeDoubleClick: /* index */ Double => Callback = null,
    isResizable: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    onSelectionEnd: /* regions */ js.Array[IRegion] => Callback = null,
    selectedRegionTransform: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => CallbackTo[IRegion] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IInternalHeaderProps, 
    typingsJapgolly.blueprintjsTable.headerMod.Header, 
    Unit, 
    IInternalHeaderProps
  ] = {
    val __obj = js.Dynamic.literal(fullRegionCardinality = fullRegionCardinality.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], headerCellIsReorderablePropName = headerCellIsReorderablePropName.asInstanceOf[js.Any], headerCellIsSelectedPropName = headerCellIsSelectedPropName.asInstanceOf[js.Any], indexEnd = indexEnd.asInstanceOf[js.Any], indexStart = indexStart.asInstanceOf[js.Any], locator = locator.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], resizeOrientation = resizeOrientation.asInstanceOf[js.Any], selectedRegions = selectedRegions.asInstanceOf[js.Any])
  
      __obj.updateDynamic("getCellExtremaClasses")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getCellExtremaClasses(t0, t1).runNow()))
    __obj.updateDynamic("getCellIndexClass")(js.Any.fromFunction1((t0: scala.Double) => getCellIndexClass(t0).runNow()))
    __obj.updateDynamic("getCellSize")(js.Any.fromFunction1((t0: scala.Double) => getCellSize(t0).runNow()))
    __obj.updateDynamic("getDragCoordinate")(js.Any.fromFunction1((t0: typingsJapgolly.blueprintjsTable.draggableMod.IClientCoordinates) => getDragCoordinate(t0).runNow()))
    __obj.updateDynamic("getIndexClass")(js.Any.fromFunction1((t0: scala.Double) => getIndexClass(t0).runNow()))
    __obj.updateDynamic("getMouseCoordinate")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.MouseEvent) => getMouseCoordinate(t0).runNow()))
    __obj.updateDynamic("ghostCellRenderer")(js.Any.fromFunction2((t0: scala.Double, t1: js.Array[java.lang.String]) => ghostCellRenderer(t0, t1).runNow()))
    __obj.updateDynamic("handleResizeEnd")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => handleResizeEnd(t0, t1).runNow()))
    __obj.updateDynamic("handleSizeChanged")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => handleSizeChanged(t0, t1).runNow()))
    __obj.updateDynamic("headerCellRenderer")(js.Any.fromFunction1((t0: scala.Double) => headerCellRenderer(t0).runNow()))
    __obj.updateDynamic("isCellSelected")(js.Any.fromFunction1((t0: scala.Double) => isCellSelected(t0).runNow()))
    __obj.updateDynamic("isGhostIndex")(js.Any.fromFunction1((t0: scala.Double) => isGhostIndex(t0).runNow()))
    __obj.updateDynamic("onFocusedCell")(js.Any.fromFunction1((t0: typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates) => onFocusedCell(t0).runNow()))
    __obj.updateDynamic("onLayoutLock")(js.Any.fromFunction1((t0: js.UndefOr[scala.Boolean]) => onLayoutLock(t0).runNow()))
    __obj.updateDynamic("onReordered")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => onReordered(t0, t1, t2).runNow()))
    __obj.updateDynamic("onReordering")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => onReordering(t0, t1, t2).runNow()))
    __obj.updateDynamic("onResizeGuide")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => onResizeGuide(t0).runNow()))
    __obj.updateDynamic("onSelection")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion]) => onSelection(t0).runNow()))
    __obj.updateDynamic("toRegion")(js.Any.fromFunction2((t0: scala.Double, t1: js.UndefOr[scala.Double]) => toRegion(t0, t1).runNow()))
    __obj.updateDynamic("wrapCells")(js.Any.fromFunction1((t0: js.Array[japgolly.scalajs.react.raw.React.Element]) => wrapCells(t0).runNow()))
    if (convertPointToIndex != null) __obj.updateDynamic("convertPointToIndex")(js.Any.fromFunction2((t0: /* clientXOrY */ scala.Double, t1: /* useMidpoint */ js.UndefOr[scala.Boolean]) => convertPointToIndex(t0, t1).runNow()))
    if (!js.isUndefined(enableMultipleSelection)) __obj.updateDynamic("enableMultipleSelection")(enableMultipleSelection.asInstanceOf[js.Any])
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell.asInstanceOf[js.Any])
    if (handleResizeDoubleClick != null) __obj.updateDynamic("handleResizeDoubleClick")(js.Any.fromFunction1((t0: /* index */ scala.Double) => handleResizeDoubleClick(t0).runNow()))
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onSelectionEnd != null) __obj.updateDynamic("onSelectionEnd")(js.Any.fromFunction1((t0: /* regions */ js.Array[typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion]) => onSelectionEnd(t0).runNow()))
    if (selectedRegionTransform != null) __obj.updateDynamic("selectedRegionTransform")(js.Any.fromFunction3((t0: /* region */ typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion, t1: /* event */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.KeyboardEvent, t2: /* coords */ js.UndefOr[typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData]) => selectedRegionTransform(t0, t1, t2).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.headerMod.IInternalHeaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.headerMod.Header](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.headerMod.IInternalHeaderProps])(children: _*)
  }
  @JSImport("@blueprintjs/table/lib/esm/headers/header", "Header")
  @js.native
  object componentImport extends js.Object
  
}


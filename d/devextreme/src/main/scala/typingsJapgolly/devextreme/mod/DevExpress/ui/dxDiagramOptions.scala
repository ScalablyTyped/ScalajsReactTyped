package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonAllowEditImage
import typingsJapgolly.devextreme.AnonAutoLayout
import typingsJapgolly.devextreme.AnonCollapsible
import typingsJapgolly.devextreme.AnonCommands
import typingsJapgolly.devextreme.AnonComponentDxDiagram
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonElementItems
import typingsJapgolly.devextreme.AnonFromExpr
import typingsJapgolly.devextreme.AnonGroups
import typingsJapgolly.devextreme.AnonItem
import typingsJapgolly.devextreme.AnonItemsValue
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.AnonProxyUrl
import typingsJapgolly.devextreme.AnonVisible
import typingsJapgolly.devextreme.AnonWidth
import typingsJapgolly.devextreme.devextremeStrings.cm
import typingsJapgolly.devextreme.devextremeStrings.disabled
import typingsJapgolly.devextreme.devextremeStrings.fitContent
import typingsJapgolly.devextreme.devextremeStrings.fitWidth
import typingsJapgolly.devextreme.devextremeStrings.in
import typingsJapgolly.devextreme.devextremeStrings.landscape
import typingsJapgolly.devextreme.devextremeStrings.portrait
import typingsJapgolly.devextreme.devextremeStrings.px
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDiagramOptions extends WidgetOptions[dxDiagram] {
  /** Specifies whether the Diagram widget automatically zooms the work area. */
  var autoZoom: js.UndefOr[fitContent | fitWidth | disabled] = js.undefined
  /** Configures the context menu's settings. */
  var contextMenu: js.UndefOr[AnonCommands] = js.undefined
  /** Provide access to an array of custom shapes. */
  var customShapes: js.UndefOr[js.Array[AnonAllowEditImage]] = js.undefined
  /** Allows you to bind the collection of diagram edges to a data source. */
  var edges: js.UndefOr[AnonFromExpr] = js.undefined
  /** Configures export settings. */
  var export: js.UndefOr[AnonProxyUrl] = js.undefined
  /** Specifies whether or not to display the widget in full-screen mode. */
  var fullScreen: js.UndefOr[Boolean] = js.undefined
  /** Specifies the grid pitch. */
  var gridSize: js.UndefOr[Double | AnonItemsValue] = js.undefined
  /** Allows you to bind the collection of diagram nodes to a data source. */
  var nodes: js.UndefOr[AnonAutoLayout] = js.undefined
  /** A function that is executed when the diagram's data changes. */
  var onDataChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxDiagram, _]] = js.undefined
  /** A function that is executed after a shape or connector is clicked. */
  var onItemClick: js.UndefOr[js.Function1[/* e */ AnonItem, _]] = js.undefined
  /** A function that is executed after a shape or connector is double-clicked. */
  var onItemDblClick: js.UndefOr[js.Function1[/* e */ AnonItem, _]] = js.undefined
  /** A function that is executed after the selection is changed in the Diagram. */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonElementItems, _]] = js.undefined
  /** Specifies the color of a diagram page. */
  var pageColor: js.UndefOr[String] = js.undefined
  /** Specifies the page orientation. */
  var pageOrientation: js.UndefOr[portrait | landscape] = js.undefined
  /** Specifies a size of pages. */
  var pageSize: js.UndefOr[AnonWidth] = js.undefined
  /** Provides access to Properties panel settings. */
  var propertiesPanel: js.UndefOr[AnonCollapsible] = js.undefined
  /** Specifies whether the diagram is read-only. */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether grid lines are visible. */
  var showGrid: js.UndefOr[Boolean] = js.undefined
  /** Switch the Diagram widget to simple view mode. */
  var simpleView: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether diagram elements should snap to grid lines. */
  var snapToGrid: js.UndefOr[Boolean] = js.undefined
  /** Provides access to toolbar settings. */
  var toolbar: js.UndefOr[AnonVisible] = js.undefined
  /** Provides access to toolbox settings. */
  var toolbox: js.UndefOr[AnonGroups] = js.undefined
  /** Specifies the unit for measurement options (for example, defaultHeight, gridSize, leftExpr). */
  var units: js.UndefOr[in | cm | px] = js.undefined
  /** Specifies the measurement unit that is displayed in user interface elements. */
  var viewUnits: js.UndefOr[in | cm | px] = js.undefined
  /** Specifies the zoom level. */
  var zoomLevel: js.UndefOr[Double | AnonItemsValue] = js.undefined
}

object dxDiagramOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    autoZoom: fitContent | fitWidth | disabled = null,
    bindingOptions: js.Any = null,
    contextMenu: AnonCommands = null,
    customShapes: js.Array[AnonAllowEditImage] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    edges: AnonFromExpr = null,
    elementAttr: js.Any = null,
    export: AnonProxyUrl = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    fullScreen: js.UndefOr[Boolean] = js.undefined,
    gridSize: Double | AnonItemsValue = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    nodes: AnonAutoLayout = null,
    onContentReady: /* e */ AnonComponentElement[dxDiagram] => CallbackTo[js.Any] = null,
    onDataChanged: /* e */ AnonComponentDxDiagram => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxDiagram] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxDiagram] => CallbackTo[js.Any] = null,
    onItemClick: /* e */ AnonItem => CallbackTo[js.Any] = null,
    onItemDblClick: /* e */ AnonItem => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxDiagram] => CallbackTo[js.Any] = null,
    onSelectionChanged: /* e */ AnonElementItems => CallbackTo[js.Any] = null,
    pageColor: String = null,
    pageOrientation: portrait | landscape = null,
    pageSize: AnonWidth = null,
    propertiesPanel: AnonCollapsible = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    simpleView: js.UndefOr[Boolean] = js.undefined,
    snapToGrid: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    toolbar: AnonVisible = null,
    toolbox: AnonGroups = null,
    units: in | cm | px = null,
    viewUnits: in | cm | px = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null,
    zoomLevel: Double | AnonItemsValue = null
  ): dxDiagramOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (autoZoom != null) __obj.updateDynamic("autoZoom")(autoZoom.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (customShapes != null) __obj.updateDynamic("customShapes")(customShapes.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (edges != null) __obj.updateDynamic("edges")(edges.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen.asInstanceOf[js.Any])
    if (gridSize != null) __obj.updateDynamic("gridSize")(gridSize.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDiagram]) => onContentReady(t0).runNow()))
    if (onDataChanged != null) __obj.updateDynamic("onDataChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentDxDiagram) => onDataChanged(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDiagram]) => onDisposing(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDiagram]) => onInitialized(t0).runNow()))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonItem) => onItemClick(t0).runNow()))
    if (onItemDblClick != null) __obj.updateDynamic("onItemDblClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonItem) => onItemDblClick(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDiagram]) => onOptionChanged(t0).runNow()))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementItems) => onSelectionChanged(t0).runNow()))
    if (pageColor != null) __obj.updateDynamic("pageColor")(pageColor.asInstanceOf[js.Any])
    if (pageOrientation != null) __obj.updateDynamic("pageOrientation")(pageOrientation.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (propertiesPanel != null) __obj.updateDynamic("propertiesPanel")(propertiesPanel.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid.asInstanceOf[js.Any])
    if (!js.isUndefined(simpleView)) __obj.updateDynamic("simpleView")(simpleView.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToGrid)) __obj.updateDynamic("snapToGrid")(snapToGrid.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (toolbox != null) __obj.updateDynamic("toolbox")(toolbox.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (viewUnits != null) __obj.updateDynamic("viewUnits")(viewUnits.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoomLevel != null) __obj.updateDynamic("zoomLevel")(zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDiagramOptions]
  }
}


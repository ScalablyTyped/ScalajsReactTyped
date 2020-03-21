package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonCancelComponentData
import typingsJapgolly.devextreme.AnonColorCodeField
import typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonElementModelNode
import typingsJapgolly.devextreme.AnonFormatModel
import typingsJapgolly.devextreme.AnonHeaderHeight
import typingsJapgolly.devextreme.AnonJQueryEventModelNode
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonModelRoot
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.AnonRect
import typingsJapgolly.devextreme.AnonSelectionStyle
import typingsJapgolly.devextreme.AnonTargetAny
import typingsJapgolly.devextreme.devextremeStrings.ellipsis
import typingsJapgolly.devextreme.devextremeStrings.genericDotcarmine
import typingsJapgolly.devextreme.devextremeStrings.genericDotcontrast
import typingsJapgolly.devextreme.devextremeStrings.genericDotdark
import typingsJapgolly.devextreme.devextremeStrings.genericDotdarkmoon
import typingsJapgolly.devextreme.devextremeStrings.genericDotdarkviolet
import typingsJapgolly.devextreme.devextremeStrings.genericDotgreenmist
import typingsJapgolly.devextreme.devextremeStrings.genericDotlight
import typingsJapgolly.devextreme.devextremeStrings.genericDotsoftblue
import typingsJapgolly.devextreme.devextremeStrings.hide
import typingsJapgolly.devextreme.devextremeStrings.ios7Dotdefault
import typingsJapgolly.devextreme.devextremeStrings.leftBottomRightTop
import typingsJapgolly.devextreme.devextremeStrings.leftTopRightBottom
import typingsJapgolly.devextreme.devextremeStrings.materialDotblueDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDotlimeDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDotorangeDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDotpurpleDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDottealDotlight
import typingsJapgolly.devextreme.devextremeStrings.multiple
import typingsJapgolly.devextreme.devextremeStrings.none
import typingsJapgolly.devextreme.devextremeStrings.rightBottomLeftTop
import typingsJapgolly.devextreme.devextremeStrings.rightTopLeftBottom
import typingsJapgolly.devextreme.devextremeStrings.single_
import typingsJapgolly.devextreme.devextremeStrings.sliceanddice
import typingsJapgolly.devextreme.devextremeStrings.squarified
import typingsJapgolly.devextreme.devextremeStrings.strip
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTreeMapOptions extends BaseWidgetOptions[dxTreeMap] {
  /** Specifies the name of the data source field that provides nested items for a group. Applies to hierarchical data sources only. */
  var childrenField: js.UndefOr[String] = js.undefined
  /** Specifies the name of the data source field that provides colors for tiles. */
  var colorField: js.UndefOr[String] = js.undefined
  /** Manages the color settings. */
  var colorizer: js.UndefOr[AnonColorCodeField] = js.undefined
  /** Binds the widget to data. */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.undefined
  /** Configures groups. */
  var group: js.UndefOr[AnonHeaderHeight] = js.undefined
  /** Specifies whether tiles and groups change their style when a user pauses on them. */
  var hoverEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the name of the data source field that provides IDs for items. Applies to plain data sources only. */
  var idField: js.UndefOr[String] = js.undefined
  /** Specifies whether the user will interact with a single tile or its group. */
  var interactWithGroup: js.UndefOr[Boolean] = js.undefined
  /** Specifies the name of the data source field that provides texts for tile and group labels. */
  var labelField: js.UndefOr[String] = js.undefined
  /** Specifies the layout algorithm. */
  var layoutAlgorithm: js.UndefOr[sliceanddice | squarified | strip | (js.Function1[/* e */ AnonRect, _])] = js.undefined
  /** Specifies the direction in which the items will be laid out. */
  var layoutDirection: js.UndefOr[
    leftBottomRightTop | leftTopRightBottom | rightBottomLeftTop | rightTopLeftBottom
  ] = js.undefined
  /** Specifies how many hierarchical levels must be visualized. */
  var maxDepth: js.UndefOr[Double] = js.undefined
  /** A function that is executed when a node is clicked or tapped. */
  var onClick: js.UndefOr[(js.Function1[/* e */ AnonJQueryEventModelNode, _]) | String] = js.undefined
  /** A function that is executed when a user drills up or down. */
  var onDrill: js.UndefOr[js.Function1[/* e */ AnonElementModelNode, _]] = js.undefined
  /** A function that is executed after the pointer enters or leaves a node. */
  var onHoverChanged: js.UndefOr[js.Function1[/* e */ AnonElementModelNode, _]] = js.undefined
  /** A function that is executed only once, after the nodes are initialized. */
  var onNodesInitialized: js.UndefOr[js.Function1[/* e */ AnonModelRoot, _]] = js.undefined
  /** A function that is executed before the nodes are displayed and each time the collection of active nodes is changed. */
  var onNodesRendering: js.UndefOr[js.Function1[/* e */ AnonElementModelNode, _]] = js.undefined
  /** A function that is executed when a node is selected or selection is canceled. */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonElementModelNode, _]] = js.undefined
  /** Specifies the name of the data source field that provides parent IDs for items. Applies to plain data sources only. */
  var parentField: js.UndefOr[String] = js.undefined
  /** @deprecated Use the tile.label.textOverflow option instead. */
  /** Decides whether those labels that overflow their tile/group should be hidden or truncated with ellipsis. */
  var resolveLabelOverflow: js.UndefOr[ellipsis | hide] = js.undefined
  /** Specifies whether a single or multiple nodes can be in the selected state simultaneously. */
  var selectionMode: js.UndefOr[multiple | none | single_] = js.undefined
  /** Configures tiles. */
  var tile: js.UndefOr[AnonSelectionStyle] = js.undefined
  /** Configures tooltips - small pop-up rectangles that display information about a data-visualizing widget element being pressed or hovered over with the mouse pointer. */
  @JSName("tooltip")
  var tooltip_dxTreeMapOptions: js.UndefOr[dxTreeMapTooltip] = js.undefined
  /** Specifies the name of the data source field that provides values for tiles. */
  var valueField: js.UndefOr[String] = js.undefined
}

object dxTreeMapOptions {
  @scala.inline
  def apply(
    bindingOptions: js.Any = null,
    childrenField: String = null,
    colorField: String = null,
    colorizer: AnonColorCodeField = null,
    dataSource: js.Array[_] | DataSource | DataSourceOptions | String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    group: AnonHeaderHeight = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hoverEnabled: js.UndefOr[Boolean] = js.undefined,
    idField: String = null,
    interactWithGroup: js.UndefOr[Boolean] = js.undefined,
    labelField: String = null,
    layoutAlgorithm: sliceanddice | squarified | strip | (js.Function1[/* e */ AnonRect, _]) = null,
    layoutDirection: leftBottomRightTop | leftTopRightBottom | rightBottomLeftTop | rightTopLeftBottom = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    maxDepth: Int | Double = null,
    onClick: (js.Function1[/* e */ AnonJQueryEventModelNode, _]) | String = null,
    onDisposing: /* e */ AnonModel[dxTreeMap] => CallbackTo[js.Any] = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[dxTreeMap] => CallbackTo[js.Any] = null,
    onDrill: /* e */ AnonElementModelNode => CallbackTo[js.Any] = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[dxTreeMap] => CallbackTo[js.Any] = null,
    onExporting: /* e */ AnonFormatModel[dxTreeMap] => CallbackTo[js.Any] = null,
    onFileSaving: /* e */ AnonCancelComponentData[dxTreeMap] => CallbackTo[js.Any] = null,
    onHoverChanged: /* e */ AnonElementModelNode => CallbackTo[js.Any] = null,
    onIncidentOccurred: /* e */ AnonTargetAny[dxTreeMap] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxTreeMap] => CallbackTo[js.Any] = null,
    onNodesInitialized: /* e */ AnonModelRoot => CallbackTo[js.Any] = null,
    onNodesRendering: /* e */ AnonElementModelNode => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxTreeMap] => CallbackTo[js.Any] = null,
    onSelectionChanged: /* e */ AnonElementModelNode => CallbackTo[js.Any] = null,
    parentField: String = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    resolveLabelOverflow: ellipsis | hide = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectionMode: multiple | none | single_ = null,
    size: BaseWidgetSize = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    tile: AnonSelectionStyle = null,
    title: BaseWidgetTitle | String = null,
    tooltip: dxTreeMapTooltip = null,
    valueField: String = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxTreeMapOptions = {
    val __obj = js.Dynamic.literal()
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (childrenField != null) __obj.updateDynamic("childrenField")(childrenField.asInstanceOf[js.Any])
    if (colorField != null) __obj.updateDynamic("colorField")(colorField.asInstanceOf[js.Any])
    if (colorizer != null) __obj.updateDynamic("colorizer")(colorizer.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverEnabled)) __obj.updateDynamic("hoverEnabled")(hoverEnabled.asInstanceOf[js.Any])
    if (idField != null) __obj.updateDynamic("idField")(idField.asInstanceOf[js.Any])
    if (!js.isUndefined(interactWithGroup)) __obj.updateDynamic("interactWithGroup")(interactWithGroup.asInstanceOf[js.Any])
    if (labelField != null) __obj.updateDynamic("labelField")(labelField.asInstanceOf[js.Any])
    if (layoutAlgorithm != null) __obj.updateDynamic("layoutAlgorithm")(layoutAlgorithm.asInstanceOf[js.Any])
    if (layoutDirection != null) __obj.updateDynamic("layoutDirection")(layoutDirection.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.viz.dxTreeMap]) => onDisposing(t0).runNow()))
    if (onDrawn != null) __obj.updateDynamic("onDrawn")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxTreeMap]) => onDrawn(t0).runNow()))
    if (onDrill != null) __obj.updateDynamic("onDrill")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementModelNode) => onDrill(t0).runNow()))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxTreeMap]) => onExported(t0).runNow()))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonFormatModel[typingsJapgolly.devextreme.mod.DevExpress.viz.dxTreeMap]) => onExporting(t0).runNow()))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonCancelComponentData[typingsJapgolly.devextreme.mod.DevExpress.viz.dxTreeMap]) => onFileSaving(t0).runNow()))
    if (onHoverChanged != null) __obj.updateDynamic("onHoverChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementModelNode) => onHoverChanged(t0).runNow()))
    if (onIncidentOccurred != null) __obj.updateDynamic("onIncidentOccurred")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonTargetAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxTreeMap]) => onIncidentOccurred(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.viz.dxTreeMap]) => onInitialized(t0).runNow()))
    if (onNodesInitialized != null) __obj.updateDynamic("onNodesInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModelRoot) => onNodesInitialized(t0).runNow()))
    if (onNodesRendering != null) __obj.updateDynamic("onNodesRendering")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementModelNode) => onNodesRendering(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.viz.dxTreeMap]) => onOptionChanged(t0).runNow()))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementModelNode) => onSelectionChanged(t0).runNow()))
    if (parentField != null) __obj.updateDynamic("parentField")(parentField.asInstanceOf[js.Any])
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (resolveLabelOverflow != null) __obj.updateDynamic("resolveLabelOverflow")(resolveLabelOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tile != null) __obj.updateDynamic("tile")(tile.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeMapOptions]
  }
}


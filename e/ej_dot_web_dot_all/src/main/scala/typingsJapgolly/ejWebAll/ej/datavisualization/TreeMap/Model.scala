package typingsJapgolly.ejWebAll.ej.datavisualization.TreeMap

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires, on clicking the tree map items.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
  /** Specifies the border brush color of the treemap
    * @Default {white}
    */
  var borderBrush: js.UndefOr[String] = js.undefined
  /** Specifies the border thickness of the treemap
    * @Default {1}
    */
  var borderThickness: js.UndefOr[Double] = js.undefined
  /** Specifies the field name in the datasource that contains color values for treemap items.
    * @Default {null}
    */
  var colorPath: js.UndefOr[String] = js.undefined
  /** Specifies the color value path of the treemap
    * @Default {null}
    */
  var colorValuePath: js.UndefOr[String] = js.undefined
  /** Specifies the datasource of the treemap
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Specifies the desaturationColorMapping settings of the treemap
    */
  var desaturationColorMapping: js.UndefOr[DesaturationColorMapping] = js.undefined
  /** Specifies the dockPosition for legend
    * @Default {top}
    */
  var dockPosition: js.UndefOr[DockPosition | String] = js.undefined
  /** Fires, on double clicking the tree map items.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.undefined
  /** This property is used to select group of treemap items while clicking and dragging
    * @Default {false}
    */
  var draggingGroupOnSelection: js.UndefOr[Boolean] = js.undefined
  /** This property is used to select treemap items while clicking and dragging
    * @Default {false}
    */
  var draggingOnSelection: js.UndefOr[Boolean] = js.undefined
  /** specifies the drillDown header color
    * @Default {'null'}
    */
  var drillDownHeaderColor: js.UndefOr[String] = js.undefined
  /** Triggers on treemap  drilldown  item  selected.
    */
  var drillDownItemSelected: js.UndefOr[js.Function1[/* e */ DrillDownItemSelectedEventArgs, Unit]] = js.undefined
  /** Specifies to render particular level of the treemap.
    * @Default {0}
    */
  var drillDownLevel: js.UndefOr[Double] = js.undefined
  /** specifies the drillDown selection color
    * @Default {'#000000'}
    */
  var drillDownSelectionColor: js.UndefOr[String] = js.undefined
  /** Specifies to drill the particular data of the treemap.
    * @Default {null}
    */
  var drillDownValue: js.UndefOr[String] = js.undefined
  /** Triggers when drilldown is started
    */
  var drillStarted: js.UndefOr[js.Function1[/* e */ DrillStartedEventArgs, Unit]] = js.undefined
  /** Enable/Disable the drillDown for treemap
    * @Default {false}
    */
  var enableDrillDown: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether gradient color has to be applied for treemap items
    * @Default {false}
    */
  var enableGradient: js.UndefOr[Boolean] = js.undefined
  /** Specify to convert the date object to string, using locale settings.
    * @Default {false}
    */
  var enableGroupSeparator: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether treemap need to resize when container is resized
    * @Default {true}
    */
  var enableResize: js.UndefOr[Boolean] = js.undefined
  /** Specifies the group color mapping of the treemap
    * @Default {[]}
    */
  var groupColorMapping: js.UndefOr[js.Array[GroupColorMapping]] = js.undefined
  /** Specifies the selection mode of the treemap. Accepted selection mode values are Default and Multiple.
    * @Default {default}
    */
  var groupSelectionMode: js.UndefOr[
    typingsJapgolly.ejWebAll.ej.datavisualization.TreeMap.groupSelectionMode | String
  ] = js.undefined
  /** Specifies the header for parent item during drilldown. This is applicable only for hierarchical data source.
    * @Default {null}
    */
  var header: js.UndefOr[String] = js.undefined
  /** Triggers before rendering the treemap drilldown header template
    */
  var headerTemplateRendering: js.UndefOr[js.Function1[/* e */ HeaderTemplateRenderingEventArgs, Unit]] = js.undefined
  /** Specifies the highlight border brush of treemap
    * @Default {gray}
    */
  var highlightBorderBrush: js.UndefOr[String] = js.undefined
  /** Specifies the border thickness when treemap items is highlighted in the treemap
    * @Default {5}
    */
  var highlightBorderThickness: js.UndefOr[Double] = js.undefined
  /** Specifies the highlight border brush of treemap
    * @Default {gray}
    */
  var highlightGroupBorderBrush: js.UndefOr[String] = js.undefined
  /** Specifies the border thickness when treemap items is highlighted in the treemap
    * @Default {5}
    */
  var highlightGroupBorderThickness: js.UndefOr[Double] = js.undefined
  /** Specifies whether treemap item need to highlighted on selection
    * @Default {false}
    */
  var highlightGroupOnSelection: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether treemap item need to highlighted on selection
    * @Default {false}
    */
  var highlightOnSelection: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether datasource is hierarchical or not.
    * @Default {false}
    */
  var isHierarchicalDatasource: js.UndefOr[Boolean] = js.undefined
  /** Controls whether Treemap has to be responsive while resizing the window.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Triggers while rendering each treemap items.
    */
  var itemRendering: js.UndefOr[js.Function1[/* e */ ItemRenderingEventArgs, Unit]] = js.undefined
  /** Specifies the items layout mode of the treemap. Accepted itemsLayoutMode values are Squarified, SliceAndDiceHorizontal, SliceAndDiceVertical and SliceAndDiceAuto
    * @Default {Squarified}
    */
  var itemsLayoutMode: js.UndefOr[ItemsLayoutMode | String] = js.undefined
  /** Specifies the leaf settings of the treemap
    */
  var leafItemSettings: js.UndefOr[LeafItemSettings] = js.undefined
  /** Triggers while rendering each legend item
    */
  var legendItemRendering: js.UndefOr[js.Function1[/* e */ LegendItemRenderingEventArgs, Unit]] = js.undefined
  /** Specifies the legend settings of the treemap
    */
  var legendSettings: js.UndefOr[LegendSettings] = js.undefined
  /** Specify levels of treemap for grouped visualization of data
    * @Default {[]}
    */
  var levels: js.UndefOr[js.Array[Level]] = js.undefined
  /** Name of the culture based on which Tree Map should be localized.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Specifies the paletteColorMapping of the treemap
    */
  var paletteColorMapping: js.UndefOr[PaletteColorMapping] = js.undefined
  /** Specifies the rangeColorMapping settings of the treemap
    * @Default {[]}
    */
  var rangeColorMapping: js.UndefOr[js.Array[RangeColorMapping]] = js.undefined
  /** Triggers after refreshing the treemap items.
    */
  var refreshed: js.UndefOr[js.Function1[/* e */ RefreshedEventArgs, Unit]] = js.undefined
  /** Fires, on right clicking the tree map items.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.undefined
  /** Specifies the selection mode of treemap item. Accepted selection mode values are Default and Multiple.
    * @Default {default}
    */
  var selectionMode: js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.TreeMap.selectionMode | String] = js.undefined
  /** Specifies the legend visibility status of the treemap
    * @Default {false}
    */
  var showLegend: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether treemap showTooltip need to be visible
    */
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  /** Specifies the tooltip template of the treemap
    * @Default {null}
    */
  var tooltipTemplate: js.UndefOr[String] = js.undefined
  /** Triggers when the group selection is performed on treemap items.
    */
  var treeMapGroupSelected: js.UndefOr[js.Function1[/* e */ TreeMapGroupSelectedEventArgs, Unit]] = js.undefined
  /** Triggers on treemap item selected.
    */
  var treeMapItemSelected: js.UndefOr[js.Function1[/* e */ TreeMapItemSelectedEventArgs, Unit]] = js.undefined
  /** Hold the treeMapItems to be displayed in treemap
    * @Default {[]}
    */
  var treeMapItems: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the uniColorMapping settings of the treemap
    */
  var uniColorMapping: js.UndefOr[UniColorMapping] = js.undefined
  /** Specifies the weight value path of the treemap
    * @Default {null}
    */
  var weightValuePath: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    Click: /* e */ ClickEventArgs => Callback = null,
    borderBrush: String = null,
    borderThickness: Int | Double = null,
    colorPath: String = null,
    colorValuePath: String = null,
    dataSource: js.Any = null,
    desaturationColorMapping: DesaturationColorMapping = null,
    dockPosition: DockPosition | String = null,
    doubleClick: /* e */ DoubleClickEventArgs => Callback = null,
    draggingGroupOnSelection: js.UndefOr[Boolean] = js.undefined,
    draggingOnSelection: js.UndefOr[Boolean] = js.undefined,
    drillDownHeaderColor: String = null,
    drillDownItemSelected: /* e */ DrillDownItemSelectedEventArgs => Callback = null,
    drillDownLevel: Int | Double = null,
    drillDownSelectionColor: String = null,
    drillDownValue: String = null,
    drillStarted: /* e */ DrillStartedEventArgs => Callback = null,
    enableDrillDown: js.UndefOr[Boolean] = js.undefined,
    enableGradient: js.UndefOr[Boolean] = js.undefined,
    enableGroupSeparator: js.UndefOr[Boolean] = js.undefined,
    enableResize: js.UndefOr[Boolean] = js.undefined,
    groupColorMapping: js.Array[GroupColorMapping] = null,
    groupSelectionMode: groupSelectionMode | String = null,
    header: String = null,
    headerTemplateRendering: /* e */ HeaderTemplateRenderingEventArgs => Callback = null,
    highlightBorderBrush: String = null,
    highlightBorderThickness: Int | Double = null,
    highlightGroupBorderBrush: String = null,
    highlightGroupBorderThickness: Int | Double = null,
    highlightGroupOnSelection: js.UndefOr[Boolean] = js.undefined,
    highlightOnSelection: js.UndefOr[Boolean] = js.undefined,
    isHierarchicalDatasource: js.UndefOr[Boolean] = js.undefined,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    itemRendering: /* e */ ItemRenderingEventArgs => Callback = null,
    itemsLayoutMode: ItemsLayoutMode | String = null,
    leafItemSettings: LeafItemSettings = null,
    legendItemRendering: /* e */ LegendItemRenderingEventArgs => Callback = null,
    legendSettings: LegendSettings = null,
    levels: js.Array[Level] = null,
    locale: String = null,
    paletteColorMapping: PaletteColorMapping = null,
    rangeColorMapping: js.Array[RangeColorMapping] = null,
    refreshed: /* e */ RefreshedEventArgs => Callback = null,
    rightClick: /* e */ RightClickEventArgs => Callback = null,
    selectionMode: selectionMode | String = null,
    showLegend: js.UndefOr[Boolean] = js.undefined,
    showTooltip: js.UndefOr[Boolean] = js.undefined,
    tooltipTemplate: String = null,
    treeMapGroupSelected: /* e */ TreeMapGroupSelectedEventArgs => Callback = null,
    treeMapItemSelected: /* e */ TreeMapItemSelectedEventArgs => Callback = null,
    treeMapItems: js.Array[_] = null,
    uniColorMapping: UniColorMapping = null,
    weightValuePath: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (Click != null) __obj.updateDynamic("Click")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.TreeMap.ClickEventArgs) => Click(t0).runNow()))
    if (borderBrush != null) __obj.updateDynamic("borderBrush")(borderBrush.asInstanceOf[js.Any])
    if (borderThickness != null) __obj.updateDynamic("borderThickness")(borderThickness.asInstanceOf[js.Any])
    if (colorPath != null) __obj.updateDynamic("colorPath")(colorPath.asInstanceOf[js.Any])
    if (colorValuePath != null) __obj.updateDynamic("colorValuePath")(colorValuePath.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (desaturationColorMapping != null) __obj.updateDynamic("desaturationColorMapping")(desaturationColorMapping.asInstanceOf[js.Any])
    if (dockPosition != null) __obj.updateDynamic("dockPosition")(dockPosition.asInstanceOf[js.Any])
    if (doubleClick != null) __obj.updateDynamic("doubleClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.TreeMap.DoubleClickEventArgs) => doubleClick(t0).runNow()))
    if (!js.isUndefined(draggingGroupOnSelection)) __obj.updateDynamic("draggingGroupOnSelection")(draggingGroupOnSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(draggingOnSelection)) __obj.updateDynamic("draggingOnSelection")(draggingOnSelection.asInstanceOf[js.Any])
    if (drillDownHeaderColor != null) __obj.updateDynamic("drillDownHeaderColor")(drillDownHeaderColor.asInstanceOf[js.Any])
    if (drillDownItemSelected != null) __obj.updateDynamic("drillDownItemSelected")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.TreeMap.DrillDownItemSelectedEventArgs) => drillDownItemSelected(t0).runNow()))
    if (drillDownLevel != null) __obj.updateDynamic("drillDownLevel")(drillDownLevel.asInstanceOf[js.Any])
    if (drillDownSelectionColor != null) __obj.updateDynamic("drillDownSelectionColor")(drillDownSelectionColor.asInstanceOf[js.Any])
    if (drillDownValue != null) __obj.updateDynamic("drillDownValue")(drillDownValue.asInstanceOf[js.Any])
    if (drillStarted != null) __obj.updateDynamic("drillStarted")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.TreeMap.DrillStartedEventArgs) => drillStarted(t0).runNow()))
    if (!js.isUndefined(enableDrillDown)) __obj.updateDynamic("enableDrillDown")(enableDrillDown.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGradient)) __obj.updateDynamic("enableGradient")(enableGradient.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGroupSeparator)) __obj.updateDynamic("enableGroupSeparator")(enableGroupSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(enableResize)) __obj.updateDynamic("enableResize")(enableResize.asInstanceOf[js.Any])
    if (groupColorMapping != null) __obj.updateDynamic("groupColorMapping")(groupColorMapping.asInstanceOf[js.Any])
    if (groupSelectionMode != null) __obj.updateDynamic("groupSelectionMode")(groupSelectionMode.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerTemplateRendering != null) __obj.updateDynamic("headerTemplateRendering")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.TreeMap.HeaderTemplateRenderingEventArgs) => headerTemplateRendering(t0).runNow()))
    if (highlightBorderBrush != null) __obj.updateDynamic("highlightBorderBrush")(highlightBorderBrush.asInstanceOf[js.Any])
    if (highlightBorderThickness != null) __obj.updateDynamic("highlightBorderThickness")(highlightBorderThickness.asInstanceOf[js.Any])
    if (highlightGroupBorderBrush != null) __obj.updateDynamic("highlightGroupBorderBrush")(highlightGroupBorderBrush.asInstanceOf[js.Any])
    if (highlightGroupBorderThickness != null) __obj.updateDynamic("highlightGroupBorderThickness")(highlightGroupBorderThickness.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightGroupOnSelection)) __obj.updateDynamic("highlightGroupOnSelection")(highlightGroupOnSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightOnSelection)) __obj.updateDynamic("highlightOnSelection")(highlightOnSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(isHierarchicalDatasource)) __obj.updateDynamic("isHierarchicalDatasource")(isHierarchicalDatasource.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (itemRendering != null) __obj.updateDynamic("itemRendering")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.TreeMap.ItemRenderingEventArgs) => itemRendering(t0).runNow()))
    if (itemsLayoutMode != null) __obj.updateDynamic("itemsLayoutMode")(itemsLayoutMode.asInstanceOf[js.Any])
    if (leafItemSettings != null) __obj.updateDynamic("leafItemSettings")(leafItemSettings.asInstanceOf[js.Any])
    if (legendItemRendering != null) __obj.updateDynamic("legendItemRendering")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.TreeMap.LegendItemRenderingEventArgs) => legendItemRendering(t0).runNow()))
    if (legendSettings != null) __obj.updateDynamic("legendSettings")(legendSettings.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (paletteColorMapping != null) __obj.updateDynamic("paletteColorMapping")(paletteColorMapping.asInstanceOf[js.Any])
    if (rangeColorMapping != null) __obj.updateDynamic("rangeColorMapping")(rangeColorMapping.asInstanceOf[js.Any])
    if (refreshed != null) __obj.updateDynamic("refreshed")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.TreeMap.RefreshedEventArgs) => refreshed(t0).runNow()))
    if (rightClick != null) __obj.updateDynamic("rightClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.TreeMap.RightClickEventArgs) => rightClick(t0).runNow()))
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(showLegend)) __obj.updateDynamic("showLegend")(showLegend.asInstanceOf[js.Any])
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip.asInstanceOf[js.Any])
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate.asInstanceOf[js.Any])
    if (treeMapGroupSelected != null) __obj.updateDynamic("treeMapGroupSelected")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.TreeMap.TreeMapGroupSelectedEventArgs) => treeMapGroupSelected(t0).runNow()))
    if (treeMapItemSelected != null) __obj.updateDynamic("treeMapItemSelected")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.TreeMap.TreeMapItemSelectedEventArgs) => treeMapItemSelected(t0).runNow()))
    if (treeMapItems != null) __obj.updateDynamic("treeMapItems")(treeMapItems.asInstanceOf[js.Any])
    if (uniColorMapping != null) __obj.updateDynamic("uniColorMapping")(uniColorMapping.asInstanceOf[js.Any])
    if (weightValuePath != null) __obj.updateDynamic("weightValuePath")(weightValuePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}


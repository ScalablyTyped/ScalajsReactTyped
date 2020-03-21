package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonCancelComponentData
import typingsJapgolly.devextreme.AnonColorMode
import typingsJapgolly.devextreme.AnonComponentDxSankey
import typingsJapgolly.devextreme.AnonComponentElementEventModel
import typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonEventModelTarget
import typingsJapgolly.devextreme.AnonFormatModel
import typingsJapgolly.devextreme.AnonHorizontalOffset
import typingsJapgolly.devextreme.AnonKeepLabels
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.AnonPadding
import typingsJapgolly.devextreme.AnonTargetAny
import typingsJapgolly.devextreme.AnonTargetDxSankeyNode
import typingsJapgolly.devextreme.devextremeStrings.Bright
import typingsJapgolly.devextreme.devextremeStrings.Carmine
import typingsJapgolly.devextreme.devextremeStrings.Default
import typingsJapgolly.devextreme.devextremeStrings.Material
import typingsJapgolly.devextreme.devextremeStrings.Ocean
import typingsJapgolly.devextreme.devextremeStrings.Office
import typingsJapgolly.devextreme.devextremeStrings.Pastel
import typingsJapgolly.devextreme.devextremeStrings.Soft
import typingsJapgolly.devextreme.devextremeStrings.Vintage
import typingsJapgolly.devextreme.devextremeStrings.Violet
import typingsJapgolly.devextreme.devextremeStrings.`Dark Moon`
import typingsJapgolly.devextreme.devextremeStrings.`Dark Violet`
import typingsJapgolly.devextreme.devextremeStrings.`Green Mist`
import typingsJapgolly.devextreme.devextremeStrings.`Harmony Light`
import typingsJapgolly.devextreme.devextremeStrings.`Soft Blue`
import typingsJapgolly.devextreme.devextremeStrings.`Soft Pastel`
import typingsJapgolly.devextreme.devextremeStrings.alternate
import typingsJapgolly.devextreme.devextremeStrings.blend
import typingsJapgolly.devextreme.devextremeStrings.bottom
import typingsJapgolly.devextreme.devextremeStrings.center
import typingsJapgolly.devextreme.devextremeStrings.extrapolate
import typingsJapgolly.devextreme.devextremeStrings.genericDotcarmine
import typingsJapgolly.devextreme.devextremeStrings.genericDotcontrast
import typingsJapgolly.devextreme.devextremeStrings.genericDotdark
import typingsJapgolly.devextreme.devextremeStrings.genericDotdarkmoon
import typingsJapgolly.devextreme.devextremeStrings.genericDotdarkviolet
import typingsJapgolly.devextreme.devextremeStrings.genericDotgreenmist
import typingsJapgolly.devextreme.devextremeStrings.genericDotlight
import typingsJapgolly.devextreme.devextremeStrings.genericDotsoftblue
import typingsJapgolly.devextreme.devextremeStrings.ios7Dotdefault
import typingsJapgolly.devextreme.devextremeStrings.materialDotblueDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDotlimeDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDotorangeDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDotpurpleDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDottealDotlight
import typingsJapgolly.devextreme.devextremeStrings.top
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSankeyOptions extends BaseWidgetOptions[dxSankey] {
  /** Specifies adaptive layout options. */
  var adaptiveLayout: js.UndefOr[AnonKeepLabels] = js.undefined
  /** Aligns node columns vertically. */
  var alignment: js.UndefOr[bottom | center | top | (js.Array[bottom | center | top])] = js.undefined
  /** Binds the widget to data. */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.undefined
  /** Specifies whether nodes and links change their style when they are hovered over or pressed. */
  var hoverEnabled: js.UndefOr[Boolean] = js.undefined
  /** Configures sankey nodes' labels. */
  var label: js.UndefOr[AnonHorizontalOffset] = js.undefined
  /** Configures sankey links' appearance. */
  var link: js.UndefOr[AnonColorMode] = js.undefined
  /** Configures sankey nodes' appearance. */
  var node: js.UndefOr[AnonPadding] = js.undefined
  /** A function that is executed when a sankey link is clicked or tapped. */
  var onLinkClick: js.UndefOr[(js.Function1[/* e */ AnonEventModelTarget, _]) | String] = js.undefined
  /** A function that is executed after the pointer enters or leaves a sankey link. */
  var onLinkHoverChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxSankey, _]] = js.undefined
  /** A function that is executed when a sankey node is clicked or tapped. */
  var onNodeClick: js.UndefOr[(js.Function1[/* e */ AnonComponentElementEventModel, _]) | String] = js.undefined
  /** A function that is executed after the pointer enters or leaves a sankey node. */
  var onNodeHoverChanged: js.UndefOr[js.Function1[/* e */ AnonTargetDxSankeyNode, _]] = js.undefined
  /** Sets the palette to be used to colorize sankey nodes. */
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.undefined
  /** Specifies how to extend the palette when it contains less colors than the number of sankey nodes. */
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.undefined
  /** Specifies nodes' sorting order in their columns. */
  var sortData: js.UndefOr[js.Any] = js.undefined
  /** Specifies which data source field provides links' source nodes. */
  var sourceField: js.UndefOr[String] = js.undefined
  /** Specifies which data source field provides links' target nodes. */
  var targetField: js.UndefOr[String] = js.undefined
  /** Configures tooltips - small pop-up rectangles that display information about a data-visualizing widget element being pressed or hovered over with the mouse pointer. */
  @JSName("tooltip")
  var tooltip_dxSankeyOptions: js.UndefOr[dxSankeyTooltip] = js.undefined
  /** Specifies which data source field provides links' weights. */
  var weightField: js.UndefOr[String] = js.undefined
}

object dxSankeyOptions {
  @scala.inline
  def apply(
    adaptiveLayout: AnonKeepLabels = null,
    alignment: bottom | center | top | (js.Array[bottom | center | top]) = null,
    bindingOptions: js.Any = null,
    dataSource: js.Array[_] | DataSource | DataSourceOptions | String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hoverEnabled: js.UndefOr[Boolean] = js.undefined,
    label: AnonHorizontalOffset = null,
    link: AnonColorMode = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    node: AnonPadding = null,
    onDisposing: /* e */ AnonModel[dxSankey] => CallbackTo[js.Any] = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[dxSankey] => CallbackTo[js.Any] = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[dxSankey] => CallbackTo[js.Any] = null,
    onExporting: /* e */ AnonFormatModel[dxSankey] => CallbackTo[js.Any] = null,
    onFileSaving: /* e */ AnonCancelComponentData[dxSankey] => CallbackTo[js.Any] = null,
    onIncidentOccurred: /* e */ AnonTargetAny[dxSankey] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxSankey] => CallbackTo[js.Any] = null,
    onLinkClick: (js.Function1[/* e */ AnonEventModelTarget, _]) | String = null,
    onLinkHoverChanged: /* e */ AnonComponentDxSankey => CallbackTo[js.Any] = null,
    onNodeClick: (js.Function1[/* e */ AnonComponentElementEventModel, _]) | String = null,
    onNodeHoverChanged: /* e */ AnonTargetDxSankeyNode => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxSankey] => CallbackTo[js.Any] = null,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    paletteExtensionMode: alternate | blend | extrapolate = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    size: BaseWidgetSize = null,
    sortData: js.Any = null,
    sourceField: String = null,
    targetField: String = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: dxSankeyTooltip = null,
    weightField: String = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxSankeyOptions = {
    val __obj = js.Dynamic.literal()
    if (adaptiveLayout != null) __obj.updateDynamic("adaptiveLayout")(adaptiveLayout.asInstanceOf[js.Any])
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverEnabled)) __obj.updateDynamic("hoverEnabled")(hoverEnabled.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.viz.dxSankey]) => onDisposing(t0).runNow()))
    if (onDrawn != null) __obj.updateDynamic("onDrawn")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxSankey]) => onDrawn(t0).runNow()))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxSankey]) => onExported(t0).runNow()))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonFormatModel[typingsJapgolly.devextreme.mod.DevExpress.viz.dxSankey]) => onExporting(t0).runNow()))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonCancelComponentData[typingsJapgolly.devextreme.mod.DevExpress.viz.dxSankey]) => onFileSaving(t0).runNow()))
    if (onIncidentOccurred != null) __obj.updateDynamic("onIncidentOccurred")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonTargetAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxSankey]) => onIncidentOccurred(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.viz.dxSankey]) => onInitialized(t0).runNow()))
    if (onLinkClick != null) __obj.updateDynamic("onLinkClick")(onLinkClick.asInstanceOf[js.Any])
    if (onLinkHoverChanged != null) __obj.updateDynamic("onLinkHoverChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentDxSankey) => onLinkHoverChanged(t0).runNow()))
    if (onNodeClick != null) __obj.updateDynamic("onNodeClick")(onNodeClick.asInstanceOf[js.Any])
    if (onNodeHoverChanged != null) __obj.updateDynamic("onNodeHoverChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonTargetDxSankeyNode) => onNodeHoverChanged(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.viz.dxSankey]) => onOptionChanged(t0).runNow()))
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (paletteExtensionMode != null) __obj.updateDynamic("paletteExtensionMode")(paletteExtensionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sortData != null) __obj.updateDynamic("sortData")(sortData.asInstanceOf[js.Any])
    if (sourceField != null) __obj.updateDynamic("sourceField")(sourceField.asInstanceOf[js.Any])
    if (targetField != null) __obj.updateDynamic("targetField")(targetField.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (weightField != null) __obj.updateDynamic("weightField")(weightField.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSankeyOptions]
  }
}


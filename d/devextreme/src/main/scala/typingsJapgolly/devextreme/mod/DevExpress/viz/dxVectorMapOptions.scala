package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonBorderColorColor
import typingsJapgolly.devextreme.AnonBorderWidth
import typingsJapgolly.devextreme.AnonCancelComponentData
import typingsJapgolly.devextreme.AnonCenter
import typingsJapgolly.devextreme.AnonComponentDxVectorMap
import typingsJapgolly.devextreme.AnonComponentElementEventJQueryEvent
import typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonFormatModel
import typingsJapgolly.devextreme.AnonMargin
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.AnonTargetAny
import typingsJapgolly.devextreme.AnonZoomFactor
import typingsJapgolly.devextreme.devextremeStrings.equirectangular
import typingsJapgolly.devextreme.devextremeStrings.genericDotcarmine
import typingsJapgolly.devextreme.devextremeStrings.genericDotcontrast
import typingsJapgolly.devextreme.devextremeStrings.genericDotdark
import typingsJapgolly.devextreme.devextremeStrings.genericDotdarkmoon
import typingsJapgolly.devextreme.devextremeStrings.genericDotdarkviolet
import typingsJapgolly.devextreme.devextremeStrings.genericDotgreenmist
import typingsJapgolly.devextreme.devextremeStrings.genericDotlight
import typingsJapgolly.devextreme.devextremeStrings.genericDotsoftblue
import typingsJapgolly.devextreme.devextremeStrings.ios7Dotdefault
import typingsJapgolly.devextreme.devextremeStrings.lambert
import typingsJapgolly.devextreme.devextremeStrings.materialDotblueDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDotlimeDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDotorangeDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDotpurpleDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDottealDotlight
import typingsJapgolly.devextreme.devextremeStrings.mercator
import typingsJapgolly.devextreme.devextremeStrings.miller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxVectorMapOptions extends BaseWidgetOptions[dxVectorMap] {
  /** Specifies the options for the map background. */
  var background: js.UndefOr[AnonBorderColorColor] = js.undefined
  /** Specifies the positioning of a map in geographical coordinates. */
  var bounds: js.UndefOr[js.Array[Double]] = js.undefined
  /** Specifies the geographical coordinates of the center for a map. */
  var center: js.UndefOr[js.Array[Double]] = js.undefined
  /** Configures the control bar. */
  var controlBar: js.UndefOr[AnonMargin] = js.undefined
  /** Specifies options for VectorMap widget layers. */
  var layers: js.UndefOr[js.Array[AnonBorderWidth] | AnonBorderWidth] = js.undefined
  /** Configures map legends. */
  var legends: js.UndefOr[js.Array[dxVectorMapLegends]] = js.undefined
  /** Specifies a map's maximum zoom factor. */
  var maxZoomFactor: js.UndefOr[Double] = js.undefined
  /** A function that is executed each time the center coordinates are changed. */
  var onCenterChanged: js.UndefOr[js.Function1[/* e */ AnonCenter, _]] = js.undefined
  /** A function that is executed when any location on the map is clicked or tapped. */
  var onClick: js.UndefOr[(js.Function1[/* e */ AnonComponentElementEventJQueryEvent, _]) | String] = js.undefined
  /** A function that is executed when a layer element is selected or selection is canceled. */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxVectorMap, _]] = js.undefined
  /** A function that is executed when a tooltip becomes hidden. */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ AnonComponentDxVectorMap, _]] = js.undefined
  /** A function that is executed when a tooltip appears. */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ AnonComponentDxVectorMap, _]] = js.undefined
  /** A function that is executed each time the zoom factor is changed. */
  var onZoomFactorChanged: js.UndefOr[js.Function1[/* e */ AnonZoomFactor, _]] = js.undefined
  /** Disables the panning capability. */
  var panningEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the map projection. */
  var projection: js.UndefOr[
    equirectangular | lambert | mercator | miller | VectorMapProjectionConfig | String | js.Any
  ] = js.undefined
  /** Configures tooltips. */
  @JSName("tooltip")
  var tooltip_dxVectorMapOptions: js.UndefOr[dxVectorMapTooltip] = js.undefined
  /** Specifies whether the map should respond to touch gestures. */
  var touchEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not the map should respond when a user rolls the mouse wheel. */
  var wheelEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies a number that is used to zoom a map initially. */
  var zoomFactor: js.UndefOr[Double] = js.undefined
  /** Disables the zooming capability. */
  var zoomingEnabled: js.UndefOr[Boolean] = js.undefined
}

object dxVectorMapOptions {
  @scala.inline
  def apply(
    background: AnonBorderColorColor = null,
    bindingOptions: js.Any = null,
    bounds: js.Array[Double] = null,
    center: js.Array[Double] = null,
    controlBar: AnonMargin = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    layers: js.Array[AnonBorderWidth] | AnonBorderWidth = null,
    legends: js.Array[dxVectorMapLegends] = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    maxZoomFactor: Int | Double = null,
    onCenterChanged: /* e */ AnonCenter => CallbackTo[js.Any] = null,
    onClick: (js.Function1[/* e */ AnonComponentElementEventJQueryEvent, _]) | String = null,
    onDisposing: /* e */ AnonModel[dxVectorMap] => CallbackTo[js.Any] = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[dxVectorMap] => CallbackTo[js.Any] = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[dxVectorMap] => CallbackTo[js.Any] = null,
    onExporting: /* e */ AnonFormatModel[dxVectorMap] => CallbackTo[js.Any] = null,
    onFileSaving: /* e */ AnonCancelComponentData[dxVectorMap] => CallbackTo[js.Any] = null,
    onIncidentOccurred: /* e */ AnonTargetAny[dxVectorMap] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxVectorMap] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxVectorMap] => CallbackTo[js.Any] = null,
    onSelectionChanged: /* e */ AnonComponentDxVectorMap => CallbackTo[js.Any] = null,
    onTooltipHidden: /* e */ AnonComponentDxVectorMap => CallbackTo[js.Any] = null,
    onTooltipShown: /* e */ AnonComponentDxVectorMap => CallbackTo[js.Any] = null,
    onZoomFactorChanged: /* e */ AnonZoomFactor => CallbackTo[js.Any] = null,
    panningEnabled: js.UndefOr[Boolean] = js.undefined,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    projection: equirectangular | lambert | mercator | miller | VectorMapProjectionConfig | String | js.Any = null,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    size: BaseWidgetSize = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: dxVectorMapTooltip = null,
    touchEnabled: js.UndefOr[Boolean] = js.undefined,
    wheelEnabled: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null,
    zoomFactor: Int | Double = null,
    zoomingEnabled: js.UndefOr[Boolean] = js.undefined
  ): dxVectorMapOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (controlBar != null) __obj.updateDynamic("controlBar")(controlBar.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxZoomFactor != null) __obj.updateDynamic("maxZoomFactor")(maxZoomFactor.asInstanceOf[js.Any])
    if (onCenterChanged != null) __obj.updateDynamic("onCenterChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonCenter) => onCenterChanged(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.viz.dxVectorMap]) => onDisposing(t0).runNow()))
    if (onDrawn != null) __obj.updateDynamic("onDrawn")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxVectorMap]) => onDrawn(t0).runNow()))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxVectorMap]) => onExported(t0).runNow()))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonFormatModel[typingsJapgolly.devextreme.mod.DevExpress.viz.dxVectorMap]) => onExporting(t0).runNow()))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonCancelComponentData[typingsJapgolly.devextreme.mod.DevExpress.viz.dxVectorMap]) => onFileSaving(t0).runNow()))
    if (onIncidentOccurred != null) __obj.updateDynamic("onIncidentOccurred")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonTargetAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxVectorMap]) => onIncidentOccurred(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.viz.dxVectorMap]) => onInitialized(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.viz.dxVectorMap]) => onOptionChanged(t0).runNow()))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentDxVectorMap) => onSelectionChanged(t0).runNow()))
    if (onTooltipHidden != null) __obj.updateDynamic("onTooltipHidden")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentDxVectorMap) => onTooltipHidden(t0).runNow()))
    if (onTooltipShown != null) __obj.updateDynamic("onTooltipShown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentDxVectorMap) => onTooltipShown(t0).runNow()))
    if (onZoomFactorChanged != null) __obj.updateDynamic("onZoomFactorChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonZoomFactor) => onZoomFactorChanged(t0).runNow()))
    if (!js.isUndefined(panningEnabled)) __obj.updateDynamic("panningEnabled")(panningEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(touchEnabled)) __obj.updateDynamic("touchEnabled")(touchEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(wheelEnabled)) __obj.updateDynamic("wheelEnabled")(wheelEnabled.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoomFactor != null) __obj.updateDynamic("zoomFactor")(zoomFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomingEnabled)) __obj.updateDynamic("zoomingEnabled")(zoomingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxVectorMapOptions]
  }
}


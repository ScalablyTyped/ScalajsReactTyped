package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonCancelComponentData
import typingsJapgolly.devextreme.AnonComponentElementModelTarget
import typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonFormatModel
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.AnonTargetAny
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseGaugeOptions[T] extends BaseWidgetOptions[T] {
  /** Specifies animation options. */
  var animation: js.UndefOr[BaseGaugeAnimation] = js.undefined
  /** Specifies the color of the parent page element. */
  var containerBackgroundColor: js.UndefOr[String] = js.undefined
  /** Configures the loading indicator. */
  @JSName("loadingIndicator")
  var loadingIndicator_BaseGaugeOptions: js.UndefOr[BaseGaugeLoadingIndicator] = js.undefined
  /** A function that is executed when a tooltip becomes hidden. */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ AnonComponentElementModelTarget[T], _]] = js.undefined
  /** A function that is executed when a tooltip appears. */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ AnonComponentElementModelTarget[T], _]] = js.undefined
  /** Specifies options of the gauge's range container. */
  var rangeContainer: js.UndefOr[BaseGaugeRangeContainer] = js.undefined
  /** Specifies options of the gauge's scale. */
  var scale: js.UndefOr[BaseGaugeScale] = js.undefined
  /** Specifies a set of subvalues to be designated by the subvalue indicators. */
  var subvalues: js.UndefOr[js.Array[Double]] = js.undefined
  /** Configures tooltips. */
  @JSName("tooltip")
  var tooltip_BaseGaugeOptions: js.UndefOr[BaseGaugeTooltip] = js.undefined
  /** Specifies the main value on a gauge. */
  var value: js.UndefOr[Double] = js.undefined
}

object BaseGaugeOptions {
  @scala.inline
  def apply[T](
    animation: BaseGaugeAnimation = null,
    bindingOptions: js.Any = null,
    containerBackgroundColor: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    loadingIndicator: BaseGaugeLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    onDisposing: /* e */ AnonModel[T] => CallbackTo[js.Any] = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[T] => CallbackTo[js.Any] = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[T] => CallbackTo[js.Any] = null,
    onExporting: /* e */ AnonFormatModel[T] => CallbackTo[js.Any] = null,
    onFileSaving: /* e */ AnonCancelComponentData[T] => CallbackTo[js.Any] = null,
    onIncidentOccurred: /* e */ AnonTargetAny[T] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[T] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[T] => CallbackTo[js.Any] = null,
    onTooltipHidden: /* e */ AnonComponentElementModelTarget[T] => CallbackTo[js.Any] = null,
    onTooltipShown: /* e */ AnonComponentElementModelTarget[T] => CallbackTo[js.Any] = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    rangeContainer: BaseGaugeRangeContainer = null,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scale: BaseGaugeScale = null,
    size: BaseWidgetSize = null,
    subvalues: js.Array[Double] = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: BaseGaugeTooltip = null,
    value: Int | Double = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): BaseGaugeOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[T]) => onDisposing(t0).runNow()))
    if (onDrawn != null) __obj.updateDynamic("onDrawn")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny[T]) => onDrawn(t0).runNow()))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny[T]) => onExported(t0).runNow()))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonFormatModel[T]) => onExporting(t0).runNow()))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonCancelComponentData[T]) => onFileSaving(t0).runNow()))
    if (onIncidentOccurred != null) __obj.updateDynamic("onIncidentOccurred")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonTargetAny[T]) => onIncidentOccurred(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[T]) => onInitialized(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[T]) => onOptionChanged(t0).runNow()))
    if (onTooltipHidden != null) __obj.updateDynamic("onTooltipHidden")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElementModelTarget[T]) => onTooltipHidden(t0).runNow()))
    if (onTooltipShown != null) __obj.updateDynamic("onTooltipShown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElementModelTarget[T]) => onTooltipShown(t0).runNow()))
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.asInstanceOf[js.Any])
    if (rangeContainer != null) __obj.updateDynamic("rangeContainer")(rangeContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (subvalues != null) __obj.updateDynamic("subvalues")(subvalues.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseGaugeOptions[T]]
  }
}


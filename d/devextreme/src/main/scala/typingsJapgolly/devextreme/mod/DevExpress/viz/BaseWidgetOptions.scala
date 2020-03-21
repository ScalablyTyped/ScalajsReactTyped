package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonCancelComponentData
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
import typingsJapgolly.devextreme.mod.DevExpress.DOMComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseWidgetOptions[T] extends DOMComponentOptions[T] {
  /** Specifies whether the widget responds to the user interaction. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Configures the exporting and printing features. */
  var export: js.UndefOr[BaseWidgetExport] = js.undefined
  /** Configures the loading indicator. */
  var loadingIndicator: js.UndefOr[BaseWidgetLoadingIndicator] = js.undefined
  /** Generates space around the widget. */
  var margin: js.UndefOr[BaseWidgetMargin] = js.undefined
  /** A function that is executed when the widget's rendering has finished. */
  var onDrawn: js.UndefOr[js.Function1[/* e */ AnonComponentTElementDxElementModelAny[T], _]] = js.undefined
  /** A function that is executed after the widget is exported. */
  var onExported: js.UndefOr[js.Function1[/* e */ AnonComponentTElementDxElementModelAny[T], _]] = js.undefined
  /** A function that is executed before the widget is exported. */
  var onExporting: js.UndefOr[js.Function1[/* e */ AnonFormatModel[T], _]] = js.undefined
  /** A function that is executed before a file with exported widget is saved to the user's local storage. */
  var onFileSaving: js.UndefOr[js.Function1[/* e */ AnonCancelComponentData[T], _]] = js.undefined
  /** A function that is executed when an error or warning occurs. */
  var onIncidentOccurred: js.UndefOr[js.Function1[/* e */ AnonTargetAny[T], _]] = js.undefined
  /** Notifies the widget that it is embedded into an HTML page that uses a tag modifying the path. */
  var pathModified: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to redraw the widget when the size of the parent browser window changes or a mobile device rotates. */
  var redrawOnResize: js.UndefOr[Boolean] = js.undefined
  /** Specifies the widget's size in pixels. */
  var size: js.UndefOr[BaseWidgetSize] = js.undefined
  /** Sets the name of the theme the widget uses. */
  var theme: js.UndefOr[
    genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight
  ] = js.undefined
  /** Configures the widget's title. */
  var title: js.UndefOr[BaseWidgetTitle | String] = js.undefined
  /** Configures tooltips - small pop-up rectangles that display information about a data-visualizing widget element being pressed or hovered over with the mouse pointer. */
  var tooltip: js.UndefOr[BaseWidgetTooltip] = js.undefined
}

object BaseWidgetOptions {
  @scala.inline
  def apply[T](
    bindingOptions: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    onDisposing: /* e */ AnonModel[T] => CallbackTo[js.Any] = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[T] => CallbackTo[js.Any] = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[T] => CallbackTo[js.Any] = null,
    onExporting: /* e */ AnonFormatModel[T] => CallbackTo[js.Any] = null,
    onFileSaving: /* e */ AnonCancelComponentData[T] => CallbackTo[js.Any] = null,
    onIncidentOccurred: /* e */ AnonTargetAny[T] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[T] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[T] => CallbackTo[js.Any] = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    size: BaseWidgetSize = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: BaseWidgetTooltip = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): BaseWidgetOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
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
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseWidgetOptions[T]]
  }
}


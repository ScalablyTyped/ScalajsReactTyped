package typingsJapgolly.calHeatmap.mod._Global_.CalHeatMap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeOptions extends InitOptions {
  /** Margin around each domain, in pixels. Ordered like in CSS (top, right, bottom, left) */
  @JSName("domainMargin")
  var domainMargin_RuntimeOptions: js.Array[Double]
  /** List of dates to highlight */
  @JSName("highlight")
  var highlight_RuntimeOptions: js.Array[js.Date]
  /**
  			 * Name of the items to represent in the calendar.
  			 * First index is singular form, and the second index, the plural form.
  			 */
  @JSName("itemName")
  var itemName_RuntimeOptions: js.Array[String]
  /** Margin around the legend, in pixels. Ordered like in CSS (top, right, bottom, left) */
  @JSName("legendMargin")
  var legendMargin_RuntimeOptions: js.Array[Double]
}

object RuntimeOptions {
  @scala.inline
  def apply(
    domainMargin: js.Array[Double],
    highlight: js.Array[js.Date],
    itemName: js.Array[String],
    legendMargin: js.Array[Double],
    afterLoad: js.UndefOr[Callback] = js.undefined,
    afterLoadData: /* data */ js.Any => CallbackTo[DataFormat] = null,
    afterLoadNextDomain: /* date */ js.Date => Callback = null,
    afterLoadPreviousDomain: /* date */ js.Date => Callback = null,
    animationDuration: Int | Double = null,
    cellPadding: Int | Double = null,
    cellRadius: Int | Double = null,
    cellSize: Int | Double = null,
    colLimit: Int | Double = null,
    considerMissingDataAsZero: js.UndefOr[Boolean] = js.undefined,
    data: String | js.Object = null,
    dataType: String = null,
    displayLegend: js.UndefOr[Boolean] = js.undefined,
    domain: String = null,
    domainDynamicDimension: js.UndefOr[Boolean] = js.undefined,
    domainGutter: Int | Double = null,
    domainLabelFormat: String | js.Function = null,
    itemNamespace: String = null,
    itemSelector: String | HTMLElement | Element | EventTarget = null,
    label: Label = null,
    legend: js.Array[Double] = null,
    legendCellPadding: Int | Double = null,
    legendCellSize: Int | Double = null,
    legendColors: LegendColor | js.Array[String] = null,
    legendHorizontalPosition: String = null,
    legendOrientation: String = null,
    legendTitleFormat: LegendTitleTemplates = null,
    legendVerticalPosition: String = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    nextSelector: String | HTMLElement = null,
    onClick: (/* date */ js.Date, /* value */ Double) => Callback = null,
    onComplete: js.UndefOr[Callback] = js.undefined,
    onMaxDomainReached: /* reached */ Boolean => Callback = null,
    onMinDomainReached: /* reached */ Boolean => Callback = null,
    previousSelector: String | HTMLElement = null,
    range: Int | Double = null,
    rowLimit: Int | Double = null,
    start: js.Date = null,
    subDomain: String = null,
    subDomainDateFormat: String | js.Function = null,
    subDomainTextFormat: String | js.Function = null,
    subDomainTitleFormat: SubDomainFormatTemplates = null,
    tooltip: js.UndefOr[Boolean] = js.undefined,
    verticalOrientation: js.UndefOr[Boolean] = js.undefined,
    weekStartOnMonday: js.UndefOr[Boolean] = js.undefined
  ): RuntimeOptions = {
    val __obj = js.Dynamic.literal(domainMargin = domainMargin.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], legendMargin = legendMargin.asInstanceOf[js.Any])
    afterLoad.foreach(p => __obj.updateDynamic("afterLoad")(p.toJsFn))
    if (afterLoadData != null) __obj.updateDynamic("afterLoadData")(js.Any.fromFunction1((t0: /* data */ js.Any) => afterLoadData(t0).runNow()))
    if (afterLoadNextDomain != null) __obj.updateDynamic("afterLoadNextDomain")(js.Any.fromFunction1((t0: /* date */ js.Date) => afterLoadNextDomain(t0).runNow()))
    if (afterLoadPreviousDomain != null) __obj.updateDynamic("afterLoadPreviousDomain")(js.Any.fromFunction1((t0: /* date */ js.Date) => afterLoadPreviousDomain(t0).runNow()))
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding.asInstanceOf[js.Any])
    if (cellRadius != null) __obj.updateDynamic("cellRadius")(cellRadius.asInstanceOf[js.Any])
    if (cellSize != null) __obj.updateDynamic("cellSize")(cellSize.asInstanceOf[js.Any])
    if (colLimit != null) __obj.updateDynamic("colLimit")(colLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(considerMissingDataAsZero)) __obj.updateDynamic("considerMissingDataAsZero")(considerMissingDataAsZero.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (!js.isUndefined(displayLegend)) __obj.updateDynamic("displayLegend")(displayLegend.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(domainDynamicDimension)) __obj.updateDynamic("domainDynamicDimension")(domainDynamicDimension.asInstanceOf[js.Any])
    if (domainGutter != null) __obj.updateDynamic("domainGutter")(domainGutter.asInstanceOf[js.Any])
    if (domainLabelFormat != null) __obj.updateDynamic("domainLabelFormat")(domainLabelFormat.asInstanceOf[js.Any])
    if (itemNamespace != null) __obj.updateDynamic("itemNamespace")(itemNamespace.asInstanceOf[js.Any])
    if (itemSelector != null) __obj.updateDynamic("itemSelector")(itemSelector.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (legendCellPadding != null) __obj.updateDynamic("legendCellPadding")(legendCellPadding.asInstanceOf[js.Any])
    if (legendCellSize != null) __obj.updateDynamic("legendCellSize")(legendCellSize.asInstanceOf[js.Any])
    if (legendColors != null) __obj.updateDynamic("legendColors")(legendColors.asInstanceOf[js.Any])
    if (legendHorizontalPosition != null) __obj.updateDynamic("legendHorizontalPosition")(legendHorizontalPosition.asInstanceOf[js.Any])
    if (legendOrientation != null) __obj.updateDynamic("legendOrientation")(legendOrientation.asInstanceOf[js.Any])
    if (legendTitleFormat != null) __obj.updateDynamic("legendTitleFormat")(legendTitleFormat.asInstanceOf[js.Any])
    if (legendVerticalPosition != null) __obj.updateDynamic("legendVerticalPosition")(legendVerticalPosition.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (nextSelector != null) __obj.updateDynamic("nextSelector")(nextSelector.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* date */ js.Date, t1: /* value */ scala.Double) => onClick(t0, t1).runNow()))
    onComplete.foreach(p => __obj.updateDynamic("onComplete")(p.toJsFn))
    if (onMaxDomainReached != null) __obj.updateDynamic("onMaxDomainReached")(js.Any.fromFunction1((t0: /* reached */ scala.Boolean) => onMaxDomainReached(t0).runNow()))
    if (onMinDomainReached != null) __obj.updateDynamic("onMinDomainReached")(js.Any.fromFunction1((t0: /* reached */ scala.Boolean) => onMinDomainReached(t0).runNow()))
    if (previousSelector != null) __obj.updateDynamic("previousSelector")(previousSelector.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (rowLimit != null) __obj.updateDynamic("rowLimit")(rowLimit.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (subDomain != null) __obj.updateDynamic("subDomain")(subDomain.asInstanceOf[js.Any])
    if (subDomainDateFormat != null) __obj.updateDynamic("subDomainDateFormat")(subDomainDateFormat.asInstanceOf[js.Any])
    if (subDomainTextFormat != null) __obj.updateDynamic("subDomainTextFormat")(subDomainTextFormat.asInstanceOf[js.Any])
    if (subDomainTitleFormat != null) __obj.updateDynamic("subDomainTitleFormat")(subDomainTitleFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalOrientation)) __obj.updateDynamic("verticalOrientation")(verticalOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(weekStartOnMonday)) __obj.updateDynamic("weekStartOnMonday")(weekStartOnMonday.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeOptions]
  }
}


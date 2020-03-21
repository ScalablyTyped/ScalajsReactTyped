package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AboveAverage
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodApril
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodAugust
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodDecember
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodFebruray
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodJanuary
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodJuly
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodJune
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodMarch
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodMay
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodNovember
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodOctober
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodQuarter1
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodQuarter2
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodQuarter3
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodQuarter4
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodSeptember
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.And
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.BelowAverage
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.BottomItems
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.BottomPercent
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.CellColor
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Custom
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dynamic
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FontColor
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LastMonth
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LastQuarter
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LastWeek
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LastYear
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NextMonth
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NextQuarter
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NextWeek
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NextYear
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Or
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThisMonth
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThisQuarter
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThisWeek
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThisYear
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Today
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Tomorrow
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.TopItems
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.TopPercent
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Unknown_
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Values
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.YearToDate
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Yesterday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the filtering criteria applied to a column.
  *
  * [Api set: ExcelApi 1.2]
  */
trait FilterCriteria extends js.Object {
  /**
    *
    * The HTML color string used to filter cells. Used with "cellColor" and "fontColor" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * The first criterion used to filter data. Used as an operator in the case of "custom" filtering.
    For example ">50" for number greater than 50 or "=*s" for values ending in "s".
    
    Used as a number in the case of top/bottom items/percents. E.g. "5" for the top 5 items if filterOn is set to "topItems"
    *
    * [Api set: ExcelApi 1.2]
    */
  var criterion1: js.UndefOr[String] = js.undefined
  /**
    *
    * The second criterion used to filter data. Only used as an operator in the case of "custom" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var criterion2: js.UndefOr[String] = js.undefined
  /**
    *
    * The dynamic criteria from the Excel.DynamicFilterCriteria set to apply on this column. Used with "dynamic" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var dynamicCriteria: js.UndefOr[
    DynamicFilterCriteria | Unknown_ | AboveAverage | AllDatesInPeriodApril | AllDatesInPeriodAugust | AllDatesInPeriodDecember | AllDatesInPeriodFebruray | AllDatesInPeriodJanuary | AllDatesInPeriodJuly | AllDatesInPeriodJune | AllDatesInPeriodMarch | AllDatesInPeriodMay | AllDatesInPeriodNovember | AllDatesInPeriodOctober | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodSeptember | BelowAverage | LastMonth | LastQuarter | LastWeek | LastYear | NextMonth | NextQuarter | NextWeek | NextYear | ThisMonth | ThisQuarter | ThisWeek | ThisYear | Today | Tomorrow | YearToDate | Yesterday
  ] = js.undefined
  /**
    *
    * The property used by the filter to determine whether the values should stay visible.
    *
    * [Api set: ExcelApi 1.2]
    */
  var filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Icon | Custom
  /**
    *
    * The icon used to filter cells. Used with "icon" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var icon: js.UndefOr[Icon] = js.undefined
  /**
    *
    * The operator used to combine criterion 1 and 2 when using "custom" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var operator: js.UndefOr[FilterOperator | And | Or] = js.undefined
  /**
    *
    * The property used by the filter to do rich filter on richvalues.
    *
    * [Api set: ExcelApi 1.9]
    */
  var subField: js.UndefOr[String] = js.undefined
  /**
    *
    * The set of values to be used as part of "values" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var values: js.UndefOr[js.Array[String | FilterDatetime]] = js.undefined
}

object FilterCriteria {
  @scala.inline
  def apply(
    filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Icon | Custom,
    color: String = null,
    criterion1: String = null,
    criterion2: String = null,
    dynamicCriteria: DynamicFilterCriteria | Unknown_ | AboveAverage | AllDatesInPeriodApril | AllDatesInPeriodAugust | AllDatesInPeriodDecember | AllDatesInPeriodFebruray | AllDatesInPeriodJanuary | AllDatesInPeriodJuly | AllDatesInPeriodJune | AllDatesInPeriodMarch | AllDatesInPeriodMay | AllDatesInPeriodNovember | AllDatesInPeriodOctober | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodSeptember | BelowAverage | LastMonth | LastQuarter | LastWeek | LastYear | NextMonth | NextQuarter | NextWeek | NextYear | ThisMonth | ThisQuarter | ThisWeek | ThisYear | Today | Tomorrow | YearToDate | Yesterday = null,
    icon: Icon = null,
    operator: FilterOperator | And | Or = null,
    subField: String = null,
    values: js.Array[String | FilterDatetime] = null
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal(filterOn = filterOn.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (criterion1 != null) __obj.updateDynamic("criterion1")(criterion1.asInstanceOf[js.Any])
    if (criterion2 != null) __obj.updateDynamic("criterion2")(criterion2.asInstanceOf[js.Any])
    if (dynamicCriteria != null) __obj.updateDynamic("dynamicCriteria")(dynamicCriteria.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (subField != null) __obj.updateDynamic("subField")(subField.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterCriteria]
  }
}


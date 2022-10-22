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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the filtering criteria applied to a column.
  *
  * @remarks
  * [Api set: ExcelApi 1.2]
  */
trait FilterCriteria extends StObject {
  
  /**
    * The HTML color string used to filter cells. Used with `cellColor` and `fontColor` filtering.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * The first criterion used to filter data. Used as an operator in the case of `custom` filtering.
    For example ">50" for numbers greater than 50, or "=*s" for values ending in "s".
    
    Used as a number in the case of top/bottom items/percents (e.g., "5" for the top 5 items if `filterOn` is set to `topItems`).
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var criterion1: js.UndefOr[String] = js.undefined
  
  /**
    * The second criterion used to filter data. Only used as an operator in the case of `custom` filtering.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var criterion2: js.UndefOr[String] = js.undefined
  
  /**
    * The dynamic criteria from the `Excel.DynamicFilterCriteria` set to apply on this column. Used with `dynamic` filtering.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var dynamicCriteria: js.UndefOr[
    DynamicFilterCriteria | Unknown_ | AboveAverage | AllDatesInPeriodApril | AllDatesInPeriodAugust | AllDatesInPeriodDecember | AllDatesInPeriodFebruray | AllDatesInPeriodJanuary | AllDatesInPeriodJuly | AllDatesInPeriodJune | AllDatesInPeriodMarch | AllDatesInPeriodMay | AllDatesInPeriodNovember | AllDatesInPeriodOctober | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodSeptember | BelowAverage | LastMonth | LastQuarter | LastWeek | LastYear | NextMonth | NextQuarter | NextWeek | NextYear | ThisMonth | ThisQuarter | ThisWeek | ThisYear | Today | Tomorrow | YearToDate | Yesterday
  ] = js.undefined
  
  /**
    * The property used by the filter to determine whether the values should stay visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Icon | Custom
  
  /**
    * The icon used to filter cells. Used with `icon` filtering.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var icon: js.UndefOr[Icon] = js.undefined
  
  /**
    * The operator used to combine criterion 1 and 2 when using `custom` filtering.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var operator: js.UndefOr[FilterOperator | And | Or] = js.undefined
  
  /**
    * The property used by the filter to do a rich filter on rich values.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var subField: js.UndefOr[String] = js.undefined
  
  /**
    * The set of values to be used as part of `values` filtering.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var values: js.UndefOr[js.Array[String | FilterDatetime]] = js.undefined
}
object FilterCriteria {
  
  inline def apply(
    filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Icon | Custom
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal(filterOn = filterOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterCriteria]
  }
  
  extension [Self <: FilterCriteria](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCriterion1(value: String): Self = StObject.set(x, "criterion1", value.asInstanceOf[js.Any])
    
    inline def setCriterion1Undefined: Self = StObject.set(x, "criterion1", js.undefined)
    
    inline def setCriterion2(value: String): Self = StObject.set(x, "criterion2", value.asInstanceOf[js.Any])
    
    inline def setCriterion2Undefined: Self = StObject.set(x, "criterion2", js.undefined)
    
    inline def setDynamicCriteria(
      value: DynamicFilterCriteria | Unknown_ | AboveAverage | AllDatesInPeriodApril | AllDatesInPeriodAugust | AllDatesInPeriodDecember | AllDatesInPeriodFebruray | AllDatesInPeriodJanuary | AllDatesInPeriodJuly | AllDatesInPeriodJune | AllDatesInPeriodMarch | AllDatesInPeriodMay | AllDatesInPeriodNovember | AllDatesInPeriodOctober | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodSeptember | BelowAverage | LastMonth | LastQuarter | LastWeek | LastYear | NextMonth | NextQuarter | NextWeek | NextYear | ThisMonth | ThisQuarter | ThisWeek | ThisYear | Today | Tomorrow | YearToDate | Yesterday
    ): Self = StObject.set(x, "dynamicCriteria", value.asInstanceOf[js.Any])
    
    inline def setDynamicCriteriaUndefined: Self = StObject.set(x, "dynamicCriteria", js.undefined)
    
    inline def setFilterOn(
      value: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Icon | Custom
    ): Self = StObject.set(x, "filterOn", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setOperator(value: FilterOperator | And | Or): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setSubField(value: String): Self = StObject.set(x, "subField", value.asInstanceOf[js.Any])
    
    inline def setSubFieldUndefined: Self = StObject.set(x, "subField", js.undefined)
    
    inline def setValues(value: js.Array[String | FilterDatetime]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: (String | FilterDatetime)*): Self = StObject.set(x, "values", js.Array(value*))
  }
}

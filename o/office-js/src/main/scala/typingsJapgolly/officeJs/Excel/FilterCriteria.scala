package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.officeJsStrings.AboveAverage
import typingsJapgolly.officeJs.officeJsStrings.AllDatesInPeriodApril
import typingsJapgolly.officeJs.officeJsStrings.AllDatesInPeriodAugust
import typingsJapgolly.officeJs.officeJsStrings.AllDatesInPeriodDecember
import typingsJapgolly.officeJs.officeJsStrings.AllDatesInPeriodFebruray
import typingsJapgolly.officeJs.officeJsStrings.AllDatesInPeriodJanuary
import typingsJapgolly.officeJs.officeJsStrings.AllDatesInPeriodJuly
import typingsJapgolly.officeJs.officeJsStrings.AllDatesInPeriodJune
import typingsJapgolly.officeJs.officeJsStrings.AllDatesInPeriodMarch
import typingsJapgolly.officeJs.officeJsStrings.AllDatesInPeriodMay
import typingsJapgolly.officeJs.officeJsStrings.AllDatesInPeriodNovember
import typingsJapgolly.officeJs.officeJsStrings.AllDatesInPeriodOctober
import typingsJapgolly.officeJs.officeJsStrings.AllDatesInPeriodQuarter1
import typingsJapgolly.officeJs.officeJsStrings.AllDatesInPeriodQuarter2
import typingsJapgolly.officeJs.officeJsStrings.AllDatesInPeriodQuarter3
import typingsJapgolly.officeJs.officeJsStrings.AllDatesInPeriodQuarter4
import typingsJapgolly.officeJs.officeJsStrings.AllDatesInPeriodSeptember
import typingsJapgolly.officeJs.officeJsStrings.And
import typingsJapgolly.officeJs.officeJsStrings.BelowAverage
import typingsJapgolly.officeJs.officeJsStrings.BottomItems
import typingsJapgolly.officeJs.officeJsStrings.BottomPercent
import typingsJapgolly.officeJs.officeJsStrings.CellColor
import typingsJapgolly.officeJs.officeJsStrings.Custom
import typingsJapgolly.officeJs.officeJsStrings.Dynamic
import typingsJapgolly.officeJs.officeJsStrings.FontColor
import typingsJapgolly.officeJs.officeJsStrings.LastMonth
import typingsJapgolly.officeJs.officeJsStrings.LastQuarter
import typingsJapgolly.officeJs.officeJsStrings.LastWeek
import typingsJapgolly.officeJs.officeJsStrings.LastYear
import typingsJapgolly.officeJs.officeJsStrings.NextMonth
import typingsJapgolly.officeJs.officeJsStrings.NextQuarter
import typingsJapgolly.officeJs.officeJsStrings.NextWeek
import typingsJapgolly.officeJs.officeJsStrings.NextYear
import typingsJapgolly.officeJs.officeJsStrings.Or
import typingsJapgolly.officeJs.officeJsStrings.ThisMonth
import typingsJapgolly.officeJs.officeJsStrings.ThisQuarter
import typingsJapgolly.officeJs.officeJsStrings.ThisWeek
import typingsJapgolly.officeJs.officeJsStrings.ThisYear
import typingsJapgolly.officeJs.officeJsStrings.Today
import typingsJapgolly.officeJs.officeJsStrings.Tomorrow
import typingsJapgolly.officeJs.officeJsStrings.TopItems
import typingsJapgolly.officeJs.officeJsStrings.TopPercent
import typingsJapgolly.officeJs.officeJsStrings.Unknown_
import typingsJapgolly.officeJs.officeJsStrings.Values
import typingsJapgolly.officeJs.officeJsStrings.YearToDate
import typingsJapgolly.officeJs.officeJsStrings.Yesterday
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
  var filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typingsJapgolly.officeJs.officeJsStrings.Icon | Custom
  
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
    filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typingsJapgolly.officeJs.officeJsStrings.Icon | Custom
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
      value: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typingsJapgolly.officeJs.officeJsStrings.Icon | Custom
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

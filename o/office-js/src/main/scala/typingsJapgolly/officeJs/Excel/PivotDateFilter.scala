package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.officeJsStrings.After
import typingsJapgolly.officeJs.officeJsStrings.AfterOrEqualTo
import typingsJapgolly.officeJs.officeJsStrings.AllDatesInPeriodApril
import typingsJapgolly.officeJs.officeJsStrings.AllDatesInPeriodAugust
import typingsJapgolly.officeJs.officeJsStrings.AllDatesInPeriodDecember
import typingsJapgolly.officeJs.officeJsStrings.AllDatesInPeriodFebruary
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
import typingsJapgolly.officeJs.officeJsStrings.Before
import typingsJapgolly.officeJs.officeJsStrings.BeforeOrEqualTo
import typingsJapgolly.officeJs.officeJsStrings.Between
import typingsJapgolly.officeJs.officeJsStrings.Equals
import typingsJapgolly.officeJs.officeJsStrings.LastMonth
import typingsJapgolly.officeJs.officeJsStrings.LastQuarter
import typingsJapgolly.officeJs.officeJsStrings.LastWeek
import typingsJapgolly.officeJs.officeJsStrings.LastYear
import typingsJapgolly.officeJs.officeJsStrings.NextMonth
import typingsJapgolly.officeJs.officeJsStrings.NextQuarter
import typingsJapgolly.officeJs.officeJsStrings.NextWeek
import typingsJapgolly.officeJs.officeJsStrings.NextYear
import typingsJapgolly.officeJs.officeJsStrings.ThisMonth
import typingsJapgolly.officeJs.officeJsStrings.ThisQuarter
import typingsJapgolly.officeJs.officeJsStrings.ThisWeek
import typingsJapgolly.officeJs.officeJsStrings.ThisYear
import typingsJapgolly.officeJs.officeJsStrings.Today
import typingsJapgolly.officeJs.officeJsStrings.Tomorrow
import typingsJapgolly.officeJs.officeJsStrings.Unknown_
import typingsJapgolly.officeJs.officeJsStrings.YearToDate
import typingsJapgolly.officeJs.officeJsStrings.Yesterday
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configurable template for a date filter to apply to a PivotField.
  The `condition` defines what criteria need to be set in order for the filter to operate.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
trait PivotDateFilter extends StObject {
  
  /**
    * The comparator is the static value to which other values are compared. The type of comparison is defined by the condition.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var comparator: js.UndefOr[FilterDatetime] = js.undefined
  
  /**
    * Specifies the condition for the filter, which defines the necessary filtering criteria.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var condition: DateFilterCondition | Unknown_ | Equals | Before | BeforeOrEqualTo | After | AfterOrEqualTo | Between | Tomorrow | Today | Yesterday | NextWeek | ThisWeek | LastWeek | NextMonth | ThisMonth | LastMonth | NextQuarter | ThisQuarter | LastQuarter | NextYear | ThisYear | LastYear | YearToDate | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodJanuary | AllDatesInPeriodFebruary | AllDatesInPeriodMarch | AllDatesInPeriodApril | AllDatesInPeriodMay | AllDatesInPeriodJune | AllDatesInPeriodJuly | AllDatesInPeriodAugust | AllDatesInPeriodSeptember | AllDatesInPeriodOctober | AllDatesInPeriodNovember | AllDatesInPeriodDecember
  
  /**
    * If `true`, filter *excludes* items that meet criteria. The default is `false` (filter to include items that meet criteria).
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var exclusive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The lower-bound of the range for the `between` filter condition.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var lowerBound: js.UndefOr[FilterDatetime] = js.undefined
  
  /**
    * The upper-bound of the range for the `between` filter condition.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var upperBound: js.UndefOr[FilterDatetime] = js.undefined
  
  /**
    * For `equals`, `before`, `after`, and `between` filter conditions, indicates if comparisons should be made as whole days.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var wholeDays: js.UndefOr[Boolean] = js.undefined
}
object PivotDateFilter {
  
  inline def apply(
    condition: DateFilterCondition | Unknown_ | Equals | Before | BeforeOrEqualTo | After | AfterOrEqualTo | Between | Tomorrow | Today | Yesterday | NextWeek | ThisWeek | LastWeek | NextMonth | ThisMonth | LastMonth | NextQuarter | ThisQuarter | LastQuarter | NextYear | ThisYear | LastYear | YearToDate | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodJanuary | AllDatesInPeriodFebruary | AllDatesInPeriodMarch | AllDatesInPeriodApril | AllDatesInPeriodMay | AllDatesInPeriodJune | AllDatesInPeriodJuly | AllDatesInPeriodAugust | AllDatesInPeriodSeptember | AllDatesInPeriodOctober | AllDatesInPeriodNovember | AllDatesInPeriodDecember
  ): PivotDateFilter = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotDateFilter]
  }
  
  extension [Self <: PivotDateFilter](x: Self) {
    
    inline def setComparator(value: FilterDatetime): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    inline def setCondition(
      value: DateFilterCondition | Unknown_ | Equals | Before | BeforeOrEqualTo | After | AfterOrEqualTo | Between | Tomorrow | Today | Yesterday | NextWeek | ThisWeek | LastWeek | NextMonth | ThisMonth | LastMonth | NextQuarter | ThisQuarter | LastQuarter | NextYear | ThisYear | LastYear | YearToDate | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodJanuary | AllDatesInPeriodFebruary | AllDatesInPeriodMarch | AllDatesInPeriodApril | AllDatesInPeriodMay | AllDatesInPeriodJune | AllDatesInPeriodJuly | AllDatesInPeriodAugust | AllDatesInPeriodSeptember | AllDatesInPeriodOctober | AllDatesInPeriodNovember | AllDatesInPeriodDecember
    ): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    inline def setLowerBound(value: FilterDatetime): Self = StObject.set(x, "lowerBound", value.asInstanceOf[js.Any])
    
    inline def setLowerBoundUndefined: Self = StObject.set(x, "lowerBound", js.undefined)
    
    inline def setUpperBound(value: FilterDatetime): Self = StObject.set(x, "upperBound", value.asInstanceOf[js.Any])
    
    inline def setUpperBoundUndefined: Self = StObject.set(x, "upperBound", js.undefined)
    
    inline def setWholeDays(value: Boolean): Self = StObject.set(x, "wholeDays", value.asInstanceOf[js.Any])
    
    inline def setWholeDaysUndefined: Self = StObject.set(x, "wholeDays", js.undefined)
  }
}

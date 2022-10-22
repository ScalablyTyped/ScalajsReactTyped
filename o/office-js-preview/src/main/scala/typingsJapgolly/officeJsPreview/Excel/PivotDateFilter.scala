package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.After
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AfterOrEqualTo
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodApril
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodAugust
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodDecember
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodFebruary
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
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Before
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.BeforeOrEqualTo
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Between
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Equals
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LastMonth
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LastQuarter
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LastWeek
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LastYear
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NextMonth
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NextQuarter
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NextWeek
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NextYear
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThisMonth
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThisQuarter
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThisWeek
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThisYear
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Today
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Tomorrow
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Unknown_
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.YearToDate
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Yesterday
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

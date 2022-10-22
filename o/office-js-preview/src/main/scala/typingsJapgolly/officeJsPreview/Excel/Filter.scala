package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.FilterData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.FilterLoadOptions
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.anon.Expand
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
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Unknown_
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.YearToDate
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Yesterday
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manages the filtering of a table's column.
  *
  * @remarks
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait Filter
  extends StObject
     with ClientObject {
  
  /**
    * Apply the given filter criteria on the given column.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    *
    * @param criteria The criteria to apply.
    */
  @JSName("apply")
  def apply(criteria: FilterCriteria): Unit = js.native
  
  /**
    * Apply a "Bottom Item" filter to the column for the given number of elements.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    *
    * @param count The number of elements from the bottom to show.
    */
  def applyBottomItemsFilter(count: Double): Unit = js.native
  
  /**
    * Apply a "Bottom Percent" filter to the column for the given percentage of elements.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    *
    * @param percent The percentage of elements from the bottom to show.
    */
  def applyBottomPercentFilter(percent: Double): Unit = js.native
  
  /**
    * Apply a "Cell Color" filter to the column for the given color.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    *
    * @param color The background color of the cells to show.
    */
  def applyCellColorFilter(color: String): Unit = js.native
  
  /**
    * Apply an "Icon" filter to the column for the given criteria strings.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    *
    * @param criteria1 The first criteria string.
    * @param criteria2 Optional. The second criteria string.
    * @param oper Optional. The operator that describes how the two criteria are joined.
    */
  def applyCustomFilter(criteria1: String): Unit = js.native
  def applyCustomFilter(criteria1: String, criteria2: String): Unit = js.native
  def applyCustomFilter(criteria1: String, criteria2: String, oper: And | Or): Unit = js.native
  def applyCustomFilter(criteria1: String, criteria2: String, oper: FilterOperator): Unit = js.native
  def applyCustomFilter(criteria1: String, criteria2: Unit, oper: And | Or): Unit = js.native
  def applyCustomFilter(criteria1: String, criteria2: Unit, oper: FilterOperator): Unit = js.native
  
  /**
    * Apply a "Dynamic" filter to the column.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    *
    * @param criteria The dynamic criteria to apply.
    */
  def applyDynamicFilter(
    criteria: Unknown_ | AboveAverage | AllDatesInPeriodApril | AllDatesInPeriodAugust | AllDatesInPeriodDecember | AllDatesInPeriodFebruray | AllDatesInPeriodJanuary | AllDatesInPeriodJuly | AllDatesInPeriodJune | AllDatesInPeriodMarch | AllDatesInPeriodMay | AllDatesInPeriodNovember | AllDatesInPeriodOctober | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodSeptember | BelowAverage | LastMonth | LastQuarter | LastWeek | LastYear | NextMonth | NextQuarter | NextWeek | NextYear | ThisMonth | ThisQuarter | ThisWeek | ThisYear | Today | Tomorrow | YearToDate | Yesterday
  ): Unit = js.native
  /**
    * Apply a "Dynamic" filter to the column.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    *
    * @param criteria The dynamic criteria to apply.
    */
  def applyDynamicFilter(criteria: DynamicFilterCriteria): Unit = js.native
  
  /**
    * Apply a "Font Color" filter to the column for the given color.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    *
    * @param color The font color of the cells to show.
    */
  def applyFontColorFilter(color: String): Unit = js.native
  
  /**
    * Apply an "Icon" filter to the column for the given icon.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    *
    * @param icon The icons of the cells to show.
    */
  def applyIconFilter(icon: Icon): Unit = js.native
  
  /**
    * Apply a "Top Item" filter to the column for the given number of elements.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    *
    * @param count The number of elements from the top to show.
    */
  def applyTopItemsFilter(count: Double): Unit = js.native
  
  /**
    * Apply a "Top Percent" filter to the column for the given percentage of elements.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    *
    * @param percent The percentage of elements from the top to show.
    */
  def applyTopPercentFilter(percent: Double): Unit = js.native
  
  /**
    * Apply a "Values" filter to the column for the given values.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    *
    * @param values The list of values to show. This must be an array of strings or an array of `Excel.FilterDateTime` objects.
    */
  def applyValuesFilter(values: js.Array[String | FilterDatetime]): Unit = js.native
  
  /**
    * Clear the filter on the given column.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  def clear(): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Filter: RequestContext = js.native
  
  /**
    * The currently applied filter on the given column.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  val criteria: FilterCriteria = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Filter = js.native
  def load(options: FilterLoadOptions): Filter = js.native
  def load(propertyNamesAndPaths: Expand): Filter = js.native
  def load(propertyNames: String): Filter = js.native
  def load(propertyNames: js.Array[String]): Filter = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Filter object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.FilterData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): FilterData = js.native
}

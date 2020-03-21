package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.AnonExpand
import typingsJapgolly.officeJs.Excel.Interfaces.FilterData
import typingsJapgolly.officeJs.Excel.Interfaces.FilterLoadOptions
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
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
import typingsJapgolly.officeJs.officeJsStrings.Unknown_
import typingsJapgolly.officeJs.officeJsStrings.YearToDate
import typingsJapgolly.officeJs.officeJsStrings.Yesterday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Manages the filtering of a table's column.
  *
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.Filter")
@js.native
class Filter () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Filter: RequestContext = js.native
  /**
    *
    * The currently applied filter on the given column. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  val criteria: FilterCriteria = js.native
  /**
    *
    * Apply the given filter criteria on the given column.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param criteria The criteria to apply.
    */
  @JSName("apply")
  def apply(criteria: FilterCriteria): Unit = js.native
  /**
    *
    * Apply a "Bottom Item" filter to the column for the given number of elements.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param count The number of elements from the bottom to show.
    */
  def applyBottomItemsFilter(count: Double): Unit = js.native
  /**
    *
    * Apply a "Bottom Percent" filter to the column for the given percentage of elements.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param percent The percentage of elements from the bottom to show.
    */
  def applyBottomPercentFilter(percent: Double): Unit = js.native
  /**
    *
    * Apply a "Cell Color" filter to the column for the given color.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param color The background color of the cells to show.
    */
  def applyCellColorFilter(color: String): Unit = js.native
  /**
    *
    * Apply an "Icon" filter to the column for the given criteria strings.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param criteria1 The first criteria string.
    * @param criteria2 Optional. The second criteria string.
    * @param oper Optional. The operator that describes how the two criteria are joined.
    */
  def applyCustomFilter(criteria1: String): Unit = js.native
  def applyCustomFilter(criteria1: String, criteria2: String): Unit = js.native
  def applyCustomFilter(criteria1: String, criteria2: String, oper: FilterOperator): Unit = js.native
  @JSName("applyCustomFilter")
  def applyCustomFilter_And(criteria1: String, criteria2: String, oper: And): Unit = js.native
  @JSName("applyCustomFilter")
  def applyCustomFilter_Or(criteria1: String, criteria2: String, oper: Or): Unit = js.native
  /**
    *
    * Apply a "Dynamic" filter to the column.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param criteria The dynamic criteria to apply.
    */
  def applyDynamicFilter(
    criteria: Unknown_ | AboveAverage | AllDatesInPeriodApril | AllDatesInPeriodAugust | AllDatesInPeriodDecember | AllDatesInPeriodFebruray | AllDatesInPeriodJanuary | AllDatesInPeriodJuly | AllDatesInPeriodJune | AllDatesInPeriodMarch | AllDatesInPeriodMay | AllDatesInPeriodNovember | AllDatesInPeriodOctober | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodSeptember | BelowAverage | LastMonth | LastQuarter | LastWeek | LastYear | NextMonth | NextQuarter | NextWeek | NextYear | ThisMonth | ThisQuarter | ThisWeek | ThisYear | Today | Tomorrow | YearToDate | Yesterday
  ): Unit = js.native
  /**
    *
    * Apply a "Dynamic" filter to the column.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param criteria The dynamic criteria to apply.
    */
  def applyDynamicFilter(criteria: DynamicFilterCriteria): Unit = js.native
  /**
    *
    * Apply a "Font Color" filter to the column for the given color.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param color The font color of the cells to show.
    */
  def applyFontColorFilter(color: String): Unit = js.native
  /**
    *
    * Apply an "Icon" filter to the column for the given icon.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param icon The icons of the cells to show.
    */
  def applyIconFilter(icon: Icon): Unit = js.native
  /**
    *
    * Apply a "Top Item" filter to the column for the given number of elements.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param count The number of elements from the top to show.
    */
  def applyTopItemsFilter(count: Double): Unit = js.native
  /**
    *
    * Apply a "Top Percent" filter to the column for the given percentage of elements.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param percent The percentage of elements from the top to show.
    */
  def applyTopPercentFilter(percent: Double): Unit = js.native
  /**
    *
    * Apply a "Values" filter to the column for the given values.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values The list of values to show. This must be an array of strings or an array of Excel.FilterDateTime objects.
    */
  def applyValuesFilter(values: js.Array[String | FilterDatetime]): Unit = js.native
  /**
    *
    * Clear the filter on the given column.
    *
    * [Api set: ExcelApi 1.2]
    */
  def clear(): Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Filter = js.native
  def load(options: FilterLoadOptions): Filter = js.native
  def load(propertyNamesAndPaths: AnonExpand): Filter = js.native
  def load(propertyNames: String): Filter = js.native
  def load(propertyNames: js.Array[String]): Filter = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Filter object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.FilterData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): FilterData = js.native
}


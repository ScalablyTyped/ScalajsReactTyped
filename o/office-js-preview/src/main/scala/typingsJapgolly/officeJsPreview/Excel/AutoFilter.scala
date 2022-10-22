package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.AutoFilterData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.AutoFilterLoadOptions
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the `AutoFilter` object.
  AutoFilter turns the values in Excel column into specific filters based on the cell contents.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait AutoFilter
  extends StObject
     with ClientObject {
  
  @JSName("apply")
  def apply(range: String): Unit = js.native
  @JSName("apply")
  def apply(range: String, columnIndex: Double): Unit = js.native
  @JSName("apply")
  def apply(range: String, columnIndex: Double, criteria: FilterCriteria): Unit = js.native
  @JSName("apply")
  def apply(range: String, columnIndex: Unit, criteria: FilterCriteria): Unit = js.native
  /**
    * Applies the AutoFilter to a range. This filters the column if column index and filter criteria are specified.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param range The range on which the AutoFilter will apply.
    * @param columnIndex The zero-based column index to which the AutoFilter is applied.
    * @param criteria The filter criteria.
    */
  @JSName("apply")
  def apply(range: Range): Unit = js.native
  @JSName("apply")
  def apply(range: Range, columnIndex: Double): Unit = js.native
  @JSName("apply")
  def apply(range: Range, columnIndex: Double, criteria: FilterCriteria): Unit = js.native
  @JSName("apply")
  def apply(range: Range, columnIndex: Unit, criteria: FilterCriteria): Unit = js.native
  
  /**
    * Clears the column filter criteria of the AutoFilter.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    *
    * @param columnIndex The zero-based column index, which represents which column filter needs to be cleared.
    If the index value is not supported (for example, if the value is a negative number, or if the value is greater than the number of available columns in the range),
    then an `InvalidArgument` error will be thrown.
    */
  def clearColumnCriteria(columnIndex: Double): Unit = js.native
  
  /**
    * Clears the filter criteria and sort state of the AutoFilter.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def clearCriteria(): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_AutoFilter: RequestContext = js.native
  
  /**
    * An array that holds all the filter criteria in the autofiltered range.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val criteria: js.Array[FilterCriteria] = js.native
  
  /**
    * Specifies if the AutoFilter is enabled.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val enabled: Boolean = js.native
  
  /**
    * Returns the `Range` object that represents the range to which the AutoFilter applies.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def getRange(): Range = js.native
  
  /**
    * Returns the `Range` object that represents the range to which the AutoFilter applies.
    If there is no `Range` object associated with the AutoFilter, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def getRangeOrNullObject(): Range = js.native
  
  /**
    * Specifies if the AutoFilter has filter criteria.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val isDataFiltered: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): AutoFilter = js.native
  def load(options: AutoFilterLoadOptions): AutoFilter = js.native
  def load(propertyNamesAndPaths: Expand): AutoFilter = js.native
  def load(propertyNames: String): AutoFilter = js.native
  def load(propertyNames: js.Array[String]): AutoFilter = js.native
  
  /**
    * Applies the specified AutoFilter object currently on the range.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def reapply(): Unit = js.native
  
  /**
    * Removes the AutoFilter for the range.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def remove(): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.AutoFilter object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.AutoFilterData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): AutoFilterData = js.native
}

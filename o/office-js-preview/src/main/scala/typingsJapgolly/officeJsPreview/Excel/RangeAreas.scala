package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.RangeAreasData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.RangeAreasLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.RangeAreasUpdateData
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJsPreview.anon.Expand
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.All
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Blanks
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ConditionalFormats
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Constants
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Contents
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DataValidations
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Errors
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ErrorsLogical
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ErrorsLogicalNumber
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ErrorsLogicalText
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ErrorsNumberText
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ErrorsNumbers
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ErrorsText
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Formats
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Formulas
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Hyperlinks
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Logical
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LogicalNumbers
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LogicalNumbersText
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LogicalText
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Numbers
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NumbersText
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.RemoveHyperlinks
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.SameConditionalFormat
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.SameDataValidation
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Text
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Values
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `RangeAreas` represents a collection of one or more rectangular ranges in the same worksheet.
  To learn how to use discontiguous ranges, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-multiple-ranges | Work with multiple ranges simultaneously in Excel add-ins}.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait RangeAreas
  extends StObject
     with ClientObject {
  
  /**
    * Returns the `RangeAreas` reference in A1-style. Address value will contain the worksheet name for each rectangular block of cells (e.g., "Sheet1!A1:B4, Sheet1!D1:D4").
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val address: String = js.native
  
  /**
    * Returns the `RangeAreas` reference in the user locale.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val addressLocal: String = js.native
  
  /**
    * Returns the number of rectangular ranges that comprise this `RangeAreas` object.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val areaCount: Double = js.native
  
  /**
    * Returns a collection of rectangular ranges that comprise this `RangeAreas` object.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val areas: RangeCollection = js.native
  
  /**
    * Calculates all cells in the `RangeAreas`.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def calculate(): Unit = js.native
  
  /**
    * Returns the number of cells in the `RangeAreas` object, summing up the cell counts of all of the individual rectangular ranges. Returns -1 if the cell count exceeds 2^31-1 (2,147,483,647).
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val cellCount: Double = js.native
  
  /**
    * Clears values, format, fill, border, and other properties on each of the areas that comprise this `RangeAreas` object.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param applyTo Optional. Determines the type of clear action. See `Excel.ClearApplyTo` for details. Default is "All".
    */
  def clear(): Unit = js.native
  def clear(applyTo: All | Formats | Contents | Hyperlinks | RemoveHyperlinks): Unit = js.native
  def clear(applyTo: ClearApplyTo): Unit = js.native
  
  /**
    * Returns a collection of conditional formats that intersect with any cells in this `RangeAreas` object.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val conditionalFormats: ConditionalFormatCollection = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeAreas: RequestContext = js.native
  
  /**
    * Converts all cells in the `RangeAreas` with data types into text.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def convertDataTypeToText(): Unit = js.native
  
  /**
    * Converts all cells in the `RangeAreas` into linked data types.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param serviceID The service ID which will be used to query the data.
    * @param languageCulture Language culture to query the service for.
    */
  def convertToLinkedDataType(serviceID: Double, languageCulture: String): Unit = js.native
  
  def copyFrom(sourceRange: String): Unit = js.native
  def copyFrom(sourceRange: String, copyType: All | Formulas | Values | Formats): Unit = js.native
  def copyFrom(sourceRange: String, copyType: All | Formulas | Values | Formats, skipBlanks: Boolean): Unit = js.native
  def copyFrom(
    sourceRange: String,
    copyType: All | Formulas | Values | Formats,
    skipBlanks: Boolean,
    transpose: Boolean
  ): Unit = js.native
  def copyFrom(
    sourceRange: String,
    copyType: All | Formulas | Values | Formats,
    skipBlanks: Unit,
    transpose: Boolean
  ): Unit = js.native
  def copyFrom(sourceRange: String, copyType: Unit, skipBlanks: Boolean): Unit = js.native
  def copyFrom(sourceRange: String, copyType: Unit, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  def copyFrom(sourceRange: String, copyType: Unit, skipBlanks: Unit, transpose: Boolean): Unit = js.native
  def copyFrom(sourceRange: String, copyType: RangeCopyType): Unit = js.native
  def copyFrom(sourceRange: String, copyType: RangeCopyType, skipBlanks: Boolean): Unit = js.native
  def copyFrom(sourceRange: String, copyType: RangeCopyType, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  def copyFrom(sourceRange: String, copyType: RangeCopyType, skipBlanks: Unit, transpose: Boolean): Unit = js.native
  /**
    * Copies cell data or formatting from the source range or `RangeAreas` to the current `RangeAreas`.
    The destination `RangeAreas` can be a different size than the source range or `RangeAreas`. The destination will be expanded automatically if it is smaller than the source.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param sourceRange The source range or `RangeAreas` to copy from. When the source `RangeAreas` has multiple ranges, their form must able to be created by removing full rows or columns from a rectangular range.
    * @param copyType The type of cell data or formatting to copy over. Default is "All".
    * @param skipBlanks True if to skip blank cells in the source range or `RangeAreas`. Default is false.
    * @param transpose True if to transpose the cells in the destination `RangeAreas`. Default is false.
    */
  def copyFrom(sourceRange: Range): Unit = js.native
  def copyFrom(sourceRange: RangeAreas): Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: All | Formulas | Values | Formats): Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: All | Formulas | Values | Formats, skipBlanks: Boolean): Unit = js.native
  def copyFrom(
    sourceRange: RangeAreas,
    copyType: All | Formulas | Values | Formats,
    skipBlanks: Boolean,
    transpose: Boolean
  ): Unit = js.native
  def copyFrom(
    sourceRange: RangeAreas,
    copyType: All | Formulas | Values | Formats,
    skipBlanks: Unit,
    transpose: Boolean
  ): Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: Unit, skipBlanks: Boolean): Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: Unit, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: Unit, skipBlanks: Unit, transpose: Boolean): Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: RangeCopyType): Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: RangeCopyType, skipBlanks: Boolean): Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: RangeCopyType, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: RangeCopyType, skipBlanks: Unit, transpose: Boolean): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: All | Formulas | Values | Formats): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: All | Formulas | Values | Formats, skipBlanks: Boolean): Unit = js.native
  def copyFrom(
    sourceRange: Range,
    copyType: All | Formulas | Values | Formats,
    skipBlanks: Boolean,
    transpose: Boolean
  ): Unit = js.native
  def copyFrom(
    sourceRange: Range,
    copyType: All | Formulas | Values | Formats,
    skipBlanks: Unit,
    transpose: Boolean
  ): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: Unit, skipBlanks: Boolean): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: Unit, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: Unit, skipBlanks: Unit, transpose: Boolean): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: RangeCopyType): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: RangeCopyType, skipBlanks: Boolean): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: RangeCopyType, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: RangeCopyType, skipBlanks: Unit, transpose: Boolean): Unit = js.native
  
  /**
    * Returns a data validation object for all ranges in the `RangeAreas`.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val dataValidation: DataValidation = js.native
  
  /**
    * Returns a `RangeFormat` object, encapsulating the font, fill, borders, alignment, and other properties for all ranges in the `RangeAreas` object.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val format: RangeFormat = js.native
  
  /**
    * Returns a `RangeAreas` object that represents the entire columns of the `RangeAreas` (for example, if the current `RangeAreas` represents cells "B4:E11, H2", it returns a `RangeAreas` that represents columns "B:E, H:H").
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def getEntireColumn(): RangeAreas = js.native
  
  /**
    * Returns a `RangeAreas` object that represents the entire rows of the `RangeAreas` (for example, if the current `RangeAreas` represents cells "B4:E11", it returns a `RangeAreas` that represents rows "4:11").
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def getEntireRow(): RangeAreas = js.native
  
  def getIntersection(anotherRange: String): RangeAreas = js.native
  /**
    * Returns the `RangeAreas` object that represents the intersection of the given ranges or `RangeAreas`. If no intersection is found, an `ItemNotFound` error will be thrown.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param anotherRange The range, `RangeAreas` object, or range address that will be used to determine the intersection.
    */
  def getIntersection(anotherRange: Range): RangeAreas = js.native
  def getIntersection(anotherRange: RangeAreas): RangeAreas = js.native
  
  def getIntersectionOrNullObject(anotherRange: String): RangeAreas = js.native
  /**
    * Returns the `RangeAreas` object that represents the intersection of the given ranges or `RangeAreas`. If no intersection is found, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param anotherRange The range, `RangeAreas` object, or address that will be used to determine the intersection.
    */
  def getIntersectionOrNullObject(anotherRange: Range): RangeAreas = js.native
  def getIntersectionOrNullObject(anotherRange: RangeAreas): RangeAreas = js.native
  
  /**
    * Returns a `RangeAreas` object that is shifted by the specific row and column offset. The dimension of the returned `RangeAreas` will match the original object. If the resulting `RangeAreas` is forced outside the bounds of the worksheet grid, an error will be thrown.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param rowOffset The number of rows (positive, negative, or 0) by which the `RangeAreas` is to be offset. Positive values are offset downward, and negative values are offset upward.
    * @param columnOffset The number of columns (positive, negative, or 0) by which the `RangeAreas` is to be offset. Positive values are offset to the right, and negative values are offset to the left.
    */
  def getOffsetRangeAreas(rowOffset: Double, columnOffset: Double): RangeAreas = js.native
  
  /**
    * Returns a `RangeAreas` object that represents all the cells that match the specified type and value. Throws an error if no special cells are found that match the criteria.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param cellType The type of cells to include.
    * @param cellValueType If `cellType` is either `constants` or `formulas`, this argument is used to determine which types of cells to include in the result. These values can be combined together to return more than one type. The default is to select all constants or formulas, no matter what the type.
    */
  def getSpecialCells(
    cellType: ConditionalFormats | DataValidations | Blanks | Constants | Formulas | SameConditionalFormat | SameDataValidation | Visible
  ): RangeAreas = js.native
  def getSpecialCells(
    cellType: ConditionalFormats | DataValidations | Blanks | Constants | Formulas | SameConditionalFormat | SameDataValidation | Visible,
    cellValueType: All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
  ): RangeAreas = js.native
  /**
    * Returns a `RangeAreas` object that represents all the cells that match the specified type and value. Throws an error if no special cells are found that match the criteria.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param cellType The type of cells to include.
    * @param cellValueType If `cellType` is either `constants` or `formulas`, this argument is used to determine which types of cells to include in the result. These values can be combined together to return more than one type. The default is to select all constants or formulas, no matter what the type.
    */
  def getSpecialCells(cellType: SpecialCellType): RangeAreas = js.native
  def getSpecialCells(cellType: SpecialCellType, cellValueType: SpecialCellValueType): RangeAreas = js.native
  
  /**
    * Returns a `RangeAreas` object that represents all the cells that match the specified type and value. If no special cells are found that match the criteria, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param cellType The type of cells to include.
    * @param cellValueType If `cellType` is either `constants` or `formulas`, this argument is used to determine which types of cells to include in the result. These values can be combined together to return more than one type. The default is to select all constants or formulas, no matter what the type.
    */
  def getSpecialCellsOrNullObject(
    cellType: ConditionalFormats | DataValidations | Blanks | Constants | Formulas | SameConditionalFormat | SameDataValidation | Visible
  ): RangeAreas = js.native
  def getSpecialCellsOrNullObject(
    cellType: ConditionalFormats | DataValidations | Blanks | Constants | Formulas | SameConditionalFormat | SameDataValidation | Visible,
    cellValueType: All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
  ): RangeAreas = js.native
  /**
    * Returns a `RangeAreas` object that represents all the cells that match the specified type and value. If no special cells are found that match the criteria, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param cellType The type of cells to include.
    * @param cellValueType If `cellType` is either `constants` or `formulas`, this argument is used to determine which types of cells to include in the result. These values can be combined together to return more than one type. The default is to select all constants or formulas, no matter what the type.
    */
  def getSpecialCellsOrNullObject(cellType: SpecialCellType): RangeAreas = js.native
  def getSpecialCellsOrNullObject(cellType: SpecialCellType, cellValueType: SpecialCellValueType): RangeAreas = js.native
  
  /**
    * Returns a scoped collection of tables that overlap with any range in this `RangeAreas` object.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param fullyContained If `true`, returns only tables that are fully contained within the range bounds. Default is `false`.
    */
  def getTables(): TableScopedCollection = js.native
  def getTables(fullyContained: Boolean): TableScopedCollection = js.native
  
  /**
    * Returns the used `RangeAreas` that comprises all the used areas of individual rectangular ranges in the `RangeAreas` object.
    If there are no used cells within the `RangeAreas`, the `ItemNotFound` error will be thrown.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param valuesOnly Whether to only consider cells with values as used cells. Default is `false`.
    */
  def getUsedRangeAreas(): RangeAreas = js.native
  def getUsedRangeAreas(valuesOnly: Boolean): RangeAreas = js.native
  
  /**
    * Returns the used `RangeAreas` that comprises all the used areas of individual rectangular ranges in the `RangeAreas` object.
    If there are no used cells within the `RangeAreas`, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param valuesOnly Whether to only consider cells with values as used cells.
    */
  def getUsedRangeAreasOrNullObject(): RangeAreas = js.native
  def getUsedRangeAreasOrNullObject(valuesOnly: Boolean): RangeAreas = js.native
  
  /**
    * Specifies if all the ranges on this `RangeAreas` object represent entire columns (e.g., "A:C, Q:Z").
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val isEntireColumn: Boolean = js.native
  
  /**
    * Specifies if all the ranges on this `RangeAreas` object represent entire rows (e.g., "1:3, 5:7").
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val isEntireRow: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeAreas = js.native
  def load(options: RangeAreasLoadOptions): RangeAreas = js.native
  def load(propertyNamesAndPaths: Expand): RangeAreas = js.native
  def load(propertyNames: String): RangeAreas = js.native
  def load(propertyNames: js.Array[String]): RangeAreas = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: RangeAreasUpdateData): Unit = js.native
  def set(properties: RangeAreasUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: RangeAreas): Unit = js.native
  
  /**
    * Sets the `RangeAreas` to be recalculated when the next recalculation occurs.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def setDirty(): Unit = js.native
  
  /**
    * Represents the style for all ranges in this `RangeAreas` object.
    If the styles of the cells are inconsistent, `null` will be returned.
    For custom styles, the style name will be returned. For built-in styles, a string representing a value in the `BuiltInStyle` enum will be returned.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var style: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.RangeAreas object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeAreasData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): RangeAreasData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created.
    */
  def track(): RangeAreas = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): RangeAreas = js.native
  
  /**
    * Returns the worksheet for the current `RangeAreas`.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val worksheet: Worksheet = js.native
}

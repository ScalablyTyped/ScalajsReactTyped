package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.PivotLayoutData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.PivotLayoutLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.PivotLayoutUpdateData
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJsPreview.anon.Expand
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Ascending
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AtBottom
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AtTop
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Column
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Compact
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Data
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Descending
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Off
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Outline
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Row
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Tabular
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the visual layout of the PivotTable.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait PivotLayout
  extends StObject
     with ClientObject {
  
  /**
    * The alt text description of the PivotTable.
    
    Alt text provides alternative, text-based representations of the information contained in the PivotTable.
    This information is useful for people with vision or cognitive impairments who may not be able to see or understand the table.
    A title can be read to a person with a disability and is used to determine whether they wish to hear the description of the content.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var altTextDescription: String = js.native
  
  /**
    * The alt text title of the PivotTable.
    
    Alt text provides alternative, text-based representations of the information contained in the PivotTable.
    This information is useful for people with vision or cognitive impairments who may not be able to see or understand the table.
    A title can be read to a person with a disability and is used to determine whether they wish to hear the description of the content.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var altTextTitle: String = js.native
  
  /**
    * Specifies if formatting will be automatically formatted when it’s refreshed or when fields are moved.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var autoFormat: Boolean = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PivotLayout: RequestContext = js.native
  
  /**
    * Sets whether or not to display a blank line after each item. This is set at the global level for the PivotTable and applied to individual PivotFields.
    This function overwrites the setting for all fields in the PivotTable to the value of `display` parameter.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    *
    * @param display True turns on the blank-line display setting. False turns it off.
    */
  def displayBlankLineAfterEachItem(display: Boolean): Unit = js.native
  
  /**
    * The text that is automatically filled into any empty cell in the PivotTable if `fillEmptyCells == true`.
    Note that this value persists if `fillEmptyCells` is set to `false`, and that setting this value does not set that property to `true`.
    By default, this is an empty string.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var emptyCellText: String = js.native
  
  /**
    * Specifies if the field list can be shown in the UI.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var enableFieldList: Boolean = js.native
  
  /**
    * Specifies whether empty cells in the PivotTable should be populated with the `emptyCellText`. Default is `false`.
    Note that the value of `emptyCellText` persists when this property is set to `false`.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var fillEmptyCells: Boolean = js.native
  
  def getCell(
    dataHierarchy: String,
    rowItems: js.Array[PivotItem | String],
    columnItems: js.Array[PivotItem | String]
  ): Range = js.native
  /**
    * Gets a unique cell in the PivotTable based on a data hierarchy and the row and column items of their respective hierarchies. The returned cell is the intersection of the given row and column that contains the data from the given hierarchy. This method is the inverse of calling `getPivotItems` and `getDataHierarchy` on a particular cell.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param dataHierarchy The `dataHierarchy` that provides the data item to find.
    * @param rowItems The PivotItems from the row axis that make up the value to find.
    * @param columnItems The PivotItems from the column axis that make up the value to find.
    * @returns A range specifying a single cell that contains the value specified.
    */
  def getCell(
    dataHierarchy: DataPivotHierarchy,
    rowItems: js.Array[PivotItem | String],
    columnItems: js.Array[PivotItem | String]
  ): Range = js.native
  
  /**
    * Returns the range where the PivotTable's column labels reside.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  def getColumnLabelRange(): Range = js.native
  
  /**
    * Returns the range where the PivotTable's data values reside.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  def getDataBodyRange(): Range = js.native
  
  def getDataHierarchy(cell: String): DataPivotHierarchy = js.native
  /**
    * Gets the DataHierarchy that is used to calculate the value in a specified range within the PivotTable.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param cell A single cell within the PivotTable data body.
    * @returns The DataPivotHierarchy object used to calculate the value in the specified cell.
    */
  def getDataHierarchy(cell: Range): DataPivotHierarchy = js.native
  
  /**
    * Returns the range of the PivotTable's filter area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  def getFilterAxisRange(): Range = js.native
  
  def getPivotItems(
    axis: Unknown_ | Row | Column | Data | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Filter,
    cell: String
  ): PivotItemCollection = js.native
  /**
    * Gets the PivotItems from an axis that make up the value in a specified range within the PivotTable.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param axis The axis from which to get the PivotItems. Must be either "row" or "column."
    * @param cell A single cell within the PivotTable's data body.
    * @returns A PivotItemCollection of the PivotItems that are used to calculate the values in the specified row.
    */
  def getPivotItems(
    axis: Unknown_ | Row | Column | Data | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Filter,
    cell: Range
  ): PivotItemCollection = js.native
  def getPivotItems(axis: PivotAxis, cell: String): PivotItemCollection = js.native
  /**
    * Gets the PivotItems from an axis that make up the value in a specified range within the PivotTable.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param axis The axis from which to get the PivotItems. Must be either "row" or "column."
    * @param cell A single cell within the PivotTable's data body.
    * @returns A PivotItemCollection of the PivotItems that are used to calculate the values in the specified row.
    */
  def getPivotItems(axis: PivotAxis, cell: Range): PivotItemCollection = js.native
  
  /**
    * Returns the range the PivotTable exists on, excluding the filter area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  def getRange(): Range = js.native
  
  /**
    * Returns the range where the PivotTable's row labels reside.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  def getRowLabelRange(): Range = js.native
  
  /**
    * This property indicates the PivotLayoutType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var layoutType: PivotLayoutType | Compact | Tabular | Outline = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PivotLayout = js.native
  def load(options: PivotLayoutLoadOptions): PivotLayout = js.native
  def load(propertyNamesAndPaths: Expand): PivotLayout = js.native
  def load(propertyNames: String): PivotLayout = js.native
  def load(propertyNames: js.Array[String]): PivotLayout = js.native
  
  /**
    * The style applied to the PivotTable.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val pivotStyle: PivotTableStyle = js.native
  
  /**
    * Specifies if formatting is preserved when the report is refreshed or recalculated by operations such as pivoting, sorting, or changing page field items.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var preserveFormatting: Boolean = js.native
  
  /**
    * Sets the "repeat all item labels" setting across all fields in the PivotTable.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    *
    * @param repeatLabels True turns on the label-repetition display setting. False turns it off.
    */
  def repeatAllItemLabels(repeatLabels: Boolean): Unit = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: PivotLayoutUpdateData): Unit = js.native
  def set(properties: PivotLayoutUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: PivotLayout): Unit = js.native
  
  def setAutoSortOnCell(cell: String, sortBy: Ascending | Descending): Unit = js.native
  def setAutoSortOnCell(cell: String, sortBy: SortBy): Unit = js.native
  /**
    * Sets the PivotTable to automatically sort using the specified cell to automatically select all necessary criteria and context. This behaves identically to applying an autosort from the UI.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param cell A single cell to use get the criteria from for applying the autosort.
    * @param sortBy The direction of the sort.
    */
  def setAutoSortOnCell(cell: Range, sortBy: Ascending | Descending): Unit = js.native
  /**
    * Sets the PivotTable to automatically sort using the specified cell to automatically select all necessary criteria and context. This behaves identically to applying an autosort from the UI.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param cell A single cell to use get the criteria from for applying the autosort.
    * @param sortBy The direction of the sort.
    */
  def setAutoSortOnCell(cell: Range, sortBy: SortBy): Unit = js.native
  
  /**
    * Sets the style applied to the PivotTable.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param style The style to apply to the PivotTable. An `InvalidArgumentException` is thrown if a string is provided that does not match the name of any style.
    */
  def setStyle(style: String): Unit = js.native
  def setStyle(style: BuiltInPivotTableStyle): Unit = js.native
  def setStyle(style: PivotTableStyle): Unit = js.native
  
  /**
    * Specifies if the PivotTable report shows grand totals for columns.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var showColumnGrandTotals: Boolean = js.native
  
  /**
    * Specifies whether the PivotTable displays field headers (field captions and filter drop-downs).
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var showFieldHeaders: Boolean = js.native
  
  /**
    * Specifies if the PivotTable report shows grand totals for rows.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var showRowGrandTotals: Boolean = js.native
  
  /**
    * This property indicates the `SubtotalLocationType` of all fields on the PivotTable. If fields have different states, this will be `null`.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var subtotalLocation: SubtotalLocationType | AtTop | AtBottom | Off = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.PivotLayout object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PivotLayoutData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PivotLayoutData = js.native
}

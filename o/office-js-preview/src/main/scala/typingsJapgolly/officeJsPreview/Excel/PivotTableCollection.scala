package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.PivotTableCollectionData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.PivotTableCollectionLoadOptions
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientResult
import typingsJapgolly.officeJsPreview.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of all the PivotTables that are part of the workbook or worksheet.
  *
  * @remarks
  * [Api set: ExcelApi 1.3]
  */
@js.native
trait PivotTableCollection
  extends StObject
     with ClientObject {
  
  def add(name: String, source: String, destination: String): PivotTable = js.native
  def add(name: String, source: String, destination: Range): PivotTable = js.native
  def add(name: String, source: Range, destination: String): PivotTable = js.native
  /**
    * Add a PivotTable based on the specified source data and insert it at the top-left cell of the destination range.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    *
    * @param name The name of the new PivotTable.
    * @param source The source data for the new PivotTable, this can either be a range (or string address including the worksheet name) or a table.
    * @param destination The cell in the upper-left corner of the PivotTable report's destination range (the range on the worksheet where the resulting report will be placed).
    * @returns Returns the newly inserted PivotTable.
    */
  def add(name: String, source: Range, destination: Range): PivotTable = js.native
  def add(name: String, source: Table, destination: String): PivotTable = js.native
  def add(name: String, source: Table, destination: Range): PivotTable = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PivotTableCollection: RequestContext = js.native
  
  /**
    * Gets the number of pivot tables in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a PivotTable by name.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    *
    * @param name Name of the PivotTable to be retrieved.
    */
  def getItem(name: String): PivotTable = js.native
  
  /**
    * Gets a PivotTable by name. If the PivotTable does not exist, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    *
    * @param name Name of the PivotTable to be retrieved.
    */
  def getItemOrNullObject(name: String): PivotTable = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[PivotTable] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PivotTableCollection = js.native
  def load(options: PivotTableCollectionLoadOptions & CollectionLoadOptions): PivotTableCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): PivotTableCollection = js.native
  def load(propertyNames: String): PivotTableCollection = js.native
  def load(propertyNames: js.Array[String]): PivotTableCollection = js.native
  
  /**
    * Refreshes all the pivot tables in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  def refreshAll(): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.PivotTableCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PivotTableCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): PivotTableCollectionData = js.native
}

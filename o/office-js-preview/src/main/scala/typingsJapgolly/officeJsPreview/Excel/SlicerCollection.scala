package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.SlicerCollectionData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.SlicerCollectionLoadOptions
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientResult
import typingsJapgolly.officeJsPreview.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of all the slicer objects in the workbook or a worksheet.
  *
  * @remarks
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait SlicerCollection
  extends StObject
     with ClientObject {
  
  /**
    * Adds a new slicer to the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    *
    * @param slicerSource The data source that the new slicer will be based on. It can be a `PivotTable` object, a `Table` object, or a string. When a PivotTable object is passed, the data source is the source of the `PivotTable` object. When a `Table` object is passed, the data source is the `Table` object. When a string is passed, it is interpreted as the name or ID of a PivotTable or table.
    * @param sourceField The field in the data source to filter by. It can be a `PivotField` object, a `TableColumn` object, the ID of a `PivotField` or the name or ID of a `TableColumn`.
    * @param slicerDestination Optional. The worksheet in which the new slicer will be created. It can be a `Worksheet` object or the name or ID of a worksheet. This parameter can be omitted if the slicer collection is retrieved from a worksheet.
    * @returns The new slicer.
    */
  def add(slicerSource: String, sourceField: String): Slicer = js.native
  def add(slicerSource: String, sourceField: String, slicerDestination: String): Slicer = js.native
  def add(slicerSource: String, sourceField: String, slicerDestination: Worksheet): Slicer = js.native
  def add(slicerSource: String, sourceField: Double): Slicer = js.native
  def add(slicerSource: String, sourceField: Double, slicerDestination: String): Slicer = js.native
  def add(slicerSource: String, sourceField: Double, slicerDestination: Worksheet): Slicer = js.native
  def add(slicerSource: String, sourceField: PivotField): Slicer = js.native
  def add(slicerSource: String, sourceField: PivotField, slicerDestination: String): Slicer = js.native
  def add(slicerSource: String, sourceField: PivotField, slicerDestination: Worksheet): Slicer = js.native
  def add(slicerSource: String, sourceField: TableColumn): Slicer = js.native
  def add(slicerSource: String, sourceField: TableColumn, slicerDestination: String): Slicer = js.native
  def add(slicerSource: String, sourceField: TableColumn, slicerDestination: Worksheet): Slicer = js.native
  def add(slicerSource: PivotTable, sourceField: String): Slicer = js.native
  def add(slicerSource: PivotTable, sourceField: String, slicerDestination: String): Slicer = js.native
  def add(slicerSource: PivotTable, sourceField: String, slicerDestination: Worksheet): Slicer = js.native
  def add(slicerSource: PivotTable, sourceField: Double): Slicer = js.native
  def add(slicerSource: PivotTable, sourceField: Double, slicerDestination: String): Slicer = js.native
  def add(slicerSource: PivotTable, sourceField: Double, slicerDestination: Worksheet): Slicer = js.native
  def add(slicerSource: PivotTable, sourceField: PivotField): Slicer = js.native
  def add(slicerSource: PivotTable, sourceField: PivotField, slicerDestination: String): Slicer = js.native
  def add(slicerSource: PivotTable, sourceField: PivotField, slicerDestination: Worksheet): Slicer = js.native
  def add(slicerSource: PivotTable, sourceField: TableColumn): Slicer = js.native
  def add(slicerSource: PivotTable, sourceField: TableColumn, slicerDestination: String): Slicer = js.native
  def add(slicerSource: PivotTable, sourceField: TableColumn, slicerDestination: Worksheet): Slicer = js.native
  def add(slicerSource: Table, sourceField: String): Slicer = js.native
  def add(slicerSource: Table, sourceField: String, slicerDestination: String): Slicer = js.native
  def add(slicerSource: Table, sourceField: String, slicerDestination: Worksheet): Slicer = js.native
  def add(slicerSource: Table, sourceField: Double): Slicer = js.native
  def add(slicerSource: Table, sourceField: Double, slicerDestination: String): Slicer = js.native
  def add(slicerSource: Table, sourceField: Double, slicerDestination: Worksheet): Slicer = js.native
  def add(slicerSource: Table, sourceField: PivotField): Slicer = js.native
  def add(slicerSource: Table, sourceField: PivotField, slicerDestination: String): Slicer = js.native
  def add(slicerSource: Table, sourceField: PivotField, slicerDestination: Worksheet): Slicer = js.native
  def add(slicerSource: Table, sourceField: TableColumn): Slicer = js.native
  def add(slicerSource: Table, sourceField: TableColumn, slicerDestination: String): Slicer = js.native
  def add(slicerSource: Table, sourceField: TableColumn, slicerDestination: Worksheet): Slicer = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SlicerCollection: RequestContext = js.native
  
  /**
    * Returns the number of slicers in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a slicer object using its name or ID.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    *
    * @param key The name or ID of the slicer.
    */
  def getItem(key: String): Slicer = js.native
  
  /**
    * Gets a slicer based on its position in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): Slicer = js.native
  
  /**
    * Gets a slicer using its name or ID. If the slicer doesn't exist, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    *
    * @param key Name or ID of the slicer to be retrieved.
    */
  def getItemOrNullObject(key: String): Slicer = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Slicer] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SlicerCollection = js.native
  def load(options: SlicerCollectionLoadOptions & CollectionLoadOptions): SlicerCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): SlicerCollection = js.native
  def load(propertyNames: String): SlicerCollection = js.native
  def load(propertyNames: js.Array[String]): SlicerCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.SlicerCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.SlicerCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): SlicerCollectionData = js.native
}

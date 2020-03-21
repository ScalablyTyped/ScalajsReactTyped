package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.SlicerCollectionData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.SlicerCollectionLoadOptions
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientResult
import typingsJapgolly.officeJsPreview.OfficeExtension.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the slicer objects on the workbook or a worksheet.
  *
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.SlicerCollection")
@js.native
class SlicerCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SlicerCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Slicer] = js.native
  /**
    *
    * Adds a new slicer to the workbook.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param slicerSource The data source that the new slicer will be based on. It can be a PivotTable object, a Table object or a string. When a PivotTable object is passed, the data source is the source of the PivotTable object. When a Table object is passed, the data source is the Table object. When a string is passed, it is interpreted as the name/id of a PivotTable/Table.
    * @param sourceField The field in the data source to filter by. It can be a PivotField object, a TableColumn object, the id of a PivotField or the id/name of TableColumn.
    * @param slicerDestination Optional. The worksheet where the new slicer will be created in. It can be a Worksheet object or the name/id of a worksheet. This parameter can be omitted if the slicer collection is retrieved from worksheet.
    * @returns The new slicer.
    */
  def add(slicerSource: String | PivotTable | Table, sourceField: String | PivotField | Double | TableColumn): Slicer = js.native
  def add(
    slicerSource: String | PivotTable | Table,
    sourceField: String | PivotField | Double | TableColumn,
    slicerDestination: String | Worksheet
  ): Slicer = js.native
  /**
    *
    * Returns the number of slicers in the collection.
    *
    * [Api set: ExcelApi 1.10]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    *
    * Gets a slicer object using its name or id.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param key The name or id of the slicer.
    */
  def getItem(key: String): Slicer = js.native
  /**
    *
    * Gets a slicer based on its position in the collection.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): Slicer = js.native
  /**
    *
    * Gets a slicer using its name or id. If the slicer does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param key Name or Id of the slicer to be retrieved.
    */
  def getItemOrNullObject(key: String): Slicer = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SlicerCollection = js.native
  def load(options: SlicerCollectionLoadOptions with CollectionLoadOptions): SlicerCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): SlicerCollection = js.native
  def load(propertyNames: String): SlicerCollection = js.native
  def load(propertyNames: js.Array[String]): SlicerCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.SlicerCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.SlicerCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): SlicerCollectionData = js.native
}


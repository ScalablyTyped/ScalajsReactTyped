package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.TableScopedCollectionData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.TableScopedCollectionLoadOptions
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientResult
import typingsJapgolly.officeJsPreview.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a scoped collection of tables. For each table its top-left corner is considered its anchor location, and the tables are sorted top-to-bottom and then left-to-right.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait TableScopedCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableScopedCollection: RequestContext = js.native
  
  /**
    * Gets the number of tables in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets the first table in the collection. The tables in the collection are sorted top-to-bottom and left-to-right, such that top-left table is the first table in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def getFirst(): Table = js.native
  
  /**
    * Gets a table by name or ID.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param key Name or ID of the table to be retrieved.
    */
  def getItem(key: String): Table = js.native
  
  /**
    * Gets a table by name or ID.
    If the table object does not exist, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties  | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    *
    * @param key Name or ID of the table to be retrieved.
    */
  def getItemOrNullObject(key: String): Table = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Table] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableScopedCollection = js.native
  def load(options: TableScopedCollectionLoadOptions & CollectionLoadOptions): TableScopedCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): TableScopedCollection = js.native
  def load(propertyNames: String): TableScopedCollection = js.native
  def load(propertyNames: js.Array[String]): TableScopedCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.TableScopedCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TableScopedCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): TableScopedCollectionData = js.native
}

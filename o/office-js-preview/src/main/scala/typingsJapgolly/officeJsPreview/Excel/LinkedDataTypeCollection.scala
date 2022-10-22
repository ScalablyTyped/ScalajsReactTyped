package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.LinkedDataTypeCollectionData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.LinkedDataTypeCollectionLoadOptions
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientResult
import typingsJapgolly.officeJsPreview.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of linked data types.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait LinkedDataTypeCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_LinkedDataTypeCollection: RequestContext = js.native
  
  /**
    * Gets the number of linked data types in the collection.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a linked data type by service ID.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param key The ID of the linked data type.
    */
  def getItem(key: Double): LinkedDataType = js.native
  
  /**
    * Gets a linked data type by its index in the collection.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param index The index of the linked data type object in the collection.
    * @returns The linked data type at the given index.
    */
  def getItemAt(index: Double): LinkedDataType = js.native
  
  /**
    * Gets a linked data type by ID. If the linked data type doesn't exist, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param key The service ID of the linked data type.
    */
  def getItemOrNullObject(key: Double): LinkedDataType = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[LinkedDataType] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): LinkedDataTypeCollection = js.native
  def load(options: LinkedDataTypeCollectionLoadOptions & CollectionLoadOptions): LinkedDataTypeCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): LinkedDataTypeCollection = js.native
  def load(propertyNames: String): LinkedDataTypeCollection = js.native
  def load(propertyNames: js.Array[String]): LinkedDataTypeCollection = js.native
  
  /**
    * Makes a request to refresh all the linked data types in the collection.
    If the service is busy or otherwise temporarily inaccessible, the request will not be fulfilled.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def requestRefreshAll(): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.LinkedDataTypeCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.LinkedDataTypeCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): LinkedDataTypeCollectionData = js.native
}

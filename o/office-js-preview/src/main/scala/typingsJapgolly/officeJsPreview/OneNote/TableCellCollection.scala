package typingsJapgolly.officeJsPreview.OneNote

import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.LoadOption
import typingsJapgolly.officeJsPreview.OneNote.Interfaces.CollectionLoadOptions
import typingsJapgolly.officeJsPreview.OneNote.Interfaces.TableCellCollectionData
import typingsJapgolly.officeJsPreview.OneNote.Interfaces.TableCellCollectionLoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a collection of TableCell objects.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait TableCellCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableCellCollection: RequestContext = js.native
  
  /**
    * Returns the number of tablecells in this collection. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val count: Double = js.native
  
  def getItem(index: String): TableCell = js.native
  /**
    * Gets a table cell object by ID or by its index in the collection. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param index A number that identifies the index location of a table cell object.
    */
  def getItem(index: Double): TableCell = js.native
  
  /**
    * Gets a tablecell at its position in the collection.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): TableCell = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[TableCell] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableCellCollection = js.native
  def load(options: TableCellCollectionLoadOptions & CollectionLoadOptions): TableCellCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): TableCellCollection = js.native
  def load(propertyNames: String): TableCellCollection = js.native
  def load(propertyNames: js.Array[String]): TableCellCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `OneNote.TableCellCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.TableCellCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): TableCellCollectionData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): TableCellCollection = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): TableCellCollection = js.native
}

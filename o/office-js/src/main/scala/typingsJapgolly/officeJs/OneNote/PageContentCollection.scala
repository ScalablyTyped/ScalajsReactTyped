package typingsJapgolly.officeJs.OneNote

import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.LoadOption
import typingsJapgolly.officeJs.OneNote.Interfaces.CollectionLoadOptions
import typingsJapgolly.officeJs.OneNote.Interfaces.PageContentCollectionData
import typingsJapgolly.officeJs.OneNote.Interfaces.PageContentCollectionLoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the contents of a page, as a collection of PageContent objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.PageContentCollection")
@js.native
class PageContentCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PageContentCollection: RequestContext = js.native
  /**
    *
    * Returns the number of page contents in the collection. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val count: Double = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[PageContent] = js.native
  def getItem(index: String): PageContent = js.native
  /**
    *
    * Gets a PageContent object by ID or by its index in the collection. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param index The ID of the PageContent object, or the index location of the PageContent object in the collection.
    */
  def getItem(index: Double): PageContent = js.native
  /**
    *
    * Gets a page content on its position in the collection.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): PageContent = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): OneNote.PageContentCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): OneNote.PageContentCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.PageContentCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PageContentCollection = js.native
  def load(option: PageContentCollectionLoadOptions with CollectionLoadOptions): PageContentCollection = js.native
  def load(option: String): PageContentCollection = js.native
  def load(option: js.Array[String]): PageContentCollection = js.native
  def load(option: LoadOption): PageContentCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `OneNote.PageContentCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.PageContentCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): PageContentCollectionData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): PageContentCollection = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): PageContentCollection = js.native
}


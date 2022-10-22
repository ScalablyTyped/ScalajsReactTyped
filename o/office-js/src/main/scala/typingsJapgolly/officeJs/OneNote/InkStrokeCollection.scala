package typingsJapgolly.officeJs.OneNote

import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.LoadOption
import typingsJapgolly.officeJs.OneNote.Interfaces.CollectionLoadOptions
import typingsJapgolly.officeJs.OneNote.Interfaces.InkStrokeCollectionData
import typingsJapgolly.officeJs.OneNote.Interfaces.InkStrokeCollectionLoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of InkStroke objects.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait InkStrokeCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_InkStrokeCollection: RequestContext = js.native
  
  /**
    * Returns the number of InkStrokes in the page. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val count: Double = js.native
  
  def getItem(index: String): InkStroke = js.native
  /**
    * Gets a InkStroke object by ID or by its index in the collection. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param index The ID of the InkStroke object, or the index location of the InkStroke object in the collection.
    */
  def getItem(index: Double): InkStroke = js.native
  
  /**
    * Gets a InkStroke on its position in the collection.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): InkStroke = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[InkStroke] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): InkStrokeCollection = js.native
  def load(options: InkStrokeCollectionLoadOptions & CollectionLoadOptions): InkStrokeCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): InkStrokeCollection = js.native
  def load(propertyNames: String): InkStrokeCollection = js.native
  def load(propertyNames: js.Array[String]): InkStrokeCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `OneNote.InkStrokeCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.InkStrokeCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): InkStrokeCollectionData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): InkStrokeCollection = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): InkStrokeCollection = js.native
}

package typingsJapgolly.officeJs.Visio

import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.ClientResult
import typingsJapgolly.officeJs.OfficeExtension.LoadOption
import typingsJapgolly.officeJs.Visio.Interfaces.CollectionLoadOptions
import typingsJapgolly.officeJs.Visio.Interfaces.CommentCollectionData
import typingsJapgolly.officeJs.Visio.Interfaces.CommentCollectionLoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the CommentCollection for a given Shape.
  *
  * [Api set:  1.1]
  */
@js.native
trait CommentCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CommentCollection: RequestContext = js.native
  
  /**
    *
    * Gets the number of Comments.
    *
    * [Api set:  1.1]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    *
    * Gets the Comment using its name.
    *
    * [Api set:  1.1]
    *
    * @param key Key is the name of the Comment to be retrieved.
    */
  def getItem(key: String): Comment = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Comment] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CommentCollection = js.native
  def load(options: CommentCollectionLoadOptions & CollectionLoadOptions): CommentCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): CommentCollection = js.native
  def load(propertyNames: String): CommentCollection = js.native
  def load(propertyNames: js.Array[String]): CommentCollection = js.native
  
  /**
    * Set mock data
    */
  def setMockData(data: CommentCollectionData): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Visio.CommentCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.CommentCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): CommentCollectionData = js.native
}

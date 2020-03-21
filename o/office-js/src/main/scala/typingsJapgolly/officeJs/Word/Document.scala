package typingsJapgolly.officeJs.Word

import typingsJapgolly.officeJs.AnonExpand
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJs.Word.Interfaces.DocumentData
import typingsJapgolly.officeJs.Word.Interfaces.DocumentLoadOptions
import typingsJapgolly.officeJs.Word.Interfaces.DocumentUpdateData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * The Document object is the top level object. A Document object contains one or more sections, content controls, and the body that contains the contents of the document.
  *
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.Document")
@js.native
class Document () extends ClientObject {
  /**
    *
    * Gets the body object of the document. The body is the text that excludes headers, footers, footnotes, textboxes, etc.. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val body: Body = js.native
  /**
    *
    * Gets the collection of content control objects in the document. This includes content controls in the body of the document, headers, footers, textboxes, etc.. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val contentControls: ContentControlCollection = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Document: RequestContext = js.native
  /**
    *
    * Gets the properties of the document. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val properties: DocumentProperties = js.native
  /**
    *
    * Indicates whether the changes in the document have been saved. A value of true indicates that the document hasn't changed since it was saved. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val saved: Boolean = js.native
  /**
    *
    * Gets the collection of section objects in the document. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val sections: SectionCollection = js.native
  /**
    *
    * Gets the current selection of the document. Multiple selections are not supported.
    *
    * [Api set: WordApi 1.1]
    */
  def getSelection(): Range = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.Document` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.Document` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.Document` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Document = js.native
  def load(option: String): Document = js.native
  def load(option: js.Array[String]): Document = js.native
  def load(option: AnonExpand): Document = js.native
  def load(option: DocumentLoadOptions): Document = js.native
  /**
    *
    * Saves the document. This uses the Word default file naming convention if the document has not been saved before.
    *
    * [Api set: WordApi 1.1]
    */
  def save(): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Document): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Word.Document): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: DocumentUpdateData): Unit = js.native
  def set(properties: DocumentUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.Document object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.DocumentData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): DocumentData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Document = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): Document = js.native
}


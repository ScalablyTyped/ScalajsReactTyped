package typingsJapgolly.officeJsPreview.Word

import typingsJapgolly.officeJsPreview.AnonExpand
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJsPreview.Word.Interfaces.SectionData
import typingsJapgolly.officeJsPreview.Word.Interfaces.SectionLoadOptions
import typingsJapgolly.officeJsPreview.Word.Interfaces.SectionUpdateData
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EvenPages
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FirstPage
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Primary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a section in a Word document.
  *
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.Section")
@js.native
class Section () extends ClientObject {
  /**
    *
    * Gets the body object of the section. This does not include the header/footer and other section metadata. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val body: Body = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Section: RequestContext = js.native
  /**
    *
    * Gets one of the section's footers.
    *
    * [Api set: WordApi 1.1]
    *
    * @param type Required. The type of footer to return. This value can be: 'Primary', 'FirstPage', or 'EvenPages'.
    */
  def getFooter(`type`: HeaderFooterType): Body = js.native
  @JSName("getFooter")
  def getFooter_EvenPages(`type`: EvenPages): Body = js.native
  @JSName("getFooter")
  def getFooter_FirstPage(`type`: FirstPage): Body = js.native
  /**
    *
    * Gets one of the section's footers.
    *
    * [Api set: WordApi 1.1]
    *
    * @param type Required. The type of footer to return. This value can be: 'Primary', 'FirstPage', or 'EvenPages'.
    */
  @JSName("getFooter")
  def getFooter_Primary(`type`: Primary): Body = js.native
  /**
    *
    * Gets one of the section's headers.
    *
    * [Api set: WordApi 1.1]
    *
    * @param type Required. The type of header to return. This value can be: 'Primary', 'FirstPage', or 'EvenPages'.
    */
  def getHeader(`type`: HeaderFooterType): Body = js.native
  @JSName("getHeader")
  def getHeader_EvenPages(`type`: EvenPages): Body = js.native
  @JSName("getHeader")
  def getHeader_FirstPage(`type`: FirstPage): Body = js.native
  /**
    *
    * Gets one of the section's headers.
    *
    * [Api set: WordApi 1.1]
    *
    * @param type Required. The type of header to return. This value can be: 'Primary', 'FirstPage', or 'EvenPages'.
    */
  @JSName("getHeader")
  def getHeader_Primary(`type`: Primary): Body = js.native
  /**
    *
    * Gets the next section. Throws an error if this section is the last one.
    *
    * [Api set: WordApi 1.3]
    */
  def getNext(): Section = js.native
  /**
    *
    * Gets the next section. Returns a null object if this section is the last one.
    *
    * [Api set: WordApi 1.3]
    */
  def getNextOrNullObject(): Section = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.Section` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.Section` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.Section` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Section = js.native
  def load(option: String): Section = js.native
  def load(option: js.Array[String]): Section = js.native
  def load(option: AnonExpand): Section = js.native
  def load(option: SectionLoadOptions): Section = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Word.Section): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: SectionUpdateData): Unit = js.native
  def set(properties: SectionUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Section): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.Section object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.SectionData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): SectionData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Section = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): Section = js.native
}


package typingsJapgolly.officeJs.Word

import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJs.Word.Interfaces.CommentContentRangeData
import typingsJapgolly.officeJs.Word.Interfaces.CommentContentRangeLoadOptions
import typingsJapgolly.officeJs.Word.Interfaces.CommentContentRangeUpdateData
import typingsJapgolly.officeJs.anon.Expand
import typingsJapgolly.officeJs.officeJsStrings.After
import typingsJapgolly.officeJs.officeJsStrings.Before
import typingsJapgolly.officeJs.officeJsStrings.DashLine
import typingsJapgolly.officeJs.officeJsStrings.DashLineHeavy
import typingsJapgolly.officeJs.officeJsStrings.DashLineLong
import typingsJapgolly.officeJs.officeJsStrings.DashLineLongHeavy
import typingsJapgolly.officeJs.officeJsStrings.DotDashLine
import typingsJapgolly.officeJs.officeJsStrings.DotDashLineHeavy
import typingsJapgolly.officeJs.officeJsStrings.DotLine
import typingsJapgolly.officeJs.officeJsStrings.Dotted
import typingsJapgolly.officeJs.officeJsStrings.DottedHeavy
import typingsJapgolly.officeJs.officeJsStrings.Double
import typingsJapgolly.officeJs.officeJsStrings.End
import typingsJapgolly.officeJs.officeJsStrings.Hidden
import typingsJapgolly.officeJs.officeJsStrings.Mixed
import typingsJapgolly.officeJs.officeJsStrings.None
import typingsJapgolly.officeJs.officeJsStrings.Replace
import typingsJapgolly.officeJs.officeJsStrings.Single
import typingsJapgolly.officeJs.officeJsStrings.Start
import typingsJapgolly.officeJs.officeJsStrings.Thick
import typingsJapgolly.officeJs.officeJsStrings.TwoDotDashLine
import typingsJapgolly.officeJs.officeJsStrings.TwoDotDashLineHeavy
import typingsJapgolly.officeJs.officeJsStrings.Wave
import typingsJapgolly.officeJs.officeJsStrings.WaveDouble
import typingsJapgolly.officeJs.officeJsStrings.WaveHeavy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @remarks
  * [Api set: WordApi 1.4]
  */
@js.native
trait CommentContentRange
  extends StObject
     with ClientObject {
  
  /**
    * Gets or sets a value that indicates whether the comment text is bold.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var bold: Boolean = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CommentContentRange: RequestContext = js.native
  
  /**
    * Gets the first hyperlink in the range, or sets a hyperlink on the range. All hyperlinks in the range are deleted when you set a new hyperlink on the range.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var hyperlink: String = js.native
  
  def insertText(text: String, insertLocation: Replace | Start | End | Before | After): CommentContentRange = js.native
  /**
    * Inserts text into at the specified location. **Note**: For the modern comment, the content range tracked across context turns to empty if any revision to the comment is posted through the UI.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * @param text Required. The text to be inserted in to the CommentContentRange.
    * @param insertLocation Required. The value must be 'Replace', 'Start', 'End', 'Before', or 'After'.
    */
  def insertText(text: String, insertLocation: InsertLocation): CommentContentRange = js.native
  
  /**
    * Checks whether the range length is zero.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  val isEmpty: Boolean = js.native
  
  /**
    * Gets or sets a value that indicates whether the comment text is italicized.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var italic: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CommentContentRange = js.native
  def load(options: CommentContentRangeLoadOptions): CommentContentRange = js.native
  def load(propertyNamesAndPaths: Expand): CommentContentRange = js.native
  def load(propertyNames: String): CommentContentRange = js.native
  def load(propertyNames: js.Array[String]): CommentContentRange = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: CommentContentRange): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: CommentContentRangeUpdateData): Unit = js.native
  def set(properties: CommentContentRangeUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Gets or sets a value that indicates whether the comment text has a strikethrough.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var strikeThrough: Boolean = js.native
  
  /**
    * Gets the text of the comment range.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  val text: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.CommentContentRange object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.CommentContentRangeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): CommentContentRangeData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): CommentContentRange = js.native
  
  /**
    * Gets or sets a value that indicates the comment text's underline type. 'None' if the comment text is not underlined.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var underline: UnderlineType | Mixed | None | Hidden | DotLine | Single | typingsJapgolly.officeJs.officeJsStrings.Word | Double | Thick | Dotted | DottedHeavy | DashLine | DashLineHeavy | DashLineLong | DashLineLongHeavy | DotDashLine | DotDashLineHeavy | TwoDotDashLine | TwoDotDashLineHeavy | Wave | WaveHeavy | WaveDouble = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): CommentContentRange = js.native
}

package typingsJapgolly.officeJsPreview.OneNote

import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJsPreview.OneNote.Interfaces.InkAnalysisData
import typingsJapgolly.officeJsPreview.OneNote.Interfaces.InkAnalysisLoadOptions
import typingsJapgolly.officeJsPreview.OneNote.Interfaces.InkAnalysisUpdateData
import typingsJapgolly.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents ink analysis data for a given set of ink strokes.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait InkAnalysis
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_InkAnalysis: RequestContext = js.native
  
  /**
    * Gets the ID of the InkAnalysis object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val id: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): InkAnalysis = js.native
  def load(options: InkAnalysisLoadOptions): InkAnalysis = js.native
  def load(propertyNamesAndPaths: Expand): InkAnalysis = js.native
  def load(propertyNames: String): InkAnalysis = js.native
  def load(propertyNames: js.Array[String]): InkAnalysis = js.native
  
  /**
    * Gets the parent page object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val page: Page = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: InkAnalysis): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: InkAnalysisUpdateData): Unit = js.native
  def set(properties: InkAnalysisUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.InkAnalysis object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.InkAnalysisData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): InkAnalysisData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): InkAnalysis = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): InkAnalysis = js.native
}

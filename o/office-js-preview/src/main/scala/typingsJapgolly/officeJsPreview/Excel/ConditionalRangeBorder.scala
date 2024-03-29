package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.ConditionalRangeBorderData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ConditionalRangeBorderLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ConditionalRangeBorderUpdateData
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJsPreview.anon.Expand
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Continuous
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dash
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashDot
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashDotDot
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dot
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EdgeBottom
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EdgeLeft
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EdgeRight
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EdgeTop
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.None
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the border of an object.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalRangeBorder
  extends StObject
     with ClientObject {
  
  /**
    * HTML color code representing the color of the border line, in the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var color: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ConditionalRangeBorder: RequestContext = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ConditionalRangeBorder = js.native
  def load(options: ConditionalRangeBorderLoadOptions): ConditionalRangeBorder = js.native
  def load(propertyNamesAndPaths: Expand): ConditionalRangeBorder = js.native
  def load(propertyNames: String): ConditionalRangeBorder = js.native
  def load(propertyNames: js.Array[String]): ConditionalRangeBorder = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ConditionalRangeBorder): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ConditionalRangeBorderUpdateData): Unit = js.native
  def set(properties: ConditionalRangeBorderUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Constant value that indicates the specific side of the border. See `Excel.ConditionalRangeBorderIndex` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val sideIndex: ConditionalRangeBorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight = js.native
  
  /**
    * One of the constants of line style specifying the line style for the border. See `Excel.BorderLineStyle` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var style: ConditionalRangeBorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ConditionalRangeBorder object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ConditionalRangeBorderData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ConditionalRangeBorderData = js.native
}

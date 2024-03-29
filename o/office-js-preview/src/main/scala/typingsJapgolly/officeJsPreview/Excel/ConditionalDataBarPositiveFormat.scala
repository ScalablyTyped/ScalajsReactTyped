package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.ConditionalDataBarPositiveFormatData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ConditionalDataBarPositiveFormatLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ConditionalDataBarPositiveFormatUpdateData
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a conditional format for the positive side of the data bar.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalDataBarPositiveFormat
  extends StObject
     with ClientObject {
  
  /**
    * HTML color code representing the color of the border line, in the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    Value is "" (an empty string) if no border is present or set.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var borderColor: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ConditionalDataBarPositiveFormat: RequestContext = js.native
  
  /**
    * HTML color code representing the fill color, in the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var fillColor: String = js.native
  
  /**
    * Specifies if the data bar has a gradient.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var gradientFill: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ConditionalDataBarPositiveFormat = js.native
  def load(options: ConditionalDataBarPositiveFormatLoadOptions): ConditionalDataBarPositiveFormat = js.native
  def load(propertyNamesAndPaths: Expand): ConditionalDataBarPositiveFormat = js.native
  def load(propertyNames: String): ConditionalDataBarPositiveFormat = js.native
  def load(propertyNames: js.Array[String]): ConditionalDataBarPositiveFormat = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ConditionalDataBarPositiveFormat): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ConditionalDataBarPositiveFormatUpdateData): Unit = js.native
  def set(properties: ConditionalDataBarPositiveFormatUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ConditionalDataBarPositiveFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ConditionalDataBarPositiveFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ConditionalDataBarPositiveFormatData = js.native
}

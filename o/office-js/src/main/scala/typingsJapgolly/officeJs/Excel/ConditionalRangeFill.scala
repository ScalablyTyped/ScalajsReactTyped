package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.Interfaces.ConditionalRangeFillData
import typingsJapgolly.officeJs.Excel.Interfaces.ConditionalRangeFillLoadOptions
import typingsJapgolly.officeJs.Excel.Interfaces.ConditionalRangeFillUpdateData
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the background of a conditional range object.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalRangeFill
  extends StObject
     with ClientObject {
  
  /**
    * Resets the fill.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  def clear(): Unit = js.native
  
  /**
    * HTML color code representing the color of the fill, in the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var color: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ConditionalRangeFill: RequestContext = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ConditionalRangeFill = js.native
  def load(options: ConditionalRangeFillLoadOptions): ConditionalRangeFill = js.native
  def load(propertyNamesAndPaths: Expand): ConditionalRangeFill = js.native
  def load(propertyNames: String): ConditionalRangeFill = js.native
  def load(propertyNames: js.Array[String]): ConditionalRangeFill = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ConditionalRangeFill): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ConditionalRangeFillUpdateData): Unit = js.native
  def set(properties: ConditionalRangeFillUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ConditionalRangeFill object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ConditionalRangeFillData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ConditionalRangeFillData = js.native
}

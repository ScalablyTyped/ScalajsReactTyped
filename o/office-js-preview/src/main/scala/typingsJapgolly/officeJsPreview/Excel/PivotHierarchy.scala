package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.PivotHierarchyData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.PivotHierarchyLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.PivotHierarchyUpdateData
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the Excel PivotHierarchy.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait PivotHierarchy
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PivotHierarchy: RequestContext = js.native
  
  /**
    * Returns the PivotFields associated with the PivotHierarchy.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val fields: PivotFieldCollection = js.native
  
  /**
    * ID of the PivotHierarchy.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val id: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PivotHierarchy = js.native
  def load(options: PivotHierarchyLoadOptions): PivotHierarchy = js.native
  def load(propertyNamesAndPaths: Expand): PivotHierarchy = js.native
  def load(propertyNames: String): PivotHierarchy = js.native
  def load(propertyNames: js.Array[String]): PivotHierarchy = js.native
  
  /**
    * Name of the PivotHierarchy.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var name: String = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: PivotHierarchyUpdateData): Unit = js.native
  def set(properties: PivotHierarchyUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: PivotHierarchy): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.PivotHierarchy object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PivotHierarchyData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PivotHierarchyData = js.native
}

package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.LinkedDataTypeData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.LinkedDataTypeLoadOptions
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.anon.Expand
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Manual
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.OnLoad
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Periodic
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a linked data type.
  A linked data type is a data type connected to an online data source.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait LinkedDataType
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_LinkedDataType: RequestContext = js.native
  
  /**
    * The name of the data provider for the linked data type. This may change when information is retrieved from the service.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val dataProvider: String = js.native
  
  /**
    * The local time-zone date and time since the workbook was opened when the linked data type was last refreshed.
    Returns `undefined` if the linked data type has not been refreshed.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val lastRefreshed: js.Date = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): LinkedDataType = js.native
  def load(options: LinkedDataTypeLoadOptions): LinkedDataType = js.native
  def load(propertyNamesAndPaths: Expand): LinkedDataType = js.native
  def load(propertyNames: String): LinkedDataType = js.native
  def load(propertyNames: js.Array[String]): LinkedDataType = js.native
  
  /**
    * The name of the linked data type. This may change when information is retrieved from the service.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val name: String = js.native
  
  /**
    * The frequency, in seconds, at which the linked data type is refreshed if `refreshMode` is set to "Periodic".
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val periodicRefreshInterval: Double = js.native
  
  /**
    * The mechanism by which the data for the linked data type is retrieved.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val refreshMode: LinkedDataTypeRefreshMode | Unknown_ | Manual | OnLoad | Periodic = js.native
  
  /**
    * Makes a request to refresh the linked data type. If the service is busy or otherwise temporarily inaccessible, the request will not be fulfilled.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def requestRefresh(): Unit = js.native
  
  /**
    * Makes a request to change the refresh mode for this linked data type.
    If the given refresh mode is not supported by this linked data type the mode is left unchanged.
    If set to "Periodic", the refresh interval is set to a predetermined value based on the particular linked data type.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param refreshMode The intended mode to which this linked data type is requested to change.
    */
  def requestSetRefreshMode(refreshMode: Unknown_ | Manual | OnLoad | Periodic): Unit = js.native
  /**
    * Makes a request to change the refresh mode for this linked data type.
    If the given refresh mode is not supported by this linked data type the mode is left unchanged.
    If set to "Periodic", the refresh interval is set to a predetermined value based on the particular linked data type.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param refreshMode The intended mode to which this linked data type is requested to change.
    */
  def requestSetRefreshMode(refreshMode: LinkedDataTypeRefreshMode): Unit = js.native
  
  /**
    * The unique ID of the linked data type.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val serviceId: Double = js.native
  
  /**
    * Returns an array with all the refresh modes supported by the linked data type. The contents of the array may change when information is retrieved from the service.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val supportedRefreshModes: js.Array[LinkedDataTypeRefreshMode] = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.LinkedDataType object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.LinkedDataTypeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): LinkedDataTypeData = js.native
}

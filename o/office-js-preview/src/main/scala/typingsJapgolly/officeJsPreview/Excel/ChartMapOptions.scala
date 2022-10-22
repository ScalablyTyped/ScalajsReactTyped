package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartMapOptionsData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartMapOptionsLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartMapOptionsUpdateData
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJsPreview.anon.Expand
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Albers
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Automatic
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.BestFit
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.City
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Continent
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Country
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.County
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DataOnly
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Mercator
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Miller
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.None
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Robinson
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ShowAll
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.State
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.World
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates the properties for a region map chart.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ChartMapOptions
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartMapOptions: RequestContext = js.native
  
  /**
    * Specifies the series map labels strategy of a region map chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var labelStrategy: ChartMapLabelStrategy | None | BestFit | ShowAll = js.native
  
  /**
    * Specifies the series mapping level of a region map chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var level: ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartMapOptions = js.native
  def load(options: ChartMapOptionsLoadOptions): ChartMapOptions = js.native
  def load(propertyNamesAndPaths: Expand): ChartMapOptions = js.native
  def load(propertyNames: String): ChartMapOptions = js.native
  def load(propertyNames: js.Array[String]): ChartMapOptions = js.native
  
  /**
    * Specifies the series projection type of a region map chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var projectionType: ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartMapOptions): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartMapOptionsUpdateData): Unit = js.native
  def set(properties: ChartMapOptionsUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartMapOptions object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartMapOptionsData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartMapOptionsData = js.native
}

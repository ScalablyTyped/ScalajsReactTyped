package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartErrorBarsData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartErrorBarsLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartErrorBarsUpdateData
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJsPreview.anon.Expand
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Both
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Custom
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FixedValue
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.MinusValues
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Percent
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.PlusValues
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.StDev
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.StError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object represents the attributes for a chart's error bars.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ChartErrorBars
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartErrorBars: RequestContext = js.native
  
  /**
    * Specifies if error bars have an end style cap.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var endStyleCap: Boolean = js.native
  
  /**
    * Specifies the formatting type of the error bars.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val format: ChartErrorBarsFormat = js.native
  
  /**
    * Specifies which parts of the error bars to include.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var include: ChartErrorBarsInclude | Both | MinusValues | PlusValues = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartErrorBars = js.native
  def load(options: ChartErrorBarsLoadOptions): ChartErrorBars = js.native
  def load(propertyNamesAndPaths: Expand): ChartErrorBars = js.native
  def load(propertyNames: String): ChartErrorBars = js.native
  def load(propertyNames: js.Array[String]): ChartErrorBars = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartErrorBars): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartErrorBarsUpdateData): Unit = js.native
  def set(properties: ChartErrorBarsUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartErrorBars object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartErrorBarsData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartErrorBarsData = js.native
  
  /**
    * The type of range marked by the error bars.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var `type`: ChartErrorBarsType | FixedValue | Percent | StDev | StError | Custom = js.native
  
  /**
    * Specifies whether the error bars are displayed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var visible: Boolean = js.native
}

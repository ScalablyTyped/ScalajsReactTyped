package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartAxesData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartAxesLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartAxesUpdateData
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJsPreview.anon.Expand
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Category
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Invalid
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Primary
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Secondary
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Series
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the chart axes.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartAxes
  extends StObject
     with ClientObject {
  
  /**
    * Represents the category axis in a chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val categoryAxis: ChartAxis = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartAxes: RequestContext = js.native
  
  /**
    * Returns the specific axis identified by type and group.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @param type Specifies the axis type. See `Excel.ChartAxisType` for details.
    * @param group Optional. Specifies the axis group. See `Excel.ChartAxisGroup` for details.
    */
  def getItem(`type`: Invalid | Category | Value | Series): ChartAxis = js.native
  def getItem(`type`: Invalid | Category | Value | Series, group: Primary | Secondary): ChartAxis = js.native
  /**
    * Returns the specific axis identified by type and group.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @param type Specifies the axis type. See `Excel.ChartAxisType` for details.
    * @param group Optional. Specifies the axis group. See `Excel.ChartAxisGroup` for details.
    */
  def getItem(`type`: ChartAxisType): ChartAxis = js.native
  def getItem(`type`: ChartAxisType, group: ChartAxisGroup): ChartAxis = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartAxes = js.native
  def load(options: ChartAxesLoadOptions): ChartAxes = js.native
  def load(propertyNamesAndPaths: Expand): ChartAxes = js.native
  def load(propertyNames: String): ChartAxes = js.native
  def load(propertyNames: js.Array[String]): ChartAxes = js.native
  
  /**
    * Represents the series axis of a 3-D chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val seriesAxis: ChartAxis = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartAxes): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartAxesUpdateData): Unit = js.native
  def set(properties: ChartAxesUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartAxes object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartAxesData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartAxesData = js.native
  
  /**
    * Represents the value axis in an axis.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val valueAxis: ChartAxis = js.native
}

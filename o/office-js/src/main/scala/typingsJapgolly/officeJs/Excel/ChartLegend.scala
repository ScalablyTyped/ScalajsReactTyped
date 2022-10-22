package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.Interfaces.ChartLegendData
import typingsJapgolly.officeJs.Excel.Interfaces.ChartLegendLoadOptions
import typingsJapgolly.officeJs.Excel.Interfaces.ChartLegendUpdateData
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJs.anon.Expand
import typingsJapgolly.officeJs.officeJsStrings.Bottom
import typingsJapgolly.officeJs.officeJsStrings.Corner
import typingsJapgolly.officeJs.officeJsStrings.Custom
import typingsJapgolly.officeJs.officeJsStrings.Invalid
import typingsJapgolly.officeJs.officeJsStrings.Left
import typingsJapgolly.officeJs.officeJsStrings.Right
import typingsJapgolly.officeJs.officeJsStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the legend in a chart.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartLegend
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartLegend: RequestContext = js.native
  
  /**
    * Represents the formatting of a chart legend, which includes fill and font formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val format: ChartLegendFormat = js.native
  
  /**
    * Specifies the height, in points, of the legend on the chart. Value is `null` if the legend is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var height: Double = js.native
  
  /**
    * Specifies the left value, in points, of the legend on the chart. Value is `null` if the legend is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var left: Double = js.native
  
  /**
    * Represents a collection of legendEntries in the legend.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  val legendEntries: ChartLegendEntryCollection = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartLegend = js.native
  def load(options: ChartLegendLoadOptions): ChartLegend = js.native
  def load(propertyNamesAndPaths: Expand): ChartLegend = js.native
  def load(propertyNames: String): ChartLegend = js.native
  def load(propertyNames: js.Array[String]): ChartLegend = js.native
  
  /**
    * Specifies if the chart legend should overlap with the main body of the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var overlay: Boolean = js.native
  
  /**
    * Specifies the position of the legend on the chart. See `Excel.ChartLegendPosition` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var position: ChartLegendPosition | Invalid | Top | Bottom | Left | Right | Corner | Custom = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartLegend): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartLegendUpdateData): Unit = js.native
  def set(properties: ChartLegendUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Specifies if the legend has a shadow on the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: Boolean = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartLegend object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartLegendData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartLegendData = js.native
  
  /**
    * Specifies the top of a chart legend.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var top: Double = js.native
  
  /**
    * Specifies if the chart legend is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var visible: Boolean = js.native
  
  /**
    * Specifies the width, in points, of the legend on the chart. Value is `null` if the legend is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var width: Double = js.native
}

package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.AnonExpand
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartLineFormatData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartLineFormatLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartLineFormatUpdateData
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Automatic
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Continuous
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dash
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashDot
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashDotDot
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dot
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Grey25
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Grey50
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Grey75
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.None
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.RoundDot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Encapsulates the formatting options for line elements.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartLineFormat")
@js.native
class ChartLineFormat () extends ClientObject {
  /**
    *
    * HTML color code representing the color of lines in the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartLineFormat: RequestContext = js.native
  /**
    *
    * Represents the line style. See Excel.ChartLineStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var lineStyle: ChartLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Grey25 | Grey50 | Grey75 | Automatic | RoundDot = js.native
  /**
    *
    * Represents weight of the line, in points.
    *
    * [Api set: ExcelApi 1.7]
    */
  var weight: Double = js.native
  /**
    *
    * Clear the line format of a chart element.
    *
    * [Api set: ExcelApi 1.1]
    */
  def clear(): Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartLineFormat = js.native
  def load(options: ChartLineFormatLoadOptions): ChartLineFormat = js.native
  def load(propertyNamesAndPaths: AnonExpand): ChartLineFormat = js.native
  def load(propertyNames: String): ChartLineFormat = js.native
  def load(propertyNames: js.Array[String]): ChartLineFormat = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartLineFormat): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartLineFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartLineFormatUpdateData): Unit = js.native
  def set(properties: ChartLineFormatUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartLineFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartLineFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartLineFormatData = js.native
}


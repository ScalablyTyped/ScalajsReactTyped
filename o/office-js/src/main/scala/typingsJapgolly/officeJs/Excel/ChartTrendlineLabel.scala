package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.Interfaces.ChartTrendlineLabelData
import typingsJapgolly.officeJs.Excel.Interfaces.ChartTrendlineLabelLoadOptions
import typingsJapgolly.officeJs.Excel.Interfaces.ChartTrendlineLabelUpdateData
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJs.anon.Expand
import typingsJapgolly.officeJs.officeJsStrings.Bottom
import typingsJapgolly.officeJs.officeJsStrings.Center
import typingsJapgolly.officeJs.officeJsStrings.Distributed
import typingsJapgolly.officeJs.officeJsStrings.Justify
import typingsJapgolly.officeJs.officeJsStrings.Left
import typingsJapgolly.officeJs.officeJsStrings.Right
import typingsJapgolly.officeJs.officeJsStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object represents the attributes for a chart trendline label object.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait ChartTrendlineLabel
  extends StObject
     with ClientObject {
  
  /**
    * Specifies if the trendline label automatically generates appropriate text based on context.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var autoText: Boolean = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartTrendlineLabel: RequestContext = js.native
  
  /**
    * The format of the chart trendline label.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val format: ChartTrendlineLabelFormat = js.native
  
  /**
    * String value that represents the formula of the chart trendline label using A1-style notation.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var formula: String = js.native
  
  /**
    * Returns the height, in points, of the chart trendline label. Value is `null` if the chart trendline label is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val height: Double = js.native
  
  /**
    * Represents the horizontal alignment of the chart trendline label. See `Excel.ChartTextHorizontalAlignment` for details.
    This property is valid only when `TextOrientation` of a trendline label is -90, 90, or 180.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed = js.native
  
  /**
    * Represents the distance, in points, from the left edge of the chart trendline label to the left edge of the chart area. Value is `null` if the chart trendline label is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var left: Double = js.native
  
  /**
    * Specifies if the number format is linked to the cells (so that the number format changes in the labels when it changes in the cells).
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartTrendlineLabel = js.native
  def load(options: ChartTrendlineLabelLoadOptions): ChartTrendlineLabel = js.native
  def load(propertyNamesAndPaths: Expand): ChartTrendlineLabel = js.native
  def load(propertyNames: String): ChartTrendlineLabel = js.native
  def load(propertyNames: js.Array[String]): ChartTrendlineLabel = js.native
  
  /**
    * String value that represents the format code for the trendline label.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: String = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartTrendlineLabel): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartTrendlineLabelUpdateData): Unit = js.native
  def set(properties: ChartTrendlineLabelUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * String representing the text of the trendline label on a chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var text: String = js.native
  
  /**
    * Represents the angle to which the text is oriented for the chart trendline label. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartTrendlineLabel object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartTrendlineLabelData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartTrendlineLabelData = js.native
  
  /**
    * Represents the distance, in points, from the top edge of the chart trendline label to the top of the chart area. Value is `null` if the chart trendline label is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var top: Double = js.native
  
  /**
    * Represents the vertical alignment of the chart trendline label. See `Excel.ChartTextVerticalAlignment` for details.
    This property is valid only when `TextOrientation` of a trendline label is 0.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed = js.native
  
  /**
    * Returns the width, in points, of the chart trendline label. Value is `null` if the chart trendline label is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val width: Double = js.native
}

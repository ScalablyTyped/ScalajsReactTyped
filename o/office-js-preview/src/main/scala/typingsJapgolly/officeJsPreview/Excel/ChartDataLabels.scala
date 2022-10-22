package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartDataLabelsData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartDataLabelsLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartDataLabelsUpdateData
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJsPreview.anon.Expand
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.BestFit
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Bottom
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Callout
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Center
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Distributed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.InsideBase
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.InsideEnd
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Invalid
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Justify
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Left
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.None
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.OutsideEnd
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Right
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of all the data labels on a chart point.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartDataLabels
  extends StObject
     with ClientObject {
  
  /**
    * Specifies if data labels automatically generate appropriate text based on context.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var autoText: Boolean = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartDataLabels: RequestContext = js.native
  
  /**
    * Specifies the format of chart data labels, which includes fill and font formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val format: ChartDataLabelFormat = js.native
  
  /**
    * Specifies the horizontal alignment for chart data label. See `Excel.ChartTextHorizontalAlignment` for details.
    This property is valid only when the `TextOrientation` of data label is 0.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed = js.native
  
  /**
    * Specifies if the number format is linked to the cells. If `true`, the number format will change in the labels when it changes in the cells.
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
  def load(): ChartDataLabels = js.native
  def load(options: ChartDataLabelsLoadOptions): ChartDataLabels = js.native
  def load(propertyNamesAndPaths: Expand): ChartDataLabels = js.native
  def load(propertyNames: String): ChartDataLabels = js.native
  def load(propertyNames: js.Array[String]): ChartDataLabels = js.native
  
  /**
    * Specifies the format code for data labels.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: String = js.native
  
  /**
    * Value that represents the position of the data label. See `Excel.ChartDataLabelPosition` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var position: ChartDataLabelPosition | Invalid | None | Center | InsideEnd | InsideBase | OutsideEnd | Left | Right | Top | Bottom | BestFit | Callout = js.native
  
  /**
    * String representing the separator used for the data labels on a chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var separator: String = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartDataLabels): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartDataLabelsUpdateData): Unit = js.native
  def set(properties: ChartDataLabelsUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Specifies if the data label bubble size is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var showBubbleSize: Boolean = js.native
  
  /**
    * Specifies if the data label category name is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var showCategoryName: Boolean = js.native
  
  /**
    * Specifies if the data label legend key is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var showLegendKey: Boolean = js.native
  
  /**
    * Specifies if the data label percentage is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var showPercentage: Boolean = js.native
  
  /**
    * Specifies if the data label series name is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var showSeriesName: Boolean = js.native
  
  /**
    * Specifies if the data label value is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var showValue: Boolean = js.native
  
  /**
    * Represents the angle to which the text is oriented for data labels. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartDataLabels object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartDataLabelsData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartDataLabelsData = js.native
  
  /**
    * Represents the vertical alignment of chart data label. See `Excel.ChartTextVerticalAlignment` for details.
    This property is valid only when `TextOrientation` of the data label is -90, 90, or 180.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed = js.native
}

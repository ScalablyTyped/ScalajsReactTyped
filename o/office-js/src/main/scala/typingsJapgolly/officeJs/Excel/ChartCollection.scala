package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.Interfaces.ChartCollectionData
import typingsJapgolly.officeJs.Excel.Interfaces.ChartCollectionLoadOptions
import typingsJapgolly.officeJs.Excel.Interfaces.CollectionLoadOptions
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.ClientResult
import typingsJapgolly.officeJs.OfficeExtension.EventHandlers
import typingsJapgolly.officeJs.OfficeExtension.LoadOption
import typingsJapgolly.officeJs.officeJsStrings.Auto
import typingsJapgolly.officeJs.officeJsStrings.Columns
import typingsJapgolly.officeJs.officeJsStrings.Rows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of all the chart objects on a worksheet.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartCollection
  extends StObject
     with ClientObject {
  
  /**
    * Creates a new chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param type Represents the type of a chart. See `Excel.ChartType` for details.
    * @param sourceData The `Range` object corresponding to the source data.
    * @param seriesBy Optional. Specifies the way columns or rows are used as data series on the chart. See `Excel.ChartSeriesBy` for details.
    */
  def add(
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 82, starting with typingsJapgolly.officeJs.officeJsStrings.Invalid, typingsJapgolly.officeJs.officeJsStrings.ColumnClustered, typingsJapgolly.officeJs.officeJsStrings.ColumnStacked */ Any,
    sourceData: Range
  ): Chart = js.native
  def add(
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 82, starting with typingsJapgolly.officeJs.officeJsStrings.Invalid, typingsJapgolly.officeJs.officeJsStrings.ColumnClustered, typingsJapgolly.officeJs.officeJsStrings.ColumnStacked */ Any,
    sourceData: Range,
    seriesBy: Auto | Columns | Rows
  ): Chart = js.native
  /**
    * Creates a new chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param type Represents the type of a chart. See `Excel.ChartType` for details.
    * @param sourceData The `Range` object corresponding to the source data.
    * @param seriesBy Optional. Specifies the way columns or rows are used as data series on the chart. See `Excel.ChartSeriesBy` for details.
    */
  def add(`type`: ChartType, sourceData: Range): Chart = js.native
  def add(`type`: ChartType, sourceData: Range, seriesBy: ChartSeriesBy): Chart = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartCollection: RequestContext = js.native
  
  /**
    * Returns the number of charts in the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val count: Double = js.native
  
  /**
    * Returns the number of charts in the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a chart using its name. If there are multiple charts with the same name, the first one will be returned.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param name Name of the chart to be retrieved.
    */
  def getItem(name: String): Chart = js.native
  
  /**
    * Gets a chart based on its position in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): Chart = js.native
  
  /**
    * Gets a chart using its name. If there are multiple charts with the same name, the first one will be returned. If the chart doesn't exist, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    *
    * @param name Name of the chart to be retrieved.
    */
  def getItemOrNullObject(name: String): Chart = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Chart] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartCollection = js.native
  def load(options: ChartCollectionLoadOptions & CollectionLoadOptions): ChartCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): ChartCollection = js.native
  def load(propertyNames: String): ChartCollection = js.native
  def load(propertyNames: js.Array[String]): ChartCollection = js.native
  
  /**
    * Occurs when a chart is activated.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onActivated: EventHandlers[ChartActivatedEventArgs] = js.native
  
  /**
    * Occurs when a new chart is added to the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onAdded: EventHandlers[ChartAddedEventArgs] = js.native
  
  /**
    * Occurs when a chart is deactivated.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onDeactivated: EventHandlers[ChartDeactivatedEventArgs] = js.native
  
  /**
    * Occurs when a chart is deleted.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onDeleted: EventHandlers[ChartDeletedEventArgs] = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.ChartCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): ChartCollectionData = js.native
}

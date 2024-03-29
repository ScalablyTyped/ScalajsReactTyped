package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartSeriesCollectionData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartSeriesCollectionLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientResult
import typingsJapgolly.officeJsPreview.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of chart series.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartSeriesCollection
  extends StObject
     with ClientObject {
  
  /**
    * Add a new series to the collection. The new added series is not visible until values, x-axis values, or bubble sizes for it are set (depending on chart type).
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @param name Optional. Name of the series.
    * @param index Optional. Index value of the series to be added. Zero-indexed.
    */
  def add(): ChartSeries = js.native
  def add(name: String): ChartSeries = js.native
  def add(name: String, index: Double): ChartSeries = js.native
  def add(name: Unit, index: Double): ChartSeries = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartSeriesCollection: RequestContext = js.native
  
  /**
    * Returns the number of series in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val count: Double = js.native
  
  /**
    * Returns the number of series in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Retrieves a series based on its position in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): ChartSeries = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[ChartSeries] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartSeriesCollection = js.native
  def load(options: ChartSeriesCollectionLoadOptions & CollectionLoadOptions): ChartSeriesCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): ChartSeriesCollection = js.native
  def load(propertyNames: String): ChartSeriesCollection = js.native
  def load(propertyNames: js.Array[String]): ChartSeriesCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.ChartSeriesCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartSeriesCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): ChartSeriesCollectionData = js.native
}

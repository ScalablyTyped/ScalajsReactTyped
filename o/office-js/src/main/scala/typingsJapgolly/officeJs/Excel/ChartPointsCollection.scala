package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.Interfaces.ChartPointsCollectionData
import typingsJapgolly.officeJs.Excel.Interfaces.ChartPointsCollectionLoadOptions
import typingsJapgolly.officeJs.Excel.Interfaces.CollectionLoadOptions
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.ClientResult
import typingsJapgolly.officeJs.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of all the chart points within a series inside a chart.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartPointsCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartPointsCollection: RequestContext = js.native
  
  /**
    * Returns the number of chart points in the series.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val count: Double = js.native
  
  /**
    * Returns the number of chart points in the series.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Retrieve a point based on its position within the series.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): ChartPoint = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[ChartPoint] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartPointsCollection = js.native
  def load(options: ChartPointsCollectionLoadOptions & CollectionLoadOptions): ChartPointsCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): ChartPointsCollection = js.native
  def load(propertyNames: String): ChartPointsCollection = js.native
  def load(propertyNames: js.Array[String]): ChartPointsCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.ChartPointsCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartPointsCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): ChartPointsCollectionData = js.native
}

package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.Interfaces.ChartLegendEntryCollectionData
import typingsJapgolly.officeJs.Excel.Interfaces.ChartLegendEntryCollectionLoadOptions
import typingsJapgolly.officeJs.Excel.Interfaces.CollectionLoadOptions
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.ClientResult
import typingsJapgolly.officeJs.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of legend entries.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait ChartLegendEntryCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartLegendEntryCollection: RequestContext = js.native
  
  /**
    * Returns the number of legend entries in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Returns a legend entry at the given index.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @param index Index of the legend entry to be retrieved.
    */
  def getItemAt(index: Double): ChartLegendEntry = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[ChartLegendEntry] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartLegendEntryCollection = js.native
  def load(options: ChartLegendEntryCollectionLoadOptions & CollectionLoadOptions): ChartLegendEntryCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): ChartLegendEntryCollection = js.native
  def load(propertyNames: String): ChartLegendEntryCollection = js.native
  def load(propertyNames: js.Array[String]): ChartLegendEntryCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.ChartLegendEntryCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartLegendEntryCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): ChartLegendEntryCollectionData = js.native
}

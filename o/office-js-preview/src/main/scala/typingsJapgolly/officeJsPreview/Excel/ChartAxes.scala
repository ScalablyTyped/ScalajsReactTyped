package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.AnonExpand
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartAxesData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartAxesLoadOptions
import typingsJapgolly.officeJsPreview.Excel.Interfaces.ChartAxesUpdateData
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Category
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Invalid
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Primary
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Secondary
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Series
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the chart axes.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartAxes")
@js.native
class ChartAxes () extends ClientObject {
  /**
    *
    * Represents the category axis in a chart. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val categoryAxis: ChartAxis = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartAxes: RequestContext = js.native
  /**
    *
    * Represents the series axis of a 3-dimensional chart. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val seriesAxis: ChartAxis = js.native
  /**
    *
    * Represents the value axis in an axis. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val valueAxis: ChartAxis = js.native
  /**
    *
    * Returns the specific axis identified by type and group.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param type Specifies the axis type. See Excel.ChartAxisType for details.
    * @param group Optional. Specifies the axis group. See Excel.ChartAxisGroup for details.
    */
  def getItem(`type`: ChartAxisType): ChartAxis = js.native
  def getItem(`type`: ChartAxisType, group: ChartAxisGroup): ChartAxis = js.native
  def getItem(`type`: Category, group: Primary): ChartAxis = js.native
  def getItem(`type`: Category, group: Secondary): ChartAxis = js.native
  def getItem(`type`: Invalid, group: Primary): ChartAxis = js.native
  def getItem(`type`: Invalid, group: Secondary): ChartAxis = js.native
  def getItem(`type`: Series, group: Primary): ChartAxis = js.native
  def getItem(`type`: Series, group: Secondary): ChartAxis = js.native
  def getItem(`type`: Value, group: Primary): ChartAxis = js.native
  def getItem(`type`: Value, group: Secondary): ChartAxis = js.native
  @JSName("getItem")
  def getItem_Category(`type`: Category): ChartAxis = js.native
  /**
    *
    * Returns the specific axis identified by type and group.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param type Specifies the axis type. See Excel.ChartAxisType for details.
    * @param group Optional. Specifies the axis group. See Excel.ChartAxisGroup for details.
    */
  @JSName("getItem")
  def getItem_Invalid(`type`: Invalid): ChartAxis = js.native
  @JSName("getItem")
  def getItem_Series(`type`: Series): ChartAxis = js.native
  @JSName("getItem")
  def getItem_Value(`type`: Value): ChartAxis = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartAxes = js.native
  def load(options: ChartAxesLoadOptions): ChartAxes = js.native
  def load(propertyNamesAndPaths: AnonExpand): ChartAxes = js.native
  def load(propertyNames: String): ChartAxes = js.native
  def load(propertyNames: js.Array[String]): ChartAxes = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartAxes): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartAxes): void`
    *
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
}


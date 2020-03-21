package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.AnonExpand
import typingsJapgolly.officeJs.Excel.Interfaces.RemoveDuplicatesResultData
import typingsJapgolly.officeJs.Excel.Interfaces.RemoveDuplicatesResultLoadOptions
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the results from the removeDuplicates method on range
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.RemoveDuplicatesResult")
@js.native
class RemoveDuplicatesResult () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RemoveDuplicatesResult: RequestContext = js.native
  /**
    *
    * Number of duplicated rows removed by the operation.
    *
    * [Api set: ExcelApi 1.9]
    */
  val removed: Double = js.native
  /**
    *
    * Number of remaining unique rows present in the resulting range.
    *
    * [Api set: ExcelApi 1.9]
    */
  val uniqueRemaining: Double = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RemoveDuplicatesResult = js.native
  def load(options: RemoveDuplicatesResultLoadOptions): RemoveDuplicatesResult = js.native
  def load(propertyNamesAndPaths: AnonExpand): RemoveDuplicatesResult = js.native
  def load(propertyNames: String): RemoveDuplicatesResult = js.native
  def load(propertyNames: js.Array[String]): RemoveDuplicatesResult = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.RemoveDuplicatesResult object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RemoveDuplicatesResultData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): RemoveDuplicatesResultData = js.native
}


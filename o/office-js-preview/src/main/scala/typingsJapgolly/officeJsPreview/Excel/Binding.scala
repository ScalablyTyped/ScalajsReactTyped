package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.AnonExpand
import typingsJapgolly.officeJsPreview.Excel.Interfaces.BindingData
import typingsJapgolly.officeJsPreview.Excel.Interfaces.BindingLoadOptions
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientResult
import typingsJapgolly.officeJsPreview.OfficeExtension.EventHandlers
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an Office.js binding that is defined in the workbook.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.Binding")
@js.native
class Binding () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Binding: RequestContext = js.native
  /**
    *
    * Represents binding identifier. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val id: String = js.native
  /**
    *
    * Occurs when data or formatting within the binding is changed.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @eventproperty
    */
  val onDataChanged: EventHandlers[BindingDataChangedEventArgs] = js.native
  /**
    *
    * Occurs when the selected content in the binding is changed.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @eventproperty
    */
  val onSelectionChanged: EventHandlers[BindingSelectionChangedEventArgs] = js.native
  /**
    *
    * Returns the type of the binding. See Excel.BindingType for details. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val `type`: BindingType | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Range | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Table | Text = js.native
  /**
    *
    * Deletes the binding.
    *
    * [Api set: ExcelApi 1.3]
    */
  def delete(): Unit = js.native
  /**
    *
    * Returns the range represented by the binding. Will throw an error if binding is not of the correct type.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getRange(): Range = js.native
  /**
    *
    * Returns the table represented by the binding. Will throw an error if binding is not of the correct type.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getTable(): Table = js.native
  /**
    *
    * Returns the text represented by the binding. Will throw an error if binding is not of the correct type.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getText(): ClientResult[String] = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Binding = js.native
  def load(options: BindingLoadOptions): Binding = js.native
  def load(propertyNamesAndPaths: AnonExpand): Binding = js.native
  def load(propertyNames: String): Binding = js.native
  def load(propertyNames: js.Array[String]): Binding = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Binding object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.BindingData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): BindingData = js.native
}


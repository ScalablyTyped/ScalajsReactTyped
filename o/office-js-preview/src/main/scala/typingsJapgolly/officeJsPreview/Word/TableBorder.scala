package typingsJapgolly.officeJsPreview.Word

import typingsJapgolly.officeJsPreview.AnonExpand
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJsPreview.Word.Interfaces.TableBorderData
import typingsJapgolly.officeJsPreview.Word.Interfaces.TableBorderLoadOptions
import typingsJapgolly.officeJsPreview.Word.Interfaces.TableBorderUpdateData
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashDotStroked
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dashed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashedSmall
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dot2Dashed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DotDashed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dotted
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Double
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DoubleWave
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Mixed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.None
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Single
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThickThinLarge
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThickThinMed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThickThinSmall
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThinThickLarge
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThinThickMed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThinThickSmall
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThinThickThinLarge
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThinThickThinMed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThinThickThinSmall
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeDEmboss
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeDEngrave
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Triple
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Wave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies the border style.
  *
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.TableBorder")
@js.native
class TableBorder () extends ClientObject {
  /**
    *
    * Gets or sets the table border color.
    *
    * [Api set: WordApi 1.3]
    */
  var color: String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableBorder: RequestContext = js.native
  /**
    *
    * Gets or sets the type of the table border.
    *
    * [Api set: WordApi 1.3]
    */
  var `type`: BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave = js.native
  /**
    *
    * Gets or sets the width, in points, of the table border. Not applicable to table border types that have fixed widths.
    *
    * [Api set: WordApi 1.3]
    */
  var width: scala.Double = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.TableBorder` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.TableBorder` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.TableBorder` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableBorder = js.native
  def load(option: String): TableBorder = js.native
  def load(option: js.Array[String]): TableBorder = js.native
  def load(option: AnonExpand): TableBorder = js.native
  def load(option: TableBorderLoadOptions): TableBorder = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Word.TableBorder): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: TableBorderUpdateData): Unit = js.native
  def set(properties: TableBorderUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TableBorder): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.TableBorder object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.TableBorderData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TableBorderData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): TableBorder = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): TableBorder = js.native
}


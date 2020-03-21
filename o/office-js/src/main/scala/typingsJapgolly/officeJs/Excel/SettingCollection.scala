package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.Interfaces.CollectionLoadOptions
import typingsJapgolly.officeJs.Excel.Interfaces.SettingCollectionData
import typingsJapgolly.officeJs.Excel.Interfaces.SettingCollectionLoadOptions
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.ClientResult
import typingsJapgolly.officeJs.OfficeExtension.EventHandlers
import typingsJapgolly.officeJs.OfficeExtension.LoadOption
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of key-value pair setting objects that are part of the workbook. The scope is limited to per file and add-in (task-pane or content) combination.
  *
  * [Api set: ExcelApi 1.4]
  */
@JSGlobal("Excel.SettingCollection")
@js.native
class SettingCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SettingCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Setting] = js.native
  /**
    *
    * Occurs when the Settings in the document are changed.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @eventproperty
    */
  val onSettingsChanged: EventHandlers[SettingsChangedEventArgs] = js.native
  /**
    *
    * Sets or adds the specified setting to the workbook.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param key The Key of the new setting.
    * @param value The Value for the new setting.
    */
  def add(key: String, value: String): Setting = js.native
  def add(key: String, value: js.Any): Setting = js.native
  def add(key: String, value: js.Array[_]): Setting = js.native
  def add(key: String, value: Boolean): Setting = js.native
  def add(key: String, value: Double): Setting = js.native
  def add(key: String, value: Date): Setting = js.native
  /**
    *
    * Gets the number of Settings in the collection.
    *
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    *
    * Gets a Setting entry via the key.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param key Key of the setting.
    */
  def getItem(key: String): Setting = js.native
  /**
    *
    * Gets a Setting entry via the key. If the Setting does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param key The key of the setting.
    */
  def getItemOrNullObject(key: String): Setting = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SettingCollection = js.native
  def load(options: SettingCollectionLoadOptions with CollectionLoadOptions): SettingCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): SettingCollection = js.native
  def load(propertyNames: String): SettingCollection = js.native
  def load(propertyNames: js.Array[String]): SettingCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.SettingCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.SettingCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): SettingCollectionData = js.native
}


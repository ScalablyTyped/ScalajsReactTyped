package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.Interfaces.CollectionLoadOptions
import typingsJapgolly.officeJs.Excel.Interfaces.CustomXmlPartCollectionData
import typingsJapgolly.officeJs.Excel.Interfaces.CustomXmlPartCollectionLoadOptions
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.ClientResult
import typingsJapgolly.officeJs.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of custom XML parts.
  *
  * @remarks
  * [Api set: ExcelApi 1.5]
  */
@js.native
trait CustomXmlPartCollection
  extends StObject
     with ClientObject {
  
  /**
    * Adds a new custom XML part to the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.5]
    *
    * @param xml XML content. Must be a valid XML fragment.
    */
  def add(xml: String): CustomXmlPart = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CustomXmlPartCollection: RequestContext = js.native
  
  /**
    * Gets a new scoped collection of custom XML parts whose namespaces match the given namespace.
    *
    * @remarks
    * [Api set: ExcelApi 1.5]
    *
    * @param namespaceUri This must be a fully qualified schema URI; for example, "http://schemas.contoso.com/review/1.0".
    */
  def getByNamespace(namespaceUri: String): CustomXmlPartScopedCollection = js.native
  
  /**
    * Gets the number of custom XML parts in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.5]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a custom XML part based on its ID.
    *
    * @remarks
    * [Api set: ExcelApi 1.5]
    *
    * @param id ID of the object to be retrieved.
    */
  def getItem(id: String): CustomXmlPart = js.native
  
  /**
    * Gets a custom XML part based on its ID.
    If the `CustomXmlPart` does not exist, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.5]
    *
    * @param id ID of the object to be retrieved.
    */
  def getItemOrNullObject(id: String): CustomXmlPart = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[CustomXmlPart] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CustomXmlPartCollection = js.native
  def load(options: CustomXmlPartCollectionLoadOptions & CollectionLoadOptions): CustomXmlPartCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): CustomXmlPartCollection = js.native
  def load(propertyNames: String): CustomXmlPartCollection = js.native
  def load(propertyNames: js.Array[String]): CustomXmlPartCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.CustomXmlPartCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.CustomXmlPartCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): CustomXmlPartCollectionData = js.native
}

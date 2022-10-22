package typingsJapgolly.arcgisJsApi.esri

import org.scalajs.dom.Blob
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`array-buffer`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.blob
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.document
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.json
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.text
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalItemResource
  extends StObject
     with Accessor {
  
  /**
    * Requests the PortalItemResource data in the format specified for the `responseType`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#fetch)
    */
  def fetch(): js.Promise[Any] = js.native
  def fetch(responseType: json | xml | text | blob | `array-buffer` | document): js.Promise[Any] = js.native
  def fetch(
    responseType: json | xml | text | blob | `array-buffer` | document,
    options: PortalItemResourceFetchOptions
  ): js.Promise[Any] = js.native
  def fetch(responseType: scala.Unit, options: PortalItemResourceFetchOptions): js.Promise[Any] = js.native
  
  /**
    * Path of the resource relative to `{ITEM}/resources/`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#path)
    */
  var path: String = js.native
  
  /**
    * The [portal item](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html) that owns the resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#portalItem)
    */
  var portalItem: PortalItem = js.native
  
  /**
    * Updates an existing resource with new content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#update)
    */
  def update(content: Blob): js.Promise[Any] = js.native
  def update(content: Blob, options: PortalItemResourceUpdateOptions): js.Promise[Any] = js.native
  
  /**
    * The absolute url to the item resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#url)
    */
  val url: String = js.native
}

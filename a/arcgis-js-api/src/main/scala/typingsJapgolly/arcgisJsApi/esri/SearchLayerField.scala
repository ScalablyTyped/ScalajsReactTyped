package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`global-id`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`small-integer`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.blob
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.date
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.double
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.guid
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.integer
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.long
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.oid
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.raster
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.single
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.string
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchLayerField extends Accessor {
  /**
    * Whether or not the field is an exact match.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#exactMatch)
    */
  var exactMatch: Boolean = js.native
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#name)
    */
  var name: String = js.native
  /**
    * The data type of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#type)
    */
  var `type`: `small-integer` | integer | single | double | long | string | date | oid | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.geometry | blob | raster | guid | `global-id` | xml = js.native
}

@JSGlobal("__esri.SearchLayerField")
@js.native
object SearchLayerField extends TopLevel[SearchLayerFieldConstructor]


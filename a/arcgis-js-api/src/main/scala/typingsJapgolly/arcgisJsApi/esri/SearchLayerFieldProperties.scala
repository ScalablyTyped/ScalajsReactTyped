package typingsJapgolly.arcgisJsApi.esri

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

trait SearchLayerFieldProperties extends js.Object {
  /**
    * Whether or not the field is an exact match.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#exactMatch)
    */
  var exactMatch: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The data type of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#type)
    */
  var `type`: js.UndefOr[
    `small-integer` | integer | single | double | long | string | date | oid | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.geometry | blob | raster | guid | `global-id` | xml
  ] = js.undefined
}

object SearchLayerFieldProperties {
  @scala.inline
  def apply(
    exactMatch: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    `type`: `small-integer` | integer | single | double | long | string | date | oid | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.geometry | blob | raster | guid | `global-id` | xml = null
  ): SearchLayerFieldProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exactMatch)) __obj.updateDynamic("exactMatch")(exactMatch.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchLayerFieldProperties]
  }
}


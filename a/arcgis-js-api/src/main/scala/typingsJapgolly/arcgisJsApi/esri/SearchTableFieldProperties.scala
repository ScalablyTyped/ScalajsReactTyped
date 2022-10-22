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
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.string_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTableFieldProperties extends StObject {
  
  /**
    * Whether or not the field is an exact match.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchTableField.html#exactMatch)
    */
  var exactMatch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchTableField.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The data type of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchTableField.html#type)
    */
  var `type`: js.UndefOr[
    `small-integer` | integer | single | double | long | string_ | date | oid | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.geometry | blob | raster | guid | `global-id` | xml
  ] = js.undefined
}
object SearchTableFieldProperties {
  
  inline def apply(): SearchTableFieldProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTableFieldProperties]
  }
  
  extension [Self <: SearchTableFieldProperties](x: Self) {
    
    inline def setExactMatch(value: Boolean): Self = StObject.set(x, "exactMatch", value.asInstanceOf[js.Any])
    
    inline def setExactMatchUndefined: Self = StObject.set(x, "exactMatch", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(
      value: `small-integer` | integer | single | double | long | string_ | date | oid | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.geometry | blob | raster | guid | `global-id` | xml
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

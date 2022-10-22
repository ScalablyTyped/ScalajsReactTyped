package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`data-file`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`feature-record-set-layer`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`linear-unit`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`multi-value`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`raster-data-layer`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`raster-data`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`record-set`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.boolean
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.date
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.double
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.field
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.long
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.string_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterValue
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Specifies the parameter's data type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ParameterValue.html#dataType)
    */
  var dataType: boolean | `data-file` | date | double | `feature-record-set-layer` | field | `linear-unit` | long | `raster-data` | `raster-data-layer` | `record-set` | string_ | `multi-value` = js.native
  
  /**
    * The value of the parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ParameterValue.html#value)
    */
  var value: Boolean | DataFile | js.Date | Double | FeatureSet | Field | LinearUnit | RasterData | String | (js.Array[
    Boolean | DataFile | js.Date | Double | FeatureSet | Field | LinearUnit | RasterData | String
  ]) = js.native
}

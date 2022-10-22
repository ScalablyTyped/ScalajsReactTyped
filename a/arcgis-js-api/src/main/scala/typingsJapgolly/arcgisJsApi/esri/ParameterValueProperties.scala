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

trait ParameterValueProperties extends StObject {
  
  /**
    * Specifies the parameter's data type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ParameterValue.html#dataType)
    */
  var dataType: js.UndefOr[
    boolean | `data-file` | date | double | `feature-record-set-layer` | field | `linear-unit` | long | `raster-data` | `raster-data-layer` | `record-set` | string_ | `multi-value`
  ] = js.undefined
  
  /**
    * The value of the parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ParameterValue.html#value)
    */
  var value: js.UndefOr[
    Boolean | DataFileProperties | DateProperties | Double | FeatureSetProperties | FieldProperties | LinearUnitProperties | RasterDataProperties | String | (js.Array[
      Boolean | DataFileProperties | DateProperties | Double | FeatureSetProperties | FieldProperties | LinearUnitProperties | RasterDataProperties | String
    ])
  ] = js.undefined
}
object ParameterValueProperties {
  
  inline def apply(): ParameterValueProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterValueProperties]
  }
  
  extension [Self <: ParameterValueProperties](x: Self) {
    
    inline def setDataType(
      value: boolean | `data-file` | date | double | `feature-record-set-layer` | field | `linear-unit` | long | `raster-data` | `raster-data-layer` | `record-set` | string_ | `multi-value`
    ): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setValue(
      value: Boolean | DataFileProperties | DateProperties | Double | FeatureSetProperties | FieldProperties | LinearUnitProperties | RasterDataProperties | String | (js.Array[
          Boolean | DataFileProperties | DateProperties | Double | FeatureSetProperties | FieldProperties | LinearUnitProperties | RasterDataProperties | String
        ])
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(
      value: (Boolean | DataFileProperties | DateProperties | Double | FeatureSetProperties | FieldProperties | LinearUnitProperties | RasterDataProperties | String)*
    ): Self = StObject.set(x, "value", js.Array(value*))
  }
}

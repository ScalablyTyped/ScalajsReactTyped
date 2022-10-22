package typingsJapgolly.arcgisJsApi.anon

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`return`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.firstOfMany
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.last
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.lastOfMany
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.PointCloudReturnFilterProperties & {  type :'return'} */
trait PointCloudReturnFilterPro extends StObject {
  
  /**
    * The field used for applying the filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudFilter.html#field)
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * An array of return types used to filter points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html#includedReturns)
    */
  var includedReturns: js.UndefOr[js.Array[firstOfMany | last | lastOfMany | single]] = js.undefined
  
  var `type`: `return`
}
object PointCloudReturnFilterPro {
  
  inline def apply(): PointCloudReturnFilterPro = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("return")
    __obj.asInstanceOf[PointCloudReturnFilterPro]
  }
  
  extension [Self <: PointCloudReturnFilterPro](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setIncludedReturns(value: js.Array[firstOfMany | last | lastOfMany | single]): Self = StObject.set(x, "includedReturns", value.asInstanceOf[js.Any])
    
    inline def setIncludedReturnsUndefined: Self = StObject.set(x, "includedReturns", js.undefined)
    
    inline def setIncludedReturnsVarargs(value: (firstOfMany | last | lastOfMany | single)*): Self = StObject.set(x, "includedReturns", js.Array(value*))
    
    inline def setType(value: `return`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
